/* Aquest programa demana de quin color està el semafor i et dirà que fer.
* Si passar, córrer o parar.
*/

public class Semafor {
    public static void main(String[] args) {
        System.out.println("Color?");
        String color = Entrada.readLine();
        
        if (color.equals("verd")) {
            System.out.println("pots passar");
        } else if (color.equals("vermell")) {
            System.out.println("ni se t'acudeixi creuar");
        } else if (color.equals("groc")) {
            System.out.println("corre!");
        } else {
            System.out.println("aquest color no està al semafor");
        }
    }
}
