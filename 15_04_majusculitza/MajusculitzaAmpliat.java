/* Aquest programa demana un text i et mostra el text transformat
* a capitalize (el primer caràcter de cada paraula en majúscula).
* Ara, incloent les vocals següent a l'apostrof
*/

public class MajusculitzaAmpliat {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        String text = Entrada.readLine();
        // Crear un nou String que guarde el text transformat
        String nouText = "";
        // El primer caràcter del text sempre serà majúscula
        // Declarar el boolean esMajuscula en false
        boolean esMajuscula = false;
        // Declarar e inicialitzar el String apostrof per guardar l'apòstrof
        String apostrof = "'";
        // Declarar e inicialitzar el boolean esApostrogf en false
        boolean esApostrof = false;
        
        // Verificar si el text no està buit
        if (!text.isEmpty()) {
            // Guardar els primer caràcters en majúscules
            nouText += Character.toUpperCase(text.charAt(0));
            // Fer un for per iterar tots els caràcters del text
            for (int i = 0; i < text.length()-1; i++) {
                // Assignarle false a esMajuscula per reiniciar el boolean en la iteració
                esMajuscula = false;
                // Assignarle false a esApostrof per reiniciar el boolean en la iteració
                esApostrof = false;
                
                // Verificar si es un espai en blanc o es el signe -
                if (Character.isWhitespace(text.charAt(i)) || text.charAt(i) == '-') {
                    // Verificar si després de un espai hi ha un caràcter amb un apòstrof
                    if (text.charAt(i+2) == apostrof.charAt(0)) {
                        // Assignarle false a esMajuscula
                        esMajuscula = false;
                        // Assignarle true a esApostrof
                        esApostrof = true;
                    } else {
                        // Assignarle true a esMajuscula
                        esMajuscula = true;
                    }
                } 
                
                // Verificar és un signo
                if (!Character.isLetter(text.charAt(i)) && !Character.isDigit(text.charAt(i))) {
                    // Assignarle true a esMajuscula
                    esMajuscula = true;
                }
                
                // Verificar si esMajuscula és true
                if (esMajuscula && !esApostrof) {
                    // Guardar el caràcter en majúscula
                    nouText += Character.toUpperCase(text.charAt(i+1));
                // Del contrari, quan esMajuscula sigui false
                } else {
                    // Guardar el caràcter en minúscula
                    nouText += Character.toLowerCase(text.charAt(i+1));
                }
            }
            // Mostrar el text transformat
            System.out.println(nouText);        
        }
    }
}
