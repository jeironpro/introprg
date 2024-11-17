/* Aquest programa demana texts fins que rebre una entrada buida.
* Per cada text introduït et dira si és un enter o no.
*/

public class Enters {
    public static void main(String[] args) {
        // Demanar els texts
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        // Declarar e incializar text amb caracters
        String text = "true";
        // Declarar e incializar enter com false
        boolean enter = false;
        
        // El bucle s'executarà quan el text no sigui buit
        while (!text.isEmpty()) {
            // Rebent els texts
            text = Entrada.readLine();
            
            // Verificar si el text està buit
            if (!text.isEmpty()) {
                // Com el text no està buit, enter és true
                enter = true;
                for (int i = 0; i < text.length(); i++) {
                    // Verificar si els caràcter del text són digits
                    if (!Character.isDigit(text.charAt(i))) {
                        // Com no lo són enter serà false
                        enter = false;
                    } 
                    // Verificar que i és a la poscició 0
                    if (i == 0) {
                        // Verificar si el caràcter 0 és un signe de - o +
                        if (text.charAt(i) == '-' || text.charAt(i) == '+') {
                            // Si el caràcter 0 és un signe de - o +, sumar-li 1 a i
                            i = i + 1;
                            // Verificar si el caràcter 1 és un dígit
                            if (i == 1 && Character.isDigit(text.charAt(i))) {
                                // Com el caràcter 0 es un signe i el caràcter 1 és un dígit, enter es true
                                enter = true;
                            }                            
                        }
                    }
                }
                // Si enter és true
                if (enter == true) {
                    // Mostrar que és enter
                    System.out.println("És enter");
                // De lo contrari
                } else {
                    // Mostrar que no és un enter
                    System.out.println("No és enter");
                }
            // Del contrari
            } else {
                // Finalitzar el programa
                text = "";
                // Mostrar un missatge de comiat
                System.out.println("Adéu");             
            }
        }
    }
}
