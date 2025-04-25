/* Programa que es fa servir la classe Hora per testejar les funcionalitats afegides
 * que generen excepcions en els mètodes setter, especificament 
 * IllegalArgumentException.
 */

public class UsaHora {
    public static void main(String[] args) throws Exception {
        System.out.println("Intentarem crear una hora amb valors no vàlids");

        try {
            Hora hora = new Hora(-1, 1, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Argument il·legal!");
        }
    }
}