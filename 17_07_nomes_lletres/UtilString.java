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
}
