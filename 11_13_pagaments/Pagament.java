/* Aquest programa demanara un preu i una paga 
* i simularà una transaccio amb la quantitat a pagar i la pagada 
* i t'indicarà si sobren o falten.
*/
public class Pagament {
    public static void main(String[] args) {
        System.out.println("Preu?");
        int preu = Integer.parseInt(Entrada.readLine());
        System.out.println("Paga?");
        int paga = Integer.parseInt(Entrada.readLine());
        int resultat;
        
        if (preu < paga) {
            resultat = paga - preu;
            System.out.println("Sobren " + resultat + "€");
        } else if (preu > paga) {
            resultat = preu - paga;
            System.out.println("Falten " + resultat + "€");
        } else {
            System.out.println("No sobra ni falta res");
        }
    }
}
