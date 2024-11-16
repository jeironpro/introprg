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
            if (!text.isEmpty()) {
                if (text.charAt(0) == '-' || text.charAt(0) == '+' || (Character.isDigit(text.charAt(0)) && Character.isDigit(text.length()-1))) {
                    System.out.println("És enter");
                } else {
                    System.out.println("No és enter");
                }
            // Del contrari, fer la verificació si és enter o no
            } else {
                // Finalitzar el programa
                text = "";
                System.out.println("Adéu");             
            }
        }
    }
}
