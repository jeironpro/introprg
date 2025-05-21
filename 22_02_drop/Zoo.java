/**
 * Classe que es fa servir d'entorn per gestionar una base de dades fent connexio,
   desconnexio i creació i eliminació de taules. 
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
}
