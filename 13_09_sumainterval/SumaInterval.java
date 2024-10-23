/* Aquest programa demana dos valors enters i suma tots els nombres que hi ha
* entre els dos, incloent-los i et mostrarà els càlculs que va fent fins a arribar
* al valor més alt dels introduïts.
*/

public class SumaInterval {
    public static void main(String[] args) {
        System.out.println("primer?");
        int primer = Integer.parseInt(Entrada.readLine());
        System.out.println("segon?");
        int segon = Integer.parseInt(Entrada.readLine());
        int sumador = 0;
        
        if (primer > segon) {
            int tmp = primer;
            primer = segon;
            segon = tmp;
        }
        for (int i = primer; segon >= i; i++) {
            int resultat = sumador + i;
            System.out.println(sumador + " + " + i + " = " + resultat);
            sumador = resultat;
        }
    }
}
