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
            // Declarar e inicialitzar el boolean iniVocal en false
            boolean iniVocal = false;
            // Declarar e inicialitzar el boolean fiVocal en false
            boolean fiVocal = false;
            
            // Si la paraula no està buida
            if (!paraula.isEmpty()) {
                // Agafar el primer caràcter de la paraula
                char primerCaracter = paraula.charAt(0);
                // Agafar l'últim caràcter de la paraula
                char ultimCaracter = paraula.charAt(paraula.length()-1);
                
                // Assignar-li la funció esVocal que es troba en el fitxer UtilString al boolean iniVocal 
                // i passar-li com argument el primer caràcter de la paraula
                iniVocal = UtilString.esVocal(primerCaracter);  
                // Assignar-li la funció esVocal que es troba en el fitxer UtilString al boolean fiVocal 
                // i passar-li com argument l'últim caràcter de la paraula   
                fiVocal = UtilString.esVocal(ultimCaracter);   
                
                // Si la paraula incia o acaba en vocal, repetir la paraula
                if (iniVocal || fiVocal) {
                    System.out.println("El lloro diu: " + paraula);
                }  
            // Del contrari
            } else {
                // Demanar confirmació per finalitzar
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
