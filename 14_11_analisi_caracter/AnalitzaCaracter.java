/**/


public class AnalitzaCaracter {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String caracter = "";
        
        if (!text.isEmpty()) {
            System.out.println("Posició?");
            int posicio = Integer.parseInt(Entrada.readLine());
            
            if (posicio < 0) {
                posicio = Math.abs(posicio) % text.length();
                caracter += text.charAt(posicio);
            } else if (posicio < text.length()) {
                caracter += text.charAt(posicio);                     
            } else if (posicio > text.length()) {
                posicio = posicio % text.length();
                caracter += text.charAt(posicio);
            }
            
            if (Character.isLetter(caracter.charAt(0))) {
                if (Character.isUpperCase(caracter.charAt(0))) {
                    System.out.println("'" + caracter + "'" + " és una lletra majúscula");
                } else {
                    System.out.println("'" + caracter + "'" + " és una lletra minúscula");
                }
            } else if (Character.isDigit(caracter.charAt(0))) {
                System.out.println("'" + caracter + "'" + " és un digit");
            } else {
                System.out.println("'" + caracter + "'" + " és una altra cosa");
            }
        } else {
            System.out.println("Text buit");
        }
        
    }
}
