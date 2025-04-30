/*  
  Classe que hereta de la classe Exception, per crear un constructor per defecte,
  un constructor especifíc que reb un missatge per la excepció. 
 */

public class BotigaException extends Exception {
	public BotigaException() throws Exception {
		throw new Exception();
	}
	
	public BotigaException(String missatge) throws Exception {
		throw new Exception(missatge);
	}
}
