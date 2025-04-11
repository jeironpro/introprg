/*
 * Programa que utilitza la classe Vi, i crea i modifica alguns vins
 * amb diferents dades.
 */

public class UsaVi {
    public static void main(String[] args) {
        System.out.println("Vi sense estoc" + new Vi("Roura blanc", 1234));
        Vi vi = new Vi("Roura blanc", 1234, 24);
        System.out.println("Vi amb estoc" + vi);
        vi.setPreu(vi.getPreu() + 120);
        vi.setEstoc(vi.getEstoc() - 10);
        System.out.println("Vi modificat" + vi);
    }
}
