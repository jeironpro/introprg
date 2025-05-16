/**
 * Classe Punt. En aquesta se faran testing, pel que s'anirá incrementant el 
   seu codi.
   De moment tenint un constructor per defecte implicit, i dos getters.
 *
 * Afegint les propietats de tipus enter x i y. A més el setter per cadascuna. 
 * Afegint un constructor específic i un nou mètode que suma les coordenades de
   dues instàncies; per exemple p1.x += p2.x i  p1.y += p2.y.
 * Afegint el mètode toString sobrescrit per mostrar el valor de les instàncies
   personalitzat i no la referència com ho fa java per defecte.
 * Afegint el mètode suma que reb un Punt i el suma els valor a la instància
   actual. A més s'ha sobreescrit el mètode equals per permet igualtat entre dues
   instància de Punt que tinguin les mateixes coordenades.
 */

public class Punt {
	private int x;
	private int y;
	
	public Punt() {}
	
	public Punt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
    public int getX() { 
    	return x; 
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void suma(Punt p) {
		x+=p.getX();
		y+=p.getY();
	}
	
	public String toString() {
		return String.format("Punt(%d, %d)", x, y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Punt)) {
			return false;
		}
		Punt altre = (Punt) obj;
		return this.x == altre.getX() && this.y == altre.getY();
	}
}
