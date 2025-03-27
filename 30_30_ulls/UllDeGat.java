/*
 * Programa que és part de un GatRenat i conte amb una propietat privada
 * dos constructors, el pel defecte que instància amb el ull tancat i un 
 * especific que permet instànciar el ull del gat obert o tancat i tres 
 * mètodes un que permet obrir el ull del gat, altre que permet tancar-ho 
 * i un ùltim que verifica si el ull esta obert o tancat.
 */

public class UllDeGat {
    // Propietat privada obret
    private boolean obret;
    
    // Constructor per defecte, crea la instancia amb el ull tancat
    public UllDeGat() {
        this.tancat();        
    }
    
    /* Constructor especific, amb un boolea com paràmetre que depenent
     * si es true o false, obre o tanca el ull del gat
     */
    public UllDeGat(boolean obret) {
        this.obret = obret;
    }
    
    // Mètode que obre el ull del gat
    public void obret() {
        this.obret = true;
    }
    
    // Mètode que tanca el ull del gat
    public void tancat() {
        this.obret = false;
    }
    
    // Mètode que verifica si el ull està obert o tancat
    public boolean esObert() {
        return this.obret;
    }
}
