/* Aquest programa demana paraulas que comenci amb vocal i la repeteix
* fins que introdueixi una cadena buida i et dira adéu.
*/

public class IniciaVocal {
    public static void main(String[] args) {
        // Demanar paraula
        System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
        String paraula = Entrada.readLine();
        
        // El bucle s'executarà mentre la paraula no està buida
        while (!paraula.isEmpty()) {
            // Veficar si la paraula comença amb vocal
            if (paraula.charAt(0) == 'a' || paraula.charAt(0) == 'e' || paraula.charAt(0) == 'i' || paraula.charAt(0) == 'o' || paraula.charAt(0) == 'u') {
                // Repetir la paraula
                System.out.println("El lloro diu: " + paraula);
            // Del contrari, no és vocal
            } else {
                // Demanar paraula a dins del bucle
                System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
                paraula = Entrada.readLine();            
            }
        }
        // Quan surti del bucle, mostrar aquest missatge
        System.out.println("Adéu");
    }
}
