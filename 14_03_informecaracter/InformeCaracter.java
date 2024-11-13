/* Aquest programa és un petit inform sobre el tipus de dades char (carácter). */

public class InformeCaracter {
    public static void main(String[] args) {
        // Demanar el text a l'usuari
        System.out.println("Text?");
        // Llegir text introduït per l'usuari
        String text = Entrada.readLine();
        
        
        
        if (text.isBlank()) {
            System.out.println("Error");
                
        } else {
            // Demanar la posició a l'usuari
            System.out.println("Posició?");
            // Llegir posicio introduït per l'usuari
            int posicio = Integer.parseInt(Entrada.readLine());
            
            if (posicio > text.length()) {
                System.out.println("Fora de rang");            
            } else {
                // Obtenir el primer carácter del text
                char caracter = text.charAt(posicio);

                // Obtenir la descripció del caracter
                System.out.println("Character.getName('" + caracter + "'): " + Character.getName(caracter));
                
                // Verificar si es un digit
                System.out.println("Character.isDigit('" + caracter + "'): " + Character.isDigit(caracter));
                
                // Verificar si pots ser l'inici d'un identificador vàlid per Java
                System.out.println("Character.isJavaIdentifierStart('" + caracter + "'): " + Character.isJavaIdentifierStart(caracter));
                
                // Verificar si pots ser part d'un identificador vàlid per Java
                System.out.println("Character.isJavaIdentifierPart('" + caracter + "'): " + Character.isJavaIdentifierPart(caracter));
                
                // Verificar si el caracter és un lletra
                System.out.println("Character.isLetter('" + caracter + "'): " + Character.isLetter(caracter));
                
                // Verificar si és minúscula
                System.out.println("Character.isLowerCase('" + caracter + "'): " + Character.isLowerCase(caracter));
                
                // Verificar si és majúscula
                System.out.println("Character.isUpperCase('" + caracter + "'): " + Character.isUpperCase(caracter));
                
                // Verificar si correspon amb un espai blanc
                System.out.println("Character.isWhitespace('" + caracter + "'): " + Character.isWhitespace(caracter));
                
                // Convertir de majúscula a minúscula
                System.out.println("Character.toLowerCase('" + caracter + "'): " + Character.toLowerCase(caracter));
                
                // Convertir de minúscula a majúscula
                System.out.println("Character.toUpperCase('" + caracter + "'): " +  Character.toUpperCase(caracter));
            }
        }
    }
}
