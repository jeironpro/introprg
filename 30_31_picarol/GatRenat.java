/*
 * Programa que conté tres propietats privades i un getter i setter per a cadascun d'ells que no son de tipus class. Pel tipus class tenim tres mètodes:
 * agafaPicarol(Picarol): que permet assignar el picarol rebut pel paràmetres.
 * deixaPicarol(): que permet assignar a null el picaroll.
 * hiHaPicarol(): que retorna cert o fals si hi ha o no picarol. 
 * A més inclòs aquests mètodes: 
 * esDret(): permet verificar si el gat està en posició dreta.
 * esAssegut(): permet verificar si el gat està en posició asseguda.
 * esEstirat(): permet verificar si el gat està en posició estirada.
 * aixecat(): permet verificar i assginar la posicio dret al renat.
 * seu(): permet verificar i assginar la posicio assegut al renat.
 * estirat(): permet verificar i assignar la posicio estirat al renat.
 * El getter i setter permet accedeix a aquestes propietats des de fora.
 */
 
public class GatRenat {
    // Propietats de la classe
    // Propietat privat vides
    private int vides = 7;
    // Propietat privat posicio
    private String posicio = "estirat";
    // Propietat de tipus class picarol (objecte-instància)
    private Picarol picarol;
    
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
    
    // Mètode que assigna un nou picarol rebut pel arguments
    public Picarol agafaPicarol(Picarol nouPicarol) {
        Picarol anticPicarol = picarol;
        picarol = nouPicarol;
        return anticPicarol;
    }
    
    // Mètode que assigna null al picarol
    public Picarol deixaPicarol() {
        Picarol anticPicarol = picarol;
        picarol = null;
        return anticPicarol;
    }
    
    // Mètode que verifica si hi ha picarol assignat
    public boolean hiHaPicarol() {
        if (picarol != null) return true;
        return false;
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
    public void setPosicio(String novaPos) {
        String[] posicions = new String[] {"dret", "assegut", "estirat"};
        
        for (int i = 0; i < posicions.length; i++) {
            if (novaPos.equals(posicions[i])) {
                posicio = novaPos;
            }
        }
    }
    
    // Mètode que verifica si renat és dret (retorna true o false)
    public boolean esDret() {
        if (posicio.equals("dret")) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si renat és assegut (retorna true o false)
    public boolean esAssegut() {
        if (posicio.equals("assegut")) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si renat és estirat (retorna true o false)
    public boolean esEstirat() {
        if (posicio.equals("estirat")) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si el renat està assegut, si ho està mostra un missatge, sino ho està li assigna aquesta posició i mostra un missatge de que ho a fet.
    public String aixecat() {
        if (esDret()) {
            return "passo de fer res";     
        }
        posicio = "dret";
        if (hiHaPicarol()) {
            picarol.sona();
        }
        return "ja m'aixeco";
    }
    
    // Mètode que verifica si el renat està dret, si ho està mostra un missatge, sino ho està li assigna aquesta posició i mostra un missatge de que ho a fet.
    public String seu() {
        if (esAssegut()) {
            return "passo de fer res";  
        }
        posicio = "assegut";
        if (hiHaPicarol()) {
            picarol.sona();
        }
        return "ja m'assec";
    }
    
    // Mètode que verifica si el renat està estirat, si ho està mostra un missatge, sino ho està li assigna aquesta posició i mostra un missatge de que ho a fet.
    public String estirat() {
        if (esEstirat()) {
            return "passo de fer res";  
        }
        posicio = "estirat";
        if (hiHaPicarol()) {
            picarol.sona();
        }
        return "ja m'estiro";
    }
}
