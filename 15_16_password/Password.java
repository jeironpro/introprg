/* Aquest programa demana una contrasenya i et mostrarà si és vàlida o no.
* Si no és vàlida et dirà les raons  */

public class Password {
    public static void main(String[] args) {
        // Llegir la contrasenya
        String contrasenya = Entrada.readLine();
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
        boolean tresDigitsConsecutius = false;
        // Declarar e inicialitzar el boolean tresDigitConsecutiusDecreixent en false
        boolean tresDigitsConsecutiusDecreixent = false;
        // Declarar e inicialitzar el int comptadorMajuscula en 1
        int comptadorMajuscula = 1;
        // Declarar e inicialitzar el int comptadorMinuscula en 1
        int comptadorMinuscula = 1;
        // Declarar e inicialitzar el int comptadorDigit en 1
        int comptadorDigit = 1;
        // Declarar e inicialitzar el int comptadorSimbol en 1
        int comptadorSimbol = 1;
        // Declarar e inicialitzar el String digit buit
        String digit = "";
        // Declarar e inicialitzar el int comptadorDigitConsecutius en 0
        int comptadorDigitsConsecutius = 0;
        // Declarar e inicialitzar el int comptadorDigitConsecutiusDecreixent en 0
        int comptadorDigitsConsecutiusDecreixent = 0;
        
        // Verificar si la contrasenya està a dins del rang permet
        if (contrasenya.length() >= 8 && contrasenya.length() <= 16) {
            // Fer un for per iterar tots els caràcters de la contrasenya 
            for (int i = 0; i < contrasenya.length(); i++) {
                // Declarar e inicialitzar el char c amb tots els caràcters de la contrasenya
                char c = contrasenya.charAt(i);
                
                // Verificar si la contrasenya conté espai en blanc
                if (Character.isWhitespace(c)) {
                    // conteEspai serà true
                    conteEspai = true;
                }
                
                // Verificar si la contrasenya conté dígit
                if (Character.isDigit(c)) {
                    // Verificar si i és menor a la longitud de la contrasenya -1
                    if (i < contrasenya.length()-1) {
                        // Verificar si el caràcter següent és digit 
                        if (Character.isDigit(contrasenya.charAt(i+1))) {
                            // Sumar-li 1 a comptadorDigit
                            comptadorDigit++;                    
                        }                    
                    }
                    // Guardar en el String digit el caràcters que ho són
                    digit += c;
                    // conteDigit serà true
                    conteDigit = true;
                // Verificar si la contrasenya conté majúscula
                } else if (Character.isUpperCase(c)) {
                    // Verificar si i és menor a la longitud de la contrasenya -1
                    if (i < contrasenya.length()-1) {
                        // Verificar si el caràcter següent és una lletra majúscula
                        if (Character.isUpperCase(contrasenya.charAt(i+1))) {
                            // Sumar-li 1 a comptadorMajuscula
                            comptadorMajuscula++;                    
                        }                    
                    }
                    // conteMajuscula serà true
                    conteMajuscula = true;
                // Verificar si la contrasenya conté minúscula
                } else if (Character.isLowerCase(c)) {
                    // Verificar si i és menor a la longitud de la contrasenya -1
                    if (i < contrasenya.length()-1) {
                        // Verificar si el caràcter següent és una lletra minúscula 
                        if (Character.isLowerCase(contrasenya.charAt(i+1))) {              
                            // Sumar-li 1 a comptadorMinuscula
                            comptadorMinuscula++;
                        }                    
                    }
                    // conteMinuscula serà true
                    conteMinuscula = true;
                // Del contrari, veriificar si la contrasenta conté simbol
                } else {
                    // Verificar si i és menor a la longitud de la contrasenya -1
                    if (i < contrasenya.length()-1) {
                        // Verificar si el caràcter següent és un simbol
                        if (!Character.isLetter(contrasenya.charAt(i+1)) && !Character.isDigit(contrasenya.charAt(i+1)) && !Character.isWhitespace(contrasenya.charAt(i+1))) {
                            // Sumar-li 1 a comptadorSimbol
                            comptadorSimbol++;               
                        }                    
                    } 
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
                    }
                }
                // Verificar que la quantitat de majúscules es major a la quantitat de minúscules
                majusculesSuperior = comptadorMajuscula >= comptadorMinuscula;
                
                // Verificar si la contrasenya conté 4 caràcters seguits del mateix tipus
                if (comptadorMajuscula > 4 || comptadorMinuscula > 4 || comptadorDigit > 4 || comptadorSimbol > 4) {
                    // quatresSeguit serà true
                    quatresSeguit = true;
                }
            }
            
            // Verificar si el String digit no està buit
            if (!digit.isEmpty()) {
                // Fer un for per iterar tots el caràcter dígits creixents
                for (int i = 0; i < digit.length(); i++) {
                    // Declarar e inicialitzar el char d amb tots els digits
                    char d = digit.charAt(i);
                    // Declarar e inicialitzar el String dig que converteix el caràcter (d) en un String
                    String dig = "" + d;
                    // Declarar e inicialitzar el int num que converteix el String dig (que contè el caràcter d) en enter
                    int num = Integer.parseInt(dig);
                    
                    // Verificar si i és menor a la longitud de digit -1
                    if (i < digit.length()-1) {
                        // Declarar e inicialitzar el char di amb els digits a partir del digit en la posició de i+1
                        char di = digit.charAt(i+1);
                        // Declarar e inicialitzar el String digi que converteix el caràcter (di) següent a i en un String
                        String digi = "" + di;
                        // Declarar e inicialitzar el int num que converteix el String dig (que contè el caràcter di) en enter
                        int numAnt = Integer.parseInt(digi);
                        // Verificar si num anterior a l'actual és igual numAnt
                        // Aquest verifica si és consecutius
                        if (num-1 == numAnt) {
                            // Sumar-li 1 a comptadorDigitConsecutius
                            comptadorDigitsConsecutius++;
                        }                    
                    }
                }
                // Verificar si la contrasenya conté tres dígits consecutius
                if (comptadorDigitsConsecutius >= 3) {
                    // tresDigitsConsecutius serà true
                    tresDigitsConsecutius = true;
                }
                
                // Fer un for per iterar tots el caràcter dígits decreixents
                for (int i = digit.length()-1; i >= 0; i--) {
                    // Declarar e inicialitzar el char d amb tots els digits al reves
                    char d = digit.charAt(i);
                    // Declarar e inicialitzar el String dig que converteix el caràcter (d) en un String
                    String dig = "" + d;
                    // Declarar e inicialitzar el int num que converteix el String dig (que contè el caràcter d) en enter
                    int num = Integer.parseInt(dig);
                    
                    // Verificar si i és major a 0
                    if (i > 0) {
                        // Declarar e inicialitzar el char di amb els digits a partir del digit en la posició de i-1
                        char di = digit.charAt(i-1);
                        // Declarar e inicialitzar el String digi que converteix el caràcter (di) següent a i en un String
                        String digi = "" + di; 
                        // Declarar e inicialitzar el int num que converteix el String dig (que contè el caràcter di) en enter
                        int numAnt = Integer.parseInt(digi);
                        
                        // Verificar si num anterior a l'actual és igual numAnt
                        // Aquest verifica si és consecutius
                        if (num-1 == numAnt) {
                            // Sumar-li 1 a comptadorDigitsConsecutiusDecreixent
                            comptadorDigitsConsecutiusDecreixent++;
                        }                    
                    }
                }
                // Verificar si la contrasenya conté tres dígits consecutius
                if (comptadorDigitsConsecutiusDecreixent >= 3) {
                    // tresDigitsConsecutiusDecreixent serà true
                    tresDigitsConsecutiusDecreixent = true;
                }
            }
            
            // Verificar si conteDigit és false (la contrasenya no conté dígit)
            if (!conteDigit) {
                // Mostrar aquest missatge de error
                System.out.println("El password ha de contenir com a mínim un numero.");
            // Verificar si conteMajuscula és false (la contrasenya no conté majúscula)
            } else if (!conteMajuscula) {
                // Mostrar aquest missatge de error
                System.out.println("El password ha de contenir com a mínim una lletra majúscula.");
            // Verificar si conteMinuscula és false (la contrasenya no conté minúscula)
            } else if (!conteMinuscula) {
                // Mostrar aquest missatge de error
                System.out.println("El password ha de contenir com a mínim una lletra minúscula.");
            // Verificar si conteSimbol és false (la contrasenya no conté simbol)
            } else if (!conteSimbol) {
                // Mostrar aquest missatge de error
                System.out.println("El password ha de contenir com a mínim un símbol.");
            // Verificar si majusculesSuperior és false (la contrasenya conté més minúscules que majúscules)
            } else if (!majusculesSuperior) {
                // Mostrar aquest missatge de error
                System.out.println("El password no pot contenir menys majúscules que minúscules.");
            // Verificar si conteEspai és true (la contrasenya conté espai)
            } else if (conteEspai) {
                // Mostrar aquest missatge de error
                System.out.println("El password no pot contenir espais en blanc.");
            // Verificar si caracterRepetit és true (la contrasenya conté caràcters repetits)
            } else if (caracterRepetit) {
                // Mostrar aquest missatge de error
                System.out.println("El password no pot contenir caràcters repetits.");
            // Verificar si quatresSeguit és true (la contrasenya conté quatres caràcters seguits)
            } else if (quatresSeguit) {
                // Mostrar aquest missatge de error
                System.out.println("El password no pot contenir més de 4 caràcters seguits del mateix tipus.");
            // Verificar si tresDigitsConsecutius o tresDigitsConsecutiusDecreixent és true (la contrasenya conté tres digits consecutius)
            } else if (tresDigitsConsecutius || tresDigitsConsecutiusDecreixent) {
                // Mostrar aquest missatge de error
                System.out.println("El password no pot contenir més de 3 números consecutius."); 
            // Del contrari
            } else {
                // La contrasenya és vàlida. Mostrar aquest missatge
                System.out.println("El maleït password és vàlid!");
            }
        // Del contrari
        } else {
            // Mostrar aquest missatge de error
            System.out.println("El password ha de tenir entre 8 i 16 caràcters.");
        }
    }
}
