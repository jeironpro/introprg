/**
 * Classe que es fa servir d'entorn per gestionar una base de dades fent 
   connexio, desconnexio i creació, eliminació de taules i recuperació de dades. 
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.LinkedList;

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
						   "id    INTEGER PRIMARY KEY AUTOINCREMENT," +
						   "nom   VARCHAR(40))";
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
	
	public void afegeixCategoria(Categoria categoria) throws SQLException {
		String sentencia = String.format("INSERT INTO CATEGORIES (nom) VALUES ('%s')", categoria.getNom());
		
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
	
	public Categoria obteCategoriaPerNom(String nom) throws SQLException {
		String sentencia = String.format("SELECT id FROM CATEGORIES WHERE nom = '%s' ORDER BY id LIMIT 1", nom);
		
		Statement st = null;
		
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sentencia);
			if (rs.next()) {
			    int id = rs.getInt("id");
			    Categoria categoria = new Categoria(id, nom);
			    return categoria;			
			}
	        return null;
		} finally {
			if (st != null) {
				st.close();
			}
		}
	}
}
