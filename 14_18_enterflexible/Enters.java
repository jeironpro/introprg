/* Aquest programa demana texts fins que rebre una entrada buida.
* Per cada text introduït et dira si és un enter o no.
*/

public class Enters {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = "true";
        String nouText = "";
        boolean esEnter = false;
                 
        while(!text.isEmpty()) {
            text = Entrada.readLine();
            if (!text.isEmpty()) {            
                esEnter = true;
                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);
                    if (Character.isLetter(c)) {
                        esEnter = false;
                    } 
                    if (!Character.isWhitespace(c) && (!Character.isLetter(c) || c == '-' || c == '+' || c == '.' || c == '_')) {
                        nouText += c;
                    }
                }
                
                if (!nouText.isEmpty()) {
                    for (int i = 0; i < nouText.length(); i++) {
                        char c = nouText.charAt(i);      
                        if (!Character.isDigit(c)) {
                            esEnter = false;
                        }           
                        if (c == '.' || c == '_') {
                            if (i - 1 >= 0 && Character.isDigit(nouText.charAt(i-1)) && i + 1 < nouText.length() && Character.isDigit(nouText.charAt(i+1))) {
                                esEnter = true;;
                            } 
                        }   
                    } 
                    if (nouText.charAt(0) == '_' || nouText.charAt(0) == '.') {
                        esEnter = false;                          
                    }
                    if (nouText.charAt(0) == '-' || nouText.charAt(0) == '+') {
                        esEnter = true;
                        for (int i = 1; i < nouText.length(); i++) {
                            if (!Character.isDigit(nouText.charAt(i))) {
                                esEnter = false;                                
                            }
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
