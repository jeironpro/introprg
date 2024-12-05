/* Aquest programa demana una contrasenya i et mostrarà si és vàlida o no.
* Si no és vàlida et dirà les raons  */

public class Password {
    public static void main(String[] args) {
        // Llegir la contrasenya
        String contrasenya = Entrada.readLine();
        
        // Verificar si la contrasenya està a dins del rang permet
        if (contrasenya.length() < 8 || contrasenya.length() > 16) {
            System.out.println("El password ha de tenir entre 8 i 16 caràcters.");
        } else {
            // Declarar e inicialitzar el boolean conteDigit en false
            boolean conteDigit = false;
            // Declarar e inicialitzar el boolean conteMajuscula en false
            boolean conteMajuscula = false;
            // Declarar e inicialitzar el boolean conteMinuscula en false
            boolean conteMinuscula = false;
            // Declarar e inicialitzar el boolean conteSimbol en false
            boolean conteSimbol = false;
            // Declarar e inicialitzar el boolean majusculesSuperior en false
            boolean majusculesSuperior = false;
            // Declarar e inicialitzar el boolean conteEspai en false
            boolean conteEspai = false;
            // Declarar e inicialitzar el boolean caracterRepetit en false
            boolean caracterRepetit = false;
            // Declarar e inicialitzar el boolean quatresSeguit en false
            boolean quatresSeguit = false;
            // Declarar e inicialitzar el boolean tresDigitConsecutius en false
            boolean tresDigitConsecutius = false;
            // Declarar e inicialitzar el int comptadorMajuscula en 0
            int comptadorMajuscula = 0;
            // Declarar e inicialitzar el int comptadorMinuscula en 0
            int comptadorMinuscula = 0;
            // Declarar e inicialitzar el int comptadorDigit en 0
            int comptadorDigit = 0;
            // Declarar e inicialitzar el int comptadorSimbol en 0
            int comptadorSimbol = 0;
            // Declarar e inicialitzar el String digit buit
            String digit = "";
            
            // Fer un for per iterar tots els caràcters de la contrasenya 
            for (int i = 0; i < contrasenya.length(); i++) {
                // Declarar e inicialitzar el char c amb tots els caràcters de la contrasenya
                char c = contrasenya.charAt(i);
                // Verificar si la contrasenya conté dígit
                if (Character.isDigit(c)) {
                    // Sumar-li 1 a comptadorDigit
                    comptadorDigit++;
                    // Guardar en el String digit el caràcters que ho són
                    digit += c;
                    // conteDigit serà true
                    conteDigit = true;
                // Verificar si la contrasenya conté majúscula
                } else if (Character.isUpperCase(c)) {
                    // Sumar-li 1 a comptadorMajuscula
                    comptadorMajuscula++;
                    // conteMajuscula serà true
                    conteMajuscula = true;
                // Verificar si la contrasenya conté minúscula
                } else if (Character.isLowerCase(c)) {
                    // Sumar-li 1 a comptadorMinuscula
                    comptadorMinuscula++;
                    // conteMinuscula serà true
                    conteMinuscula = true;
                // Verificar si la contrasenya conté espai en blanc
                } else if (Character.isWhitespace(c)) {
                    // conteEspai serà true
                    conteEspai = true;
                // Verificar que la quantitat de majúscules es major a la quantitat de minúscules
                } else if (comptadorMajuscula <= comptadorMinuscula) {
                    majusculesSuperior = true;;
                // Del contrari, veriificar si la contrasenta conté simbol
                } else if (!Character.isLetter(c) && !Character.isDigit(c) && !Character.isWhitespace(c)) {
                    // Sumar-li 1 a comptadorSimbol
                    comptadorSimbol++;
                    // conteSimbol serà true
                    conteSimbol = true;
                }
                
                // Fer un for per iterar els caràcters de contrasenya a partir de la posició 1
                for (int j = i+1; j < contrasenya.length(); j++) {
                    // Declarar e inicialitzar el char ch amb els caracter contrasenya a partir de la posició 1
                    char ch = contrasenya.charAt(j);
                    // Verificar si el caracter c és igual es ch
                    if (c == ch) {
                        // caracterRepetit serà true
                        caracterRepetit = true;
                        // Finalitzar el bucle
                        break;
                    }
                }
                // Verificar si la contrasenya conté 4 caràcters seguits del mateix tipus
                if (comptadorMajuscula > 4 || comptadorMinuscula > 4 || comptadorDigit > 4 || comptadorSimbol > 4) {
                    // quatresSeguit serà true
                    quatresSeguit = true;
                }
            }
            // Declarar e inicialitzar el int comptadorDigitConsecutius en 0
            int comptadorDigitConsecutius = 0;
            // Fer un for per iterar tots el caràcter dígits
            for (int i = 0; i < digit.length(); i++) {
                // Declarar e inicialitzar el char d amb tots els digits
                char d = digit.charAt(i);
                // Fer un for per iterar el caràcter dígits a partir del seguent dígit
                for (int j = i+1; j < digit.length(); j++) {
                    // Declarar e inicialitzar el char di amb els digits a partir del digit en la posició 1
                    char di = digit.charAt(j);
                    // Verificar si el digit +1 és igual a di
                    // Aquest verifica si és consecutius
                    if (d+1 == di) {
                        // Sumar-li 1 a comptadorDigitConsecutius
                        comptadorDigitConsecutius++;
                    }                    
                }
            }
            // Verificar si la contrasenya conté tres dígits consecutius
            if (comptadorDigitConsecutius >= 3) {
                // tresDigitConsecutius serà true
                tresDigitConsecutius = true;
            }
            
            if (!conteDigit) {
                System.out.println("El password ha de contenir com a mínim un numero.");
            } else if (!conteMajuscula) {
                System.out.println("El password ha de contenir com a mínim una lletra majúscula.");
            } else if (!conteMinuscula) {
                System.out.println("El password ha de contenir com a mínim una lletra minúscula.");
            } else if (!majusculesSuperior) {
                System.out.println("El password no pot contenir menys majúscules que minúscules.");
            } else if (!conteSimbol) {
                System.out.println("El password ha de contenir com a mínim un símbol.");
            } else if (!conteEspai) {
                System.out.println("El password no pot contenir espais en blanc.");
            }
        }
    }
}
