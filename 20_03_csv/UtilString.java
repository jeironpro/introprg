/* Aquest programa és la meva biblioteca on es troben algunes utilitats de Strings com:
* Una funció per verificar si una paraula comença o acaba per vocal i retorna un valor boolean (esVocal).
*
* Una funció que rep un text i retorna si és un valor enter o no, el valor pot ser negatiu o positiu, o pot tenir espai en blanc en els laterals (esEnter estricte).
*
* Una funció que rep un text i un boolean i retorna si és un valor enter o no, el valor pot ser negatiu o positiu, o pot tenir espai en blanc en qualsevol joc, o punt o guió baix entre dos nombres (esEnter flexible).
*
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
}
