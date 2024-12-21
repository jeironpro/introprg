/* Aquest programa demana paraulas que comenci amb vocal i la repeteix
* fins que introdueixi una cadena buida i et dira adéu.
*/

public class LloroVocalIniciFi {
    public static void main(String[] args) {
        // Bucle infinit
        while (true) {
            // Demanar la paraula
            System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
            // Llegir la paraula
            String paraula = Entrada.readLine();
            boolean iniVocal = false;
            boolean fiVocal = false;
            if (!paraula.isEmpty()) {
                char pc = paraula.charAt(0);
                char uc = paraula.charAt(paraula.length()-1);
                
                iniVocal = UtilString.esVocal(pc);     
                fiVocal = UtilString.esVocal(uc);   
                
                if (iniVocal || fiVocal) {
                    System.out.println("El lloro diu: " + paraula);
                }  
            } else {
                System.out.println("El lloro demana confirmació per finalitzar");
                if (UtilitatsConfirmacio.respostaABoolean(Entrada.readLine())) {
                    // Aturar el bucle
                    break;                                
                }
            }
        }
        // Quan surti del bucle, mostrar aquest missatge
        System.out.println("Adéu");
    }
}
