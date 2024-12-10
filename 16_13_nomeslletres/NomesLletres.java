/* Programa que demana un text i et mostra nomes les lletres separats per una coma i un espai */
public class NomesLletres {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Passar-li el valor del text al mòdul
        filtraLletres(text);
    }
    
    public static void filtraLletres(String text) {
        // Declarar e inicialitzar la variable nouText buida
        String nouText = "";
        
        // Fer un for per iterar tots el caràcter del text
        for (int i = 0; i < text.length(); i++) {
            // Verificar si els caràcters són lletres
            if (Character.isLetter(text.charAt(i))) {
                // Com són lletres, guardar-lo en la variable nouText
                nouText += text.charAt(i);
            }
        }
        
        // Fer un for per iterar tots els caràcters del nou text.
        for (int i = 0; i < nouText.length(); i++) {
            // Declarar e inicialitzar el char c amb els caràcters del nouText
            char c = text.charAt(i);
            // Verificar si i és menor a la longitud del text - 1
            if (i < nouText.length()-1) {
                // Mostrar els caràcters separat amb coma en aquesta longitud
                System.out.print(c+ ", ");
            // Del contrari, es igual a la longitud
            } else {
                // Mostrar el caràcter final sense coma
                System.out.print(c);
            }
        }
    }
}
