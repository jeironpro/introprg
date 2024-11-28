/**/

public class TriangleParaules {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String nouText = text + " ";
        
        for (int i = 0; i < nouText.length(); i++) {
            if (Character.isWhitespace(nouText.charAt(i))) {
                for (int j = 0; j <= i+1; j++) {
                    System.out.print(nouText.charAt(j));
                }
                System.out.println();            
            }
        }
    }
}
