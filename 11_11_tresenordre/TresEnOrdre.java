/* Aquest programa demanara tres números i els ordenés de menor a major. */

public class TresEnOrdre {
    public static void main(String[] args) {
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Segon?");
        int segon = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Tercer?");
        int tercer = Integer.parseInt(Entrada.readLine());
        
        // Aplicant la tècnica de la línia recta, apresa a classe
        if (primer <= segon && segon <= tercer) {
            System.out.println(primer + ", " + segon + " i " + tercer);
        } else if (primer <= tercer && tercer <= segon) {
            System.out.println(primer + ", " + tercer + " i " + segon);
        } else if (segon <= primer && primer <= tercer) {
            System.out.println(segon + ", " + primer + " i " + tercer);
        } else if (segon <= tercer && tercer <= primer) {
            System.out.println(segon + ", " + tercer + " i " + primer);
        } else if (tercer <= primer && primer <= segon) {
            System.out.println(tercer + ", " + primer + " i " + segon);
        } else {
            System.out.println(tercer + ", " + segon + " i " + primer);
        }
    }
}
