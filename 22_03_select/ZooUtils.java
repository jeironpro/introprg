/**
 * Classe que fara de biblioteca de funcions per ser utilitzades en la classe Zoo 
   i UsaZoo
 */
 
import java.util.List;

public class ZooUtils {
	public static void mostraCategories(List<Categoria> categories) {
		int quants = categories.size();
		System.out.println(quants > 0 ? "Nombre de categories: " + quants : "Cap categoria");
		for (Categoria categoria : categories) {
			System.out.println("\t" + categoria.toString());
		}
	}
}
