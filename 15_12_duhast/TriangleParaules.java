/* Aquest programa demana un text i construeix un triangle de paraules */

public class TriangleParaules {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Declarar e inicialitzar el String nouText amb el text més un espai
        String nouText = text + " ";
        
        // Fer un for per iterar els caràcters del nouText
        for (int i = 0; i < nouText.length(); i++) {
            // Verificar on hi ha un espai
            if (Character.isWhitespace(nouText.charAt(i))) {
                // Fer un for per iterar els caràcters abans de l'espai
                for (int j = 0; j <= i-1; j++) {
                    // Mostrar els caràcters abans de cada espai
                    System.out.print(nouText.charAt(j));
                }
                // Mostrar un salt de línia
                System.out.println();            
            }
        }
    }
}
