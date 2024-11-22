/* Aquest programa demana una text i et mostra els caràcter següent 
* de cada caràcter del text sempre i quan sigui minúscula.
* Cada caràcter té un codi ASCII i mitjant aquest codi poden obtenir 
* el següent caràcter
*/

public class CodificaBasic {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        String text = Entrada.readLine();
        // Declarar e inicialitzar la variable nouText buida
        String nouText = "";
        
        // Fer un for per iterar els caràcters del text
        for (int i = 0; i < text.length(); i++) {
            // Verificar si el caràcter està en el rang des de l'a fins a l'y
            if (text.charAt(i) >= 'a' && text.charAt(i) < 'z') {
                nouText += (char)(text.charAt(i) + 1);
            // Verificar si es l'z
            } else if (text.charAt(i) == 'z') {
                // Guardar l'a en el nouText
                nouText += 'a';
            // Del contrari
            } else {
                // Com no es una lletra des l'a fins a l'y, guarda-ho igual
                nouText += text.charAt(i);
            }
        }
        // Mostrar el nouText
        System.out.println(nouText);
    }
}
