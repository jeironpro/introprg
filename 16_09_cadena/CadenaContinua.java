/* Programa que demana un text i un nombre enter, i et mostra
* tots els caràcters del text fins a arribar al nombre indicat, si rep
* un nombre major a la longitud del text, et mostrarà tots els caràcters
* del text i tornarà a començar des del primer caràcter fins a l'últim
* i així sucessivament fins a arribar al nombre indicat. 
*/

public class CadenaContinua {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        
        // Verificar si el text no està buit
        if (!text.isEmpty()) {
            // Demanar el nombre 
            System.out.println("Nombre?");
            // Llegir el nombre
            int nombre = Integer.parseInt(Entrada.readLine());
            // Verificar si el nombre és major o igual a 0
            if (nombre >= 0) {
                // Passar-li els valors llegits al módul
                mostraCadenaContinua(text, nombre);
            }
        // Del contrari
        } else {
            // Mostrar aquest missatge
            System.out.println("error");
        }    
    }
    
    public static void mostraCadenaContinua(String text, int longitud) {
        for (int i = 0; i < longitud; i++) {
            System.out.print(text.charAt(i % text.length()));
        }
    }
}
