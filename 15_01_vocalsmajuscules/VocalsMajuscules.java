/* Aquest programa demana un text i et mostrarà tots les vocals
* en majúscules i la resta en minúscules
*/

public class VocalsMajuscules {
    public static void main(String[] args) {
        // Demanara el text
        System.out.println("Text?");
        String text = Entrada.readLine();
        // Declarar e inicialitzar la variable nouText buida
        String vocals = "aeiouAEIOU";
        String nouText = "";
        
        // Fer un for per iterar tots els caràcters 
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vocals.length(); j++) {
                if (text.charAt(i) == vocals.charAt(j)) {
                    nouText += Character.toUpperCase(text.charAt(i));
                } else {
                    nouText += Character.toLowerCase(text.charAt(i));                
                }
            }
        }
        // Mostrar el text transformat
        System.out.println(nouText);
    }
}
