/* Aquest programa demana un text i un nombre enter, i et mostra
* tots els caràcters del text fins a arribar al nombre indicat, si rep
* un nombre major a la longitud del text, et mostrarà tots els caràcters
* del text i tornarà a començar des del primer caràcter fins a l'últim
* i així sucessivament fins a arribar al nombre indicat. 
*/

public class CadenaContinua {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        if (text.isEmpty()) {
            System.out.println("error");
        } else {
            System.out.println("Nombre?");
            int nombre = Integer.parseInt(Entrada.readLine());
            
            if (nombre < text.length()) {
                System.out.print("");
            } else {
                for (int i = 0; i < text.length(); i++) {
                    if (nombre > text.length()) {
                        nombre = nombre - text.length();
                        for (int j = 0; j < nombre; j++) {
                            text += text.charAt(j);
                        }
                    }
                }
                System.out.println(text);
            }
            
        }        
    }
}
