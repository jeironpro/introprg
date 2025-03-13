/*
 * Programa que conté dues propietats privades i un getter i setter per a cadascun d'ells.
 * A més inclòs quatres mètodes: 
 * esViu(): permet verificar si el gat està viu o mort depenent de les vides que tingui.
 * esDret(): permet verificar si el gat està en posició dreta.
 * esAssegut(): permet verificar si el gat està en posició asseguda.
 * esEstirat(): permet verificar si el gat està en posició estirada.
 * aixecat(): permet verificar i assginar la posicio dret al renat.
 * seu(): permet verificar i assginar la posicio assegut al renat.
 * estirat(): permet verificar i assignar la posicio estirat al renat.
 * mor(): permet verificar si el renat està mor si no ho està li lleva una vida, en tots cas retorna una missatge.
 * reviu(): permet reviure el renat sumant li 1 vida i retorna un missatge.
 * reviu(int): permet fer el mateix que reviu(), però el nombre de vides a sumar-li el rebre per l'argument, si el nombre de vides és menor que un retorna un missatge.
 * El getter i setter permet accedeix a aquestes propietats des de fora.
 */

public class GatRenat {
    // Propietats de la classe
    // Propietat privat vides
    private int vides = 7;
    // Propietat privat posicio
    private String posicio = "estirat";
    
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
    
    // Mètode que verifica si renat és viu (retorna true o false)
    public boolean esViu() {
        if (vides > 0) {
            return true;
        }
        return false;
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
        return "ja m'aixeco";
    }
    
    // Mètode que verifica si el renat està dret, si ho està mostra un missatge, sino ho està li assigna aquesta posició i mostra un missatge de que ho a fet.
    public String seu() {
        if (esAssegut()) {
            return "passo de fer res";  
        }
        posicio = "assegut";
        return "ja m'assec";
    }
    
    // Mètode que verifica si el renat està estirat, si ho està mostra un missatge, sino ho està li assigna aquesta posició i mostra un missatge de que ho a fet.
    public String estirat() {
        if (esEstirat()) {
            return "passo de fer res";  
        }
        posicio = "estirat";
        return "ja m'estiro";
    }
    
    // Mètode que verifica si el renat té una o més vides per treure-li una i retornar un missatge, si quan li treu una vida ja no li queden més retorna un missatge, en cas contrari retorna una altre missatge.
    public String mor() {
        if (vides > 0) {
            vides = vides - 1;

            if (vides > 0) {
                return "auch";
            } else {
                return "ximpún";
            }
        } else {
            return "...";
        }
    }
    
    // Mètode que reviu al renat sumant-li una vida i retorna un missatge, si no estava mor retorna un altre missatge.
    public String reviu() {
        String mor = mor();
        if (mor.equals("ximpún") || mor.equals("...")) {
            vides = vides + 1;
            return "guai!";
        } else {
            return "...";
        }
    }
    
    // Mètode que reviu al renat sumant-li una vida i retorna un missatge, si no estava mor retorna un altre missatge. Les vides a sumar-li es rebran per l'argument.
    public String reviu(int vida) {
        String mor = mor();
        if ((mor.equals("ximpún") || mor.equals("...")) && vida > 0) {
            vides = vides + vida;
            return "guai!";
        } else {
            return "...";
        }
    }
}
