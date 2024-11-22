/* Aquest programa demana una text i et mostra els caràcter següent 
* de cada caràcter del text sempre i quan sigui minúscula.
* Cada caràcter té un codi ASCII i mitjant aquest codi poden obtenir 
* el següent caràcter
*/

public class CodificaBasic {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String nouText = "";
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                nouText += (char)(text.charAt(i) + 1);
            } else {
                nouText += text.charAt(i);
            }
        }
        System.out.println(nouText);
    }
}
