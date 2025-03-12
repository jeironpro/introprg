/*
 * Programa que conté dues propietats privades i un getter i setter per a cadascun d'ells.
 * El getter i setter permet accedeix a aquestes propietats des de fora. 
 * Els setters tenen restriccions i no permet que se li assignen valors inadequats a les 
 * propietats.
 */
 
public class Ascensor {
    // Propietats de la classe
    // Propietat private pis 
    private int pis = -1;
    // Propietat private moviment
    private String moviment = "aturat";
    
    // Mòdul accessor que permet accedeix a la propietat pis des de fora
    public int getPis() {
        return pis;
    }
    
    // Mòdul accessor que permet modificar a la propietat pis des de fora
    public void setPis(int nouPis) {
        if (nouPis >= -1 && nouPis <= 10) {
            pis = nouPis;
        }
    }
    
    // Mòdul accessor que permet accedeix a la propietat moviment des de fora
    public String getMoviment() {
        return moviment;
    }
    
    // Mòdul accessor que permet modificar a la propietat moviment des de fora
    public void setMoviment(String nouMov) {
        String[] moviments = new String[] {"aturat", "pujant", "baixant"};
        
        for (int i = 0; i < moviments.length; i++) {
            if (nouMov.equals(moviments[i])) {
                moviment = nouMov;
            }
        }
    }
}
