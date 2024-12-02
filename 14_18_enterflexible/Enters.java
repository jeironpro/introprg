/* Aquest programa demana texts fins que rebre una entrada buida.
* Per cada text introduït et dira si és un enter o no.
*/

public class Enters {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = "true";
        String nouText = "";
                 
        while(!text.isEmpty()) {
            text = Entrada.readLine();
            boolean esEnter = false;
            
            if (!text.isEmpty()) {
                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);
                    if (Character.isDigit(c)) {
                        esEnter = true;
                    }
                    if (!Character.isWhitespace(c) && (!Character.isLetter(c) || c == '-' || c == '+' || c == '.' || c == '_')) {
                        nouText += c;
                    }
                }
                if (!nouText.isEmpty()) {
                    // Verificar si el caràcter 0 és un signe de - o +
                    if (nouText.charAt(0) == '-' || nouText.charAt(0) == '+') {
                        // Verificar si el caràcter 1 és un dígit
                        if (Character.isDigit(nouText.charAt(1))) {
                            // Com el caràcter 0 es un signe i el caràcter 1 és un dígit, enter es true
                            esEnter = true;
                        } else {
                            esEnter = false;
                        }                            
                    }            
                }
                
                for (int i = 0; i < nouText.length(); i++) {
                    char c = nouText.charAt(i);
                    
                    if (i == 0) {
                        if (c == '_' || c == '.') {
                            esEnter = false;
                        }
                    }
                    if (c == '.' || c == '_') {
                        if (i + 1 < text.length() && Character.isDigit(nouText.charAt(i+1))) {
                            esEnter = true;
                        } else {
                            esEnter = false;
                            break;
                        }
                    }
                }
                nouText = "";
                
                if (esEnter) {
                    System.out.println("És enter");
                } else {
                    System.out.println("No és enter");
                }
            }
        }
        System.out.println("Adéu");
    }
}
