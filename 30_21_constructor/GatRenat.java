/*
 * Programa que instància la clase amb un constructor i aquest inicialitza
 * les propietats (vides, posicio) de la clase, també sobreescriu amb 
 * l'anotació @override el mètode toString per representar la conversió 
 * de l'object a un String de manera personalitzada i no com ho faria 
 * java per defecte. 
 */
 
public class GatRenat {
    // Propietats private de la classe
    private int vides;
    private String posicio;
    
    // Constructor
    public GatRenat() {
        vides = 7;
        posicio = "estirat";
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
    
    // Mètode accessor (getter)
    public String getPosicio() {
        return posicio;
    }
    
    public static void main(String[] args) {
        // Instancia de la classe
        GatRenat renat = new GatRenat();
        // Mostrar la instancia com un String
        System.out.println(renat);
    }
}
