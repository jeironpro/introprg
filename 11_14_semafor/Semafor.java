/* Aquest programa demana de quin color està el semafor i et dirà que fer.
* Si passar, córrer o parar.
*/

public class Semafor {
    public static void main(String[] args) {
        System.out.println("De quin color està el semafor?");
        String color = Entrada.readLine();
        
        if (color.equals("verd")) {
            System.out.println("Pots passar");
        } else if (color.equals("vermell")) {
            System.out.println("Ni se t'acudeixi creuar");
        } else if (color.equals("groc")) {
            System.out.println("Corre!");
        } else {
            System.out.println("Aquest color no està al semafor");
        }
    }
}
