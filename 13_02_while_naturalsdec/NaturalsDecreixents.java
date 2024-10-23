/* Aquest programa rep un nombre per la línia de comandes i et mostra
* els números de manera decreixent des del nombre introduït fins 1.
*/

public class NaturalsDecreixents {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        
        if (numero < 1) {
            System.out.println("Cap valor decreixent entre " + numero + " i 1");
        } else {
            while (numero > 0) {
                System.out.println(numero);
                numero--;
            }
        }
    }
}
