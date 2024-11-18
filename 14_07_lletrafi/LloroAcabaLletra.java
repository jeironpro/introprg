/* Aquest programa demana paraulas i si la paraula acaba per una lletra no vocal 
* la repeteix fins que introdueixi una cadena buida i et dira adéu.
*/

public class LloroAcabaLletra {
    public static void main(String[] args) {
        // Demanar la paraula
        System.out.println("Paraula?");
        String paraula = Entrada.readLine();
        
        // El bucle s'executarà mentre la paraula no està buida
        while (!paraula.isEmpty()) {
            // Declarar e incialitzar la variable ultimCaracter amb l'últim caràcter de la paraula
            char ultimCaracter = Character.toLowerCase(paraula.charAt(paraula.length()-1));
            // Verificar si el caracter és una lletra
            if (Character.isLetter(ultimCaracter)) {
                // Verificar que el caràcter no sigui una vocal
                if (ultimCaracter != 'a' || ultimCaracter != 'e' || ultimCaracter != 'i' || ultimCaracter != 'o' || ultimCaracter != 'u') {
                    // Com es una lletra i no és vocal repetir la paraula
                    System.out.println("Repeteixo: " + paraula);
                }
            }
            // Demanar la paraula a dins del bucle
            System.out.println("Paraula?");
            paraula = Entrada.readLine();
        }
        // Quan surti del bucle, mostrar aquest missatge
        System.out.println("Adéu");
    }
}
