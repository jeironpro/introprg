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
            boolean esEnter = true;
            
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
                
                for (int i = 0; i < nouText.length(); i++) {
                    char c = nouText.charAt(i);
                    // Verificar si el caràcter 0 és un signe de - o +
                    if (c == '-' || c == '+') {
                        // Verificar si el caràcter 1 és un dígit
                        if (i + 1 < nouText.length() && Character.isDigit(nouText.charAt(i+1))) {
                            // Com el caràcter 0 es un signe i el caràcter 1 és un dígit, enter es true
                            esEnter = true;
                        } else {
                            esEnter = false;
                        }                            
                    } 
                    if (c == '.' || c == '_') {
                        if (i - 1 >= 0 && Character.isDigit(nouText.charAt(i-1))) {
                            if (i + 1 < nouText.length() && Character.isDigit(nouText.charAt(i+1))) {
                                esEnter = true;
                            } else {
                                esEnter = false;
                            }
                        } else {
                            esEnter = false;
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
