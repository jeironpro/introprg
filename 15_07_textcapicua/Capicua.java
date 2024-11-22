/* Aquest programa demana un text i et diu si es capicua o no
* Els textos capicua són els que es pot llegir al dret i a l'inrevès
* i són iguals. */

public class Capicua {
    public static void main (String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        text = text.toLowerCase();
        String textInvertit = "";
        
        for (int i = text.length()-1; i >= 0; i--) {
            textInvertit += text.charAt(i);            
        }
        
        if (text.equals(textInvertit)) {
            System.out.println("És capicua");                    
        } else {
            System.out.println("No és capicua");                    
        }
    }   
}
