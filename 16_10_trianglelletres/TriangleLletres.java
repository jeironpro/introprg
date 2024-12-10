/* Programa que rep un text i et mostra un triangle des de el primer
* caràcter fins a l'últim. Després de la segona iteració separarà el caràcters
* amb comes excepte l'últim de cada iteració.
* Exemple:
* Si el text introduït és Jeiron;
* el programa mostrarà aquest triagle:
* J
* J, e
* J, e, i
* J, e, i, r
* J, e, i, r, o
* J, e, i, r, o, n
*/
public class TriangleLletres {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        
        dibuixaTriangle(text);
    }
    
    public static void dibuixaTriangle(String text) {
        // Fer un for per iterar tots els caràcters del text
        for (int linia = 0; linia < text.length(); linia++) {
            dibuixaLinia(text, linia);
            // Fer un salt de línia en cada iteració de i
            System.out.println();
        }
    }
    
    public static void dibuixaLinia(String text, int linia) {
        // Fer un for per iterar la posició del caracter
        for (int columna = 0; columna <= linia; columna++) {
            char c = text.charAt(columna);
            // Verificar si i és igual a 0
            if (linia == 0 || columna == linia) {
                // Mostrar el primer caràcter sense coma
                System.out.print(c);
            // Del contrari
            } else {
                // Mostrar els caràcters amb comes
                System.out.print(c + ", ");
            }
        }
    }
}
