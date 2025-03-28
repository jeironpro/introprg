/*
 *
 */
 
class Garfield extends Gat {
    public Garfield() {
        super("Garfield", 9, "estirat");
    }
    
    /* Constructor amb un paràmetre (vides), crida al constructor amb paràmetres
     * i li passa l'argument que reb per vides i el valor per defecte de posicio.
     */
    /*public Garfield(int vides) {
        super("Garfield", vides, "estirat");
    }*/
    
    /* Constructor amb un paràmetre (posicio), crida al constructor amb paràmetres
     * i li passa el valor per defecte de vides i l'argument que rep per posicio.
     */
    /*public Garfield(String posicio) {
        super("Garfield", 9, posicio);
    }*/
    
    /* Constructor amb paràmetres, fa servir this per referir-se als mètodes 
     * accessors de la classe, per modificar les propietats. 
     */
    /*public Garfield(int vides, String posicio) {
        super("Garfield", vides, posicio);
    }*/
    
    // Mètode que permet modificar a la propietat posicio des de fora
    @Override
    public void setPosicio(String posicio) {
        super.setPosicio(posicio);
    }
    
    // Mètode que verifica si el renat està assegut, si ho està mostra un missatge, sino ho està li assigna aquesta posició i mostra un missatge de que ho a fet.
    @Override
    public String aixecat() {
        if (esAssegut()) {
            super.setPosicio("dret");        
            return "ja m'aixeco";
        }
        return "passo de fer res";      
    }
    
    // Mètode que verifica si el renat està dret, si ho està mostra un missatge, sino ho està li assigna aquesta posició i mostra un missatge de que ho a fet.
    @Override
    public String seu() {
        if (!esAssegut()) {
            super.setPosicio("assegut");
            return "ja m'assec";
        }
        return "passo de fer res";  
    }
    
    // Mètode que verifica si el renat està estirat, si ho està mostra un missatge, sino ho està li assigna aquesta posició i mostra un missatge de que ho a fet.
    @Override
    public String estirat() {
        if (esAssegut()) {
            super.setPosicio("estirat");
            return "ja m'estiro";
        }
        return "passo de fer res";  
    }
}
