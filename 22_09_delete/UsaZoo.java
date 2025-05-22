/**
 * Classe que comprova el funcionament dels diferents mètodes que 
   hi ha en la classe Zoo.
 */
 
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

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

        System.out.println("Intentem eliminar una categoria i un animal inexistents");
        zoo.eliminaCategoria(new Categoria("mamífer"));
        zoo.eliminaAnimal(new Animal("gat", new Categoria("mamífer")));
        ZooUtils.mostraAnimals(zoo.recuperaAnimals());
        ZooUtils.mostraCategories(zoo.recuperaCategories());

        Animal pardal = new Animal("pardal", new Categoria("ocell"));

        System.out.println();
        System.out.println("Introduïm " + pardal);
        zoo.afegeixAnimal(pardal);
        ZooUtils.mostraAnimals(zoo.recuperaAnimals());
        ZooUtils.mostraCategories(zoo.recuperaCategories());

        System.out.println();
        System.out.println("Eliminem l'animal");
        zoo.eliminaAnimal(pardal);
        ZooUtils.mostraAnimals(zoo.recuperaAnimals());
        ZooUtils.mostraCategories(zoo.recuperaCategories());

        // creem una llista d'animals
        Categoria ocell = new Categoria("ocell");
        Animal gat = new Animal("gat", new Categoria("mamífer"));

        List<Animal> animals = Arrays.asList(
            new Animal("pardal", ocell),
            new Animal("àliga", ocell),
            new Animal("gallina",  ocell),
            gat,
            new Animal("trencalós",  ocell)
            );

        System.out.println();
        System.out.println("Afegim uns quants animals");
        for (Animal animal: animals) {
            zoo.afegeixAnimal(animal);
        }

        ZooUtils.mostraAnimals(zoo.recuperaAnimals());
        ZooUtils.mostraCategories(zoo.recuperaCategories());

        ocell = zoo.obteCategoriaPerNom("ocell");

        System.out.println();
        System.out.println("Eliminem " + ocell);
        zoo.eliminaCategoria(ocell);
        ZooUtils.mostraAnimals(zoo.recuperaAnimals());
        ZooUtils.mostraCategories(zoo.recuperaCategories());

        System.out.println();
        System.out.println("No deixem ni el gat!");
        zoo.eliminaAnimal(gat);
        ZooUtils.mostraAnimals(zoo.recuperaAnimals());
        ZooUtils.mostraCategories(zoo.recuperaCategories());

        Categoria mamifer = zoo.obteCategoriaPerNom("mamífer");

        System.out.println();
        System.out.println("Eliminem " + mamifer);
        zoo.eliminaCategoria(mamifer);
        ZooUtils.mostraAnimals(zoo.recuperaAnimals());
        ZooUtils.mostraCategories(zoo.recuperaCategories());

        System.out.println();
        System.out.print("Finalment tanquem la connexió amb la base de dades: ");
        zoo.desconnecta();
        System.out.println("desconnectat");
    }
}
