/*
 * Classe Especificacio conté:
 * Quatres propietats de tipus String (nom, origen, tipus, collita), la propietat
   nom és final.
 * Un constructor que crea una instància amb tots els valors rebut normalitzat
   per a cadascuna de les propietats.
 * Metodes getter per cada propietats. 
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
}
