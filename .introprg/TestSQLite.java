/* Programa que comprova la disponibiiltat del driver de SQLite.
 * El codi d'error 0 indica que tot ha anat bé
 */
public class TestSQLite {
    public static void main(String[] args) throws java.sql.SQLException {
        java.sql.DriverManager.getDriver("jdbc:sqlite:test.bd");
    }
}

