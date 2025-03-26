/*
 * Programa que conté dues propietat i els seus getters i setters.
 * Es fa servir perquè altre programa pugui heredar els metodes.
 */
 
public class Gat {
    // Propietats de la classe
    // Propietat privat vides
    private int vides = 7;
    // Propietat privat posicio
    private String posicio = "estirat";
    
    // Mètode que permet accedeix a la propietat vides des de fora
    public int getVides() { return this.vides; }
    
    // Mètode que permet modificar a la propietat vides des de fora
    public void setVides(int vida) {
        if (vida >= 0) {
            this.vides = vida;
        }
    }
    
    // Mètode que permet accedeix a la propietat posició des de fora
    public String getPosicio() { return this.posicio; }
    
    // Mètode que permet modificar a la propietat posicio des de fora
    public void setPosicio(String novaPos) {
        String[] posicions = new String[] {"dret", "assegut", "estirat"};
        
        for (int i = 0; i < posicions.length; i++) {
            if (novaPos.equals(posicions[i])) {
                this.posicio = novaPos;
            }
        }
    }  
}
