/*
 * Programa que utilitza la classe de i propietat del programa Ascensor
 */
 
public class UsaAscensor {
    public static void main(String[] args) {
        // Crear una instancia d'ascensor
        Ascensor ascensor = new Ascensor();
        
        // Mostrar el pis de l'ascensor creat des d'aquí
        System.out.println("L' ascensor creat des de fora està al pis " + ascensor.pis);
    }
}
