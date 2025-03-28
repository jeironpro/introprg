/*
 * Programa que és fa servir com a superclasse de altres, tots els comportament
 * comuns d'un gat esten implementant en aquesta classe.
 * Conte amb: 
 * 3 propietats privades (nom, vides, posicio) 
 * 4 constructors específics
 * mètodes accessors getters i setters per cada propietats per la propietat nom no tenim setter, també conté amb aquests mètodes:
 * esViu(): permet verificar si el gat està viu o mort depenent de les vides que tingui.
 * esDret(): permet verificar si el gat està en posició dreta.
 * esAssegut(): permet verificar si el gat està en posició asseguda.
 * esEstirat(): permet verificar si el gat està en posició estirada.
 * aixecat(): permet verificar i assginar la posicio dret al renat.
 * seu(): permet verificar i assginar la posicio assegut al renat.
 * estirat(): permet verificar i assignar la posicio estirat al renat.
 */

class Gat {
    // Propietats de la classe
    // Propietat privat final nom
    private final String nom;
    // Propietat privat vides
    private int vides;
    // Propietat privat posicio
    private String posicio;
    
    /* Constructor d'un gat que rep nomes el nom (se li assigna nómes si es
     * vàlid) altrament se li assgina "anònim" i els altres valors per defecte.
     */
    public Gat(String nom) {
        if (nom != null && !nom.isBlank()) {
            this.nom = nom;        
        } else {
            this.nom = "anònim"; 
        }
        this.setVides(9);
        this.setPosicio("estirat");
    }
    
    /* Constructor d'un gat que rep nomes el nom (se li assigna nómes si es
     * vàlid) altrament se li assgina "anònim", vides i els altres valors per
     * defecte.
     */
    public Gat(String nom, int vides) {
        if (nom != null && !nom.isBlank()) {
            this.nom = nom;        
        } else {
            this.nom = "anònim"; 
        }
        this.setVides(vides);
        this.setPosicio("estirat");
    }
    
    /* Constructor d'un gat que rep nomes el nom (se li assigna nómes si es
     * vàlid) altrament se li assgina "anònim", posicio i els altres valors per
     * defecte.
     */
    public Gat(String nom, String posicio) {
        if (nom != null && !nom.isBlank()) {
            this.nom = nom;        
        } else {
            this.nom = "anònim"; 
        }
        this.setVides(9);
        this.setPosicio(posicio);
    }
    
    /* Constructor d'un gat que rep nomes el nom (se li assigna nómes si es
     * vàlid) altrament se li assgina "anònim", vides i posicio.
     */
    public Gat(String nom, int vides, String posicio) {
        if (nom != null && !nom.isBlank()) {
            this.nom = nom;        
        } else {
            this.nom = "anònim"; 
        }
        this.setVides(vides);
        this.setPosicio(posicio);
    }
    
    // Mètode accessor getter per llegir la propietat nom
    public String getNom() { 
        return this.nom;
    }
    
    // Mètode accessor getter per llegir la propietat vides
    public int getVides() {
        return this.vides;
    }
    
    // Mètode accessor setter per modificar la propietat vides
    public void setVides(int vides) {
        if (vides >= 0 && vides <= 9) {
            this.vides = vides;
        }
    }
    
    // Mètode accessor getter per llegir la propietat posicio
    public String getPosicio() {
        return this.posicio;
    }
    
    // Mètode accessor setter per modificar la propietat posicio
    public void setPosicio(String posicio) {
        this.posicio = posicio;
    }
    
    // Mètode que verifica si renat és viu (retorna true o false)
    public boolean esViu() {
        if (vides > 0) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si renat és dret (retorna true o false)
    public boolean esDret() {
        if (this.posicio.equals("dret")) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si renat és assegut (retorna true o false)
    public boolean esAssegut() {
        if (this.posicio.equals("assegut")) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si renat és estirat (retorna true o false)
    public boolean esEstirat() {
        if (this.posicio.equals("estirat")) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si el renat està assegut, si ho està mostra un missatge, sino ho està li assigna aquesta posició i mostra un missatge de que ho a fet.
    public String aixecat() {
        if (esDret()) {
            return "passo de fer res";     
        }
        this.setPosicio("dret");
        return "ja m'aixeco";
    }
    
    /* Mètode que verifica si el renat està dret, si ho està mostra un missatge,
     * sino ho està li assigna aquesta posició i mostra un missatge de que ho a
     * fet.
     */
    public String seu() {
        if (esAssegut()) {
            return "passo de fer res";  
        }
        this.setPosicio("assegut");
        return "ja m'assec";
    }
    
    /* Mètode que verifica si el renat està estirat, si ho està mostra un
     * missatge, sino ho està li assigna aquesta posició i mostra un missatge 
     * de que ho a fet.
     */
    public String estirat() {
        if (esEstirat()) {
            return "passo de fer res";  
        }
        this.setPosicio("estirat");
        return "ja m'estiro";
    }
    
}
