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
    private static int indexVi;
    
    public Botiga() {
        this.vins = new Vi[DEFAULT_MAX_VINS];
    }
    
    public Botiga(int maxVins) {
        if (maxVins > 0) {
            this.vins = new Vi[maxVins];
        } else {
            this.vins = new Vi[DEFAULT_MAX_VINS];
        }
    }
    
    public Vi afegeix(Vi vi) {
        if (!vi.esValid()) { return null; }
        
        String nomVi = vi.getNom();
        
        if (cerca(nomVi) != null) {
            return null;
        }
        
        for (int i = 0; i < vins.length; i++) {
            if (vins[i] == null) { 
                vins[i] = vi;
                return vi; 
            }
        }
        return null;
    }
    
    public Vi elimina(String nom) {
        nom = Vi.normalitzaNom(nom).toLowerCase();
        for (int i = 0; i < vins.length; i++) {
            if (vins[i] != null) {
                String nomExistent = vins[i].getNom().toLowerCase();
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
    
    public void iniciaRecorregut() {
        indexVi = 0;
    } 
    
    public Vi getSeguent() {
        Vi vi = vins[indexVi];
        if (indexVi < vins.length) {
            indexVi++;
        }
        return vi;
    } 
}
