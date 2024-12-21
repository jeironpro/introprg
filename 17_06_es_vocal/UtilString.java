/* Programa que conté una funció que rep un caràcter i verifica si és una 
* vocal o no. Retorna true si ho és i false si no ho és
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
        // Si no retorna true, retornar false
        return false;
    }
}
