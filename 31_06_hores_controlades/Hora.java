/*
 * Classe Hora que permet crear instàncies amb el constructor per defecte que crea la
 * instància amb els valors dels atributs en 0, i el setter ja no retornen res, sino 
 * que ara retornen un valor boolea, l'implementació ara es que verifica si el valor 
 * que s'intenta assignar sigui vàlid per la propietat, si ho es retorna true,
 *  altrament retorna fals.
 */

 public class Hora {
    // Propietats privades de la classe
    private int hores;
    private int minuts;
    private int segons;
    
    // Constructor per defecte
    public Hora() {
        hores = 0;
        minuts = 0;
        segons = 0;
    }
    
    // Mètode accessor getter de la propietat hores
    public int getHores() {
        // Retornar les hores actuals
        return this.hores;
    }
    
    // Mètode accessor getter de la propietat minuts
    public int getMinuts() {
        // Retornar els minuts actuals
        return this.minuts;
    }
    
    // Mètode accessor getter de la propietat segons
    public int getSegons() {
        // Retornar els segons actuals
        return this.segons;
    }
    
    // Mètode accessor setter de la propietat hores
    public boolean setHores(int hores) {
        boolean horesValides = (hores >= 0 && hores <= 23); 
        if (!horesValides) {
            return false;
        }
        this.hores = hores;
        return true;
    }
    
    // Mètode accessor setter de la propietat minuts
    public boolean setMinuts(int minuts) {
        boolean minutsValids = (minuts >= 0 && minuts <= 59); 
        if (!minutsValids) {
            return false;
        }
        this.minuts = minuts;
        return true;
    }
    
    // Mètode accessor setter de la propietat segons
    public boolean setSegons(int segons) {
        boolean segonsValids = (segons >= 0 && segons <= 59); 
        if (!segonsValids) {
            return false;
        }
        this.segons = segons;
        return true;
    }
    
    @Override
    /* Mètode sobreescrit per personalitza el valor que mostra per pantalla la
     * instancia (objecte).
     */
    public String toString() {
        return String.format("%d:%02d:%02d", hores, minuts, segons);
    }
}