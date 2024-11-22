/* Aquest programa demana un text i ho inverteix.
* Et mostrarà tots els caràcters invertit separat amb coma
* incloent l'espais.
*/

public class TextReves {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        String text = Entrada.readLine();
        // Declarar e inicialitzar la variable nouText buida
        String nouText = "";
        
        // Fer un for per iterar tots els caràcter des de l'últim fins al primer
        for (int i = text.length()-1; i >= 0; i--) {
            // Verificar que i sigui mayor a 0
            if (i > 0) {
                // Mostrar el caràcter amb coma
                System.out.print(text.charAt(i) + ", ");
            // Del contrari
            } else {
                // Mostrar els caràcters
                System.out.print(text.charAt(i));
            }
        }
    }
}

