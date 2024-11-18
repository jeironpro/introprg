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
                posicio = Math.abs(posicio);
                String textInvertido = "";
                int posicioInvertida = 0;
                for (int i = text.length()-1; i > 0; i--) {
                    textInvertido += text.charAt(i); 
                }
                if (posicio < text.length()) {
                    caracter += textInvertido.charAt(posicio-1);                 
                } else if (posicio > text.length()) {
                    while (posicio > text.length()-1) {
                        posicio = posicio - text.length(); 
                    }
                    
                    if (posicio > text.length()*2) {
                        caracter += text.charAt(Math.abs(posicio));
                    } else {
                        caracter += textInvertido.charAt(Math.abs(posicio-1));                    
                    }
                } else {
                    caracter += text.charAt(0); 
                }
            } else if (posicio < text.length()) {
                caracter += text.charAt(posicio);                     
            } else if (posicio > text.length()) {
                posicio = posicio % text.length();
                caracter += text.charAt(posicio);
            } else {
                caracter += text.charAt(0);
            }
            
            if (Character.isLetter(caracter.charAt(0))) {
                if (Character.isUpperCase(caracter.charAt(0))) {
                    System.out.println("'" + caracter + "'" + " és una lletra majúscula");
                } else {
                    System.out.println("'" + caracter + "'" + " és una lletra minúscula");
                }
            } else if (Character.isDigit(caracter.charAt(0))) {
                System.out.println("'" + caracter + "'" + " és un dígit");
            } else {
                System.out.println("'" + caracter + "'" + " és una altra cosa");
            }
        } else {
            System.out.println("Text buit");
        }
        
    }
}
