/*
 * Mata el gat Renat 3 cops
 * - el primers amb totes les vides
 * - el segon amb una sola vida
 * - el tercer amb dos vides
 * Després de matar-lo "del tot" prova un altre cop… per si de cas
 * Finalment el gat Renat acaba tenint tres vides però no les
 * pot aprofitar gaire pequè el programa s'acaba.
 */
public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        for (int vides = 1; vides <= 3; vides++) {
            while (renat.esViu()) {
                System.out.println("Renat diu: " + renat.mor());
            }
            System.out.println("Renat diu: " + renat.mor());    // per rematar-ho!
            System.out.println("Renat diu: " + renat.reviu(vides));
        }
    }
}
