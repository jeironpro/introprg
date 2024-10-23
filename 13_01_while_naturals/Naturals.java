/* Aquest programa rep un nombre per la línia de comandes i et motra
* els números del 1 fins al nombre que li has introduit.
*/

public class Naturals {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        int contador = 0;
        
        if (numero < 1) {
            System.out.println("Cap valor creixent entre 1 i " + numero);
        } else {
            while (contador < numero) {
                contador++;
                System.out.println(contador);
            }
        }
    }
}
