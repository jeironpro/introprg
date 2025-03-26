/*
 * Programa que contè dues propietats privades inicialitzades i mes de un constructor 
 * (instàncies de la classe), un per defecte i altres que reben un o més paràmetres, 
 * els constructors fan servir this() per cridar al constructor més adequat per assignar
 * els paràmetres als setter de cada propietat respectivament. També sobreescriu amb 
 * l'anotació @override el mètode toString per representar la conversió de l'object a un 
 * String de manera personalitzada i no com ho faria java per defecte. Ara el programa 
 * utilitza la referencia this. per diferenciar les propietats i mètodes de la classe i 
 * també utilitza this() per cridar a altres constructors.
 */
 
public class GatRenat {
    // Propietats privades de la classe
    private int vides;
    private String posicio;
    private static GatRenat instancia;
    
    /* Constructor amb paràmetres, fa servir this per referir-se als mètodes 
     * accessors de la classe, per modificar les propietats. 
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
    
    // Mètode accesor (setter)
    public void setPosicio(String posicio) {
        String[] posicions =  new String[] {"estirat", "assegut", "dret"};
        
        for (int i = 0; i < posicions.length; i++) {
            if (posicio.equals(posicions[i])) {
                this.posicio = posicio;
            }
        }
    }
    
    public static GatRenat getInstancia() {
        if (instancia == null) {
            instancia = new GatRenat();
        }
        return instancia;
    }
    
    public static GatRenat getInstancia(int vides) {
        if (instancia == null) {
            instancia = new GatRenat();
        }
        instancia.vides = vides;
        return instancia;
    }
    
    public static GatRenat getInstancia(String posicio) {
        if (instancia == null) {
            instancia = new GatRenat();
        }
        instancia.posicio = posicio;
        return instancia;
    }
    
    public static GatRenat getInstancia(int vides, String posicio) {
        if (instancia == null) {
            instancia = new GatRenat();
        }
        instancia.vides = vides;
        instancia.posicio = posicio;
        return instancia;
    }
    
    public static void main(String[] args) {
        // Array de tipus GatRenat
        /*GatRenat[] renats = {
            new GatRenat(),         // tot per defecte
            new GatRenat(8),        // 8 vides i posició per defecte
            new GatRenat("dret"),   // posicio dret i vides per defecte
            new GatRenat(8, "dret") // 8 vides i posició dret
        };
        
        // Iterar tots els renats
        for (GatRenat renat: renats) {
            // Mostrar cada renat com un String
            System.out.println(renat);
        }*/
    }
}
