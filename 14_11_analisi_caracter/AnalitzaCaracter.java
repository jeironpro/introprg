/**/

public class AnalitzaCaracter {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String nuevoText = "";
        
        if (!text.isEmpty()) {
            for (int i = 0; i < text.length(); i++) {
                if (Character.isLetter(text.charAt(i)) || Character.isDigit(text.charAt(i)) || Character.isWhitespace(text.charAt(i))) {
                    nuevoText += text.charAt(i);
                }
            }
            System.out.println("Posició?");
            int posicio = Integer.parseInt(Entrada.readLine());
            
            if (posicio < 0) {
                posicio = nuevoText.length() + Math.abs(posicio);
                while (posicio >= nuevoText.length()-1) {
                    posicio--;
                }
                System.out.print("'" + nuevoText.charAt(posicio) + "'");
                if (Character.isLetter(nuevoText.charAt(posicio))) {
                    if (Character.isUpperCase(nuevoText.charAt(posicio))) {
                        System.out.println(" és una lletra majúscula");
                    } else {
                        System.out.println(" és una lletra minúscula");
                    }            
                } else if (Character.isDigit(nuevoText.charAt(posicio))) {
                    System.out.println(" és un dígit");
                } else {
                    System.out.println(" és una altra cosa");
                }
            } else if (posicio >= nuevoText.length()) {
                while(posicio > nuevoText.length()-1) {
                    text = text + text;
                }
                System.out.print("'" + nuevoText.charAt(posicio) + "'");
                if (Character.isLetter(nuevoText.charAt(posicio))) {
                    if (Character.isUpperCase(nuevoText.charAt(posicio))) {
                        System.out.println(" és una lletra majúscula");
                    } else {
                        System.out.println(" és una lletra minúscula");
                    }            
                } else if (Character.isDigit(nuevoText.charAt(posicio))) {
                    System.out.println(" és un dígit");
                } else {
                    System.out.println(" és una altra cosa");
                }
            } else {
                System.out.print("'" + nuevoText.charAt(posicio) + "'");
                if (Character.isLetter(nuevoText.charAt(posicio))) {
                    if (Character.isUpperCase(nuevoText.charAt(posicio))) {
                        System.out.println(" és una lletra majúscula");
                    } else {
                        System.out.println(" és una lletra minúscula");
                    }            
                } else if (Character.isDigit(nuevoText.charAt(posicio))) {
                    System.out.println(" és un dígit");
                } else {
                    System.out.println(" és una altra cosa");
                }
            }            
        } else {
            System.out.println("Text buit");
        }
        
    }
}
