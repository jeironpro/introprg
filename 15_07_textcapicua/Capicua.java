/* Aquest programa demana un text i et diu si es capicua o no
* Els textos capicua són els que es pot llegir al dret i a l'inrevès
* i són iguals. */

public class Capicua {
    public static void main (String[] args) {
        // Demanar el text
        System.out.println("Text?");
        String text = Entrada.readLine();
        // Declarar e inicialitzar la variable textInvertit buida
        String textInvertit = "";
        boolean esCapicua = true;
        
        // Fer un for per iterar tots els caràcters del text
        for (int i = text.length()-1; i >= 0; i--) {
            // Guardar tots el caràcter del text en la variable textInvertit
            textInvertit += Character.toLowerCase(text.charAt(i));     
        }
        // Fer un for per iterar tots els caràcters del text i el textInvertit
        for (int i = 0; i < text.length(); i++) {
            // Verificar si qualsevol caràcter es diferents
            if (text.charAt(i) != textInvertit.charAt(i)) {
                // Assignarle false a esCapicua
                esCapicua = false;
            }    
        }
        
        // Verificar si el text i textInvertit no estem buit i que sigui iguals
        if (!text.isEmpty() && esCapicua) {
            // Mostrar aquest missatge           
            System.out.println("És capicua");                    
        // Del contrari
        } else {
            // Mostrar aquest missatge
            System.out.println("No és capicua");                    
        }
    }   
}
