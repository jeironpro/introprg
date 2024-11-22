/* Aquest programa demana una text i et mostra un resum del text que conté 
* La quantitat de lletres en majúscules 
* La quantitat de lletres en minúsucules
* El total de lletres
* La quantitat de vocals en majúscules
* La quantitat de vocals en minúscules
* El total de vocals
* La quantitat de dígits
* La quantitat de altres caràcters
* La longitud del text
*/

public class InformeText {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        String text = Entrada.readLine();
        // Comptador de lletres majúscules
        int contadorMajuscula = 0;
        // Comptador de lletres minúscules
        int contadorMinuscula = 0;
        // Comptador de vocals majúscules
        int contadorVocalMajuscula = 0;
        // Comptador de vocals minúscules
        int contadorVocalMinuscula = 0;
        // Comptador de totes les vocals
        int contadorVocals = 0;
        // Comptador dels dígits
        int contadorDigit = 0;
        // Comptador de altres caràcters
        int contadorAltresCaracter = 0;
        // Longitud del text
        int totalCaracter = text.length();
        // Vocals en majúscules (incloent les català)
        String vocalsMajuscules = "AÀEÉÈIÍÏOÓÒUÚÜ";
        // Vocals en minúscules (incloent les català)
        String vocalsMinuscules = "aàeéèiíïoóòuúü";
        
        // Fer un for per iterar tots els caràcters del text
        for (int i = 0; i < text.length(); i++) {
            // Verificar majúscules o minúscules
            if (Character.isLetter(text.charAt(i))) {
                if (Character.isUpperCase(text.charAt(i))) {
                    contadorMajuscula += 1;
                } else {
                    contadorMinuscula += 1;
                }
            }          
            // Fer un for per iterar les vocals en majúscules
            for (int k = 0; k < vocalsMajuscules.length(); k++) {
                if (text.charAt(i) == vocalsMajuscules.charAt(k)) {
                    contadorVocalMajuscula += 1;                 
                }
            }
            // Fer un for per iterar les vocals en minúscules
            for (int j = 0; j < vocalsMinuscules.length(); j++) {
                if (text.charAt(i) == vocalsMinuscules.charAt(j)) {
                    contadorVocalMinuscula += 1;
                }                    
            }
            // Verificar si és dígit
            if (Character.isDigit(text.charAt(i))) {
                contadorDigit += 1;
            }
            // Verificar si són altres caràcters
            if (!Character.isLetter(text.charAt(i)) && !Character.isDigit(text.charAt(i))) {
                contadorAltresCaracter += 1;
            }
        }
        // Mostrar informe
        System.out.println("Informe");
        System.out.println("=======");
        // Mostrar la quantitat de les lletres majúscules i el seu percentage
        System.out.printf("lletres en majúscules: %d (%.2f%%)%n", contadorMajuscula, 100.0 * contadorMajuscula / totalCaracter);
        // Mostrar la quantitat de les lletres minúscules i el seu percentage
        System.out.printf("lletres en minúscules: %d (%.2f%%)%n", contadorMinuscula, 100.0 * contadorMinuscula / totalCaracter);
        // Mostrar la quantitat de totes les lletres i el seu percentage
        System.out.printf("total lletres: %d (%.2f%%)%n", (contadorMajuscula + contadorMinuscula), 100.0 * (contadorMajuscula + contadorMinuscula) / totalCaracter);
        // Mostrar la quantitat de les vocals majúscules i el seu percentage
        System.out.printf("vocals en majúscules: %d (%.2f%%)%n", contadorVocalMajuscula, 100.0 * contadorVocalMajuscula / totalCaracter);
        // Mostrar la quantitat de les vocals minúscules i el seu percentage
        System.out.printf("vocals en minúscules: %d (%.2f%%)%n", contadorVocalMinuscula, 100.0 * contadorVocalMinuscula / totalCaracter);
        // Mostrar la quantitat de totes les vocals i el seu percentage
        System.out.printf("total vocals: %d (%.2f%%)%n", (contadorVocalMajuscula + contadorVocalMinuscula), 100.0 * (contadorVocalMajuscula + contadorVocalMinuscula) / totalCaracter);
        // Mostrar la quantitat de tots els dígits i el seu percentage
        System.out.printf("dígits: %d (%.2f%%)%n", contadorDigit, 100.0 * contadorDigit / totalCaracter);
        // Mostrar la quantitat de altres caràcters i el seu percentage
        System.out.printf("altres caràcters: %d (%.2f%%)%n", contadorAltresCaracter, 100.0 * contadorAltresCaracter / totalCaracter);
        // Mostrar la longitud del text
        System.out.println("total caràcters: " + totalCaracter);
    }
}
