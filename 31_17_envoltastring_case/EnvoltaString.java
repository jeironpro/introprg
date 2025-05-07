/**
 * Clase que conté:
 * Propietats: valor String
 * Constructors: Un especific que inicialitza la propietat valor amb els caràcters 
   en minúscules.
 * @Override: toString() -> mostra de manera personalitzada el valor de la instància
 * @Overload: equals(Object) -> aquest mètode reb una instància de la classe i 
              comprova si la propietat d'aquesta instància és igual a la de la 
              classe.
 */

public class EnvoltaString {
    private String valor;
    
    public EnvoltaString(String valor) { 
    	this.valor = valor.toLowerCase(); 
	}
    
    public String toString() { 
    	return String.format("ENVOLTAT(\"%s\")", valor); 
	}
    
    public boolean equals(EnvoltaString altre) {
        return valor.equals(altre.valor);
    }
}
