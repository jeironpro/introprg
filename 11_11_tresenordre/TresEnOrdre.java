/* Aquest programa demanara tres números i els ordenés de menor a major. */

public class TresEnOrdre {
    public static void main(String[] args) {
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Segon?");
        int segon = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Tercer?");
        int tercer = Integer.parseInt(Entrada.readLine());
        
        if (primer > segon && primer > tercer && segon > tercer) {
            System.out.println(tercer + "," + segon + " i " + primer);
        } else if (segon > primer && segon > tercer && primer > tercer) {
            System.out.println(tercer + "," + primer + " i " + segon);
        } else if (tercer > primer && tercer > segon && primer > segon) {
            System.out.println(segon + "," + primer + " i " + tercer);
        } else if (primer > segon && primer > tercer && tercer > segon) {
            System.out.println(segon + "," + tercer + " i " + primer);
        } else if (segon > primer && segon > tercer && tercer > primer) {
            System.out.println(primer + "," + tercer + " i " + segon);
        } else {
            System.out.println(primer + "," + segon + " i " + tercer);
        }
    }
}
