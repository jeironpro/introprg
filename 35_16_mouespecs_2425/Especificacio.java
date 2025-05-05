/*
 * Classe Especificacio conté:
 * Quatres propietats de tipus String (nom, origen, tipus, collita), la propietat
   nom és final.
 * Un constructor que crea una instància amb tots els valors rebut normalitzat
   per a cadascuna de les propietats.
 * Metodes getter per cada propietats. 
 * Sobreescrit el toString per mostra la instància de manera personalitzada.
 * Mètode esComplet que retona true si la instància té totes les propietats
   correctament inicialitzades, altrament retorna false.
 * Mètode aArrayString que converteix una especificacio en un array de Strings.
 * Mètode deArrayString que rep un array de Strings i retorna una especificacio
   si els dades són vàlides.
 * Mètode esPlantillaDe que reb un vi i verifica si algunes de les propietats
   del vi (nom, origen, tipus i collita) son igual a les de l'especificació.
 */
 
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
