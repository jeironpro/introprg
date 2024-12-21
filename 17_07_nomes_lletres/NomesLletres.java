/* Programa que demana un text i et mostra nomes les lletres separats per una coma i un espai */

public class NomesLletres{
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Mostrar el resultat de filtrar el text i obtenir només les lletres i separar les lletres amb coma
        System.out.println(
                UtilString.lletresSeparades(
                    UtilString.nomesLletres(
                        Entrada.readLine()
                        )
                    )
                );
    }
}
