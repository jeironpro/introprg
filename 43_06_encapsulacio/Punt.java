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
 * Afegint una propietat de tipus array de int. El valor de coord[0] és la 
   coordenada x i el valor de coord[1] és la coordenada y.
 */

public class Punt {
	private int[] coord = new int[2];
	
	public Punt() {}
	
	public Punt(int x, int y) {
		this.coord[0] = x;
		this.coord[1] = y;
	}
	
    public int getX() { 
    	return coord[0]; 
	}
	
	public void setX(int x) {
		this.coord[0] = x;
	}
	
	public int getY() {
		return coord[1];
	}
	
	public void setY(int y) {
		this.coord[1] = y;
	}
	
	public void suma(Punt p) {
		coord[0]+=p.getX();
		coord[1]+=p.getY();
	}
	
	public String toString() {
		return String.format("Punt(%d, %d)", coord[0], coord[1]);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Punt)) {
			return false;
		}
		Punt altre = (Punt) obj;
		return this.coord[0] == altre.getX() && this.coord[1] == altre.getY();
	}
}
