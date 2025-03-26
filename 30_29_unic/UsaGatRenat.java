/*
 * Programa que fa servir la classe GatRenat i crea una instància mitjançant
 * un mètode amb patró singleton (getInstancia()) i rebre arguments per canviar
 * la posició, els valors permesos són 1 equivalent a estirat, 2 equivalent a 
 * assegut, 3 equivalent a dret, estirat, assegut i dret, fa servir un 
 * procediment que utilitza un mètode singleton per canviar la posició.
 */
 
public class UsaGatRenat {
    public static void main(String[] args) {
         GatRenat renat = GatRenat.getInstancia();
         System.out.println("Inicialment Renat està " + renat.getPosicio());
         for (String posicio: args) {
             canviaPosicio(posicio);
             System.out.println("Ara està " + renat.getPosicio());
         }
     }
    
    // Procediment que canvia la posició mitjançant un mètode singleton
    private static void canviaPosicio(String novaPosicio) {
        // Traduir la posicio quan se rebre com argument "1", "2" o "3" 
        if (novaPosicio.equals("1")) {
            novaPosicio = "estirat";
        }
        if (novaPosicio.equals("2")) {
            novaPosicio = "assegut";
        }
        if (novaPosicio.equals("3")) {
            novaPosicio = "dret";
        }
        
        // Només canvia la posició si és estirat, assegut o dret
        if (novaPosicio.equals("estirat") || novaPosicio.equals("assegut") || novaPosicio.equals("dret")) {
            GatRenat.getInstancia(novaPosicio);
        }
    }
}
