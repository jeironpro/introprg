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
        
        // El bucle s'executarà sempre i quan el text no està buit         
        while(!text.isEmpty()) {
            // Declarar e incialitzar el boolean enter en false
            boolean enter = true;
            // Tornar a llegir el text a dins del bucle
            text = Entrada.readLine();
            
            // Verificar si el text no està buit
            if (!text.isEmpty()) {
                
                // Fer un for per iterar tots els caràcters del text
                for (int i = 0; i < text.length(); i++) {
                    // Declarar e inicialitzar el char c amb cada caràcter del text
                    char c = text.charAt(i);
                    // Verificar si el caràcter és un dígit, o un simbol com -, +, . o _
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
                        
                        // Verificar si els caràcters no és dígit    
                        if (!Character.isDigit(c)) {
                            // enter serà false
                            enter = false;
                        }           
                        
                        // Verificar si els caràcter és un punt o un guion baix
                        if (c == '.' || c == '_') {
                            // Verificar si el caràcter en la posició anterior i següent al punt o guió és un dígit
                            if (i - 1 >= 0 && !Character.isDigit(nouText.charAt(i-1)) && i + 1 < nouText.length() && !Character.isDigit(nouText.charAt(i+1))) {
                                // enter serà true
                                enter = false;;
                            } 
                        }   
                    } 
                    // Verificar que el caràcter en la posició 0 no sigui un punt o un guió 
                    if (nouText.charAt(0) == '.' || nouText.charAt(0) == '_') {
                        // enter serà false
                        enter = false;                          
                    }
                    
                    // Verificar que el caràcter en la posició 0 és un signe de menys o més 
                    if (nouText.charAt(0) != '-' || nouText.charAt(0) != '+') {
                        // enter serà true
                        enter = false;
                        
                        // Fer un for per iterar tots els caràcters a partir de la posició 1
                        for (int i = 1; i < nouText.length(); i++) {
                            // Verificar si els caràcter no són dígit
                            if (!Character.isDigit(nouText.charAt(i))) {
                                // enter serà false
                                enter = false;                                
                            }
                        }                            
                    }
                }
                // Reiniciar el String nouText per tornar a guardar el text processat
                nouText = "";
                
                // Verificar si enter és true
                if (enter) {
                    // Mostrar aquest missatge
                    System.out.println("És enter");
                // Del contrari
                } else {
                    // Mostrar aquest missatge
                    System.out.println("No és enter");
                }
            }
        }
        // Quan el bucle deixi d'executar-se mostrar aquest missatge
        System.out.println("Adéu");
    }
}
