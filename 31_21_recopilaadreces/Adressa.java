/**
 * Classe que implementa l'interfície Comparable i conté:
 * Dues propietats privades de tipus String (identificador i domini).
 *
 * Un Constructor específic privat.
 *
 * Mètode assessor getter per cada propietat.
 *
 * Sobreescriu els mètodes:
 * equals(Object) -> aquest rep un objecte i comprova si és una instància de la
   classe, si el és la converteix amb càsting i verifica si les propietats són
   Iguals a una de les instàncies de la classe.
 *
 * hashCode() -> retorna la suma del hashCode de les dues propietats de la
   instància. 
 *
 * toString() -> per mostrar el valor de la instància de manera personalitzada i no
   com el faria per defecte Java (mostra la referència).
 *
 * compareTo(Object) -> rep una adreça, el permet la firma de la classe en 
   L'implementa i compara i ordena una adreça (instància) amb una altra.
 *
 * Mètodes de classe
 * esValida(String) -> rep un text i verifica si és una adreça vàlida, verificant
   que compleixi amb certs criteris.
 *
 * fromString(String) -> rep una adreça i verifica si és vàlida amb el mètode
   esValida(String), si ho és crea una instància amb aquesta, altrament llança una 
   IllegalArgumentException.
 */

public class Adressa implements Comparable<Adressa> {
	private String identificador;
	private String domini;
	
	private Adressa(String identificador, String domini) {
		this.identificador = identificador;
		this.domini = domini;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public String getDomini() {
		return domini;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Adressa)) {
			return false;
		}
		
		Adressa altra = (Adressa) obj;
		if (identificador.equals(altra.identificador) &&
		 	domini.equals(altra.domini)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
    public int hashCode() {
        return identificador.hashCode() + domini.hashCode();
    }
	
	@Override
	public String toString() {
		return String.format("%s%s", identificador, domini);
	}
	
	@Override
	public int compareTo(Adressa altra) {
    	return toString().compareTo(altra.toString());
	}
	
	public static Adressa fromString(String adreca) {
		if (esValida(adreca)) {
			String[] adrec = adreca.split("@");
			String id = adrec[0];
			String dom = "@" + adrec[1];		
			
			return new Adressa(id, dom);
		} else {
			throw new IllegalArgumentException("L'adreça ha de ser vàlida");
		}
	}
	
	public static boolean esValida(String text) {
		if (text == null) { 
			return false;
		}
		
		String[] adreca = text.split("@");
		
		if (adreca.length != 2) {
			return false;
		}
		
		String identificador = adreca[0];
		String domini = adreca[1];
		
		if (identificador.length() < 1 || domini.length() < 2) {
			return false;
		}
		
		if (!UtilString.formatCorrecte(identificador)) {
			return false;
		}
		
		if (identificador.contains("@") || identificador.contains("@") ) {
			return false;
		}
		
		if (!domini.contains(".")) {
			return false;
		}
		
		String[] partsDomini = domini.split("\\.");
		
		if (partsDomini.length != 2) {
			return false;
		}
		
		String nomDom = partsDomini[0];
		String extDom = partsDomini[1];

		if (nomDom.isEmpty() || extDom.length() < 2) {
			return false;
		}
		
		if (nomDom.contains(".") || extDom.contains(".")) {
			return false;
		}
		
		if (!UtilString.nomesConteLletres(extDom)) {
			return false;
		}
		
		return true;
	} 
}
