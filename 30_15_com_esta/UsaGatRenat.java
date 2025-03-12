/*
 * Programa que utilitza la classe del programa GatRenat per fer servir les seves 
 * propietats privats mitjançant els mòduls getter i setter, també fer-li preguntes
 * mitjançant els mètodes que inclou.
 */

public class UsaGatRenat {
    public static void main(String[] args) {
        // Crear una instància de la classe GatRenat
        GatRenat renat = new GatRenat();
        // Mostrar el valor inicial que retorna el mòdul esViu() de la classe GatRenat
        System.out.println("Inicialment renat.esViu(): " + renat.esViu());
        // Mostrar el valor inicial que retorna el mòdul esDret() de la classe GatRenat
        System.out.println("Inicialment renat.esDret(): " + renat.esDret());
        // Mostrar el valor inicial que retorna el mòdul esAssegut() de la classe GatRenat
        System.out.println("Inicialment renat.esAssegut(): " + renat.esAssegut());
        // Mostrar el valor inicial que retorna el mòdul esEstirat() de la classe GatRenat
        System.out.println("Inicialment renat.esEstirat(): " + renat.esEstirat());
        // Demanar les vides de renat
        System.out.println("Introdueix quantes vides:");
        // Setear la noves vides
        renat.setVides(Integer.parseInt(Entrada.readLine()));
        // Demanar la nova posició de renat
        System.out.println("Introdueix nova posició:");
        // Setear la nova posicio
        renat.setPosicio(Entrada.readLine());
        // Mostrar el valor final que retorna el mòdul esViu() de la classe GatRenat
        System.out.println("Finalment renat.esViu(): " + renat.esViu());
        // Mostrar el valor final que retorna el mòdul esDret() de la classe GatRenat
        System.out.println("Finalment renat.esDret(): " + renat.esDret());
        // Mostrar el valor final que retorna el mòdul esAssegut() de la classe GatRenat
        System.out.println("Finalment renat.esAssegut(): " + renat.esAssegut());
        // Mostrar el valor final que retorna el mòdul esEstirat() de la classe GatRenat
        System.out.println("Finalment renat.esEstirat(): " + renat.esEstirat());
    }
}
