/* Aquest programa rep un nombre per la línia de comandes i et mostra
* els números de manera decreixent des del nombre introduït fins 1.
* Ara amb for.
*/

public class NaturalsDecreixents {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        
        if (numero < 1) {
            System.out.println("Cap valor decreixent entre " + numero + " i 1");
        } else {
            for (int i = numero; i > 0; i--) {
                System.out.println(i);
            }
        }
    }
}
