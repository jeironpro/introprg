/* Aquest programa és la meva biblioteca on es troben algunes utilitats de Strings com:
* Una funció que rep un text i un subtext i retornar si és substring o no, com l'utilitat de String contains (esSubstring estricte).
*
* Una funció que rep un text i un prefix i retornar si és el començament del text de manera seqüencial o no, com l'utilitat de String startsWith (esPrefix estricte).
*
* Una funció que rep un text i un sufix i retornar si és la terminació del text de manera seqüencial o no, com l'utilitat de String endsWith (esSufix estricte).
*/

public class UtilString {
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
    
    public static boolean esPrefix(String text, String prefix) {
        // Si la longitud del text és igual a 0 o la longitud del prefix és major a la longitud del text 
        if (text.length() == 0 || prefix.length() > text.length()) {
            // Retorna false
            return false;
        }
        // Si la longitud del text és major a 0 i la longitud del prefix és igual a 0
        if (text.length() > 0 && prefix.length() == 0) {
            // Retorna true
            return true;
        }
        
        // Declarar e inicialitzar el int igualtat en 0
        int igualtat = 0;
        // Fer un for per iterar els carácter del prefix
        for (int i = 0; i < prefix.length(); i++) {
            // Si el carácter de prefix i text en la posicio de i son iguals
            if (prefix.charAt(i) == text.charAt(i)) {
                // Sumar-li 1 a igualtat, per verificar sí tots els caràcters del prefix estén en el text de manera seqüencial
                igualtat++;
            }
            // Si l'igualtat és igual a la longitud del prefix
            if (igualtat == prefix.length()) {
                // Retornar true
                return true;
            }
        }
        // Si cap condició retorna true, retornar false
        return false;
    }
    
    public static boolean esSufix(String text, String sufix) {
        // Si la longitud del text és igual a 0 o la longitud del sufix és major a la longitud del text 
        if (text.length() == 0 || sufix.length() > text.length()) {
            // Retorna false
            return false;
        }
        // Si la longitud del text és major a 0 i la longitud del sufix és igual a 0
        if (text.length() > 0 && sufix.length() == 0) {
            // Retorna true
            return true;
        }
        // Declarar e inicialitzar el int igualtat en 0
        int igualtat = 0;
        // Declarar e inicialitzar el int j amb el valor de la longitud de sufix -1
        int j = sufix.length()-1;
        // Fer un for per iterar tots els carácters del text de manera decreixent
        for (int i = text.length()-1; i >= 0; i--) {
            // Si el carácter de sufix i de text en la darrera posició son igual 
            if (sufix.charAt(j) == text.charAt(i)) {
                // Sumar-li 1 a igualtat, per verificar sí tots els caràcters del sufix estén en el text de manera seqüencial
                igualtat++;
            }
            // Si j és major o igual a 1 (no permetre que i passi a -1)
            if (j >= 1) {
                // Decrementar en 1 a j
                j--;
            }
            // Si l'igualtat és igual a la longitud del sufix
            if (igualtat == sufix.length()) {
                // Retornar true
                return true;
            }
        }
        // Si cap condició retorna true, retornar false
        return false;
    }
}
