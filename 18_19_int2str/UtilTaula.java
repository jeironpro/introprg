/* 
* Aquest programa és la meva biblioteca d'utilitats de taules, compta amb les següents funcions:

* Una funció que rep un array de char bidimensional, un char d'origen i un altre per substitueix, retornar un nou array bidimensional amb el char de substitució en les posicions on es trobava el char d'origen. (substitueix)
*
* Una funció que inicialitza un array bidimensional amb l' 1 com valor en cada posicio. (inicialitzaTaula)
*
* Una funció que rep un array de int bidimensional i compon un String amb els valors de l'array separant les files amb espais en blanc des de 7 fins a 0 depenent del nombre de dígits en cada posició de l'array i retornar el String resultant. (taulaToString)
*/

public class UtilTaula {
    public static char[][] substitueix(char[][] origen, char inici, char fi) {
        // Declarar e inicialitzar el array bidimensional resultat amb dimensió agafat de l'array origen
        char[][] resultat = new char[origen.length][origen[0].length]; // Files x Columnes
        // Fer un for per iterar les files
        for (int fila = 0; fila < origen.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < origen[0].length; col++) {
                // Si en la posició de origen es troba el char inici
                if (origen[fila][col] == inici) {
                    // Substitir-ho pel char fi en l'array resultat
                    resultat[fila][col] = fi;
                // Del contrari
                } else {
                    // Mantenir el caràcter de origen en resultat
                    resultat[fila][col] = origen[fila][col];
                }
            }
        }
        // Retornar l'array resultat amb les substitucions
        return resultat;
    }

    public static void inicialitzaTaula(int[][] taula, int valor) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Assignar-li el valor a cada posició de l'array
                taula[fila][col] = valor;
            }
        }
    }

    public static String taulaToString(int[][] taula) {
        // Declarar e inicialitzar el String resultat buit
        String resultat = "";

        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Guardar en resultat 8 espai, per cada iteració de col
                resultat += String.format("%8d", taula[fila][col]);
            }
            // Guardar en resultat un salt de línia en cada iteració de fila
            resultat += String.format("%n");
        }

        // Retornar el resultat
        return resultat;
    }
}
