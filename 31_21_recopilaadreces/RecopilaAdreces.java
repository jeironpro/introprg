/**
 * Classe que es fa servir per gestionar la recopilació d'adreces, conté:
 * Atribut estàtic recopilador de tipus Recopilador, per fer-ho servir en tota la
   classe.
 *
 * Dos mètodes de classe:
 * llegeixFitxer(String) -> rep la ruta d'un fitxer i verifica si existeix i si és
   un fitxer, sinó ho és mostra un missatge en cada verificació, altrament retorna
   el contingut del fitxer fent servir StringBuilder per concatenar cada línia i
   afegir-li un salt de línia.
 * 
 * mostraResultat(Recopilador) -> rep un Recopilador i crida al mètode que conté la
   llista de adreces i la llista de noms de fitxers i els mostra. Cada adreça amb 
   el(s)seu(s) fitxer(s).
 */

import java.io.File;
import java.io.FileReader; 
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class RecopilaAdreces {
	private static Recopilador recopilador = new Recopilador();
	
	public static String llegeixFitxer(String nomFitxer) throws IOException {
		File fitxer = new File(nomFitxer);
		
		if (!fitxer.exists()) {
			System.out.println("No s'ha trobat el fitxer " + fitxer);
			return null;
		}
		
		if (!fitxer.isFile()) {
			System.out.println("No s'ha pogut llegir el fitxer " + fitxer);
			return null;
		}
		
		BufferedReader lector = new BufferedReader(new FileReader(fitxer));
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
		int quants = 0;
		for (int i = 0; i < args.length; i++) {
			String fitxer = args[i];
			String contingut = llegeixFitxer(fitxer);
			
			if (contingut != null) {
				quants += recopilador.processa(fitxer, contingut);
			}
		}
		if (quants == 0) {
			System.out.println("No s'han trobat adreces");
		}
		mostraResultat(recopilador);
	}
}
