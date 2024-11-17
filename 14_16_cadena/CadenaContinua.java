/* Aquest programa demana un text i un nombre enter, i et mostra
* tots els caràcters del text fins a arribar al nombre indicat, si rep
* un nombre major a la longitud del text, et mostrarà tots els caràcters
* del text i tornarà a començar des del primer caràcter fins a l'últim
* i així sucessivament fins a arribar al nombre indicat. 
*/

public class CadenaContinua {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        // Verificar si el text està buit
        if (text.isEmpty()) {
            // Com està buit mostrar missatge de error
            System.out.println("error");
        // Del contrari, no està buit
        } else {
            // Com el text no està buit, demanar el nombre 
            System.out.println("Nombre?");
            int nombre = Integer.parseInt(Entrada.readLine());
            
            // Verificar que el nombre sigui negatiu
            if (nombre < 0) {
                // Com es negatiu, no mostrar res
                System.out.print("");
            // Verificar si el nombre és menor a la longitud del text
            } else if (nombre < text.length()) {
                // Com es menor fer un for per iterar el nombre de caràcter demanat
                for (int i = 0; i < nombre; i++) {
                    // Mostrar els caràcters
                   System.out.print(text.charAt(i)); 
                }
            // Del contrari, el nombre és major a la longitud
            } else {
                // Com es major, fer un for que itere tots els caràcters
                for (int j = 0; j < text.length(); j++) {
                    // Vericar que el nombre sigui major a la longitud
                    if (nombre > text.length()) {
                        // Fer una resta per saber quants caràcters més cal afegir-li al text 
                        nombre = nombre - text.length();
                        // Fer un for per iterar els caràcters que es necessiten agregar al text
                        for (int k = 0; k < nombre; k++) {
                            // Agregar els caràcter del mateix text
                            text += text.charAt(k);
                        }
                    }
                }
                // Mostrar el text tots el caràcter agregats
                System.out.println(text);
            }
        }        
    }
}
