/* Programa que rep un caràcter per la línia de comanda i fa un analisis del caràcter */
public class AnalitzaCaracter {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        
        // Verificar si el text no està buit
        if (!text.isEmpty()) {    
            // Demanar la posició
            System.out.println("Posició?");
            // Llegir la posició
            int posicio = Integer.parseInt(Entrada.readLine());
            
            // Obtenir el residu del nombre negatiu
            posicio = posicio % text.length();
            
            // Verificar si la posició es negativa
            if (posicio < 0) {
                // sumar-li la longitud del text
                posicio = posicio + text.length();
            }
            
            // Agafar el caràcter en la posició indicat
            char caracter = text.charAt(posicio);
            analitzaCaracter(caracter);
        // Del contrari
        } else {
            // Mostrar aquest missatge
            System.out.println("Text buit");
        }
    }
    public static void analitzaCaracter(char caracter) {
        // Verificar si el caràcter eś una lletra
        if (Character.isLetter(caracter)) {
            // Verificar si és majúscula
            if (Character.isUpperCase(caracter)) {
                // Mostrar el caracter guardado i un missatge que indica que és
                System.out.println("'" + caracter + "'" + " és una lletra majúscula");
            // Del contrari, és minúscula
            } else {
                // Mostrar el caracter guardado i un missatge que indica que és
                System.out.println("'" + caracter + "'" + " és una lletra minúscula");
            }
        // Verificar si el caràcter és un dígit
        } else if (Character.isDigit(caracter)) {
            // Mostrar el caracter guardado i un missatge que indica que és
            System.out.println("'" + caracter + "'" + " és un dígit");
        // Del contrari, és una altra cosa
        } else {
            // Mostrar el caracter guardado i un missatge que indica que és
            System.out.println("'" + caracter + "'" + " és una altra cosa");
        }        
    }    
}
