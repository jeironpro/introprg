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
            if (paraula.isEmpty()) {
                paraula = "";
                System.out.println("Adéu");                
            } else {
                // Verificar si la paraula té una longitud de més de quatre lletra
                if (paraula.length() > 1) {
                    // Verificar si el index 0 és una lletra
                    if (Character.isLetter(paraula.charAt(0)) && Character.isLetter(paraula.charAt(1)) && Character.isLetter(paraula.charAt(paraula.length()-1)) && Character.isLetter(paraula.charAt(paraula.length()-2))) {
                        // Verificar si la primera i la segona lletra de la paraula són iguals a la penúltima i a l'última lletra respectivament sense importar el ordre 
                        char primeraLletra = Character.toUpperCase(paraula.charAt(0));
                        char segonaLletra = Character.toUpperCase(paraula.charAt(0));
                        char penultimaLletra = Character.toUpperCase(paraula.charAt(paraula.length()-1));
                        char ultimaLletra = Character.toUpperCase(paraula.charAt(paraula.length()-2));
                        if (
                        (primeraLletra == penultimaLletra && primeraLletra == ultimaLletra) 
                        &&
                        (segonaLletra == ultimaLletra && segonaLletra == ultimaLletra)
                        ) {
                            System.out.println("Repeteix: " + paraula);
                        }
                    }
                }
            }
        }      
    }
}
