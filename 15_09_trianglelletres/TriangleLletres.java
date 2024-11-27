/* Aquest programa rep un text i et mostra un triangle des de el primer
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
        
        // Verificar si el text està buit
        if (text.isEmpty()) {
            // Mostrar aquest missatge
            System.out.println("Cadena buida");
        // Del contrari
        } else {
            // Fer un for per iterar tots els caràcters del text
            for (int i = 0; i < text.length(); i++) {
                // Fer un for per iterar la posició del caracter
                for (int j = 0; j <= i; j++) {
                    // Verificar si i és igual a 0
                    if (i == 0 || j == i) {
                        // Mostrar el primer caràcter sense coma
                        System.out.print(text.charAt(j));
                    // Del contrari
                    } else {
                        // Mostrar els caràcters amb comes
                        System.out.print(text.charAt(j) + ", ");
                    }
                }
                // Fer un salt de línia en cada iteració de i
                System.out.println();
            }
        }
    }
}
