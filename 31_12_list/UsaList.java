/* 
 * Programa que fa servir les classes List i ArrayList per fer l'ús
 * d'algunes funcionalitats com add(element), add(index, element), 
 * size(), get(index) i remove(index) d'aquests.
 */

import java.util.List;
import java.util.ArrayList;

public class UsaList {
    public static void main(String[] args) {
        List<String> llista = new ArrayList<String>();

        System.out.println("Obtenim les entrades");
        System.out.println("====================");
        String valor;
        
        valor = Entrada.readLine();
        llista.add(valor);

        valor = Entrada.readLine();
		llista.add(0, valor);

        valor = Entrada.readLine();
		llista.add(1, valor);

        System.out.println("Cerquem elements de la llista");
        System.out.println("=============================");
        String text = Entrada.readLine();

        boolean esTroba = false;
        int indexPrimerOcurrencia = -1;
		for (int i = 0; i < llista.size(); i++) {
			if (llista.get(i).equals(text)) {
				esTroba = true;
				indexPrimerOcurrencia = i;
				break;
			}
		}
        System.out.printf("El text %s és troba a la llista: %s%n", text, esTroba);
        System.out.printf("Posició de %s a la llista: %s%n", text, indexPrimerOcurrencia);

        System.out.println("Mostrem les entrades introduïdes");
        System.out.println("================================");

        boolean llistaBuida = false;
        while (! llistaBuida) {
            String entrada = llista.get(0);
            System.out.println(entrada);

			llista.remove(0);
            llistaBuida = llista.size() == 0;
        }
    }
}
