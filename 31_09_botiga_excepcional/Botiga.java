/*
 * Classe Botiga, dues propietats DEFAULT_MAX_VINS (constant) no es pot modificar,
 * vi és un arreu de vins, dos constructors un per defecte i un altre específics
 * que permet inicialitza la propietat DEFAULT_MAX_VINS amb un valor positiu, del
 * contrari ho inicialitza amb 10. Un mètode (afegeix) que permet afegir vi a
 * l'arreu, un mètode (elimina) que elimina un vi de l'arreu, i un mètode (cerca)
 * que cerca un vi pel nom.
 * 
 * Ara, per simplificar el guardat del vins de la Botiga s'han agregat una
 * Atribut i dos mètodes d'instància:
 * Variable indexVi per indexar els vins de l'array vins de la Botiga.
 * Mètode iniciaRecorregut que inicialitza la variable global indexVi a 0;
 * Mètode getSeguent que recorre l'array vins i cerca un espai que no sigui null 
 * i retorna el vi.
 *
 * Ara el mètode cerca no fa la cerca amb el nom del vi, sinó que amb la
 * referència d'aquest. A més s'ha afegit un nou mètode cerca que rebre un vi
 * com plantilla per troba un vi amb algun o tots els valors.
 *
 * Ara la botiga té gestió d'excepcions, en constructor i metodes:
 * Constructor Botiga(int): gestiona l'excepció quan reb un valor menor a 1.
 * Metode cerca(String): gestiona l'excepció quan reb un valor null. 
 * Metode cerca(Vi): gestiona l'excepció quan rebi un valor null com plantilla.
 * Metode afegeix(Vi): gestiona les excepcions quan reb un vi null, quan el vi no
   és vàlid, quan  rebi una instància d'un que ja està a la botiga i quan la
   botiga està plena (Aquesta excepció es gestiona des de BotigaException).
 * Metode elimina(String): gestiona les excepcions quan reb un valor null, 
   quan rebi un vi que no sigui a la botiga i quan el vi a eliminar té estoc.
 */

public class Botiga {
    private static final int DEFAULT_MAX_VINS = 10;
    private Vi[] vins;
    private int indexVi;
    
    public Botiga() {
        this.vins = new Vi[DEFAULT_MAX_VINS];
    }
    
    public Botiga(int maxVins) throws Exception {
    	if (maxVins > 0) {
        	this.vins = new Vi[maxVins];
    	} else {
    		throw new IllegalArgumentException("No es pot crear una botiga amb menys d'un vi");
    	}
    }
    
    public Vi afegeix(Vi vi) throws Exception {
    	if (vi == null) {
    		throw new IllegalArgumentException("El vi no pot ser null");
    	} else if (!vi.esValid()) {
    		throw new IllegalArgumentException("El vi ha de ser vàlid");
    	} else if (cerca(vi.getRef()) != null) {
            throw new IllegalArgumentException("Referència de vi repetida");
        }
        boolean botigaPlena = true;
	    BotigaException botigaException;
        for (int i = 0; i < vins.length; i++) {
            if (vins[i] == null) { 
                vins[i] = vi;
                botigaPlena = false;
                return vi; 
            }
        }
        
        if (botigaPlena) {
        	botigaException = new BotigaException("Botiga plena");
        }
        return null;
    }
    
    public Vi elimina(String ref) throws Exception {
    	ref = Vi.normalitzaString(ref);
    	if (ref != null) {
    		ref = ref.toLowerCase();
		    boolean viEqual = false;
		    for (int i = 0; i < vins.length; i++) {
		        if (vins[i] != null) {
		            String refExistent = vins[i].getRef().toLowerCase();
		            if (ref.equals(refExistent)) { 
		            	viEqual = true;
		                if (vins[i].getEstoc() > 0) { 
		                    throw new IllegalArgumentException("El vi a eliminar no pot tenir estoc"); 
		                }
		                Vi eliminat = vins[i];
		                vins[i] = null;
		                return eliminat;
		            }
		        }
		    }
		    if (!viEqual) {
		    	throw new IllegalArgumentException("La instància a eliminar ha d'estar present");
		    }
    	} else {
    		throw new IllegalArgumentException("La referència no pot ser null");
    	}
    	return null;
    }
    
    public Vi cerca(String ref) throws Exception {
		ref = Vi.normalitzaString(ref);
    	if (ref != null) {
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
    	} else {
    		throw new IllegalArgumentException("La referència no pot ser null");  
    	}
    	return null;
    }

    public Vi cerca(Vi plantilla) throws Exception {
    	if (plantilla != null) {
		    for (Vi vi: vins) {
		        if (vi == null) {
		            continue;
		        }
		        if (plantilla.getRef() != null && !plantilla.getRef().isEmpty() && !plantilla.getRef().equalsIgnoreCase(vi.getRef())) {
		            continue;
		        }

		        if (plantilla.getNom() != null && !plantilla.getNom().isEmpty() && !plantilla.getNom().equalsIgnoreCase(vi.getNom())) {
		            continue;
		        }

		        if (plantilla.getPreu() >= 0 && plantilla.getPreu() < vi.getPreu()) {
		            continue;
		        }

		        if (plantilla.getEstoc() >= 0 && plantilla.getEstoc() > vi.getEstoc()) {
		            continue;
		        }

		        if (plantilla.getLloc() != null && !plantilla.getLloc().isEmpty() && !plantilla.getLloc().equalsIgnoreCase(vi.getLloc())) {
		            continue;
		        }

		        if (plantilla.getOrigen() != null && !plantilla.getOrigen().isEmpty() && !plantilla.getOrigen().equalsIgnoreCase(vi.getOrigen())) {
		            continue;
		        }

		        if (plantilla.getTipus() != null && !plantilla.getTipus().isEmpty() && !plantilla.getTipus().equalsIgnoreCase(vi.getTipus())) {
		            continue;
		        }

		        if (plantilla.getCollita() != null && !plantilla.getCollita().isEmpty() && !plantilla.getCollita().equalsIgnoreCase(vi.getCollita())) {
		            continue;
		        }
		        return vi;
		    }
    	} else {
    		throw new IllegalArgumentException("La plantilla no pot ser null");
    	}
        return null;
    }
    
    public void iniciaRecorregut() {
        indexVi = 0;
    } 
    
    public Vi getSeguent() {
        while (indexVi < vins.length) {
            Vi vi = vins[indexVi];
            indexVi++;
            if (vi == null) {
		        continue;
            }
	        return vi;
        }
        return null;
    }
}
