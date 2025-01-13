/* Aquest programa és la meva biblioteca on es troben algunes utilitats de Strings com:
* Una funció per verificar si una paraula comença o acaba per vocal i retorna un valor boolean (esVocal).
*
* Una funció que filtra un text i retorna un String amb només les lletres del text (nomesLletres).
*
* Una funció que separa un text de només lletres i retorna un String amb les lletres separat per comes (lletresSeparades).
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
}
