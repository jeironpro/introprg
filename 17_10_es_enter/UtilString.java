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
        // Declarar e inicialitzar el char signe amb el carácter en la posició 0
        char signe = text.charAt(0);
        // Si el char signe és diferent a - i + i un dígit 
        if (signe != '-' && signe != '+' && !Character.isDigit(signe)) {
            // Retornar false
            return false;
        }
        
        // Fer un for per iterar tots els caràcters de text des de la posicio 1
        for (int i = 1; i < text.length(); i++) {
            // Declarar e inicialitzar el char c amb tots els caràcter del text
            char c = text.charAt(i);
            // Si el carácter no és un dígit
            if (!Character.isDigit(c)) {
                // Retornar false
                return false;
            }
        }
        // Si cap de les condicions anterior no es compleixen, retornar true
        return true;
    }
}
