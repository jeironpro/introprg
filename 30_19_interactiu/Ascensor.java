/*
 * Programa que conté dues propietats privades i un getter i setter per a cadascun d'ells.
 * A més inclòs aquests mètodes: 
 * esAbaix(): permet verificar si l'ascensor està abaix (pis -1).
 * esAdalt(): permet verificar si l'ascensor està adalt (pis 10).
 * esAturat(): permet verificar si el moviment de l'ascensor és aturat.
 * esEnMoviment(): permet verificar si l'ascensor està en moviment. 
 * esPujant(): permet verificar si el moviment de l'ascensor és pujant.
 * esBaixant():  permet verificar si el moviment de l'ascensor és baixant.
 * comEsta(): permet verificar l'estat de les propietats pis i moviment.
 * aturat(): permet assignar el moviment aturat a l'ascensor
 * arrencaAmunt(): permet assignar el moviment pujant a l'ascensor
 * arrencaAbaix(): permet assignar el moviment baixant a l'ascensor
 * seguentPis(): permet canviar de pis segon el moviment, si està baixant permet canviar de pis de dalt cap avall, i si està pujant permet canviar de pis de baix cap amunt. 
 * El getter i setter permet accedeix a aquestes propietats des de fora.
 */
 
public class Ascensor {
    // Propietats de la classe
    // Propietat private pis 
    private int pis = -1;
    // Propietat private moviment
    private String moviment = "aturat";
    
    // Mètode accessors que permet accedeix a la propietat pis des de fora
    public int getPis() {
        return pis;
    }
    
    // Mètode accessor que permet modificar a la propietat pis des de fora
    public void setPis(int nouPis) {
        if (nouPis >= -1 && nouPis <= 10) {
            pis = nouPis;
        }
    }
    
    // Mètode accessor que permet accedeix a la propietat moviment des de fora
    public String getMoviment() {
        return moviment;
    }
    
    // Mètode accessor que permet modificar a la propietat moviment des de fora
    public void setMoviment(String nouMov) {
        String[] moviments = new String[] {"aturat", "pujant", "baixant"};
        
        for (int i = 0; i < moviments.length; i++) {
            if (nouMov.equals(moviments[i])) {
                moviment = nouMov;
            }
        }
    }
    
    // Mètode que verifica si l'ascensor està abaix
    public boolean esAbaix() {
        if (pis == -1) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si l'ascensor està adalt
    public boolean esAdalt() {
        if (pis == 10) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si l'ascensor està aturat
    public boolean esAturat() {
        if (moviment.equals("aturat")) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si l'ascensor està en moviment
    public boolean esEnMoviment() {
        if (moviment.equals("pujant") || moviment.equals("baixant")) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si l'ascensor està pujant
    public boolean esPujant() {
        if (moviment.equals("pujant")) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica si l'ascensor està baixant
    public boolean esBaixant() {
        if (moviment.equals("baixant")) {
            return true;
        }
        return false;
    }
    
    // Mètode que verifica l'estat de l'ascensor
    public String comEsta() {
        return String.format("%s al pis %d", moviment, pis);   
    } 
    
    // Mètode que verifica si l'ascensor està aturat sino ho assigna
    public boolean aturat() {
        if (!esAturat()) {
            moviment = "aturat";
            return true;        
        } else {
            return false;
        }
    }
    
    // Mètode que verifica si l'ascensor està pujant sino ho assigna
    public boolean arrencaAmunt() {
        if (esAturat()) {
            moviment = "pujant";
            return true;
        } else {
            return false;
        }
    }
    
    // Mètode que verifica si l'ascensor està baixant sino ho assigna
    public boolean arrencaAbaix() {
        if (esAturat()) {
            moviment = "baixant";
            return true;
        } else {
            return false;
        }
    }
    
    // Mètode que canviar de pis a l'ascensor segon el moviment
    public int seguentPis() {
        if (esAdalt()) {
            pis = 10;
            moviment = "baixant";
        }
        if (esAbaix()) {
            pis = -1;
            moviment = "pujant";
        }
        
        if (esPujant() && pis <= 10) {
            pis = pis +1;
        }

        if (esBaixant() && pis >= -1) {
            pis = pis -1;
        }
        return pis;
    }
}
