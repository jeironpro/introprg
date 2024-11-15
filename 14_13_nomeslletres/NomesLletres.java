/* Aquest programa demana un text i et mostra nomes les lletres separats per una coma i un espai */

public class NomesLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String nouText = "";
        
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                nouText += text.charAt(i);
            }
        }
        for (int j = 0; j < nouText.length(); j++) {
            if (j < nouText.length()-1) {
                System.out.print(nouText.charAt(j) + ", ");
            } else {
                System.out.print(nouText.charAt(j));
            }
        }
    }
}
