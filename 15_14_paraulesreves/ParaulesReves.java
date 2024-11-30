/* Aquest programa demana un text i et mostra cada paraula del text de manera
* invertida */

public class ParaulesReves {
    public static void main(String[] args) {
         // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Afegirle un espai al final del text
        // Per poder mostrar els texts (paraules) que no tinguin espai al final
        text = text + " ";
        // Declarar e inicialitzar el String paraula buit
        // Per almacenar cada paraula del text
        String paraula = "";
        
        // Fer un for per iterar cada caràcter del text
        for (int i = 0; i < text.length(); i++) {
            // Verificar si els caràcters és una lletra
            if (Character.isLetter(text.charAt(i))) {
                // Guardar les lletres a paraula
                paraula += text.charAt(i);
            } else {
                for (int j = paraula.length()-1; j >= 0; j--) {
                    System.out.print(paraula.charAt(j));
                }
                paraula = "";
            }
            if (i != text.length()-1) {
                if (!Character.isLetter(text.charAt(i)) || Character.isWhitespace(text.charAt(i))) {
                    System.out.print(text.charAt(i));            
                }            
            }
        }
        
    }
}
