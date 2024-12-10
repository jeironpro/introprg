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
        // Fer un for per iterar tots el caràcter del text
        for (int i = 0; i < text.length(); i++) {
            // Declarar e inicialitzar el char c amb els caràcters del text
            char c = text.charAt(i);
            // Verificar si els caràcters són lletres
            if (Character.isLetter(c)) {
                // Verificar si i és igual a 0
                if (i < text.length()-1) {
                    // Mostrar el caràcter amb coma
                    System.out.print(c + ", ");
                // Del contrari
                } else {
                    // Mostrar el caràcter sense coma
                    System.out.print(c);
                }
            }
        }
    }
}
