/* Aquest programa demana texts fins que rebre una entrada buida.
* Per cada text introduït et dira si és un enter o no.
* Aquesta versió ignora els espais en blanc, els punts i guions baixos
* sempre que es trobin entre dos números.
*/

public class Enters {
    public static void main(String[] args) {
        // Demanar els texts
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        // Declarar e incialitzar el String text no buit, perquè s'execute el bucle al menys una vegada
        String text = "true";
        // Declarar e inicialitzar el String nouText buit
        String nouText = "";
        // Declarar e incialitzar el boolean enter en false
        boolean enter = false;
        
        // El bucle s'executarà sempre i quan el text no està buit         
        while(!text.isEmpty()) {
            // Tornar a llegir el text a dins del bucle
            text = Entrada.readLine();
            
            // Verificar si el text no està buit
            if (!text.isEmpty()) { 
                 // Com el text no està buit, enter és true           
                enter = true;
                
                // Fer un for per iterar tots els caràcters del text
                for (int i = 0; i < text.length(); i++) {
                    // Declarar e inicialitzar el char c amb cada caràcter del text
                    char c = text.charAt(i);
                    // Verificar si el caràcter és una lletra
                    if (Character.isLetter(c)) {
                        // enter serà false
                        enter = false;
                    }               
                    // Verificar si el caràcter no és un digit, o un simbol com -, +, . o _
                    if (Character.isDigit(c) || c == '-' || c == '+' || c == '.' || c == '_') {
                        // Guardar aquests caràcters a nouText
                        nouText += c;
                    }
                }
                
                // Verificar si el nouText no està buit
                if (!nouText.isEmpty()) {
                    // Fer un for per iterar tots els caràcters del nouText
                    for (int i = 0; i < nouText.length(); i++) {
                        // Declarar e inicialitzar el char c amb cada caràcter del nouText
                        char c = nouText.charAt(i);  
                        // Verificar si els caràcters no és digit    
                        if (!Character.isDigit(c)) {
                            // enter serà false
                            enter = false;
                        }           
                        // Verificar si els caràcter és un punt o un guion baix
                        if (c == '.' || c == '_') {
                            // Verificar si el caràcter anterior i següent al punt o guió és un digit
                            if (i - 1 >= 0 && Character.isDigit(nouText.charAt(i-1)) && i + 1 < nouText.length() && Character.isDigit(nouText.charAt(i+1))) {
                                // enter serà true
                                enter = true;;
                            } else {
                                enter = false;
                            }
                        }   
                    }
                    if (nouText.charAt(0) == '-' || nouText.charAt(0) == '+') {
                        enter = true;
                        for (int i = 1; i < nouText.length(); i++) {
                            if (!Character.isDigit(nouText.charAt(i))) {
                                enter = false;                                
                            }
                        }                            
                    }
                }
                nouText = "";
                if (enter) {
                    System.out.println("És enter");
                } else {
                    System.out.println("No és enter");
                }
            }
        }
        System.out.println("Adéu");
    }
}
