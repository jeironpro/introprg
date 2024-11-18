/* Aquest programa demana un text i et mostra nomes les lletres separats per una coma i un espai */

public class NomesLletres {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        String text = Entrada.readLine();
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
        for (int j = 0; j < nouText.length(); j++) {
            // Verificar si j és menor a la longitud del text - 1
            if (j < nouText.length()-1) {
                // Com és així mostrar tots el caracter separat amb coma en aquesta longitud
                System.out.print(nouText.charAt(j) + ", ");
            // Del contrari, es igual a la longitud
            } else {
                // Mostrar el caràcter final
                System.out.print(nouText.charAt(j));
            }
        }
    }
}
