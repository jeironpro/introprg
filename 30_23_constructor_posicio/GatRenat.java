/*
 * Programa que contè dues propietats privades inicialitzades i un constructor 
 * (instància de la classe) que rep paràmetres, el constructor li passa els paràmetres 
 * als setter de cada propietat respectivament. També sobreescriu amb l'anotació @override 
 * el mètode toString per representar la conversió de l'object a un String de manera 
 * personalitzada i no com ho faria java per defecte. 
 */
 
public class GatRenat {
    // Propietats private de la classe
    private int vides = 7;
    private String posicio = "estirat";
    
    // Constructor amb paràmetres que fa servir els setter de les propietats
    public GatRenat(int novesVides, String novaPosicio) {
        setVides(novesVides);
        setPosicio(novaPosicio);
    }
    
    // Anotació
    @Override
    // Mètode convertidor a String
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
    
    // Mètode accessor (getter)
    public int getVides() {
        return vides;
    }
    
    // Mètode accesor (setter)
    private void setVides(int novesVides) {
        if (novesVides >= 0) {
            vides = novesVides;
        }
    }
    
    // Mètode accessor (getter)
    public String getPosicio() {
        return posicio;
    }
    
    // Mètode accesor (setter)
    public void setPosicio(String novaPosicio) {
        String[] posicions =  new String[] {"estirat", "assegut", "dret"};
        
        for (int i = 0; i < posicions.length; i++) {
            if (novaPosicio.equals(posicions[i])) {
                posicio = novaPosicio;
            }
        }
    }
    
    public static void main(String[] args) {
        // Mostrar la instancia com un String
        // Els valors que mostrarà se li passant com argument al constructor
        System.out.println(new GatRenat(7, "dret"));
    }
}
