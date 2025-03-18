/*
 * Programa que instància la clase amb un constructor que rep paràmetres
 * i aquest inicialitza les propietats (vides, posicio) de la clase amb ells,
 * també sobreescriu amb l'anotació @override el mètode toString per representar
 * la conversió de l'object a un String de manera personalitzada i no com ho faria 
 * java per defecte. 
 */
 
public class GatRenat {
    // Propietats private de la classe
    private int vides;
    private String posicio;
    
    // Constructor amb paràmetres
    public GatRenat(int novesVides, String novaPosicio) {
        vides = novesVides;
        posicio = novaPosicio;
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
        // Mostrar la instancia com un String
        // Els valors que mostrarà se li passant com argument al constructor
        System.out.println(new GatRenat(7, "estirat"));
    }
}
