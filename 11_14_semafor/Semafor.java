/* Aquest programa demana de quin color està el semafor i et dirà que fer.
* Si passar, córrer o parar.
*/

public class Semafor {
    public static void main(String[] args) {
        System.out.println("Color?");
        String color = Entrada.readLine();
        
        // Utilitzant Switch Expressions
        String indicacio = switch (color) {
            case "verd" -> "passa";
            case "vermell" -> "espera";
            case "groc" -> "corre!";
            default -> "ves a l'oculista";
        };
        System.out.println(indicacio);
    }
}
