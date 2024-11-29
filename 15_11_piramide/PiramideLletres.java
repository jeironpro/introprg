/* Aquest programa demana un text i et mostra una piramide del caràcters del text */

public class PiramideLletres {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        
        // Fer un for per iterar tots els caràcters del text
        for(int i = 0; i < text.length(); i++) {
            
            for (int j = i; j < text.length()-1; j++) {
                System.out.print(".");
                System.out.print(".");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(text.charAt(k));
                if (k < i) {
                    System.out.print(".");
                }
                if (k == i) {
                    System.out.print("-");
                }
            }
            for (int k = i; k >= 0; k--) {
                System.out.print(text.charAt(k));
                if (k > 0) {
                    System.out.print(".");
                }
            }
            for (int j = i; j < text.length()-1; j++) {
                System.out.print(".");
                System.out.print(".");
            }
            // Fer un salt de línia en cada iteració de i
            System.out.println();
        }      
    }
}
