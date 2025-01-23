/* Aquest programa és una animació que mostra una pilota canviar de posició
* (va caient en diagonal) mentre es presiona enter. Ara la pilota rebota.
*/

public class Pilota {
    // Variable constant que conte el nom de files
    public static final int N_FILES = 9;
    // Variable constant que conte el nom de columnes
    public static final int N_COLS = 14;

    public static void netejaPantalla() {
        // Vaig fer una investigació de aquest dos System.out.
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

    public static void netejaPosicio(char[][] camp, int[] posicio) {
        // Tornar a assignar el valor inicial el camp indicat per fila i col
        camp[posicio[0]][posicio[1]] = '·';
    }

    public static void posicionaPilota(char[][] camp, int[] posicio) {
        // Possar la pilota en la posició del camp que indica fila i col
        camp[posicio[0]][posicio[1]] = 'O';
    }


    public static int obteFila(int[] posicio) {
        // Retornar la posició de la fila
        return posicio[0];
    }

    public static int obteCol(int[] posicio) {
        // Retornar la posició de la columna
        return posicio[1];
    }

    public static int obteIncrFila(int[] increment) {
        // Retornar l'increment de la fila
        return increment[0];
    }

    public static int obteIncrCol(int[] increment) {
        // Retornar l'increment de la columna
        return increment[1];
    }


    public static void canviaPosicio(int[] posicio, int novaFila, int novaCol) {
        // Assignar la nova posició de la fila
        posicio[0] = novaFila;
         // Assignar la nova posició de la columna
        posicio[1] = novaCol;
    }

    public static void canviaIncrement(int[] increment, int nouIncFila, int nouIncCol) {
        // Assignar el nou increment de la fila
        increment[0] = nouIncFila;
        // Assignar el nou increment de la columna
        increment[1] = nouIncCol;
    }

    public static void seguentPosicio(int[] posicio, int[] increment) {
        // Declarar e inicialitzar el int fila amb la funció obteFila(passar-li com argument posicio)
        int fila = obteFila(posicio);
        // Declarar e inicialitzar el int col amb la funció obteCol(passar-li com argument posicio)
        int col = obteCol(posicio);
        // Declarar e inicialitzar el int incFila amb la funció obteIncrFila(passar-li com argument increment)
        int incFila = obteIncrFila(increment);
        // Declarar e inicialitzar el int incFila amb la funció obteIncrCol(passar-li com argument increment)
        int incCol = obteIncrCol(increment);

        // actualitza la fila
        fila = fila + incFila;
        if (fila < 0) {                     // es passa per sobre
            fila = 1;                       // torna a la primera fila
            incFila = 1;                    // toca baixar
        } else if (fila > N_FILES-1) {      // es passa per sota
            fila = N_FILES-2;               // tornar a la fila anterior
            incFila = -1;                   // l'increment de la fila és negatiu
        }

        // actualitza la columna
        col = col + incCol;
        if (col < 0) {                     // es passa per sobre
            col = 1;                       // torna a la primera columna
            incCol = 1;                    // toca baixar
        } else if (col > N_COLS-1) {       // es passa per sota
            col = N_COLS-2;                // tornar a la columna anterior
            incCol = -1;                   // l'increment de la columna és negatiu
        }
        
        // actualitza la posició i l'increment
        canviaPosicio(posicio, fila, col);
        canviaIncrement(increment, incFila, incCol);
    }

    public static void main(String[] args)  {
        // Array bidimensional camp de 9 x 14
        char[][] camp = new char[N_FILES][N_COLS];
        // Cridar netejaCamp(passar-li el argument camp)
        netejaCamp(camp);
        int[] posicio = new int[2];         // fila, col
        canviaPosicio(posicio, 0, 0);       // posició inicial (0, 0)
        int[] increment = new int[2];       // incFila, incCol
        canviaIncrement(increment, 1, 1);   // desplaçament inicial: 1 fila 1 columna


        // Fer un bucle do (S'executa almenys una vegada)
        do {
            // Cridar posicionaPilota(passar-li els argument camp i posicio)
            posicionaPilota(camp, posicio);
            // Cridar netejaPantall
            netejaPantalla();
            // Cridar mostraCamp(passar-li camp com argument)
            mostraCamp(camp);
            // Cridar netejaPosicio(passar-li els argument camp i posicio)
            netejaPosicio(camp, posicio);
            // Cridar seguentPosicio(passar-li els argument posicio i increment)
            seguentPosicio(posicio, increment);
            // Mostrar el missatge que indica que fer per canviar la posició de la pilota
            System.out.printf("%nEnter per continuar");
        // Mentre l'entrada sigui buida, executar el bucle
        } while (Entrada.readLine().isEmpty());
    }
}
