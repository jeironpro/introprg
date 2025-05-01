/*
 * Classe Botiga conté:
 * Una propietat vins que és una llista(LinkedList) de vins. 
 * Un constructor per defecte que permet inicialitzar la propietat vins.
 * Un mètode afegeix(Vi) que permet afegir vi a la llista. 
 * Un mètode elimina(String) que elimina un vi de la llista.
 * Un mètode cerca(String) que cerca un vi pel referència.
 * Un mètode cerca(Vi) que cerca multiples vins per una plantilla.
 * 
 * La botiga té gestió d'excepcions en metodes:
 * Metode cerca(String): gestiona l'excepció quan reb un valor null. 
 * Metode cerca(Vi): gestiona l'excepció quan rebi un valor null com plantilla.
 * Metode afegeix(Vi): gestiona les excepcions quan reb un vi null, quan el vi no
   és vàlid i quan rebi una instància d'un que ja està a la botiga.
 * Metode elimina(String): gestiona les excepcions quan reb un valor null, 
   quan rebi un vi que no sigui a la botiga i quan el vi a eliminar té estoc.
 */

import java.util.List;
import java.util.LinkedList;

public class Botiga {
	private List<Vi> vins;
	private int indexVi;
	
	public Botiga() {
        this.vins = new LinkedList<Vi>();
    }
    
    public List<Vi> getVins() {
    	return this.vins;
    } 
    
    public Vi afegeix(Vi vi) {
    	if (vi == null) {
    		throw new IllegalArgumentException("El vi no pot ser null");
    	} else if (!vi.esValid()) {
    		throw new IllegalArgumentException("El vi ha de ser vàlid");
    	} else if (cerca(vi.getRef()) != null) {
            throw new IllegalArgumentException("Referència de vi repetida");
        }
        this.vins.add(vi);
        return vi; 
    }
    
    public Vi elimina(String ref) {
    	ref = UtilString.normalitzaString(ref);
    	if (ref == null) {
    		throw new IllegalArgumentException("La referència no pot ser null");
    	}
    	ref = ref.toLowerCase();
	    boolean viEqual = false;
	    for (int i = 0; i < vins.size(); i++) {
	        if (vins.get(i) != null) {
	            String refExistent = vins.get(i).getRef().toLowerCase();
	            if (ref.equals(refExistent)) { 
	            	viEqual = true;
	                if (vins.get(i).getEstoc() > 0) { 
	                    throw new IllegalArgumentException("El vi a eliminar no pot tenir estoc"); 
	                }
	                Vi eliminat = vins.get(i);
	                vins.remove(i);
	                return eliminat;
	            }
	        }
	    }
	    if (!viEqual) {
	    	throw new IllegalArgumentException("La instància a eliminar ha d'estar present");
	    }
    	return null;
    }
    
    public Vi cerca(String ref) {
		ref = UtilString.normalitzaString(ref);
    	if (ref == null) {
    		throw new IllegalArgumentException("La referència no pot ser null");  
    	}
		ref = ref.toLowerCase();
	    for (Vi vi: vins) {
	    	if (vi == null) {
	    		continue;
	    	}
	        String refVi = vi.getRef().toLowerCase();
	        if (ref.equals(refVi)) { 
	            return vi; 
	        }
	    }    	
    	return null;
    }

    public List<Vi> cerca(Vi plantilla) {
    	if (plantilla == null) {
    		throw new IllegalArgumentException("La plantilla no pot ser null");
    	}
    	List<Vi> vinsCercat = new LinkedList<Vi>();
    	 
    	String refP = plantilla.getRef();
        String nomP = plantilla.getNom();
        int preuP = plantilla.getPreu();
        int estocP = plantilla.getEstoc();
        String llocP = plantilla.getLloc();
        String origenP = plantilla.getOrigen();
        String tipusP = plantilla.getTipus();
        String collitaP = plantilla.getCollita();
    	
    	for (Vi vi : this.vins) {
			boolean cercat = true;

			if (!UtilString.esPlantillaDeText(refP, vi.getRef())) { 
				cercat = false;
			}
			if (!UtilString.esPlantillaDeText(nomP, vi.getNom())) {
				cercat = false;
			}
			if (preuP >= 0 && vi.getPreu() > preuP) {
				cercat = false;
			}
			if (estocP >= 0 && vi.getEstoc() < estocP) {
				cercat = false;
			}
			if (!UtilString.esPlantillaDeText(llocP, vi.getLloc())) {
				cercat = false;
			}
			if (!UtilString.esPlantillaDeText(origenP, vi.getOrigen())) {
		 		cercat = false;
	 		}
			if (!UtilString.esPlantillaDeText(tipusP, vi.getTipus())) {
				cercat = false;
			}
			if (!UtilString.esPlantillaDeText(collitaP, vi.getCollita())) {
				cercat = false;
			}

			if (cercat) {
				vinsCercat.add(vi);
			}
		}
    	return vinsCercat;
    }
    
    public void iniciaRecorregut() {
        indexVi = 0;
    } 
    
    public Vi getSeguent() {
        while (indexVi < this.vins.size()) {
            Vi vi = this.vins.get(indexVi);
            indexVi++;
            if (vi == null) {
		        continue;
            }
	        return vi;
        }
        return null;
    }
}
