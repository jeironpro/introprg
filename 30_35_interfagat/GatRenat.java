/* 
 * Programa que fa servir la superclasse Gat i l'interfície Ensinistrable i
 * AnimalDeCompanyia. Conté:
 * 1 propietat privada posicio.
 * 2 constructors, un per defecte i un altre que reb posicio.
 * Mètode accesor getter per la propietat de la classe.
 * Sobreescriu tots els mètodes de l'interfície Ensinistrable.
 * Sobreescriu tots els mètodes de l'interfície AnimalDeCompanyia.
 */
 
class GatRenat extends Gat implements Ensinistrable, AnimalDeCompanyia {
    // Propietat de la classe
    private String posicio = "estirat";
    
    // Constructor per defecte
    public GatRenat() {
        super("Renat");
    }
    
    // Constructor específic que reb posicio
    public GatRenat(String posicio) {
        super("Renat");
        this.posicio = posicio;
    }
    
    // Mètode accessor getter per la propietat posicio
    public String getPosicio() {
        return this.posicio;
    }
    
    @Override
    // Mètode de l'interfície Ensinistrable (sobreescrit) 
    public boolean esDret() {
        return this.posicio.equals("dret");
    }
    
    @Override
    // Mètode de l'interfície Ensinistrable (sobreescrit) 
    public boolean esAssegut() {
        return this.posicio.equals("assegut");
    }
    
    @Override
    // Mètode de l'interfície Ensinistrable (sobreescrit) 
    public boolean esEstirat() {
        return this.posicio.equals("estirat");
    }
    
    @Override
    // Mètode de l'interfície Ensinistrable (sobreescrit) 
    public String aixecat() {
        if (this.esDret()) {
            return "passo de fer res";     
        }
        this.posicio = "dret";
        return "ja m'aixeco";
    }
    
    @Override
    // Mètode de l'interfície Ensinistrable (sobreescrit) 
    public String seu() {
        if (this.esAssegut()) {
            return "passo de fer res";  
        }
        this.posicio = "assegut";
        return "ja m'assec";
    }
    
    @Override
    // Mètode de l'interfície Ensinistrable (sobreescrit) 
    public String estirat() {
        if (this.esEstirat()) {
            return "passo de fer res";  
        }
        this.posicio = "estirat";
        return "ja m'estiro";
    }   
    
    @Override
    // Mètode de l'interfície AnimalDeCompanyia (sobreescrit) 
    public String deixatEstimar() {
        return "em deixo estimar";
    }
}
