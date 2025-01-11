/* Aquesta programa és la meva biblioteca on es troban algunes utilitats de strings com:

* Una funció que verificar si una paraula comença o acaba per vocal i retorna un valor boolean (esVocal).
*
* Una funció que filtra un text i retorna un String amb només les lletres del text (nomesLletres).
*
* Una funció que separa un text de només lletres i retorna un String amb les lletres separat per comes (lletresSeparades).
*/
public class UtilString {
    public static boolean esVocal(char caracter) {
        // Declarar e incialitzar el String vocals amb les vocals
        String vocals = "aàeèéiíïoóòuúü";
        
        // Fer un for per iterar totes les vocals
        for (int i = 0; i < vocals.length(); i++) {
            // Agafar els caràcters del String vocals
            char v = vocals.charAt(i);
            // Si el caràcter és una vocal, retornar true
            if (Character.toLowerCase(caracter) == v) {
                return true;                   
            }
        }     
        // Si no retorna true, retornarà false
        return false;
    }
    
    public static String nomesLletres(String text) {
        // Declarar e inicialitzar el String nouText buit
        String nouText = "";
        // Fer un for per iterar tots els caràcters de text
        for (int i = 0; i < text.length(); i++) {
            // Declarar e inicialitzar el char c amb tots els caràcter del text
            char c = text.charAt(i);
            // Si el caràcter és una lletra, guardar el caràcter en noutext
            if (Character.isLetter(c)) {
                nouText += c;
            }
        }
        // Retornar nouText amb només les lletres
        return nouText;
    }
    
    public static String lletresSeparades(String text) {
        // Declarar e inicialitzar el String nouText buit
        String nouText = "";
        // Fer un for per iterar tots els caràcters de text
        for (int i = 0; i < text.length(); i++) {
            // Declarar e inicialitzar el char c amb tots els caràcter del text
            char c = text.charAt(i);
            // Si i és menor a la longitud del text - 1, guardar els caràcters separat amb coma
            if (i < text.length()-1) {
                nouText += c + ", ";
            // Del contrari, guardar el caràcter sense coma
            } else {
                nouText += c;
            }
        }
        // Retornar nouText amb les lletres separat per coma
        return nouText;
    }
    
    public static String intervalString(String text, int ini, int fi) {
        // Declarar e inicialitzar el String intervalCaracters buit
        String intervalCaracters = "";
        // Si el valor de ini és menor o igual a la longitud del text 
        if (ini >= text.length()) {
            // El valor de ini és igual a la longitud del text -1
            ini = text.length()-1;
        }
        // Si el valor de fi és menor o igual a la longitud del text 
        if (fi >= text.length()) {
            // El valor de fi és igual a la longitud del text -1
            fi = text.length()-1;
        }
        // Si el valor de ini és negatiu
        if (ini < 0) {
            // El valor de ini és igua a 0
            ini = 0;
        }
        // Si el valor de fi és negatiu
        if (fi < 0) {
            // El valor de fi és igua a 0
            fi = 0;
        }
        // Si el valor de ini és menor o igual al valor de fi       
        if (ini <= fi) {
            // Fer un for creixent que itere tots els carácters del text en el rang de ini fins a fi
            for (int i = ini; i <= fi; i++) {
                // Declarar e inicialitzar el char c amb els carácters del text en el rango de ini fins a fi 
                char c = text.charAt(i);
                // En cada iteració, sumar-li al String intervalCaracters el carácter en la posició de i
                intervalCaracters += c;
            }
            // Al finalitzar el bucle, retornar els carácters guardat en el String 
            return intervalCaracters;
        // Del contrari, si el valor de ini és mayor al valor de fi 
        } else {
            // Fer un for decreixent que itere tots els carácters del text en el rang de ini fins a fi
            for (int i = ini; i >= fi; i--) {
                // Declarar e inicialitzar el char c amb els carácters del text en el rango de ini fins a fi
                char c = text.charAt(i);
                // En cada iteració, sumar-li al String intervalCaracters el carácter en la posició de i
                intervalCaracters += c;
            }
            // Al finalitzar el bucle, retornar els carácters guardat en el String 
            return intervalCaracters;
        }
    }
    
    public static boolean esEnter(String text) {
        // Si el text está buit
        if (text.isBlank()) {
            // Retornar false
            return false;     
        } 
        
        // Fer un for per iterar tots els caràcters del text
        for (int i = 0; i < text.length(); i++) {
            // Declarar e inicialitzar el char c amb tots els caràcter del text
            char c = text.charAt(i);
            // Si la longitud del text és major a 1 i el primer carácter és '-' o '+'
            if (text.length() > 1 && i == 0 && (c == '-' || c == '+')) {
                // Si el següent carácter no és un dígit 
                if (!Character.isDigit(text.charAt(i+1))) {
                    // Retornar false
                    return false;
                }
            // Del contrari, si el carácter no és un dígit
            } else if (!Character.isDigit(c)) {
                // Retornar false
                return false;
            }
        }
        // Si cap de les condicions anterior no es compleixen, retornar true
        return true; 
    }
    
    public static boolean esEnter(String text, boolean estricte) {
        // Si esEstricte és true
        if (estricte) {
            // Retornar el resultat del text passat com argument a la funció esEnter(String)
            return esEnter(text);
        // Del contrari
        } else {
            // Si el text está buit
            if (text.isBlank()) {
                // Retornar false
                return false;
            }
            // Declarar e inicialitzar el nouText buit
            String nouText = "";
            // Fer un for per iterar tots els carácter del text
            for (int i = 0; i < text.length(); i++) {
                // Declarar e inicialitzar el char c amb tots els caràcters del text
                char c = text.charAt(i);
                // Si el carácter és una lletra o un dígit o '-' o '+' o '.' o '_'
                if (Character.isLetter(c) || Character.isDigit(c) || c == '-' || c == '+' || c == '.' || c == '_') {
                    // Guardar el carácter en el nouText
                    nouText += c;
                }
            }
            
            // Fer un for per iterar tots els caràcters del nouText
            for (int i = 0; i < nouText.length(); i++) {
                // Declarar e inicialitzar el char c amb tots els caràcters del nouText
                char c = nouText.charAt(i);
                // Si la longitud del nouText és major a 1 i el primer carácter és '-' o '+'
                if (nouText.length() > 1 && i == 0 && (c == '-' || c == '+')) {
                    // Si el següent carácter no és un dígit 
                    if (!Character.isDigit(nouText.charAt(i+1))) {
                        // Retornar false
                        return false;
                    }
                // Del contrari, si el carácter és '.' o '_' i no es troba en els laterals 
                } else if (i-1 >= 0 && i+1 < nouText.length() && (c == '.' || c == '_')) {
                    // Si el carácter anterior i el següent no és un dígit
                    if (!Character.isDigit(nouText.charAt(i-1)) || !Character.isDigit(nouText.charAt(i+1))) {
                        // Retornar false
                        return false;
                    }
                // Del contrari, si no és un dígit
                } else if (!Character.isDigit(c)) {
                    return false;
                }
            }
            // Si cap de les condicions anterior no es compleixen, retornar true
            return true;
        }
    }
    
    public static int aEnter(String text) {
        // Retornar el text convertit a enter
        return Integer.parseInt(text);
    }
    
    public static int aEnter(String text, boolean estricte) {
        // Si estrice és true
        if (estricte) {
            // Retornar el resultat del text passat a la funció aEnter(String)
            return aEnter(text);  
        // Del contrari      
        } else {
            // Declarar e inicialitzar el String nouText buit
            String nouText = "";
            // Si la funció esEnter(String, boolean) retorna true
            if (esEnter(text, estricte)) {
                // Fer un for per iterar tots el carácters del text
                for (int i = 0; i < text.length(); i++) {
                    // Declarar e inicialitzar el char c amb tots els carácters del text
                    char c = text.charAt(i);
                    // Si el carácter és un dígit o '-' o '+'
                    if (Character.isDigit(c) || c == '-' || c == '+') {
                        // Guardar en nouText el carácter
                        nouText += c;
                    }
                }
            }
            // Retornar el nouText convertit a enter
            return Integer.parseInt(nouText);        
        }
    }
  
}
