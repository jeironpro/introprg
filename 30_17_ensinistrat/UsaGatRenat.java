/*
 * Programa que utilitza la classe del programa GatRenat per fer-li preguntes
 * mitjançant els mètodes que inclou.
 */

public class UsaGatRenat {
    public static void main(String[] args) {
        // Crear una instància de la classe GatRenat
        GatRenat renat = new GatRenat();
        // Mostrar si el renat està o no assegut
        System.out.println("El Renat diu: "+ renat.aixecat());
        // Mostrar si el renat està o no dret
        System.out.println("El Renat diu: "+ renat.seu());
        // Mostrar si el renat està o no estirat
        System.out.println("El Renat diu: "+ renat.estirat());
        System.out.println("El Renat diu: "+ renat.estirat());
    }
}
