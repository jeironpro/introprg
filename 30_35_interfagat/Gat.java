/* 
 * Programa que es la superclasse de altres programes i es fa servir 
 * l'interfície EsserViu. Aquesta classe conté:
 * 2 popietats privades vides i nom.
 * 2 constructors específics un que reb un nom i altre que reb un nom i un nombre de vides.
 * Els mètodes que accessor getter i setter per cada propietat excepte que nom no té setter.
 * esViu(): permet verificar si el gat està viu o mort depenent de les vides que tingui.
 * mor(): permet verificar si el renat està mor si no ho està li lleva una vida, en tots cas retorna una missatge.
 * reviu(): permet reviure el renat sumant li 1 vida i retorna un missatge.
 */
 
class Gat implements EsserViu {
    // Propietats de la classe
    private int vides = 7;
    private String nom = "anònim";
    
    // Constructor específic que reb nom
    public Gat(String nom) {
        this(nom, 7);
    }
    
    // Constructor específic que reb nom i vides
    public Gat(String nom, int vides) {
        if (nom != null && !nom.isBlank()) {
            this.nom = nom;
        }
        this.setVides(vides);
    }
    
    // Mètode accessor getter per la propietat nom
    public String getNom() {
        return this.nom;
    }
    
    // Mètode accessor getter per la propietat vides
    public int getVides() {
        return this.vides;
    }
    
    // Mètode accessor setter per la propietat vides
    public void setVides(int vides) {
        if (vides >= 0 && vides <= 7) {
            this.vides = vides;
        }
    }
    
    @Override
    // Mètode de l'interfície EsserViu (sobreescrit) 
    public boolean esViu() {
        return this.vides > 0;
    }
    
    @Override
    // Mètode de l'interfície EsserViu (sobreescrit) 
    public String mor() {
        if (this.vides > 0) {
            this.vides = this.vides - 1;
            return "adéu món cruel";        
        } else {
            return "ja l'he espifiada";
        }
    }
    
    @Override
    // Mètode de l'interfície EsserViu (sobreescrit) 
    public String reviu() {
        if (this.vides <= 0) {
            this.vides = this.vides + 1;
            return "guai!";
        } else {
            return "encara miolo";
        }
    }
}
