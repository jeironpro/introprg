/**
 * Classe Segment. En aquesta se faran testing, pel que s'anirá incrementant el 
   seu codi.
 * De moment tenint dues propietats de tipus Punt
 * Dos constructors: un per defecte que i un altra específic que reb dues 
   instàncies de Punt i inicialitza els valors de les coordernades de cada 
   propietat Punt.
 * Getters i setter per cada propietat.
 * Un mètode longitud que retorna un double amb l'arrel quadrada de la suma de les
   diferències elevades al quadrat de cada propietat de dos punts.
 * Un mètode toString sobrescrit per mostrar el valor de les instàncies
   personalitzat i no la referència com ho fa java per defecte.
 */
 
public class Segment {
	private Punt p1 = new Punt();
	private Punt p2 = new Punt();
	
	public Segment() {}
	
	public Segment(Punt p1, Punt p2) {
		this.p1.setX(p1.getX());
		this.p1.setY(p1.getY());
		this.p2.setX(p2.getX());
		this.p2.setY(p2.getY());
	}
	
	public Punt getP1() {
		return p1;
	}
	
	public void setP1(Punt p1) {
		this.p1 = p1;
	}
	
	public Punt getP2() {
		return p2;
	}
	
	public void setP2(Punt p2) {
		this.p2 = p2;
	}
	
	public double longitud() {
		return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) + Math.pow(p1.getY()-p2.getY(), 2));
	}
	
	public String toString() {
		return String.format("Segment(Punt(%d, %d), Punt(%d, %d))",
								p1.getX(), p1.getY(),
								p2.getX(), p2.getY());
	}
}
