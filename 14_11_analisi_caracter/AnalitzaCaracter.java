/* Aquest programa demana un text i una posició, i mostra el caracter que està
* en la posició indicada, si la posicio supera la longitud del text, la posició
* arribarà a la longitud del text i tornarà a començar de 0 i així sucesivament
* fins trobar la posició del caràcter, si per contra la posicio és negativa, la
* posició començarà a partir de l'últim caracter, quan la posició negativa 
* (convertida amb Math.abs() a positiva) sea major a la longitud farà el mateix
* com si fos la posició positiva major a la longitud, però començarà a partir
* de l'últim caràcter
*/


public class AnalitzaCaracter {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        // Declarar e inicialitzar la variable caracter, buida perquè guardi el caracter de la posició
        String caracter = "";
        
        // Verificar si el text està buit
        if (!text.isEmpty()) {
            // Com el text no està buit, demanar posició
            System.out.println("Posició?");
            int posicio = Integer.parseInt(Entrada.readLine());
            
            // Verificar si la posició es negativa
            if (posicio < 0) {
                posicio = posicio % text.length();
                if (Math.abs(posicio) > text.length()) {
                    if (posicio == 1) {
                        posicio = text.length()-1;                    
                    } else if (posicio > text.length()) {
                        posicio = posicio + text.length();
                    }
                } else {               
                    posicio = posicio % text.length();
                }
                caracter += text.charAt(Math.abs(posicio));
               
            // Verificar si la posició és menor a la longitud del text
            } else if (posicio < text.length()) {
                // Guardar el caracter de la posició
                caracter += text.charAt(posicio); 
            // Verificar si la posicio és major a la longitud del text                    
            } else if (posicio > text.length()) {
                // Obtenir el residu de posicio entre la longitud del text 
                posicio = posicio % text.length();
                // Guardar el caracter de la posició
                caracter += text.charAt(posicio);
            } else {
                caracter += text.charAt(0);
            }
            // Verificar si el caràcter eś una lletra
            if (Character.isLetter(caracter.charAt(0))) {
                // Verificar si és majúscula
                if (Character.isUpperCase(caracter.charAt(0))) {
                    // Mostrar el caracter guardado i un missatge que indica que és
                    System.out.println("'" + caracter + "'" + " és una lletra majúscula");
                // Del contrari, és minúscula
                } else {
                    // Mostrar el caracter guardado i un missatge que indica que és
                    System.out.println("'" + caracter + "'" + " és una lletra minúscula");
                }
            // Verificar si el caràcter és un dígit
            } else if (Character.isDigit(caracter.charAt(0))) {
                // Mostrar el caracter guardado i un missatge que indica que és
                System.out.println("'" + caracter + "'" + " és un dígit");
            // Del contrari, és una altra cosa
            } else {
                // Mostrar el caracter guardado i un missatge que indica que és
                System.out.println("'" + caracter + "'" + " és una altra cosa");
            }
        // Del contrari, el text està buit
        } else {
            // Mostrar aquest missatge
            System.out.println("Text buit");
        }
    }
}
