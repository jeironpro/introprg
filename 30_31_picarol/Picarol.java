/*
 * Programa que es fa servir amb GatRenat(se li agrega), contè una propietat
 * privada cops, un mètode sona() que fa un soroll i un altre que retorna la 
 * vegades que es crida el mètode sona().
 */

public class Picarol {
    // Propietat privada de la classe
    private int cops;
    
    // Mètode que fa un soroll i augmenta el valor de la propietat cops
    public void sona() {
        System.out.println("clink-clink");
        cops++;
    }
    
    // Mètode que retorna el valor de la propietat cops
    public int vegades() {
        return cops;
    }
}
