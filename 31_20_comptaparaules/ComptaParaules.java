/*
 * Programa que demana texts i compta les vegades que s'han introduït cada
 * paraula del text.
 */
 
import java.util.Map;
import java.util.HashMap;

public class ComptaParaules {
	public static void main(String[] args) {
		Map<String, Integer> paraules = new HashMap<>();
		
		System.out.println("Ves introduint frases. Enter per finalitzar.");	
		while(true) {
			String text = Entrada.readLine();
			
			if (text.isBlank()) {
				break;
			}
			text = text.toLowerCase();
			String paraula = "";
			for (int i = 0; i < text.length(); i++) {
				char c = text.charAt(i);
				
				if (Character.isLetter(c)) {
					paraula += c;
				} else if (!paraula.isBlank()) {
					paraula = UtilString.filtraVocalsCatalaV2(paraula);
					if (paraules.get(paraula) == null) {
						paraules.put(paraula, 0);
					}
					paraules.put(paraula, paraules.get(paraula) + 1);
					System.out.printf("%s -> %d%n", paraula, paraules.get(paraula));
					paraula = "";
				}
			}
		}
		System.out.println("Adéu");
	}
}
