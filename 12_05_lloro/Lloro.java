/* Aquest programa demanarà paraules i les repetirà fins que introdueixi una 
* resposta buida. Et dira adéu.
*/

public class Lloro {
    public static void main(String[] args) {
        System.out.println("El lloro espera paraula:");
        String paraula = Entrada.readLine();
        
        while (!paraula.isEmpty()) {
            System.out.println("El lloro repeteix: " + paraula);
            System.out.println("El lloro espera paraula:");
            paraula = Entrada.readLine();    
        }
        System.out.println("Adéu");
    }
}
