/*
 * Classe Botiga, dos propietats DEFAULT_MAX_VINS (constant) no es pot modificar,
 * vi és un arreu de vins, dos constructor un per defecte i un altre especifics
 * que permet inicialitza la propietat DEFAULT_MAX_VINS amb un valor positiu, del
 * contrari ho inicialitza amb 10. Un mètode (afegeix) que permet afegir vi a
 * l'arreu, un mètode (elimina) que elimina un vi de l'arreu, i un mètode (cerca)
 * que cerca un vi pel nom.
 */

public class Botiga {
    private static final int DEFAULT_MAX_VINS;
    private Vi[] vins;
    
    public Botiga() {
        this.DEFAULT_MAX_VINS = 10;
        this.vins = new Vi[DEFAULT_MAX_VINS];
    }
    
    public Botiga(int maxVins) {
        if (maxVins > 1) {
            this.DEFAULT_MAX_VINS = maxVins;
        } else {
            this.DEFAULT_MAX_VINS = 10;
        }
        this.vins = new Vi[DEFAULT_MAX_VINS];
    }
    
    public Vi afegeix(Vi vi) {
        if (!vi.esValid()) { return null; }
        for (int i = 0; i < vins.length; i++) {
            if (vins[i] != null && vins[i].getNom().equals(vi.getNom())) { return null; }
            if (vins[i] == null) { 
                vins[i] = vi;
                return vi; 
            }
        }
        return null;
    }
    
    public Vi elimina(String nom) {
        for (int i = 0; i < vins.length; i++) {
            if (vins[i].getNom().equals(nom)) { 
                if (vins[i].getEstoc() == 0) { 
                    vins[i] = null;
                    return vins[i];
                } else {
                    return null; 
                }
            }
        }
        return null;
    }
    
    public Vi cerca(String nom) {
        nom = Vi.normalitzaNom(nom);
        for (int i = 0; i < vins.length; i++) {
            if (vins[i].getNom().equals(nom)) { return vins[i]; }
        }
        return null;    
    }  
}
