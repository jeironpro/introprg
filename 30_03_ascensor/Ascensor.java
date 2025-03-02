/*
 * Programa que mostra el pis (propietat de la classe) on es troba l'ascensor
 */
 
public class Ascensor {
    // Propietats
    // int pis
    int pis = -1;
    
    public static void main(String[] args) {
        // Instancia de la classe Ascensor
        Ascensor ascensor = new Ascensor();
        // Mostrar on es troba l'ascensor
        System.out.println("L'ascensor está a la planta " + ascensor.pis);
    } 
}
