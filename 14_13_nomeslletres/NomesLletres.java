/* Aquest programa demana un text i et mostra nomes les lletres separats per una coma i un espai */

public class NomesLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        
         for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (i <= 1) {
                    System.out.print(text.charAt(i)); 
                } else {
                    System.out.print(text.charAt(i) + ", ");                              
                }
            }
        }
    }
}
