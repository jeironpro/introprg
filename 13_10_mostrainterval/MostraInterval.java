/* Aquest programa demana dos valors enters i et mostra tots els valors
* que hi ha entre el primer i segon valor, i vicervesa. 
*/

public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int finall = Integer.parseInt(Entrada.readLine());
        
        if (inici > finall) {
            for (int i = inici; i >= finall; i--) {
                System.out.println(i);
            }
        } else {
            for (int j = inici; j <= finall; j++) {
                System.out.println(j);
            }        
        }
    }
}
