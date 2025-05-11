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
		
		if (!text.contains("@")) {
			return false;
		}
		
		String[] adrec = text.split("@");
		
		if (adrec.length != 2) {
			return false;
		}
		
		if (adrec[0].length() < 1 || adrec[1].length() < 1) {
			return false;
		}
		
		if (adrec[0].contains("@") || adrec[1].contains("@") ) {
			return false;
		}
		
		String[] dom = adrec[1].split("\\.");

		if (dom.length != 2) {
			return false;
		}
		
		if (dom[0].isEmpty() || dom[1].length() < 2) {
			return false;
		}
		
		if (dom[0].contains("\\.") || dom[1].contains("\\.")) {
			return false;
		}
		
		if (!UtilString.nomesConteLletres(dom[1])) {
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
