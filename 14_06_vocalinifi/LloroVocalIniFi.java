/* Aquest programa demana paraulas i si la paraula comença i acaba per vocal 
* sense diferenciar entre vocal majúscula i minúscula amb vocal i la repeteix
* fins que introdueixi una cadena buida i et dira adéu.
*/

public class LloroVocalIniFi {
    public static void main(String[] args) {
        System.out.println("Paraula?");
        String paraula = Entrada.readLine();
        
        while (!paraula.isEmpty()) {
            System.out.print(((paraula.charAt(0) == 'a' || paraula.charAt(0) == 'A') && (paraula.charAt(paraula.length()-1) == 'a' || paraula.charAt(paraula.length()-1) == 'A') || (paraula.charAt(0) == 'e' || paraula.charAt(0) == 'E') && (paraula.charAt(paraula.length()-1) == 'e' || paraula.charAt(paraula.length()-1) == 'E') || (paraula.charAt(0) == 'i' || paraula.charAt(0) == 'I') && (paraula.charAt(paraula.length()-1) == 'i' || paraula.charAt(paraula.length()-1) == 'I') || (paraula.charAt(0) == 'o' || paraula.charAt(0) == 'O') && (paraula.charAt(paraula.length()-1) == 'o' || paraula.charAt(paraula.length()-1) == 'O') || (paraula.charAt(0) == 'u' || paraula.charAt(0) == 'U') && (paraula.charAt(paraula.length()-1) == 'u' || paraula.charAt(paraula.length()-1) == 'U') ? "Repeteixo: " + paraula + "\n" : ""));
            System.out.println("Paraula?");
            paraula = Entrada.readLine();
        }
        System.out.println("Adéu");
    }
}
