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
        System.out.println("Creem les taules");
        zoo.creaTaulaAnimals();
        System.out.println("Taules resultants: " + zoo.getNomTaules());

        System.out.println();
        System.out.println("Introduïm categories amb una de repetida");
        Categoria peix = new Categoria("peix");
        zoo.afegeixCategoria(new Categoria("ocell"));
        zoo.afegeixCategoria(peix);
        zoo.afegeixCategoria(new Categoria("ocell"));
        ZooUtils.mostraCategories(zoo.recuperaCategories());

        System.out.println();
        System.out.println("Afegim guppy amb " + peix);
        zoo.afegeixAnimal(new Animal("guppy", peix));
        ZooUtils.mostraCategories(zoo.recuperaCategories());

        System.out.println();
        System.out.println("Afegim pardal dins d'una categoria coneguda");
        zoo.afegeixAnimal(new Animal("pardal", new Categoria("ocell")));
        ZooUtils.mostraCategories(zoo.recuperaCategories());

        System.out.println();
        System.out.println("Afegim un animal d'una nova categoria");
        zoo.afegeixAnimal(new Animal("gat", new Categoria("mamífer")));
        ZooUtils.mostraCategories(zoo.recuperaCategories());

        System.out.println();
        System.out.print("Finalment tanquem la connexió amb la base de dades: ");
        zoo.desconnecta();
        System.out.println("desconnectat");
    }
}
