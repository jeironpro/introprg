/* Aquest programa demana paraules i, si la primera i la segona lletra de la paraula 
* són iguals a la penúltima i a l'última lletra respectivament sense importar el ordre 
* la repeteix fins que introdueixis una cadena buida i et dira adéu.
*/

public class ExtremsPermutats {
    public static void main(String[] args) {
        System.out.println("Ves introduïnt texts (finalitza amb INTRO sol)");
        boolean continuar = true;
        String guardaParaula = "";
        int cantidadParaula = 0;
        
        while (continuar) {
            String paraula = Entrada.readLine();
            
            if (!paraula.isEmpty() && Character.isLetter(paraula.charAt(0)) && (paraula.charAt(paraula.length()-1) == paraula.charAt(0) || paraula.charAt(paraula.length()-1) == paraula.charAt(1) && paraula.charAt(paraula.length()-2) == paraula.charAt(0) || paraula.charAt(paraula.length()-2) == paraula.charAt(1))) {
                cantidadParaula += 1;
                guardaParaula += paraula;
            }
            
            if (paraula.isEmpty()) {
                continuar = false;
            }
        }
        for (int i = cantidadParaula; i > 0; i--) {
            System.out.println("Repeteix: " + guardaParaula);                
        }
        System.out.println("Adéu");
    }
}
