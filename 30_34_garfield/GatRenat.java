/*
 *
 */
 
class GatRenat extends Gat {
    public GatRenat() {
        super("Renat", 7, "estirat");
    }
    
    /* Constructor amb un paràmetre (vides), crida al constructor amb paràmetres
     * i li passa l'argument que reb per vides i el valor per defecte de posicio.
     */
    public GatRenat(int vides) {
        super("Renat", vides, "estirat");
    }
    
    /* Constructor amb un paràmetre (posicio), crida al constructor amb paràmetres
     * i li passa el valor per defecte de vides i l'argument que rep per posicio.
     */
    public GatRenat(String posicio) {
        super("Renat", 7, posicio);
    }
    
    /* Constructor amb paràmetres, fa servir this per referir-se als mètodes 
     * accessors de la classe, per modificar les propietats. 
     */
    public GatRenat(int vides, String posicio) {
        super("Renat", vides, posicio);
    }
}
