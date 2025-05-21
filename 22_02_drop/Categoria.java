/**
 * Classe que es fa servir per realitzar instància i guardar les dades de les
   seves propietats en una base de dades, a més s'ha sobreescrit el mètode
   toString per mostrar de manera personalitzada quan es fa un select d'alguna 
   categoria.
 *
 * Aquesta classe conté:
 * Dues propietats: String nom i int id
 * Dos constructors específics, un que inicialitza la propietat nom, l'altre
   inicialitza ambdues.
 * Getter per cada propietat.
 * Un mètode que retorna false si la propietat id té un valor negatiu, altrament
   retorna true.
 * Sobreescrit el mètode toString mencionat abans.
 */
 
public class Categoria {
	private int id = -1;
	private String nom;
	
	public Categoria(String nom) {
		if (nom == null || nom.isBlank()) {
			throw new IllegalArgumentException("El nom no pot ser null ni blanc");
		}
		this.nom = nom;
	}
	
	public Categoria(int id, String nom) {
		this(nom);
		if (id < 0) {
			throw new IllegalArgumentException("L'identificador ha de ser positiu");
		}
		this.id = id;
	}
	
	public boolean idIndefinit() {
		return id < 0;
	}
	
	public int getId() {
		if (idIndefinit()) {
			throw new UnsupportedOperationException("L'identificador no está disponible");
		}
		return id;
	}
	
	public String getNom() {
		return nom;
	}
	
	@Override
	public String toString() {
		return String.format("Categoria(id:%s, %s)", 
								(id < 0 ? "indefinit": id), 
								nom);
	}
}
