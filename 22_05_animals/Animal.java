/**
 * Classe que es fa servir per realitzar instància i guardar les dades de les
   seves propietats en una base de dades, a més s'ha sobreescrit el mètode
   toString per mostrar de manera personalitzada quan es fa un select d'algun
   animal.
 *
 * Aquesta classe conté:
 * Tres propietats: int id, String nom i Categoria categoria
 * Dos constructors específics, un que inicialitza la propietat nom i categoria,
   l'altre inicialitza totes les propietats.
 * Getter per cada propietat.
 * Un mètode que retorna false si la propietat id té un valor negatiu, altrament
   retorna true.
 * Sobreescrit el mètode toString mencionat abans.
 */
 
public class Animal {
	private int id = -1;
	private String nom;
	private Categoria categoria;
	
	public Animal(String nom, Categoria categoria) {
		if (nom == null || nom.isBlank()) {
			throw new IllegalArgumentException("El nom no pot ser null ni blanc");
		}		
		if (categoria == null) {
			throw new IllegalArgumentException("La categoria no pot ser null");
		}
		this.nom = nom;
		this.categoria = categoria;
	}
	
	public Animal(int id, String nom, Categoria categoria) {
		this(nom, categoria);
		
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
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	@Override
	public String toString() {
		return String.format("Animal(id:%s, %s, %s)", 
								(id < 0 ? "indefinit": id), 
								nom, 
								categoria.toString());
	}
}
