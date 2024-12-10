/* Programa que rep un text i et mostra per pantalla un triangle 
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
        // Passar-li el valor del text al mòdul
        dibuixaTriangleInvertit(text);
    }
    
    public static void dibuixaTriangleInvertit(String text) {
        // Fer un for per iterar tots els caràcters del text
        for (int linia = text.length()-1; linia >= 0; linia--) {
            dibuixaLiniaInvertida(text, linia);
            // Fer un salt de línia en cada iteració de i
            System.out.println();
        }
    }
    
    public static void dibuixaLiniaInvertida(String text, int linia) {
        // Fer un for per iterar la posició del caracter
        for (int columna = linia; columna >= 0; columna--) {
            char c = text.charAt(columna);
            // Mostrar el primer caràcter sense coma
            if (columna == 0) {
                // Mostrar l'últim caràcter que és el primer, perquè el text està invertit
                System.out.print(c);
            // Del contrari
            } else {
                // Mostrar els altres caràcters amb coma
                System.out.print(c + ", ");                 
            }
        }
    }
}
