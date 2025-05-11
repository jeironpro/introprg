/**
 *
 */
 
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Recopilador {
	private Map<Adressa, List<String>> adreces = new HashMap<>();
	private static final String SEPARADORS = "[\\s\\[{(<>})\\],;:'\"=|/\\!?]";
	
	public int processa(String nom, String text) {
		int comptador = 0;
		String[] adreca = text.split(SEPARADORS);
		
		for (String adrec: adreca) {
			if (adrec.contains("@")) {
				if (Adressa.esValida(adrec)) {
					Adressa adressa = Adressa.fromString(adrec);
					if (adreces.get(adressa) != null) {
						if (!adreces.get(adressa).contains(nom)) {
							adreces.get(adressa).add(nom);
							comptador++;
						}
					} else {
						List<String> noms = new ArrayList<>();
						noms.add(nom);
						adreces.put(adressa, noms);
						comptador++;
					}
				}
			}
		} 
		return comptador;
	}
	
	public List<Adressa> getAdreces() {
		List<Adressa> adrecs = new ArrayList<>(adreces.keySet());
		java.util.Collections.sort(adrecs);
		return adrecs;
	}

	public List<String> getNoms(Adressa adressa) {
		List<String> noms = adreces.get(adressa);
		java.util.Collections.sort(noms);
		return noms;
	}
}
