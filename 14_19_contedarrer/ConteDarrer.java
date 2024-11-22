/* Aquest programa demana texts i verifica si el text següent conté
* l'últim caràcter del text anterior. El primer text serà acceptat per
* poder fer la verificació, si el text no conté l'últim caràcter del text o
* si el text està buit mostrarà un missatge de despedida. 
*/
public class ConteDarrer {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = Entrada.readLine();
        
        // Verificar si el text no està buit
        if (!text.isEmpty()) {
            // Mostrar aquest missatge
            System.out.println("bé");
        }
        
        // Fer un while que s'execute mentre el text no està buit
        while (!text.isEmpty()) {
            // Declarar un boolean en false
            boolean conte = false; 
            // Obtenir el ultim caràcter del text
            char ultimCaracter = Character.toLowerCase(text.charAt(text.length()-1));
            // Tornar a demanar el text a dins del bucle
            text = Entrada.readLine();
           
            // Fer un for per iterar tots els caràcters del text 
            for (int i = 0; i < text.length(); i++) {
                // Verificar els caràcters del text són igual l'últim caràcter
                if (Character.toLowerCase(text.charAt(i)) == ultimCaracter) {
                    // conte serà true
                    conte = true;
                    // Si troba al menys un caràcter igual a l'últim, sortir del bucle for
                    break;
                }
            }
            
            // Si conte és true       
            if (conte) {
                // Mostrar aquest missatge
                System.out.println("bé");
            // Del contrari
            } else {
                // Sortir del bucle while
                break;            
            }
        }
        // Quan surti del bucle, mostrar aquest missatge
        System.out.println("Adéu");
    }
}
