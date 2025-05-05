public class Especificacio {
	private final String nom;
	private String origen;
	private String tipus;
	private String collita;
	 
	public Especificacio(String nom, String origen, String tipus, String collita) {
		this.nom = UtilString.normalitzaString(nom);
		this.origen = UtilString.normalitzaString(origen);
		this.tipus = UtilString.normalitzaString(tipus);
		this.collita = UtilString.normalitzaString(collita);
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getOrigen() {
		return this.origen;
	}
	
	public String getTipus() {
		return this.tipus;
	}
	
	public String getCollita() {
		return this.collita;
	}
	
	public boolean esComplet() {
		if (this.getNom() != null && 
			this.getOrigen() != null && 
			this.getTipus() != null && 
			this.getCollita() != null) {
			return true;
		}
		return false;
	}
	
	public boolean esPlantillaDe(Vi vi) {
		Especificacio espec = vi.getEspec();
		String nom = espec.getNom();
		String origen = espec.getOrigen();
		String tipus = espec.getTipus();
		String collita = espec.getCollita();
		
		boolean esPlantilla = true;
		if (!UtilString.esPlantillaDeText(this.getNom(), nom)) {
			esPlantilla = false;
		}
		if (!UtilString.esPlantillaDeText(this.getOrigen(), origen)) {
	 		esPlantilla = false;
 		}
		if (!UtilString.esPlantillaDeText(this.getTipus(), tipus)) {
			esPlantilla = false;
		}
		if (!UtilString.esPlantillaDeText(this.getCollita(), collita)) {
			esPlantilla = false;
		}
		return esPlantilla;
	}
	
	public String[] aArrayString() {
        String nom = this.getNom();
        String origen = this.getOrigen();
        String tipus = this.getTipus();
        String collita = this.getCollita();
        
        String[] viArray = new String[] {
            nom, origen, tipus, collita
        };
        return viArray;
    }
    
    public static Especificacio deArrayString(String[] atributsVi) {
        if (atributsVi.length != 4) {
            return null;
        }
        String nom = atributsVi[0];
        String origen = atributsVi[1];
        String tipus = atributsVi[2];
        String collita = atributsVi[3];
        return new Especificacio(nom, origen, tipus, collita);
    }
	
	public String toString() {
		return String.format("    Nom: %s%n    D.O.: %s%n    Tipus: %s%n    Collita: %s%n", nom, origen, tipus, collita);
	}
}
