/*
 * Programa que demana un text, li extreu els espais i amb el text netejat mostra totes les subcadenes possibles
 * Utilitzant l'ordre (post-ordre). Divideix el text a la meitat i mostra la meitat del costat esquerre i 
 * després la meitat de la dreta i el pas actual entre mig.
*/

public class Subcadenes {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        
        // Si la longitud del text és menor o igual  a 1
        if (text.length() <= 1) {
            // Mostrar el text
            System.out.println(text);
        // Del contrari
        } else {
            // Netejar els espais del text
            text = netejaEspais(text);
            // Cridar el mòdul i passar-li els arguments text, valor inicial (0) i longitud del text
            preOrdre(text, 0, text.length());
        }
    }
    
    public static void preOrdre(String text, int ini, int fi) {
        if (text.isEmpty()) return; // Cas base 1
        if (fi - ini <= 0) return; // Cas base 2
        // System.out.printf("FI: %d - INI: %d == RESULTAT: %d%n", fi, ini, (fi-ini));

        String midText = text.substring(ini, fi); // Pas actual
        // System.out.printf("SUBSTRING: DES DE INI: %d --- FINS A FI: %d%n", ini, fi);

        int meitat = (ini + fi) / 2; // Meitat del text
        // System.out.printf("INI: %d + FI: %d == DIVIDIT PER 2: %d%n", ini, fi, meitat);
        
        if (meitat < fi) preOrdre(text, ini, meitat); // Pas recursiu 1 (meitat de l'esquerra)
        // System.out.printf("CRIDAT MEITAT DE L'ESQUERRA: TEXT:%s DES DE INI: %d FINS A MEITAT: %d%n", text, ini, meitat);

        System.out.printf("%4d: %s%n", midText.length(), midText); // Mostrar longitud i text inicial i recursiu

        if (meitat > ini) preOrdre(text, meitat, fi); // Pas recursiu 2 (meitat de la dreta)
        // System.out.printf("CRIDAT MEITAT DE LA DRETA: TEXT:%s DES DE MEITAT: %d FINS A FI: %d%n", text, meitat, fi);        
    }

    public static String netejaEspais(String text) {
        // Si el text està buit
        if (text.isEmpty()) return text; // Cas base
        
        String nouText = ""; // Declarar e inicialitzar un String buit

        // Hi ha al menys un caràcter
        char primer = text.charAt(0); // Considerem el primer caràcter

        // Si el caràcter és una lletra, guardar-ho en nouText
        if (Character.isLetter(primer)) nouText += primer; // Pas actual
        
        // Considerem les lletres que conté la resta del text
        String restaText = netejaEspais(text.substring(1));  // Pas recursiu
        
        nouText += restaText; // Guardar la resta del text en nouText
        
        return nouText; // Retornar el nouText
    }
}
