/*
 * Programa que utilitza la classe del programa GatRenat i la seves propietats privats
 * mitjançant els mòduls getter i setter.
 */
 
public class UsaGatRenat {
    public static void main(String[] args) {
        // Crear una instancia de la classe GatRenat
        GatRenat renat = new GatRenat();
        // Mostrar el valor inicial de la propietat vides des de el mòdul getVides de la classe GatRenat
        System.out.println("Les vides inicials son: " + renat.getVides());
        // Mostrar el valor inicial de la propietat posicio des de el mòdul getPosicio de la classe GatRenat
        System.out.println("La posició inicial: " + renat.getPosicio());
        // Demanar la nova posicio
        System.out.println("Introdueix nova posició:");
        // Setear la nova posicio
        renat.setPosicio(Entrada.readLine());
        // Mostrar el valor canviat de la propietat posicio des de el mòdul getPosicio
        System.out.println("La posició final: " + renat.getPosicio());
    }
}
