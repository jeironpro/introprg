/* Aquest programa demana un text i et mostrarà tots les vocals
* en majúscules i la resta en minúscules
*/

public class VocalsMajuscules {
    public static void main(String[] args) {
        // Demanara el text
        System.out.println("Text?");
        String text = Entrada.readLine();
        // Declarar e inicialitzar la variable nouText buida
        String nouText = "";
        
        // Fer un for per iterar tots els caràcters 
        for (int i = 0; i < text.length(); i++) {
            // Verificar si el caràcter és una vocal
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                // Com és una vocal guardar-la en majúscula en nouText 
                nouText += Character.toUpperCase(text.charAt(i));
            // Del contrari
            } else {
                // Guarda el caràcter tal qual
                nouText += text.charAt(i);
            }
        }
        // Mostrar el text transformat
        System.out.println(nouText);
    }
}
