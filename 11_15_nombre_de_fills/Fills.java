/* Aquest programa demana la quantitat de fills que tens
* i et diu una frase segons el nombre de fills que sigui.
 */

public class Fills {
    public static void main(String[] args) {
        System.out.println("Quants fills tens?");
        int numFills = Integer.parseInt(Entrada.readLine());
        
        if (numFills < 0) {
            System.out.println("No pots tenir menys de 0 fills!");
        } else if (numFills == 0) {
            System.out.println("Tot el que t'has estalviat en bloquers!");
        } else if (numFills == 1) {
            System.out.println("Compte de no mimar-lo massa!");
        } else if (numFills > 1 && numFills < 5) {
            System.out.println("No t'avorreixes a casa, eh?");
        } else if (numFills > 4) {
            System.out.println("Tu sí fas país!");
        }
    }
}
