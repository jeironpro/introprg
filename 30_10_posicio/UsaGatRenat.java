/*
 * Programa que utilitza la classe del programa GatRenat i la seves propietats
 */

public class UsaGatRenat {
    public static void main(String[] args) {
        // Crear una instancia de GatRenat
        GatRenat renat = new GatRenat();
        // Mostrar el valor inicial de la propietat vides de GatRenat
        System.out.println("Vides inicials: " + renat.vides);
        // Mostrar el valor inicial de la propietat posicio de GatRenat
        System.out.println("Posició inicial: " + renat.posicio);
        // Canviar el valor de la propietat posicio
        renat.posicio = "assegut";
        // Mostrar el valor canviat de la propietat posicio
        System.out.println("Posició final: " + renat.posicio);
    }
}
