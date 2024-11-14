/* Aquest programa demana paraulas que comenci amb vocal i la repeteix
* fins que introdueixi una cadena buida i et dira adéu.
*/

public class IniciaVocal {
    public static void main(String[] args) {
        System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
        String paraula = Entrada.readLine();
        
        while (!paraula.isEmpty()) {
            System.out.print((paraula.charAt(0) == 'a' || paraula.charAt(0) == 'e' || paraula.charAt(0) == 'i' || paraula.charAt(0) == 'o' || paraula.charAt(0) == 'u' ? "El lloro diu: " + paraula + "\n" : ""));
            System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
            paraula = Entrada.readLine();
        }
        System.out.println("Adéu");
    }
}
