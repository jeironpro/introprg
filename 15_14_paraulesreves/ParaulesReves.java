/* Aquest programa demana un text i et mostra cada paraula del text de manera
* invertida */

public class ParaulesReves {
    public static void main(String[] args) {
         // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        String paraula = "";
        
        if (text.length() <= 1) {
            System.out.println(text);
        } else {
            for (int i = 0; i < text.length(); i++) {
                if (Character.isLetter(text.charAt(i))) {
                    paraula += text.charAt(i);
                } else if (!Character.isLetter(text.charAt(i))) {
                    for (int j = paraula.length()-1; j >= 0; j--) {
                        System.out.print(paraula.charAt(j));
                    }
                    paraula = "";
                }
                if (!Character.isLetter(text.charAt(i)) || Character.isWhitespace(text.charAt(i))) {
                    System.out.print(text.charAt(i));            
                }
            }
        }
        
    }
}
