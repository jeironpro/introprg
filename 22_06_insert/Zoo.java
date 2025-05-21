/**
 * Classe que es fa servir d'entorn per gestionar una base de dades fent 
   connexio, desconnexio i creació, eliminació de taules, inserció i recuperació 
   de dades. 
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class Zoo {
	private static final String NOM_BASE_DE_DADES = "animals.bd";
    private static final String CADENA_DE_CONNEXIO = "jdbc:sqlite:" +
                                                     NOM_BASE_DE_DADES;
	private Connection conn = null;
	
	public void connecta() throws SQLException {
        if (conn != null) return;
        conn = DriverManager.getConnection(CADENA_DE_CONNEXIO);
    }
	
	public void desconnecta() throws SQLException {
		if (conn == null) return;
		conn.close();
		conn = null;
	}
	
	public void creaTaulaCategories() throws SQLException {
		eliminaTaulaCategories();
		String sentencia = "CREATE TABLE CATEGORIES (" +
						   "id INTEGER PRIMARY KEY AUTOINCREMENT," +
						   " nom VARCHAR(40))";
	    Statement st = null;
	    
	    try {
	    	st = conn.createStatement();
	    	st.executeUpdate(sentencia);
	    } finally {
	    	if (st != null) {
	    		st.close();
	    	}
	    }
	}
	
	public void creaTaulaAnimals() throws SQLException {
		creaTaulaCategories();
		String sentencia = "CREATE TABLE ANIMALS (" +
						   "id INTEGER PRIMARY KEY AUTOINCREMENT," +
						   " nom VARCHAR(40)," +
						   " categoria INTEGER," + 
						   " FOREIGN KEY(categoria) REFERENCES CATEGORIES(id))";
		Statement st = null;
		
		try {
			st = conn.createStatement();
			st.executeUpdate(sentencia);
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
	
	public void eliminaTaulaCategories() throws SQLException {
		eliminaTaulaAnimals();
		String sentencia = "DROP TABLE IF EXISTS CATEGORIES";
		Statement st = null;
		
		try {
			st = conn.createStatement();
			st.executeUpdate(sentencia);
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
	
	public void eliminaTaulaAnimals() throws SQLException {
		String sentencia = "DROP TABLE IF EXISTS ANIMALS";
		Statement st = null;
		
		try {
			st = conn.createStatement();
			st.executeUpdate(sentencia);
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
	
	public void afegeixCategoria(Categoria categoria) throws SQLException {
		String sentencia = String.format(
		        "INSERT INTO CATEGORIES (nom) VALUES ('%s')",
		        categoria.getNom());
		Statement st = null;

		try {
		    st = conn.createStatement();
		    st.executeUpdate(sentencia);
		    ResultSet rs = st.getGeneratedKeys();
		    rs.next();
		    int id = rs.getInt(1);
		    categoria.setId(id);
		} finally {
		    if (st != null) {
		        st.close();
		    }
		}
	}
	
	public void afegeixAnimal(Animal animal) throws SQLException {
		if (!animal.idIndefinit()) {
			return;
		}
		
		int idCat = 0;
		if (animal.getCategoria().idIndefinit()) {
			String nomCategoria = animal.getCategoria().getNom();
			if (obteCategoriaPerNom(nomCategoria) == null) {
				afegeixCategoria(animal.getCategoria());
			}
			idCat = idCategoria(nomCategoria);	
		} else {
			idCat = animal.getCategoria().getId();
		}	
		
		String sentencia = String.format(
				"INSERT INTO ANIMALS (nom, categoria) VALUES ('%s', '%d')",
				animal.getNom(),
				idCat);
		Statement st = null;
		
		try {
			st = conn.createStatement();
			st.executeUpdate(sentencia);
		} finally {
			if (st != null) {
				st.close();
			}
		}		
	}
	
	public List<Categoria> recuperaCategories() throws SQLException {
		String sentencia = "SELECT * FROM CATEGORIES ORDER BY nom";
		Statement st = null;

		try {
		    st = conn.createStatement();
		    ResultSet rs = st.executeQuery(sentencia);
		    List<Categoria> categories = new LinkedList<>();

		    while (rs.next()) {
		        int bdId = rs.getInt("id");
		        String nom = rs.getString("nom");
		        Categoria categoria = new Categoria(bdId, nom);
		        categories.add(categoria);
		    }
		    rs.close();
		    return categories;
		} finally {
		    if (st != null) {
		        st.close();
		    }
		}
	}
	
	public String obteCategoriaPerNom(String nom) throws SQLException {
		String sentencia = "SELECT id FROM CATEGORIES WHERE nom = " + 
							"'" + nom + "'" + " ORDER BY id LIMIT 1;";
		Statement st = null;
		
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sentencia);
			
	        int bdId = rs.getInt("id");
	        
	        if (bdId > 0) {
			    Categoria categoria = new Categoria(bdId, nom);
			    return categoria.toString();
	        }
	        return null;
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
	
	public String getNomTaules() throws SQLException {
		String sentencia = "SELECT name FROM sqlite_schema " +
		             "WHERE name NOT LIKE 'sqlite%' " +
		             "ORDER BY name";

		List<String> taules = new ArrayList<>();

		try (Statement st = conn.createStatement()) {
		    ResultSet rs = st.executeQuery(sentencia);
		    while (rs.next()) { taules.add(rs.getString("name")); }
		    rs.close();
		}
		return taules.size() > 0 ? String.join(", ", taules) : "cap";
	}
	
	public int idCategoria(String nomCategoria) throws SQLException {
		String sentencia = "SELECT id FROM CATEGORIES WHERE nom = " + 
					       "'" + nomCategoria + "'" + " ORDER BY id LIMIT 1;";
		
		Statement st = null;
		try {
			st = conn.createStatement();
    		st.executeQuery(sentencia);
			ResultSet rs = st.getGeneratedKeys();
    		rs.next();
    		int idCat = rs.getInt(1);
    		return idCat;
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
}
