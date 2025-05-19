/**
 * Classe que comprova el funcionament dels diferents mètodes que 
   hi ha en la classe Zoo.
 */
 
import java.sql.SQLException;

public class UsaZoo {
    public static void main(String[] args) throws SQLException {
        Zoo zoo = new Zoo();

        System.out.print("Primer connectem amb la base de dades: ");
        zoo.connecta();
        System.out.println("connectat");

        System.out.println();
        System.out.println("Creació en l'ordre correcte");
        System.out.println("===========================");
        System.out.println("L'ordre correcte és primer eliminar ANIMALS, després CATEGORIES, a continuació crear CATEGORIES i finalment ANIMALS");
        zoo.eliminaTaulaAnimals();
        zoo.eliminaTaulaCategories();
        zoo.creaTaulaCategories();
        zoo.creaTaulaAnimals();
        System.out.println("Taules resultants: " + zoo.getNomTaules());

        System.out.println();
        System.out.println("Eliminació de ANIMALS");
        System.out.println("=====================");
        System.out.println("Eliminar la taula ANIMALS no ha d'afectar a CATEGORIES");
        zoo.eliminaTaulaAnimals();
        System.out.println("Taules resultants: " + zoo.getNomTaules());

        System.out.println();
        System.out.println("Creació de ANIMALS");
        System.out.println("==================");
        System.out.println("Quan no hi ha la taula CATEGORIES, es crearà per poder crear ANIMALS");
        zoo.eliminaTaulaCategories();
        zoo.creaTaulaAnimals();
        System.out.println("Taules resultants: " + zoo.getNomTaules());

        System.out.println();
        System.out.println("Eliminació de CATEGORIES");
        System.out.println("========================");
        System.out.println("Quan hi són les taules CATEGORIES i ANIMALS, en eliminar CATEGORIES s'eliminarà ANIMALS");
        zoo.eliminaTaulaCategories();
        System.out.println("Taules resultants: " + zoo.getNomTaules());

        System.out.println();
        System.out.print("Finalment tanquem la connexió amb la base de dades: ");
        zoo.desconnecta();
        System.out.println("desconnectat");
    }
}
