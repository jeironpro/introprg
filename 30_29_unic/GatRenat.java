/*
 * Programa que contè tres propietats privades, una d'elles és static 
 * i un constructor per defecte (instàncies de la classe) que fa servir 
 * this per inicialitzar amb valors per defectes les propietats que no són 
 * static. També sobreescriu amb l'anotació @override el mètode toString per 
 * representar la conversió de l'object a un String de manera personalitzada i
 * no com ho faria java per defecte. A més contè amb quatres mètodes que fan
 * servir el patro singleton que restringeix la creació una instancia que ja
 * existeix.
 */
 
public class GatRenat {
    // Propietats privades de la classe
    private int vides;
    private String posicio;
    private static GatRenat instancia;
    
    /* Constructor per defecte, fa servir this. per referir-se a les propietats 
     * de la classe i assignar-li el valor per defecte. 
     */
    private GatRenat() {
        this.vides = 7;
        this.posicio = "estirat";
    }
    
    // Anotació
    @Override
    // Mètode convertidor a String
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
    
    // Mètode accessor (getter)
    public int getVides() {
        return this.vides;
    }
    
    // Mètode accesor (setter)
    public void setVides(int vides) {
        if (vides >= 0) {
            this.vides = vides;
        }
    }
    
    // Mètode accessor (getter)
    public String getPosicio() {
        return this.posicio;
    }
    
    // Mètode accessor (setter)
    public void setPosicio(String posicio) {
        String[] posicions =  new String[] {"estirat", "assegut", "dret"};
        
        for (int i = 0; i < posicions.length; i++) {
            if (posicio.equals(posicions[i])) {
                this.posicio = posicio;
            }
        }
    }
    
    // Mètodes del patró singleton
    // Mètode de instancia sense pàrametres
    // Aquest mètode crea una instància i les propietats es queden amb els valor per defecte
    public static GatRenat getInstancia() {
        if (instancia == null) {
            instancia = new GatRenat();
        }
        return instancia;
    }
    
    // Mètode de instancia amb el pàrametre vides
    // Aquest mètode crea una instància i assigna els valors rebut a la propietat
    public static GatRenat getInstancia(int vides) {
        if (instancia == null) {
            instancia = new GatRenat();
        }
        instancia.vides = vides;
        return instancia;
    }
    
    // Mètode de instancia amb el pàrametre posicio
    // Aquest mètode crea una instància i assigna els valors rebut a la propietat
    public static GatRenat getInstancia(String posicio) {
        if (instancia == null) {
            instancia = new GatRenat();
        }
        instancia.posicio = posicio;
        return instancia;
    }
    
    // Mètode de instancia amb els pàrametres vides i posicio
    // Aquest mètode crea una instància i assigna els valors rebut a cada propietat
    public static GatRenat getInstancia(int vides, String posicio) {
        if (instancia == null) {
            instancia = new GatRenat();
        }
        instancia.vides = vides;
        instancia.posicio = posicio;
        return instancia;
    }
}
