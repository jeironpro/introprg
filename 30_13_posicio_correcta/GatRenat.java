/*
 * Programa que conté dues propietats privades i un getter i setter per a cadascun d'ells.
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
    public void setPosicio(String pos) {
        String[] posicions = new String[] {"dret", "assegut", "estirat"};
        
        for (int i = 0; i < posicions.length; i++) {
            if (pos.equals(posicions[i])) {
                posicio = pos;
            }
        }
    }
}
