/**
 * Clase que conté:
 * Propietats: valor String
 * Constructors: Un especific que inicialitza la propietat valor amb els caràcters 
   en minúscules.
 * @Override: toString() -> mostra de manera personalitzada el valor de la instància
 * @Override: equals(Object) -> aquest mètode reb un objecte i verifica si és una
   instància de la classe i comprova si la propietat aquesta instància és igual a
   la de la classe.
 */

public class EnvoltaString {
    private String valor;
    
    public EnvoltaString(String valor) { 
    	this.valor = valor.toLowerCase(); 
	}
    
    public String toString() { 
    	return String.format("ENVOLTAT(\"%s\")", valor); 
	}
    
    @Override
	public boolean equals(Object obj) {
		if (obj instanceof EnvoltaString) {
			EnvoltaString altre = (EnvoltaString) obj;
			return valor.equals(altre.valor);
		}
		return false;
	}
}
