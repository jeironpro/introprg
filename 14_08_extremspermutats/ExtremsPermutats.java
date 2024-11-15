/* Aquest programa demana paraules i, si la primera i la segona lletra de la paraula 
* són iguals a la penúltima i a l'última lletra respectivament sense importar el ordre 
* la repeteix fins que introdueixis una cadena buida i et dira adéu.
*/

public class ExtremsPermutats {
    public static void main(String[] args) {
        System.out.println("Ves introduïnt texts (finalitza amb INTRO sol)");
        String paraula = "si";
        
        while (!paraula.isEmpty()) {
            paraula = Entrada.readLine();
            
            // Verificar si la paraula no és buida
            if (!paraula.isEmpty()) {
                // Verificar si la paraula té una longitud de més de quatre lletra
                if (paraula.length() >= 4) {
                    // Verificar si el index 0 és una lletra
                    if (Character.isLetter(paraula.charAt(0))) {
                        // Verificar si la primera i la segona lletra de la paraula són iguals a la penúltima i a l'última lletra respectivament sense importar el ordre 
                        if ((paraula.charAt(paraula.length()-1) == paraula.charAt(0) || paraula.charAt(paraula.length()-1) == paraula.charAt(1) && paraula.charAt(paraula.length()-2) == paraula.charAt(0) || paraula.charAt(paraula.length()-2) == paraula.charAt(1))) {
                                System.out.println("Repeteix: " + paraula);
                        }
                    }
                
                }
            } else {
                paraula = "";
            }
        }
        System.out.println("Adéu");
    }
}
