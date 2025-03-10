/*
 * Programa que crear una instancia de la classe Ascensor i utilitza la seva propietat
 */
 
public class UsaAscensor {
    public static void main(String[] args) {
        // Crear una instancia de la classe ascensor
        Ascensor ascensor = new Ascensor();
        // Mostrar el valor inicial de la propietat pis de la classe ascensor
        System.out.println("Pis inicial: " + ascensor.pis);
        // Mostrar el valor inicial de la propietat moviment de la classe ascensor
        System.out.println("Moviment inicial: " + ascensor.moviment);
        // Canviar el valor a la propietat moviment
        ascensor.moviment = "pujant";
        // Mostrar el valor canviat de la propietat moviment
        System.out.println("Moviment final: " + ascensor.moviment);
    }
}
