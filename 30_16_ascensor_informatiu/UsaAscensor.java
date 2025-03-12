/*
 * Programa que utilitza la classe del programa Ascensor per fer servir les seves 
 * propietats privats mitjançant els mòduls getter i setter, també fer-li preguntes
 * mitjançant els mètodes que inclou.
 */

public class UsaAscensor {
    public static void main(String[] args) {
        // Crear una instància de l'Ascensor
        Ascensor ascensor = new Ascensor();
        // Mostrar el valor inicial de la propietat pis des del mòdul getPis de la classe Ascensor
        System.out.println("Pis inicial: " + ascensor.getPis());
        // Mostrar el valor inicial de la propietat moviment des del mòdul getMoviment de la classe Ascensor
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        // Demanar el nou pis
        System.out.println("Introdueix nou pis:");
        String nouPis = Entrada.readLine()
        if (UtilString.esEnter(nouPis) {
            // Setear el nou pis
            ascensor.setPis(Integer.parseInt(nouPis));
        }
        // Demanar el nou moviment
        System.out.println("Introdueix nou moviment:");
        // Setear el nou moviment
        ascensor.setMoviment(Entrada.readLine());
        // Mostrar el valor final de la propietat pis des del mòdul getPis
        System.out.println("Pis final: " + ascensor.getPis());
        // Mostrar el valor final de la propietat moviment des del mòdul getMoviment de la classe Ascensor
        System.out.println("Moviment final: " + ascensor.getMoviment());
        // Mostrar l'estar de l'ascensor
        System.out.println("Estat de l'ascensor: " + ascensor.comEsta());
    }
}
