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
    
    // Mètode que permet modificar a la propietat vides des de fora
    /*@Override
    public void setVides(int vides) {
        if (vides >= 0 && vides <= 7) {
            super.setVides(vides);
        }
    }
    
    // Mètode que permet modificar a la propietat posicio des de fora
    @Override
    public void setPosicio(String posicio) {
        String[] posicions = new String[] {"dret", "assegut", "estirat"};
        
        for (int i = 0; i < posicions.length; i++) {
            if (posicio.equals(posicions[i])) {
                super.setPosicio(posicio);
            }
        }
    }*/
    
    /*public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        
        System.out.println(renat.getNom()); 
        System.out.println(renat.getVides()); 
        System.out.println(renat.getPosicio()); 
    }*/
}
