/* Aquest programa és la meva biblioteca on es troben algunes utilitats de Strings com:
* Una funció per verificar si una paraula comença o acaba per vocal i retorna un valor boolean (esVocal).
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
}
