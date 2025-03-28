/*
 *
 */

class Gat {
    // Propietats de la classe
    // Propietat privat nom
    private final String nom;
    // Propietat privat vides
    private int vides;
    // Propietat privat posicio
    private String posicio;
    
    public Gat(String nom) {
        if (nom != null && !nom.isBlank()) {
            this.nom = nom;        
        } else {
            this.nom = "anònim"; 
        }
        this.setVides(9);
        this.setPosicio("estirat");
    }
    
    public Gat(String nom, int vides) {
        if (nom != null && !nom.isBlank()) {
            this.nom = nom;        
        } else {
            this.nom = "anònim"; 
        }
        this.setVides(vides);
    }
    
    public Gat(String nom, String posicio) {
        if (nom != null && !nom.isBlank()) {
            this.nom = nom;        
        } else {
            this.nom = "anònim"; 
        }
        this.setPosicio(posicio);
    }
    
    public Gat(String nom, int vides, String posicio) {
        if (nom != null && !nom.isBlank()) {
            this.nom = nom;        
        } else {
            this.nom = "anònim"; 
        }
        this.setVides(vides);
        this.setPosicio(posicio);
    }
    
    public String getNom() { 
        return this.nom;
    }
    
    // Mètode que permet accedeix a la propietat vides des de fora
    public int getVides() {
        return this.vides;
    }
    
    // Mètode que permet modificar a la propietat vides des de fora
    public void setVides(int vides) {
        if (vides >= 0 && vides <= 9) {
            this.vides = vides;
        }
    }
    
    // Mètode que permet accedeix a la propietat posició des de fora
    public String getPosicio() {
        return this.posicio;
    }
    
    // Mètode que permet modificar a la propietat posicio des de fora
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
    
    // Mètode que verifica si el renat està dret, si ho està mostra un missatge, sino ho està li assigna aquesta posició i mostra un missatge de que ho a fet.
    public String seu() {
        if (esAssegut()) {
            return "passo de fer res";  
        }
        this.setPosicio("assegut");
        return "ja m'assec";
    }
    
    // Mètode que verifica si el renat està estirat, si ho està mostra un missatge, sino ho està li assigna aquesta posició i mostra un missatge de que ho a fet.
    public String estirat() {
        if (esEstirat()) {
            return "passo de fer res";  
        }
        this.setPosicio("estirat");
        return "ja m'estiro";
    }
    
}
