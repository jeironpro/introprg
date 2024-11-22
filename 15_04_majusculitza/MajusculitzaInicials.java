/* Aquest programa demana un text i et mostra el text transformat
* a capitalize (el primer caràcter de cada paraula en majúscula).
*/

public class MajusculitzaInicials {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        String text = Entrada.readLine();
        // Crear un nou String que guarde el text transformat
        String nouText = "";
        // El primer caràcter del text sempre serà majúscula
        nouText += Character.toUpperCase(text.charAt(0));
        // Declarar el boolean esMajuscula en false
        boolean esMajuscula = false;
       
        for (int i = 0; i < text.length()-1; i++) {
            // Assignarle false a esMajuscula per reiniciar el boolean en la iteració
            esMajuscula = false; 
            // Verificar si es un espai en blanc o es el signe -
            if (Character.isWhitespace(text.charAt(i)) || text.charAt(i) == '-') {
                // Assignarle true a esMajuscula
                esMajuscula = true;
            } 
            
            if (!Character.isLetter(text.charAt(i)) || !Character.isDigit(text.charAt(i))) {
                esMajuscula = false;
            }
            
            
            // Verificar si esMajuscula és true
            if (esMajuscula) {
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
