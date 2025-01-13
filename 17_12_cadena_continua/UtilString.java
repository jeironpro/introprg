/* Aquest programa és la meva biblioteca on es troben algunes utilitats de Strings com:
* Una funció per verificar si una paraula comença o acaba per vocal i retorna un valor boolean (esVocal).
*
* Una funció que filtra un text i retorna un String amb només les lletres del text (nomesLletres).
*
* Una funció que separa un text de només lletres i retorna un String amb les lletres separat per comes (lletresSeparades).
*
* Una funció que rep un text, un valor inicial i un valor final i retorna un interval del text en el rang d'inici i final ambdós inclosos (intervalString).
*
* Una funció que rep un text i retorna si és un valor enter o no, el valor pot ser negatiu o positiu, o pot tenir espai en blanc en els laterals (esEnter estricte).
*
* Una funció que rep un text i un boolean i retorna si és un valor enter o no, el valor pot ser negatiu o positiu, o pot tenir espai en blanc en qualsevol joc, o punt o guió baix entre dos nombres (esEnter flexible).
*
* Una funció que rep un text i el converteix a enter des del mètode Integer.parseInt (aEnter estricte).
*
* Una funció que rep un text i el converteix a enter des del mètode Integer.parseInt, el valor pot ser negatiu o positiu, o pot tenir espai en blanc en qualsevol joc, punt o guió baix entre dos nombres (aEnter flexible).
*
* Una funció que rep un text i una quantitat i retorna un String format per la repetició circular de carácters fins a la quantitat (cadenaContinua).
*/
public class UtilString {
    public static boolean esVocal(char caracter) {
        // Almacenar en el String vocals les vocals inclòs les catalanes
        String vocals = "aàeèéiíïoóòuúü";
        // Fer un for per iterar totes les vocals
        for (int i = 0; i < vocals.length(); i++) {
            // Agafar els caràcters del String vocals en la posició de i
            char v = vocals.charAt(i);
            // Si el caràcter en minúscula és una vocal, retornar true
            if (Character.toLowerCase(caracter) == v) {
                // Retornar true
                return true;                   
            }
        }     
        // Si no retorna true, retornar false
        return false;
    }
    
    public static String nomesLletres(String text) {
        // Declarar e inicialitzar el String nouText buit
        String nouText = "";
        // Fer un for per iterar tots els caràcters del text
        for (int i = 0; i < text.length(); i++) {
            // Agafar els caràcters del String text en la posició de i
            char c = text.charAt(i);
            // Si el caràcter és una lletra
            if (Character.isLetter(c)) {
                // Guardar el caràcter en nouText
                nouText += c;
            }
        }
        // Retornar nouText amb només les lletres
        return nouText;
    }
    
    public static String lletresSeparades(String text) {
        // Declarar e inicialitzar el String nouText buit
        String nouText = "";
        // Fer un for per iterar tots els caràcters del text
        for (int i = 0; i < text.length(); i++) {
            // Agafar els caràcters del String text en la posició de i
            char c = text.charAt(i);
            // Si i és menor a la longitud del text - 1
            if (i < text.length()-1) {
                // Guardar el caràcter separat amb coma
                nouText += c + ", ";
            // Del contrari
            } else {
                // Guardar el caràcter sense coma
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
            // El valor de ini és igual a 0
            ini = 0;
        }
        // Si el valor de fi és negatiu
        if (fi < 0) {
            // El valor de fi és igual a 0
            fi = 0;
        }
        // Si el valor de ini és menor o igual al valor de fi       
        if (ini <= fi) {
            // Fer un for creixent que itere tots els carácters del text en el rang de ini i fi ambdos inclòs
            for (int i = ini; i <= fi; i++) {
                // Agafar els carácters del text en el rang de ini fins a fi ambdos inclòs
                char c = text.charAt(i);
                // En cada iteració, sumar-li al String intervalCaracters el carácter en la posició de i
                intervalCaracters += c;
            }
            // Retornar els carácters guardat en el intervalCaracters 
            return intervalCaracters;
        // Del contrari, si el valor de ini és mayor al valor de fi 
        } else {
            // Fer un for decreixent que itere tots els carácters del text en el rang de ini fins a fi ambdos inclòs
            for (int i = ini; i >= fi; i--) {
                // Agafar els carácters del text en el rang de ini fins a fi ambdos inclòs
                char c = text.charAt(i);
                // En cada iteració, sumar-li al String intervalCaracters el carácter en la posició de i
                intervalCaracters += c;
            }
            // Retornar els carácters guardat en el intervalCaracters
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
            // Agafar els caràcters del String text en la posició de i
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
        // Si estricte és true
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
                // Agafar els caràcters del String text en la posició de i
                char c = text.charAt(i);
                // Si el carácter és una lletra o un dígit o '-' o '+' o '.' o '_'
                if (Character.isLetter(c) || Character.isDigit(c) || c == '-' || c == '+' || c == '.' || c == '_') {
                    // Guardar el carácter en el nouText
                    nouText += c;
                }
            }
            
            // Fer un for per iterar tots els caràcters del nouText
            for (int i = 0; i < nouText.length(); i++) {
                // Agafar els caràcters del String nouText en la posició de i
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
                    // Retornar false
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
                    // Agafar els caràcters del String text en la posició de i
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
    
    public static String cadenaContinua(String text, int quantitat) {
        // Declarar e inicialitzar el String caractersResultant buit
        String caractersResultant = "";
        // Fer un for per iterar tots els carácters en el rang de 0 i quantitat
        for (int i = 0; i < quantitat; i++) {
            // Agafar els carácters en la posició de i residu de la longitud del text
            char c = text.charAt(i % text.length());
            // Guadar el carácter en caractersResultant
            caractersResultant += c;
        }
        // Retornar caractersResultant amb els carácters resultant
        return caractersResultant;
    }
}
