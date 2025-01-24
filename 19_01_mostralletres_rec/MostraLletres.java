/* Programa que demana un text i et mostra nomes les lletres amb funció recursiva */

public class MostraLletres {
    public static void main(String[] args){
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Cridar el mòdul i passar-li
        mostraLletres(text);
        System.out.println();   // un salt de línia final
    }

    // mostra només les lletres de text
    public static void mostraLletres(String text) {
        // Si el text està buit
        if (text.isEmpty()) {      // cas base
            // Retornar
            return;   
        }

        // hi ha al menys un caràcter. Comptem quantes lletres hi queden
        // considerem el primer caràcter
        char primer = text.charAt(0);
        // Si el caràcter és una lletra
        if (Character.isLetter(primer)) {
            // Mostrar el caràcter
            System.out.print(primer);
        }
        
        // considerem les lletres que conté la resta del text
        String restaText = text.substring(1);  // resta del text
        mostraLletres(restaText);      // crida recursiva
    }
}
