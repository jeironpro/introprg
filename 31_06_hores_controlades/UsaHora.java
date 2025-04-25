/* Programa que es fa servir la classe Hora per testejar les funcionalitats afegides
 * que controlen errors de assignar valors no vàlids en els mètodes setter que
 * retornen un valor boolean.
 */

public class UsaHora {
    public static void main(String[] args) {
        Hora hora = new Hora();
        System.out.println("Inicialment " + hora);
        System.out.println("hores.setHores(-1) -> " + hora.setHores(-1));
        System.out.println("hores.setHores(12) -> " + hora.setHores(12));
        System.out.println("hores.setHores(24) -> " + hora.setHores(24));
        System.out.println("Ara " + hora);
        System.out.println();
        System.out.println("hores.setMinuts(-1) -> " + hora.setMinuts(-1));
        System.out.println("hores.setMinuts(21) -> " + hora.setMinuts(21));
        System.out.println("hores.setMinuts(62) -> " + hora.setMinuts(62));
        System.out.println("Ara " + hora);
        System.out.println();
        System.out.println("hores.setSegons(100) -> " + hora.setSegons(100));
        System.out.println("hores.setSegons(59) -> " + hora.setSegons(59));
        System.out.println("hores.setSegons(-2) -> " + hora.setSegons(-2));
        System.out.println("finalment " + hora);
    }
}