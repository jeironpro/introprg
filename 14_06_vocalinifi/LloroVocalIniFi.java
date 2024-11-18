/* Aquest programa demana paraulas i si la paraula comença i acaba per vocal 
* sense diferenciar entre vocal majúscula i minúscula amb vocal i la repeteix
* fins que introdueixi una cadena buida i et dira adéu.
*/

public class LloroVocalIniFi {
    public static void main(String[] args) {
        // Demanar la paraula
        System.out.println("Paraula?");
        String paraula = Entrada.readLine();
        
        // El bucle s'executarà mentre la paraula no està buida
        while (!paraula.isEmpty()) {
            // Declarar e inicialitzar la variable primerCaracter amb el primer caràcter de la paraula en minúscula
            char primerCaracter = Character.toLowerCase(paraula.charAt(0));
            // Declarar e inicialitzar la variable ultimCaracter amb l'ultim caràcter de la paraula en minúscula
            char ultimCaracter = Character.toLowerCase(paraula.charAt(paraula.length()-1));
            // Verificar si el primer caràcter és una vocal
            if (primerCaracter == 'a' || primerCaracter == 'e' || primerCaracter == 'i' || primerCaracter == 'o' || primerCaracter == 'u') {
                // Verificar si l'últim caràcter és una vocal
                if (ultimCaracter == 'a' || ultimCaracter == 'e' || ultimCaracter == 'i' || ultimCaracter == 'o' || ultimCaracter == 'u') {
                    // Verificar si el primer caràcter i l'últim són iguals
                    if (primerCaracter == ultimCaracter) {
                        // Com comença i acaba en vocal, mostrar la paraula
                        System.out.println("Repeteixo: " + paraula);                        
                    }
                    
                }
            }
            // Demanar la paraula a dins del bucle
            System.out.println("Paraula?");
            paraula = Entrada.readLine();
        }
        // Quan surti del bucle, mostrar aquest missatge
        System.out.println("Adéu");
    }
}
