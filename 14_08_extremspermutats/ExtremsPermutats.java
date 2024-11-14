/* Aquest programa demana paraules i, si la primera i la segona lletra de la paraula 
* són iguals a la penúltima i a l'última lletra respectivament sense importar el ordre 
* la repeteix fins que introdueixis una cadena buida i et dira adéu.
*/

public class ExtremsPermutats {
    public static void main(String[] args) {
        System.out.println("Ves introduïnt texts (finalitza amb INTRO sol)");
        String paraula = Entrada.readLine();
        
        while (!paraula.isEmpty()) {
            System.out.print((Character.isLetter(paraula.charAt(0)) && (paraula.charAt(paraula.length()-1) == paraula.charAt(0) || paraula.charAt(paraula.length()-1) == paraula.charAt(1) && paraula.charAt(paraula.length()-2) == paraula.charAt(0) || paraula.charAt(paraula.length()-2) == paraula.charAt(1))) ? "Repeteix: " + paraula + "\n" : "");
            System.out.println("Paraula?");
            paraula = Entrada.readLine();
        }
        System.out.println("Adéu");
    }
}
