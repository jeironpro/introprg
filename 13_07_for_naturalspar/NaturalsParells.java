/* Aquest programa rep un nombre per la línia de comandes i et mostra
* els números de 2 en 2 fins al nombre que li has introduit.
* Ara amb for.
*/

public class NaturalsParells {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        
        if (numero < 1) {
            System.out.println("Cap valor parell creixent entre 1 i " + numero);
        } else {
            for (int i = 2; i <= numero; i = i + 2) {
                System.out.println(i);
            }
        }
    }
}
