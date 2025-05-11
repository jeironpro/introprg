/**
 * Class que conté:
 * 
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
	
	public int compareTo(Adressa altra) {
    	return toString().compareTo(altra.toString());
	}
}
