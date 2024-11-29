/* Aquest programa demana un text i et diu si es capicua o no
* Els textos capicua són els que es pot llegir al dret i a l'inrevès
* i són iguals.
* Aquesta es un versió avançada.
*/

public class Capicua {
    public static void main (String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Declarar e inicialitzar la variable textInvertit buida
        String textInvertit = "";
        // Declarar e inicialitzar el String nouText buit
        String nouText = "";
        // Declarar el boolean esCapicua amb true
        boolean esCapicua = true;
        
        // Fer un for per iterar tots els caràcters del text
        for (int i = 0; i < text.length(); i++) {
            // Verificar si els caràcters són lletres
            if (Character.toLowerCase(text.charAt(i)) >= 'a' && Character.toLowerCase(text.charAt(i)) <= 'z') {
                // Verificar si és una ç
                if (Character.toLowerCase(text.charAt(i)) == 'ç') {
                    // Guardar-la com una c
                    nouText += 'c';
                // Verificar si és una à
                } else if (Character.toLowerCase(text.charAt(i)) == 'à') {
                    // Guardar-la com una a
                    nouText +=  'a';
                // Verificar si és una è o é
                } else if (Character.toLowerCase(text.charAt(i)) == 'è' || Character.toLowerCase(text.charAt(i)) == 'é') {
                    // Guardar-la com una e
                    nouText +=  'e';
                // Verificar si és una í o ï
                } else if (Character.toLowerCase(text.charAt(i)) == 'í' || Character.toLowerCase(text.charAt(i)) == 'ï') {
                    // Guardar-la com una i
                    nouText +=  'i';
                // Verificar si és una ò o ó
                } else if (Character.toLowerCase(text.charAt(i)) == 'ò' || Character.toLowerCase(text.charAt(i)) == 'ó') {
                    // Guardar-la com una i
                    nouText +=  'o';
                // Verificar si és una ú o ü
                } else if (Character.toLowerCase(text.charAt(i)) == 'ú' || Character.toLowerCase(text.charAt(i)) == 'ü') {
                    // Guardar-la com una i
                    nouText +=  'u';
                // Del contrari
                } else {
                    // Guarda en nouText la lletra tal qual
                    nouText += Character.toLowerCase(text.charAt(i));
                }
            } 
        }
        
        // Fer un for per iterar tots els caràcters del nouText de manera decreixent
        for (int i = nouText.length()-1; i >= 0; i--) {
            if (Character.isLetter(nouText.charAt(i))) {
                // Guardar tots el caràcter del nouText en la variable textInvertit
                textInvertit += nouText.charAt(i);
            }
        }
        
        // Fer un for per iterar tots els caràcters del nouText
        for (int i = 0; i < nouText.length(); i++) {
                // Verificar si qualsevol caràcter del nouText és diferent al del textInvertit
                if (nouText.charAt(i) != textInvertit.charAt(i)) {
                    // Assignarle false a esCapicua
                    esCapicua = false;
                }
        }
        
        // Verificar si el text i textInvertit no estem buit i que sigui iguals
        if (!text.isBlank() && esCapicua) {
            // Mostrar aquest missatge           
            System.out.println("\"" + text + "\"" + " és capicua");                    
        // Del contrari
        } else {
            // Mostrar aquest missatge
            System.out.println("\"" + text + "\"" + " no és capicua");                    
        }
    }   
}
