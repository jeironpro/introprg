/**/

public class AnalitzaCaracter {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        System.out.println("Posició?");
        int posicio = Integer.parseInt(Entrada.readLine());
        
        if (posicio < 0) {
            posicio = text.length() + Math.abs(posicio);
            while (posicio >= text.length()-1) {
                posicio--;
            }
            System.out.print("'" + text.charAt(posicio) + "'");
            if (Character.isLetter(text.charAt(posicio))) {
                if (Character.isUpperCase(text.charAt(posicio))) {
                    System.out.println(" és una lletra majúscula");
                } else {
                    System.out.println(" és una lletra minúscula");
                }            
            } else if (Character.isDigit(text.charAt(posicio))) {
                System.out.println(" és un digit");
            } else {
                System.out.println(" és un sìmbol");
            }
        } else if (posicio >= text.length()) {
            while(posicio > text.length()-1) {
                text = text + text;
            }
            System.out.print("'" + text.charAt(posicio) + "'");
            if (Character.isLetter(text.charAt(posicio))) {
                if (Character.isUpperCase(text.charAt(posicio))) {
                    System.out.println(" és una lletra majúscula");
                } else {
                    System.out.println(" és una lletra minúscula");
                }            
            } else if (Character.isDigit(text.charAt(posicio))) {
                System.out.println(" és un digit");
            } else {
                System.out.println(" és un sìmbol");
            }
        } else {
            System.out.print("'" + text.charAt(posicio) + "'");
            if (Character.isLetter(text.charAt(posicio))) {
                if (Character.isUpperCase(text.charAt(posicio))) {
                    System.out.println(" és una lletra majúscula");
                } else {
                    System.out.println(" és una lletra minúscula");
                }            
            } else if (Character.isDigit(text.charAt(posicio))) {
                System.out.println(" és un digit");
            } else {
                System.out.println(" és un sìmbol");
            }
        }
    }
}
