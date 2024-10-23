/* Aquest programa rep un nombre per la línia de comandes i et motra
* els números del 1 fins al nombre que li has introduit.
* Ara amb el bucle for.
*/

public class Naturals {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        
        for (int i = 1; i <= numero ; i++) {
            System.out.println(i);
        }
    }
}
