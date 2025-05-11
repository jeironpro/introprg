/**
 *
 */

import java.io.File;
import java.io.FileReader; 
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class RecopilaAdreces {
	private static Recopilador recopilador = new Recopilador();
	
	public static String llegeixFitxer(String nomFitxer) throws IOException {
		BufferedReader lector = new BufferedReader(new FileReader(nomFitxer));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String linia = lector.readLine();
			
			if (linia == null) {
				break;
			}
			sb.append(linia);
			sb.append('\n');
		}		
		lector.close();
		return sb.toString();
	}
	
	public static void mostraResultat(Recopilador recopilador) {
		List<Adressa> adreca = recopilador.getAdreces();
		
		for (Adressa adrec: adreca) {
			String id = adrec.getIdentificador();
			String dom = adrec.getDomini();
			String compAdressa = id + "" + dom;
			System.out.println(compAdressa);
			
			List<String> noms = recopilador.getNoms(adrec);
			
			for (String nom: noms) {
				System.out.println("- " + nom);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		for (int i = 0; i < args.length; i++) {
			File fitxer = new File(args[i]);
			
			if (!fitxer.exists()) {
				System.out.println("No s'ha trobat el fitxer " + args[i]);
			} else if (!fitxer.canRead()) {
				System.out.println("El fixter no es pot llegir " + args[i]);
			}
			
			String contingut = llegeixFitxer(args[i]);
			int quants = recopilador.processa(args[i], contingut);
			
			if (quants == 0) {
				System.out.println("No s'han trobat adreces");
				return;
			}
		}
		mostraResultat(recopilador);
	}
}
