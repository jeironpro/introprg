/* Aquest programa demana un text i et mostra el text invertit, només invertirà
* les lletres i els dígits, els altres caràcters es mostraran en l'ordre original.
*/

public class TextReves {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Declarar e inicialitzar el String nouText buit
        String nouText = "";
        
        // Fer un for per iterar els caràcters del text de manera decreixent
        for (int i = text.length()-1; i >= 0; i--) {
            // Declarar e inicialitzar el char c amb els caràcters del text
            char c = text.charAt(i);
            // Verificar si els caràcters del text són una lletra o un dígit 
            if (Character.isLetter(c) || Character.isDigit(c)) {
                // Guardar el caràcter en nouText
                nouText += c;                
            }
        }
        
        // Declarar e inicialitzar el int j en 0
        int j = 0;
        // Fer un for per iterar els caràcters del text de manera creixent
        for (int i = 0; i < text.length(); i++) {
            // Declarar e inicialitzar el char c amb els caràcters del text
            char c = text.charAt(i);
            // Verificar si els caràcters del text són una lletra o un dígit 
            if (Character.isLetter(c) || Character.isDigit(c)) {
                // Mostrar el caràcter lletra en la posició j
                System.out.print(nouText.charAt(j));   
                // Augmentar 1 al valor de j
                j++;     
            // Del contrari
            } else {
                // Mostrar el caràcter que no sigui lletra ni dígit
                System.out.print(c);
            }
        }
    }
}
