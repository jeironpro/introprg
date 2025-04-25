/*
 * Classe Hora que permet crear instàncies amb constructors per defecte i específic,
 * el per defecte crea la instància amb els valors dels atributs en 0,
 * l'específic que declara que es pot llançar excepcions i assigna els valors als
 * atributs mitjançant els mètodes setters que llança l'excepció 
 * IllegalArgumentException quan els valors no són vàlids.
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

    // Constructor especific amb tots els atributs, aquest constructor llança excepcions
    public Hora(int hores, int minuts, int segons) throws Exception {
        setHores(hores);
        setMinuts(minuts);
        setSegons(segons);
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
    
    /* Mètode accessor setter de la propietat hores, aquest mètode llança excepcions especificament IllegalArgurmentException */
    public void setHores(int hores) throws Exception {
        if (hores >= 0 && hores <= 23) {
            this.hores = hores;
        } else {
            throw new IllegalArgumentException("hores fora de rang: " + hores);
        }
    }
    
    /* Mètode accessor setter de la propietat minuts, aquest mètode llança excepcions especificament IllegalArgurmentException */
    public void setMinuts(int minuts) throws Exception {
        if (minuts >= 0 && minuts <= 59) {
            this.minuts = minuts;
        } else {
            throw new IllegalArgumentException("minuts fora de rang: " + minuts);
        }
    }
    
    /* Mètode accessor setter de la propietat segons, aquest mètode llança excepcions especificament IllegalArgurmentException */
    public void setSegons(int segons) throws Exception {
        if (segons >= 0 && segons <= 59) {
            this.segons = segons;
        } else {
            throw new IllegalArgumentException("segons fora de rang: " + segons);
        }
    }
    
    @Override
    /* Mètode sobreescrit per personalitza el valor que mostra per pantalla la
     * instancia (objecte).
     */
    public String toString() {
        return String.format("%d:%02d:%02d", hores, minuts, segons);
    }
}
