/* Aquest programa s'ha dissenyat per funcionar com un ascensor 
* en un pis d'una planta baixa i dos pisos, et demanarà el pis on ets 
* i quin botó vols pressionar per emportar-te al pis que vols anar. 
*/

public class Ascensor {
    public static void main(String[] args) {
        System.out.println("pis?");
        String pis = Entrada.readLine();
        System.out.println("botó?");
        String boto = Entrada.readLine();
        
        // Utilitzant la tècnica apreasa a classe
        if (pis.equals("planta baixa")) {
            if (boto.equals("pujar un")) {
                System.out.println("primer pis");
            } else if (boto.equals("pujar dos")) {
                System.out.println("segon pis");
            } else {
                System.out.println("error");
            }
        } else if (pis.equals("primer pis")) {
            if (boto.equals("baixar un")) {
                System.out.println("planta baixa");
            } else if (boto.equals("pujar un")) {
                System.out.println("segon pis");
            } else {
                System.out.println("error");
            }
        } else if (pis.equals("segon pis")) {
            if (boto.equals("baixar un")) {
                System.out.println("primer pis");
            } else if (boto.equals("baixar dos")) {
                System.out.println("planta baixa");
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
