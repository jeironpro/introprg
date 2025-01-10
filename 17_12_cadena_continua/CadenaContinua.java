/* Aquest programa demana un text i un nombre enter, i et mostra
* tots els caràcters del text fins a arribar al nombre indicat, si rep
* un nombre major a la longitud del text, et mostrarà tots els caràcters
* del text i tornarà a començar des del primer caràcter fins a l'últim
* i així sucessivament fins a arribar al nombre indicat. Amb móduls de un altre fitxer. 
*/

public class CadenaContinua {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Si el text no está buit
        if (!text.isEmpty()) {
            // Demanar el nombre
            System.out.println("Nombre?");
            // Llegir el nombre
            String nombre = Entrada.readLine();
            // Si la funció esEnter (li passem el nombre) que està en el fixter UtilString, retorna true 
            if (UtilString.esEnter(nombre)) {
                // Convertir el nombre a enter
                int nombreConfirmat = Integer.parseInt(nombre);
                // Mostrar el String resultant de la funció cadenaContinua(li passem el text i el nombreConfirmat) que está en el fitxer UtilString
                System.out.println(UtilString.cadenaContinua(text, nombreConfirmat));
            // Del contrari
            } else {
                // Mostrar aquest missatge
                System.out.println("error");
            }        
        } else {
            // Mostrar aquest missatge
            System.out.println("error");
        }
    }
}
