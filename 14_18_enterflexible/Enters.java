/* Aquest programa demana texts fins que rebre una entrada buida.
* Per cada text introduït et dira si és un enter o no.
*/

public class Enters {
    public static void main(String[] args) {
        // Demanar els texts
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        // Declarar e incializar text amb caracters
        String text = "true";
        String nombre = "";
        
        // El bucle s'executarà quan el text no sigui buit
        while (!text.isEmpty()) {
            boolean enter = false;
            // Rebent els texts
            text = Entrada.readLine();
            
            // Verificar si el text està buit
            if (!text.isEmpty()) {
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == '-' || text.charAt(i) == '+' || text.charAt(i) == '_' || text.charAt(i) == '.' || Character.isDigit(text.charAt(i))) {
                        nombre += text.charAt(i);
                        enter = true;
                    }
                }
                
                for (int j = 0; j < nombre.length(); j++) {
                    if (nombre.charAt(j) == '+' || nombre.charAt(j) == '-' || nombre.charAt(j) == '_' || nombre.charAt(j) == '.') {
                        if (nombre.charAt(j) == '+' || nombre.charAt(j) == '-' || Character.isDigit(nombre.charAt(j+1))) {
                            enter = true;
                        }
                    }
                }
                
                
                
                if (enter) {
                    System.out.println("És enter");
                } else {
                    System.out.println("No és enter");
                }
            } else {
                // Finalitzar el programa
                text = "";
                // Mostrar un missatge de comiat
                System.out.println("Adéu");             
            }
        }
    }
}
