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
        
        if (pis.equals("planta baixa") && boto.equals("pujar un")) {
            System.out.println("primer pis");
        } else if (pis.equals("") && boto.equals("")) {
            System.out.println("error");
        } else if (pis.equals("planta baixa") && boto.equals("pujar dos")) {
            System.out.println("segon pis");
        } else if (pis.equals("planta baixa") && (!boto.equals("pujar un") || !boto.equals("pujar dos"))) {
            System.out.println("error");
        } else if (pis.equals("primer pis") && boto.equals("baixar un")) {
            System.out.println("planta baixa");
        } else if (pis.equals("primer pis") && boto.equals("pujar un")) {
            System.out.println("segon pis");
        } else if (pis.equals("primer pis") && (!boto.equals("baixar un") || !boto.equals("pujar un"))) {
            System.out.println("error");
        } else if (pis.equals("segon pis") && boto.equals("baixar un")) {
            System.out.println("primer pis");
        } else if (pis.equals("segon pis") && boto.equals("baixar dos")) {
            System.out.println("planta baixa");
        } else if (pis.equals("segon pis") && (!boto.equals("baixar un") || !boto.equals("baixar dos"))) {
            System.out.println("error");
        } else if (!pis.equals("planta baixa") || !pis.equals("primer pis") || !pis.equals("segon pis") && boto.equals("baixar un") || boto.equals("baixar dos") || boto.equals("pujar un") || boto.equals("pujar dos")) {
        System.out.println("error");
        }
    }
}
