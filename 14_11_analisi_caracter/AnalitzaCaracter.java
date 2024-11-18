/**/

public class AnalitzaCaracter {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        if (!text.isEmpty()) {
            System.out.println("Posició?");
            int posicio = Integer.parseInt(Entrada.readLine());
            
            if (posicio < 0) {
                posicio = Math.abs(posicio) % text.length();
                System.out.println(text.charAt(posicio));
            } else if (posicio < text.length()) {
                System.out.println(text.charAt(posicio));                     
            } else if (posicio > text.length()) {
                posicio = posicio % text.length();
                System.out.println(text.charAt(posicio));
            }
        } else {
            System.out.println("Text buit");
        }
        
    }
}
