/* Aquest programa és una animació que mostra una pilota canviar de posició
* (va caient en diagonal) mentre es presiona enter.
*/

public class Pilota {
    // Variable constant que conte el nom de files
    public static final int N_FILES = 9;
    // Variable constant que conte el nom de columnes
    public static final int N_COLS = 13;

    public static void netejaPantalla() {
        // Codi per netejar la pantalla 
        // \033 caràcter d'escap (ESC)
        // [H Mou el cursor a la posició inicial (fila 1, columna)
        // [2J Esborra tot el contingut de la pantalla
        System.out.print("\033[H\033[2J"); // Codi d'escap ANSI
        // Assegura que es processi el contingut enviat a la consola sense esperar cap tipus de memòria intermèdia
        System.out.flush();
    }

    public static void mostraCamp(char[][] camp) {
        // Fer un for per iterar les files
        for (int i=0; i<N_FILES; i++) {
            // Fer un for per iterar les columnes
            for (int j=0; j<N_COLS; j++) {
                // Mostrar el camp en la posició de i i j
                System.out.print(camp[i][j]);
            }
            // Fer un salt de línia desprès de cada iteració de i
            System.out.println();
        }
    }

    public static void netejaCamp(char[][] camp) {
        // Fer un for per iterar les files
        for (int i=0; i<N_FILES; i++) {
            // Fer un for per iterar les columnes
            for (int j=0; j<N_COLS; j++) {
                // Assignar el valor inicial de cada posició del camp
                camp[i][j] = '·';
            }
        }
    }

    public static void netejaPosicio(char[][] camp, int fila, int col) {
        // Tornar a assignar el valor inicial el camp indicat per fila i col
        camp[fila][col] = '·';
    }

    public static void posicionaPilota(char[][] camp, int fila, int col) {
        // Possar la pilota en la posició del camp que indica fila i col
        camp[fila][col] = 'O';
    }

    public static int seguentFila(int actual) {
        // Si la posició actual és menor a N_FILES-1
        if (actual < N_FILES-1) {
            // Retornar actual +1
            return actual + 1;
        // Del contrari
        } else {
            // Retornar 0
            return 0;
        }
    }

    public static int seguentCol(int actual) {
        // Si la posició actual és menor a N_COLS-1
        if (actual < N_COLS-1) {
            // Retornar actual +1
            return actual + 1;
        // Del contrari
        } else {
            // Retornar 0
            return 0;
        }
    }

    public static void main(String[] args)  {
        // Array bidimensional camp de 9 x 13
        char[][] camp = new char[N_FILES][N_COLS];
        // Cridar netejaCamp(passar-li el argument camp)
        netejaCamp(camp);
        // Declarar e inicialitzar el int fila en 0
        int fila = 0;
        // Declarar e inicialitzar el int col en 0
        int col = 0;
        
        // Fer un bucle do (S'executa almenys una vegada)
        do {
            // Cridar posicionaPilota(passar-li els argument camp, fila i col)
            posicionaPilota(camp, fila, col);
            // Cridar netejaPantall
            netejaPantalla();
            // Cridar mostraCamp(passar-li camp com argument)
            mostraCamp(camp);
            // Cridar netejaPosicio(passar-li els argument camp, fila i col)
            netejaPosicio(camp, fila, col);
            // Assignar a fila el valor que retorne la funció seguentFila(passar-li fila com argument)
            fila = seguentFila(fila);
            // Assignar a fila el valor que retorne la funció seguentCol(passar-li col com argument)
            col = seguentCol(col);
            // Mostrar el missatge que indica que fer per canviar la posició de la pilota
            System.out.printf("%nEnter per continuar");
        // Mentre l'entrada sigui buida, executar el bucle
        } while (Entrada.readLine().isEmpty());
    }
}
