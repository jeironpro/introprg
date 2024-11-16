/* Aquest programa demana texts fins que rebre una entrada buida.
* Per cada text introduït et dira si és un enter o no.
*/

public class Enters {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = "true";
        
        // El bucle s'executarà quan el text no sigui buit
        while (!text.isEmpty()) {
            // Rebent els texts
            text = Entrada.readLine();
            
            // Verificar si el text és buit
            if (text.isEmpty()) {
                // Finalitzar el programa
                text = "";
                System.out.println("Adéu");
            // Del contrari, fer la verificació si és enter o no
            } else {
                // Si comença per lletra no és un enter
                if (Character.isLetter(text.charAt(0)) || Character.isWhitespace(text.charAt(0)) || Character.isWhitespace(text.charAt(text.length()-1))) {
                    System.out.println("No és enter"); 
                // Del contrari, és un enter                   
                } else {
                    System.out.println("És enter");               
                }
            }
        }
    }
}
