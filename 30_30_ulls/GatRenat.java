/*
 * Programa que conté quatres propietats privades i un getter i setter per a
 * dos d'ells i un getter pel altres dos. A més inclòs aquests mètodes: 
 * Constructor per defecte i constructor especific. 
 * esViu(): permet verificar si el gat està viu o mort depenent de les vides que tingui.
 * esDret(): permet verificar si el gat està en posició dreta.
 * esAssegut(): permet verificar si el gat està en posició asseguda.
 * esEstirat(): permet verificar si el gat està en posició estirada.
 * aixecat(): permet verificar i assginar la posicio dret al renat.
 * seu(): permet verificar i assginar la posicio assegut al renat.
 * estirat(): permet verificar i assignar la posicio estirat al renat.
 */
 
public class GatRenat {
    // Propietats de la classe
    private int vides;
    private String posicio;
    private UllDeGat ullDret = new UllDeGat();
    private UllDeGat ullEsquerre = new UllDeGat();
    
    /* Constructor per defecte, inicialitza les propietat amb valors
     * per defecte.
     */
    public GatRenat() {
        this.setVides(7);
        this.setPosicio("estirat");
    }
    
    /* Constructor amb un paràmetre (posicio), inicialitza vides a el valor
     * per defecte i posicio amb el valor que rep.
     */
    public GatRenat(String posicio) {
        this.setVides(7);
        this.setPosicio(posicio);
    }
    
    // Mètode que permet accedeix a la propietat vides des de fora
    public int getVides() {
        return vides;
    }
    
    // Mètode que permet modificar a la propietat vides des de fora
    public void setVides(int vida) {
        if (vida >= 0) {
            vides = vida;
        }
    }
    
    // Mètode que permet accedeix a la propietat posició des de fora
    public String getPosicio() {
        return posicio;
    }
    
    // Mètode que permet modificar a la propietat posicio des de fora
    public void setPosicio(String posicio) {
        String[] posicions = new String[] {"dret", "assegut", "estirat"};
        
        for (int i = 0; i < posicions.length; i++) {
            if (posicio.equals(posicions[i])) {
                this.posicio = posicio;
            }
        }
        
        if (posicio.equals("dret")) {
            ullDret.obret();
            ullEsquerre.obret();
        }
        
        if (posicio.equals("assegut")) {
            ullDret.obret();
            ullEsquerre.tancat();
        }
        
        if (posicio.equals("estirat")) {
            ullDret.tancat();
            ullEsquerre.tancat();
        }
    }
    
    // Mètode que retorna l'ull dret del gat
    public UllDeGat getUllDret() {
        return ullDret;
    }
    
    // Mètode que retorna l'ull esquerre del gat
    public UllDeGat getUllEsquerre() {
        return ullEsquerre;
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
    
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        UllDeGat ullDret = renat.getUllDret();
        UllDeGat ullEsquerre = renat.getUllEsquerre();
        
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().esObert(),
                renat.getUllEsquerre().esObert());
        renat.seu();
        
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().esObert(),
                renat.getUllEsquerre().esObert());
        renat.aixecat();
        
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().esObert(),
                renat.getUllEsquerre().esObert());
    }
}
