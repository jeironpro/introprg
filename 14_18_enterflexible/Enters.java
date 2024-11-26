/* Aquest programa demana texts fins que rebre una entrada buida.
* Per cada text introduït et dira si és un enter o no.
*/

public class Enters {
    public static void main(String[] args) {
        // Demanar els texts
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        // Declarar e incializar text amb caracters
        String text = "true";
        int pos = 0;
        
        // El bucle s'executarà quan el text no sigui buit
        while (!text.isEmpty()) {
            boolean enter = false;
            // Rebent els texts
            text = Entrada.readLine();
            
            // Verificar si el text està buit
            if (!text.isEmpty()) {
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == '-' || text.charAt(i) == '+' || text.charAt(i) == '_' || text.charAt(i) == '.' || Character.isDigit(text.charAt(i))) {
                        enter = true;
                    }
                }
                
                
                if ((text.charAt(0) == '-' || text.charAt(0) == '+') && Character.isDigit(text.charAt(1))) {
                    enter = true;
                } else if ((text.charAt(0) == '-' || text.charAt(0) == '+') && (text.charAt(1) == '-' || text.charAt(1) == '+')) {
                    enter = false;
                } else if (Character.isWhitespace(text.charAt(0))) {
                    if (text.charAt(1) == '+' || text.charAt(1) == '-') {
                        enter = true;
                    }
                } else if ((text.charAt(0) == '+' || text.charAt(0) == '-') && Character.isWhitespace(text.charAt(1))) {
                    enter = false;
                }
                
                if (enter) {
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
