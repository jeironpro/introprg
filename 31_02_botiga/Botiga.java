/*
 * Classe Botiga, dues propietats DEFAULT_MAX_VINS (constant) no es pot modificar,
 * vi és un arreu de vins, dos constructors un per defecte i un altre específics
 * que permet inicialitza la propietat DEFAULT_MAX_VINS amb un valor positiu, del
 * contrari ho inicialitza amb 10. Un mètode (afegeix) que permet afegir vi a
 * l'arreu, un mètode (elimina) que elimina un vi de l'arreu, i un mètode (cerca)
 * que cerca un vi pel nom.
 */

public class Botiga {
    private static final int DEFAULT_MAX_VINS = 10;
    private Vi[] vins;
    
    public Botiga() {
        this.vins = new Vi[DEFAULT_MAX_VINS];
    }
    
    public Botiga(int maxVins) {
        if (maxVins > 1) {
            this.vins = new Vi[maxVins];
        } else {
            this.vins = new Vi[DEFAULT_MAX_VINS];
        }
    }
    
    public Vi afegeix(Vi vi) {
        if (!vi.esValid()) { return null; }
        
        String nomVi = vi.getNom();
        
        for (int i = 0; i < vins.length; i++) {
            if (vins[i] != null) { 
                String nomExistent = vins[i].getNom();
                
                if (nomExistent.equals(nomVi)) {
                    return null; 
                }
            }
            if (vins[i] == null) { 
                vins[i] = vi;
                return vi; 
            }
        }
        return null;
    }
    
    public Vi elimina(String nom) {
        nom = Vi.normalitzaNom(nom);
        for (int i = 0; i < vins.length; i++) {
            if (vins[i] != null) {
                String nomExistent = vins[i].getNom();
                if (nomExistent.equals(nom)) { 
                    if (vins[i].getEstoc() > 0) { 
                        return null; 
                    }
                    Vi viTmp = vins[i];
                    vins[i] = null;
                    return viTmp;
                }
            }
        }
        return null;
    }
    
    public Vi cerca(String nom) {
        nom = Vi.normalitzaNom(nom).toLowerCase();
        for (int i = 0; i < vins.length; i++) {
            if (vins[i] != null) {
                String nomVi = vins[i].getNom().toLowerCase();
                if (nomVi.equals(nom)) { 
                    return vins[i]; 
                }
            }
        }
        return null;    
    }  
}
