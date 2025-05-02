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
    	} else if (!Vi.esValid(vi.getRef(), vi.getNom(), vi.getPreu(), vi.getEstoc(), vi.getLloc(), vi.getOrigen(), vi.getTipus(), vi.getCollita())) {
    		throw new IllegalArgumentException("El vi ha de ser vàlid");
    	} else if (cerca(vi.getRef()) != null) {
            throw new IllegalArgumentException("Referència de vi repetida");
        }
        String ref = vi.getRef();
        String nom = vi.getNom();
        int preu = vi.getPreu();
        int estoc = vi.getEstoc();
        String lloc = vi.getLloc();
        String origen = vi.getOrigen();
        String tipus = vi.getTipus();
        String collita = vi.getCollita();
        
        if (!Vi.esValid(ref, nom, preu, estoc, lloc, origen, tipus, collita)) {
        	return null;
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

    public List<Vi> cerca(Especificacio espec) {
    	return cerca(espec, -1, -1);
    }
    
    public List<Vi> cerca(Especificacio espec, int preuMax, int estocMin) {
    	if (espec == null) {
    		throw new IllegalArgumentException("espec no pot ser null");
    	}
    	List<Vi> vinsCercat = new LinkedList<Vi>();
    	
        String nomE = espec.getNom();
        String origenE = espec.getOrigen();
        String tipusE = espec.getTipus();
        String collitaE = espec.getCollita();
        
    	for (Vi vi : this.vins) {
    		boolean cercat = true;
			if (!UtilString.esPlantillaDeText(nomE, vi.getNom())) {
				cercat = false;
			}
			if (preuMax >= 0 && vi.getPreu() > preuMax) {
				cercat = false;
			}
			if (estocMin >= 0 && vi.getEstoc() < estocMin) {
				cercat = false;
			}
			if (!UtilString.esPlantillaDeText(origenE, vi.getOrigen())) {
		 		cercat = false;
	 		}
			if (!UtilString.esPlantillaDeText(tipusE, vi.getTipus())) {
				cercat = false;
			}
			if (!UtilString.esPlantillaDeText(collitaE, vi.getCollita())) {
				cercat = false;
			}

			if (cercat) {
				vinsCercat.add(vi);
			}
    	}
    	return vinsCercat;
    }
}
