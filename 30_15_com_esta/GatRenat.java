/*
 * Programa que conté dues propietats privades i un getter i setter per a cadascun d'ells.
 * A més inclòs quatres mètodes: 
 * esViu(): permet verificar si el gat està viu o mort depenent de les vides que tingui.
 * esDret(): permet verificar si el gat està en posició dreta.
 * esAssegut(): permet verificar si el gat està en posició asseguda.
 * esEstirat(): permet verificar si el gat està en posició estirada.
 * El getter i setter permet accedeix a aquestes propietats des de fora.
 */

public class GatRenat {
    // Propietats de la classe
    // Propietat privat vides
    private int vides = 7;
    // Propietat privat posicio
    private String posicio = "estirat";
    
    // Mòdul que permet accedeix a la propietat vides des de fora
    public int getVides() {
        return vides;
    }
    
    // Mòdul que permet modificar a la propietat vides des de fora
    public void setVides(int vida) {
        if (vida > 0) {
            vides = vida;
        }
    }
    
    // Mòdul que permet accedeix a la propietat posició des de fora
    public String getPosicio() {
        return posicio;
    }
    
    // Mòdul que permet modificar a la propietat posicio des de fora
    public void setPosicio(String novaPos) {
        String[] posicions = new String[] {"dret", "assegut", "estirat"};
        
        for (int i = 0; i < posicions.length; i++) {
            if (pos.equals(posicions[i])) {
                posicio = novaPos;
            }
        }
    }
    
    // Mòdul que verifica si renat és viu (retorna true o false)
    public boolean esViu() {
        if (vides > 0) {
            return true;
        }
        return false;
    }
    
    // Mòdul que verifica si renat és dret (retorna true o false)
    public boolean esDret() {
        if (posicio.equals("dret")) {
            return true;
        }
        return false;
    }
    
    // Mòdul que verifica si renat és assegut (retorna true o false)
    public boolean esAssegut() {
        if (posicio.equals("assegut")) {
            return true;
        }
        return false;
    }
    
    // Mòdul que verifica si renat és estirat (retorna true o false)
    public boolean esEstirat() {
        if (posicio.equals("estirat")) {
            return true;
        }
        return false;
    }
}
