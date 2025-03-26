/*
 * Programa que és una subclasse de la classe Gat.
 * Inclòs set mètodes: 
 * esViu(): permet verificar si el gat està viu o mort depenent de les vides que tingui.
 * esDret(): permet verificar si el gat està en posició dreta.
 * esAssegut(): permet verificar si el gat està en posició asseguda.
 * esEstirat(): permet verificar si el gat està en posició estirada.
 * aixecat(): permet verificar i assginar la posicio dret al renat.
 * seu(): permet verificar i assginar la posicio assegut al renat.
 * estirat(): permet verificar i assignar la posicio estirat al renat.
 */
 
public class GatRenat extends Gat {
    // Mètode que verifica si renat és viu (retorna true o false)
    public boolean esViu() {
        if (getVides() > 0) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si renat és dret (retorna true o false)
    public boolean esDret() {
        if (getPosicio().equals("dret")) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si renat és assegut (retorna true o false)
    public boolean esAssegut() {
        if (getPosicio().equals("assegut")) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si renat és estirat (retorna true o false)
    public boolean esEstirat() {
        if (getPosicio().equals("estirat")) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si el renat està assegut, si ho està mostra un missatge, sino ho està li assigna aquesta posició i mostra un missatge de que ho a fet.
    public String aixecat() {
        if (esDret()) {
            return "passo de fer res";     
        }
        setPosicio("dret");
        return "ja m'aixeco";
    }
    
    // Mètode que verifica si el renat està dret, si ho està mostra un missatge, sino ho està li assigna aquesta posició i mostra un missatge de que ho a fet.
    public String seu() {
        if (esAssegut()) {
            return "passo de fer res";  
        }
        setPosicio("assegut");
        return "ja m'assec";
    }
    
    // Mètode que verifica si el renat està estirat, si ho està mostra un missatge, sino ho està li assigna aquesta posició i mostra un missatge de que ho a fet.
    public String estirat() {
        if (esEstirat()) {
            return "passo de fer res";  
        }
        setPosicio("estirat");
        return "ja m'estiro";
    }
}
