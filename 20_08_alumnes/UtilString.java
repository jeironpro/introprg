/* Aquest programa és la meva biblioteca on es troben algunes utilitats de Strings com:
* Una funció per verificar si una paraula comença o acaba per vocal i retorna un valor boolean (esVocal).
*
* Una funció que rep un text i retorna si és un valor enter o no, el valor pot ser negatiu o positiu, o pot tenir espai en blanc en els laterals (esEnter estricte).
*
* Una funció que rep un text i filtra les vocals catalanes, les canvia per les vocals normals i retorna un nou text. (filtraVocalCatala v1).
*
* Una funció que rep un text i un subtext i retornar si és substring o no, com l'utilitat de String contains (esSubstring estricte).
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
    
    public static String filtraVocalCatala(String text) {
        // Declarar e inicialitzar el nouText buit
        String nouText = "";
        
        // Fer un for per iterar tots els carácters del text
        for (int i = 0; i < text.length(); i++) {
            // Agafar els caràcters del String text en la posició de i i convertir-ho a minùscula
            char caracter = Character.toLowerCase(text.charAt(i));
            // Fer un switch expression que retorna un carácter
            char vocalCatala = switch (caracter) {
                case 'à' -> 'a';
                case 'è', 'é' -> 'e';
                case 'í', 'ï' -> 'i';
                case 'ò', 'ó' -> 'o';
                case 'ù', 'ú', 'ü' -> 'u';
                case 'ç' -> 'c';
                default -> caracter;
            };
            // Guardar el carácter en nouText
            nouText += vocalCatala;
        }
        // Retornar el nouText filtrat
        return nouText;
    }
    
    public static boolean esSubstring(String text, String subtext) {
        // Si la longitud del text és igual a 0 o la longitud del subtext és major a la longitud del text 
        if (text.length() == 0 || subtext.length() > text.length()) {
            // Retorna false
            return false;
        }
        // Si la longitud del text és major a 0 i la longitud del subtext és igual a 0
        if (text.length() > 0 && subtext.length() == 0) {
            // Retorna true
            return true;
        }
        
        // Fer un for per iterar tots els carácters del text
        for (int i = 0; i < text.length(); i++) {
            // Declarar e inicialitzar el int igualtat en 0
            int igualtat = 0;   
            // Fer un for per iterar tots els carácters del subtext
            for (int j = 0; j < subtext.length(); j++) {
                // Si i + igualtat és menor a la longitud del text
                if (i + igualtat < text.length()) {
                    // Si el carácter del text en la posició i + igualtat és igual a al carácter del subtext en la posició de j
                    if (text.charAt(i + igualtat) == subtext.charAt(j)) {
                        // Sumar-li 1 a igualtat, per verificar sí tots els caràcters del subtext estén en el text de manera seqüencial
                        igualtat++;
                    }
                // Del contrari
                } else {
                    // Aturar el bucle del subtext
                    break;
                }
            }
            // Si l'igualtat és igual a la longitud del subtext
            if (igualtat == subtext.length()) {
                // Retorna true
                return true;
            }
        }
        // Si cap condició retorna true, retornar false
        return false;
    }
}
