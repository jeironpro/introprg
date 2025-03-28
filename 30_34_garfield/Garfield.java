/*
 *
 */
 
class Garfield extends Gat {
    public Garfield() {
        super("Garfield", 9, "estirat");
    }
    
    // Mètode que verifica si el renat està assegut, si ho està mostra un missatge, sino ho està li assigna aquesta posició i mostra un missatge de que ho a fet.
    @Override
    public String aixecat() {
        if (esAssegut()) {
            super.setPosicio("dret");        
            return "ja m'aixeco";
        }
        
        if (esDret()) {
            return "passo de fer res";      
        }
        return "Bai Maitea, bai";    
        
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
        if (esEstirat()) {  
            return "passo de fer res";  
        }
        return "Bai Maitea, bai";
    }
}
