/**
 * Classe que es fa servir d'entorn per gestionar una base de dades fent 
   connexio, desconnexio, creació, eliminació de taules, inserció, recuperació
   i modificació de dades. 
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
	
	public void creaTaulaAnimals() throws SQLException {
		creaTaulaCategories();
		String sentencia = "CREATE TABLE ANIMALS (" +
						   " id          INTEGER PRIMARY KEY AUTOINCREMENT," +
						   " nom         VARCHAR(40)," +
						   " categoria   INTEGER," + 
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
		String sentencia = String.format("INSERT INTO CATEGORIES (nom) VALUES ('%s')", categoria.getNom());
		
		Statement st = null;

		try {
		    st = conn.createStatement();
		    st.executeUpdate(sentencia);
		    ResultSet rs = st.getGeneratedKeys();
		    if (rs.next()) {
		    	int id = rs.getInt(1);
				categoria.setId(id);		    
		    }
		    rs.close();
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
		
		Categoria categoriaAnimal = animal.getCategoria();
		if (categoriaAnimal.idIndefinit()) {
			Categoria categoria = obteCategoriaPerNom(categoriaAnimal.getNom());
			if (categoria == null) {
				afegeixCategoria(categoriaAnimal);
			} else {
				categoriaAnimal.setId(categoria.getId());
			}	
		}
		
		String sentencia = String.format(
				"INSERT INTO ANIMALS (nom, categoria) VALUES ('%s', '%d')",
				animal.getNom(),
				animal.getCategoria().getId());
				
		Statement st = null;
		
		try {
			st = conn.createStatement();
			st.executeUpdate(sentencia);
			ResultSet rs = st.getGeneratedKeys();
		    if (rs.next()) {
		    	int id = rs.getInt(1);
				animal.setId(id);		    
		    }
		    rs.close();
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
	
	public List<Animal> recuperaAnimals() throws SQLException {
		String sentencia = "SELECT a.id as id_animal, a.nom as nom_animal, c.id as id_categoria, c.nom as nom_categoria FROM ANIMALS a JOIN CATEGORIES c ON a.categoria = c.id ORDER BY a.nom";
		Statement st = null;

		try {
		    st = conn.createStatement();
		    ResultSet rs = st.executeQuery(sentencia);
		    List<Animal> animals = new LinkedList<>();

		    while (rs.next()) {
		        int idAni = rs.getInt("id_animal");
		        String nomAni = rs.getString("nom_animal");
		        int idCat = rs.getInt("id_categoria");
		        String nomCat = rs.getString("nom_categoria");
		        
		        Categoria categoria = new Categoria(idCat, nomCat);
		        Animal animal = new Animal(idAni, nomAni, categoria);
		        animals.add(animal);
		    }
		    rs.close();
		    return animals;
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
	
	public Animal obteAnimalPerNom(String nom) throws SQLException {
		String sentencia = String.format("SELECT a.id as id_animal, c.id as id_categoria, c.nom as nom_categoria FROM ANIMALS a JOIN CATEGORIES c ON a.categoria = c.id WHERE a.nom = '%s' ORDER BY a.nom LIMIT 1", nom);
			
		Statement st = null;
		
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sentencia);
			
			if (rs.next()) {
	       		int idAni = rs.getInt("id_animal");
	       	 	int idCat = rs.getInt("id_categoria");
	        	String nomCat = rs.getString("nom_categoria");
			
	        	Categoria categoria = new Categoria(idCat, nomCat);
			    Animal animal = new Animal(idAni, nom, categoria);
			    return animal;
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
	
	public void canviaCategoria(Animal animal, Categoria categoria) throws SQLException {
		Animal ani = obteAnimalPerNom(animal.getNom());
		Categoria cat = obteCategoriaPerNom(categoria.getNom());
		int idNovaCategoria = 0;
		int idAnimal = 0;
		
		if (ani != null && cat != null) {
			idNovaCategoria = categoria.getId();
			idAnimal = animal.getId();		
		} else {		
			if (ani == null) {
				Animal animalNovaCategoria = new Animal(animal.getNom(), categoria);
				afegeixAnimal(animalNovaCategoria);
			} else {
				if (cat == null) {
					afegeixCategoria(categoria);
				}
			} 
			cat = obteCategoriaPerNom(categoria.getNom());
			idNovaCategoria = cat.getId();

			ani = obteAnimalPerNom(animal.getNom());
			idAnimal = ani.getId();
		}
		
		String sentencia = String.format("UPDATE ANIMALS " +
                       			         "SET categoria = %d " +
                                         "WHERE id = %d",
                                         idNovaCategoria,
                                         idAnimal);
		
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
}
