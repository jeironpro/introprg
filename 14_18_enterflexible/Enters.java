/* Aquest programa demana texts fins que rebre una entrada buida.
* Per cada text introduït et dira si és un enter o no.
*/

public class Enters {
    public static void main(String[] args) {
        // Demanar els texts
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        // Declarar e incializar text amb caracters
        String text = "true";
        boolean enter = false;
        
        // El bucle s'executarà quan el text no sigui buit
        while (!text.isEmpty()) {
            // Rebent els texts
            text = Entrada.readLine();
            
            // Verificar si el text està buit
            if (!text.isEmpty()) {
                enter = true;
                for (int i = 0; i < text.length(); i++) {
                    if (Character.isLetter(text.charAt(i))) {
                        enter = false;
                    }
                }
                
                
                if (enter == true) {
                    System.out.println("És enter");
                } else {
                    System.out.println("No és enter");
                }
            } else {
                // Finalitzar el programa
                text = "";
                // Mostrar un missatge de comiat
                System.out.println("Adéu");             
            }
        }
    }
}
