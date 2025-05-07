/**
 * Classe que comprova el funcionament del mètode equals de EnvoltaString 
   comparant-la amb l'operador de igualtat.
 */

public class UsaEnvoltaString {
	public static void main(String[] args) {
		String nom1 = "Renat";
		String nom2 = args.length > 0 ? args[0] : "nom per defecte";
		System.out.printf("\"%s\".equals(\"%s\") -> %b%n", nom1, nom2, nom1.equals(nom2));

		EnvoltaString envoltaNom1 = new EnvoltaString(nom1);
		EnvoltaString envoltaNom2 = new EnvoltaString(nom2);
		System.out.printf("%s.equals(%s) -> %b%n", envoltaNom1, envoltaNom2, envoltaNom1.equals(envoltaNom2));
         System.out.printf("%s.equals(\"%s\") -> %b%n", envoltaNom1, nom2, envoltaNom1.equals(nom2));
         System.out.printf("\"%s\".equals(%s) -> %b%n", nom1, envoltaNom2, nom1.equals(envoltaNom2));
	}
}
