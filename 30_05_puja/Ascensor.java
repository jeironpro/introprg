/*
 * Programa que mostra el pis (propietat de la classe) on es troba l'ascensor,
 * ara permet pujar un pis.
 */
 
public class Ascensor {
    // Propietats
    // int pis
    int pis = -1;
    
    public static void puja(Ascensor ascensor) {
        // Pujar un pis
        // Augmentar en 1 la propietat pis de l'ascensor
        ascensor.pis = ascensor.pis + 1;
    }
    
    public static void main(String[] args) {
        // Instancia de la clase Ascensor
        Ascensor ascensor = new Ascensor();
        // Mostrar on es troba l'ascensor
        System.out.println("L'ascensor està a la planta " + ascensor.pis);
        // Cridar el procediment que puja l'ascensor
        puja(ascensor);
        // Mostrar la nova posició de l'ascensor
        System.out.println("L'ascensor finalment està a la planta " + ascensor.pis);
    } 
}
