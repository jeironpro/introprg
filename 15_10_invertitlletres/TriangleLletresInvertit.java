/* Aquest programa rep un text i et mostra per pantalla un triangle 
* invertir amb tots els caràcters en una lìnia i després en una altra 
* eliminarà l'últim caràcter i aixì successivament fins a arribar al 
* primer caràcter.
* Exemple:
* Si l'introduïm Jeiron:
* n, o, r, i, e, J
* o, r, i, e, J
* r, i, e, J
* i, e, J
* e, J
* J
*/

public class TriangleLletresInvertit {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        
        // Fer un for per iterar tots els caràcters del text
        for (int i = text.length()-1; i >= 0; i--) {
            // Fer un for per iterar la posició del caracter
            for (int j = i; j >= 0; j--) {
                // Mostrar el primer caràcter sense coma
                if (j == 0) {
                    // Mostrar l'últim caràcter que és el primer, perquè el text està invertit
                    System.out.print(text.charAt(j));
                // Del contrari
                } else {
                    // Mostrar els altres caràcters amb coma
                    System.out.print(text.charAt(j) + ", ");                 
                }
            }
            // Fer un salt de línia en cada iteració de i
            System.out.println();
        }
    }
}
