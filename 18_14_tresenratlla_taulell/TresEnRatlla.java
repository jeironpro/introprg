/*
* Programa que mostra la representació d'una partida del joc tic tac toe 
* amb combinacions establertes i permetent fer un movement al jugador X
* i mostra el taulell con el movement fet.
*/

public class TresEnRatlla {
    public static void main(String[] args){
        // declaració del taulell
        char[][] taulell = new char[3][3];
        // inicialització de la fila 0
        taulell[0][0] = '·';
        taulell[0][1] = 'O';
        taulell[0][2] = 'O';
        
        // inicialització de la fila 1
        taulell[1][0] = '·';
        taulell[1][1] = 'X';
        taulell[1][2] = '·';
        
        // inicialització de la fila 2
        taulell[2][0] = '·';
        taulell[2][1] = '·';
        taulell[2][2] = 'X';
        
        // mostra la posició inicial del taulell
        System.out.println("La posició inicial del taulell:");
        mostraFila(taulell[0]);     // mostra la línia 0
        mostraFila(taulell[1]);     // mostra la línia 1
        mostraFila(taulell[2]);     // mostra la línia 2
        
        // demana coordenades del moviment del jugador X
        System.out.println("Fila del següent moviment?");
        int fila = Integer.parseInt(Entrada.readLine());
        
        // Demanar la columna
        System.out.println("Columna del següent moviment?");
        // Llegir la columna
        int columna = Integer.parseInt(Entrada.readLine());
        
        // marquem el nou moviment
        // Si fila i la columna esten a dins del rang
        if ((fila >= 0 && fila <= 2) && (columna >= 0 && columna <= 2)) {
            // Si la casella està desocupat
            if (taulell[fila][columna] == '·') {
                // Marca la X en la posició corresponent
                taulell[fila][columna] = 'X';  
            // Del contrari              
            } else {
                // Mostrar aquest missatge d'error
                System.out.println("Posició ocupada");
            }
        } else {
            System.out.println("Coordenades incorrectes");
        }
        // tornem a mostrar el taulell
        System.out.println("La posició final del taulell:");
        mostraFila(taulell[0]);     // mostra la línia 0
        mostraFila(taulell[1]);     // mostra la línia 1
        mostraFila(taulell[2]);     // mostra la línia 2
    }
    // mostra el contingut de la fila per sortida estàndard
    public static void mostraFila(char[] fila) {
        // For per mostrar les files de l'array
        for (int col = 0; col < fila.length; col++) { 
            // Mostra les files
            System.out.print(fila[col]);
        }
        // Fer un salt de línia després de cada iteració de col
        System.out.println();
    }
}
