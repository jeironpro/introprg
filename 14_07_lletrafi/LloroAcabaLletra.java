/* Aquest programa demana paraulas i si la paraula acaba per una lletra no vocal 
* la repeteix fins que introdueixi una cadena buida i et dira adéu.
*/

public class LloroAcabaLletra {
    public static void main(String[] args) {
        System.out.println("Paraula?");
        String paraula = Entrada.readLine();
        
        while (!paraula.isEmpty()) {
            System.out.print((Character.isLetter(paraula.charAt(paraula.length()-1)) && (paraula.charAt(paraula.length()-1) != 'a') && (paraula.charAt(paraula.length()-1) != 'A') && (paraula.charAt(paraula.length()-1) != 'e') && (paraula.charAt(paraula.length()-1) != 'E') && (paraula.charAt(paraula.length()-1) != 'i') && (paraula.charAt(paraula.length()-1) != 'I') && (paraula.charAt(paraula.length()-1) != 'o') && (paraula.charAt(paraula.length()-1) != 'O') && (paraula.charAt(paraula.length()-1) != 'u') && (paraula.charAt(paraula.length()-1) != 'U') ? "Repeteixo: " + paraula + "\n" : ""));
            System.out.println("Paraula?");
            paraula = Entrada.readLine();
        }
        System.out.println("Adéu");
    }
}
