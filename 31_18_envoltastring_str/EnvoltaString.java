/**
 * Clase que conté:
 * Propietats: valor String
 * Constructors: Un especific que inicialitza la propietat valor amb els caràcters 
   en minúscules.
 * @Override: toString() -> mostra de manera personalitzada el valor de la
              instància.
 * @Overload: equals(Object) -> aquest mètode reb una instància de la classe i 
              comprova si la propietat d'aquesta instància és igual a la de la 
              classe sense tenir en compte majúscules i minúscules.
 * @Overload: equals(String) -> aquest mètode rep un String i verifica si és igual
              al valor de la propietat valor(String) de la classe.
 */

public class EnvoltaString {
    private String valor;
    
    public EnvoltaString(String valor) { 
    	this.valor = valor; 
	}
    
    public String toString() { 
    	return String.format("ENVOLTAT(\"%s\")", valor); 
	}
    
    public boolean equals(String altre) {
        return altre.equalsIgnoreCase(valor);
    }
    
    @Override
	public boolean equals(Object obj) {
		if (obj instanceof EnvoltaString) {
		    EnvoltaString altre = (EnvoltaString) obj;
		    return valor.equalsIgnoreCase(altre.valor);
		}
		return false;
	}
}
