/*
 * Programa que utilitza la superclasse Gat per instanciar al Garfield.
 * Conté amb: un constructor per defecte i sobreescriu els mètodes; aixecat(),
 * seu() i estirat().
 */
 
class Garfield extends Gat {
    // Constructor per defecte
    public Garfield() {
        super("Garfield", 9, "estirat");
    }
    
    /* Mètode que verifica si el renat està dret, si ho està mostra un
     * missatge, sino ho està verifica si està assegut i si ho està li assigna 
     * la posició "dret" i mostra un missatge de que ho a fet, altrament mostra 
     * un altre missatge. Aquest mètode està definit en la superclasse i aquesta
     * classe ho sobreescriu. 
     */
    @Override
    public String aixecat() {
        if (esDret()) {
            return "passo de fer res";      
        }
        
        if (super.esAssegut()) {
            super.setPosicio("dret");        
            return "ja m'aixeco";
        }
        return "Bai Maitea, bai";    
    }
    
    /* Mètode que verifica si el renat està assegut, si ho està mostra un
     * missatge, sino ho està li assigna aquesta posició i mostra un missatge 
     * de que ho a fet. Aquest mètode està definit en la superclasse i aquesta
     * classe ho sobreescriu. 
     */
    @Override
    public String seu() {
        if (!super.esAssegut()) {
            super.setPosicio("assegut");
            return "ja m'assec";
        }
        return "passo de fer res";  
    }
    
    /* Mètode que verifica si el renat està estirat, si ho està mostra un
     * missatge, sino ho està verifica si està assegut i si ho està li assigna
     * la posició "estirat" i mostra un missatge de que ho a fet, altrament 
     * mostra un altre missatge. Aquest mètode està definit en la superclasse i
     * aquesta classe ho sobreescriu.
     */ 
    @Override
    public String estirat() {
        if (super.esEstirat()) {  
            return "passo de fer res";  
        }
        
        if (super.esAssegut()) {
            super.setPosicio("estirat");
            return "ja m'estiro";
        }
        return "Bai Maitea, bai";
    }
}
