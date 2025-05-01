/*  
  Classe que hereta de la classe Exception, per crear un constructor per defecte,
  un constructor especifíc que reb un missatge per la excepció. 
 */
@SuppressWarnings("serial")
public class BotigaException extends Exception {
	public BotigaException() {
		super();
	}
	
	public BotigaException(String missatge) {
		super(missatge);
	}
}
