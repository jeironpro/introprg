/*
 * Programa que conté dues propietats privades i un getter i setter per a cadascun d'ells.
 * A més inclòs quatres mètodes: 
 * esAbaix(): permet verificar si l'ascensor està abaix (pis -1).
 * esAdalt(): permet verificar si l'ascensor està adalt (pis 10).
 * esAturat(): permet verificar si el moviment de l'ascensor és aturat.
 * esEnMoviment(): permet verificar si l'ascensor està en moviment. 
 * esPujant(): permet verificar si el moviment de l'ascensor és pujant.
 * esBaixant():  permet verificar si el moviment de l'ascensor és baixant.
 * comEsta(): permet verificar l'estat de les propietats pis i moviment.
 * El getter i setter permet accedeix a aquestes propietats des de fora.
 */
 
public class Ascensor {
    // Propietats de la classe
    // Propietat private pis 
    private int pis = -1;
    // Propietat private moviment
    private String moviment = "aturat";
    
    // Mòdul que permet accedeix a la propietat pis des de fora
    public int getPis() {
        return pis;
    }
    
    // Mòdul que permet modificar a la propietat pis des de fora
    public void setPis(int nouPis) {
        if (pis >= -1 && pis <= 10) {
            pis = nouPis;
        }
    }
    
    // Mòdul que permet accedeix a la propietat moviment des de fora
    public String getMoviment() {
        return moviment;
    }
    
    // Mòdul que permet modificar a la propietat moviment des de fora
    public void setMoviment(String nouMov) {
        String[] moviments = new String[] {"aturat", "pujant", "baixant"};
        
        for (int i = 0; i < moviments.length; i++) {
            if (nouMov.equals(moviments[i])) {
                moviment = nouMov;
            }
        }
    }
    
    // Mòdul que verifica si l'ascensor està abaix
    public boolean esAbaix() {
        if (pis == -1) {
            return true;
        }
        return false;
    }
    
    // Mòdul que verifica si l'ascensor està adalt
    public boolean esAdalt() {
        if (pis == 10) {
            return true;
        }
        return false;
    }
    
    // Mòdul que verifica si l'ascensor està aturat
    public boolean esAturat() {
        if (moviment.equals("aturat")) {
            return true;
        }
        return false;
    }
    
    // Mòdul que verifica si l'ascensor està en moviment
    public boolean esEnMoviment() {
        if (moviment.equals("pujant") || moviment.equals("baixant")) {
            return true;
        }
        return false;
    }
    
    // Mòdul que verifica si l'ascensor està pujant
    public boolean esPujant() {
        if (moviment.equals("pujant")) {
            return true;
        }
        return false;
    }
    
    // Mòdul que verifica si l'ascensor està baixant
    public boolean esBaixant() {
        if (moviment.equals("baixant")) {
            return true;
        }
        return false;
    }
    
    // Mòdul que verifica l'estat de l'ascensor
    public String comEsta() {
        return String.format("%s al pis %d", moviment, pis);   
    } 
}
