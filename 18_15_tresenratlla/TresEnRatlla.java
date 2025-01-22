/*
* Programa que representa el joc tic tac toe, com el mateix joc té dos jugadors X i O.
* Hi ha només un guanyador i té 8 combinacions per guanyar.
*/

public class TresEnRatlla {
    public static void main(String[] args) {
        // Declarar e inicialitzar el array bidimensional taulell de 3x3
        char[][] taulell = new char[3][3]; // Fila & columna
        
        // Iniciar el joc
        System.out.println("Comença el joc");
        
        // Crear el taulell inicial
        crearTaulell(taulell);

        // Mostrar el taulell inicial
        mostraTaulell(taulell);
        
        // Jugador actual X
        char jugadorActual = 'X';
        
        // while infinit
        while (true) {
            // Demanar la posició al jugador actual
            System.out.printf("%c?%n", jugadorActual);
            // Llegir la posició
            String posicioJugador = Entrada.readLine();
            // Declarar e inicialitzar el int fila en 0
            int fila = 0;
            // Declarar e inicialitzar el int columna en 0
            int columna = 0;
            
            // Si el jugador introdueix l'a, el jugador abandona
            if (posicioJugador.equals("a")) {
                // Mostrar aquest missatge
                System.out.printf("%c abandona%n", jugadorActual);
                // Aturar el bucle
                break;
            }
            
            // Mentre la funció verificaCoordenada retorna false
            while (true) {
                if (verificaCoordenada(posicioJugador)) {
                    // Agafar el primer caràcter i convertir-ho a enter
                    fila = Integer.parseInt("" + posicioJugador.charAt(0));
                    // Agafar el segon caràcter i convertir-ho a enter
                    columna = Integer.parseInt("" + posicioJugador.charAt(1)); 
                    
                    if (!casellaOcupada(taulell, fila, columna)) {
                        // Assignar-li la marca del jugador en la posició que correspon
                        taulell[fila][columna] = jugadorActual;
                        // Mostrar el taulell amb el nou moviment
                        mostraTaulell(taulell);
                        break;
                    } else {
                        // Mostrar aquest missatge d'error
                        System.out.println("Casella ocupada");
                    }
                } else {
                    // Mostrar aquest missatge d'error
                    System.out.println("Coordenades invalides");                
                }
                // Mostrar el taulell amb el nou moviment
                mostraTaulell(taulell);
                // Demanar la posició al jugador actual
                System.out.printf("%c?%n", jugadorActual);
                // Llegir la posició
                posicioJugador = Entrada.readLine();
                // Si el jugador introdueix l'a, el jugador abandona
                if (posicioJugador.equals("a")) {
                    // Mostrar aquest missatge
                    System.out.printf("%c ha abandonat%n", jugadorActual);
                    // Aturar el bucle
                    return;
                }
            }
            
            // Si la funció retorna true, el jugador actual és el ganador
            if (jugadorGuanya(taulell, jugadorActual)) {
                // Mostrar aquest missatge
                System.out.printf("%c ha guanyat%n", jugadorActual);
                // Aturar el bucle
                break;
            }
            
            // Si el jugador actual és X
            if (jugadorActual == 'X') {
                // Jugador actual O
                jugadorActual = 'O';
            // Del contrari
            } else {
                // Jugador actual X
                jugadorActual = 'X';
            }
            
            // Veriicar si hay un empat
            if (hiHaEmpat(taulell)) {
                // Mostrar aquest missatge
                System.out.println("El joc ha quedat empat");
                // Aturar el bucle
                break;
            }
        }
    }
    
    public static void crearTaulell(char[][] taulell) {
        // Fer un for per iterar l'array en la seva longitud (fila)
        for (int fila = 0; fila < taulell.length; fila++) {
            // Fer un for per iterar l'array en la seva longitud (columna)
            for (int col = 0; col < taulell.length; col++) {
                // Assignar a cada posició de l'array el seu valor inicial (·)
                taulell[fila][col] = '·';
            }
        }
    }

    public static void mostraTaulell(char[][] taulell) {
        // Fer un for per iterar l'array en la seva longitud (fila)
        for (int fila = 0; fila < taulell.length; fila++) {
            // Fer un for per iterar l'array en la seva longitud (columna)
            for (int col = 0; col < taulell.length; col++) {
                // Mostrar el valor de l'array en cada posició
                System.out.print(taulell[fila][col]);
            }
            // Fer un salt de línia, després de cada iteració de fila
            System.out.println();
        }
    }    
    
    public static boolean casellaOcupada(char[][] taulell, int fila, int columna) {
        // Verificar si la casella a ocupar està buida
        if (taulell[fila][columna] != '·') {
            // Retornar true
            return true;
        // Del contrari
        } else {
            // Retornar false
            return false;
        }
    }
    
    public static boolean jugadorGuanya(char[][] taulell, char jugador) {
        // Possibles manera de guanyar
        // Manera 1
        if (taulell[0][0] == jugador && taulell[0][1] == jugador && taulell[0][2] == jugador) {
            return true;
        }
        // Manera 2
        if (taulell[1][0] == jugador && taulell[1][1] == jugador && taulell[1][2] == jugador) {
            return true;
        }
        
        // Manera 3
        if (taulell[2][0] == jugador && taulell[2][1] == jugador && taulell[2][2] == jugador) {
            return true;
        }
        
        // Manera 4
        if (taulell[0][0] == jugador && taulell[1][0] == jugador && taulell[2][0] == jugador) {
            return true;
        }
        
        // Manera 5
        if (taulell[0][1] == jugador && taulell[1][1] == jugador && taulell[2][1] == jugador) {
            return true;
        }
        
        // Manera 6
        if (taulell[0][2] == jugador && taulell[1][2] == jugador && taulell[2][2] == jugador) {
            return true;
        }
        
        // Manera 7
        if (taulell[0][0] == jugador && taulell[1][1] == jugador && taulell[2][2] == jugador) {
            return true;
        }
        
        // Manera 8
        if (taulell[2][0] == jugador && taulell[1][1] == jugador && taulell[0][2] == jugador) {
            return true;
        }
        
        // Retornar false, si no es compleix cap condició de les anteriors
        return false;
    }
    
    public static boolean hiHaEmpat(char[][] taulell) {
        // Declarar e inicialitzar el int marcat en 0
        int marcat = 0;
        // Fer un for per iterar l'array en la seva longitud (fila)
        for (int fila = 0; fila < taulell.length; fila++) {
            // Fer un for per iterar l'array en la seva longitud (colunma)
            for (int col = 0; col < taulell.length; col++) {
                // Si la posicio de l'array no està buida
                if (taulell[fila][col] != '·') {
                    // Augmentar en 1 marcat
                    marcat++;
                }
            }
            // Si marcat llega a 9
            if (marcat == 9) {
                // Retornar true
                return true;
            }
        }
        // Retornar false, si no es compleix la condició
        return false;
    }
    
    public static boolean verificaCoordenada(String coordenada) {
        // Si la longitud de la coordena és igual a dos 
        if (coordenada.length() == 2) {
            // Verificar que el primer caràcter sigui dígit entre 0 i 2
            if (Character.isDigit(coordenada.charAt(0)) && coordenada.charAt(0) >= '0' && coordenada.charAt(0) <= '2') { 
                // Verificar que el segon caràcter sigui dígit entre 0 i 2
                if (Character.isDigit(coordenada.charAt(1)) && coordenada.charAt(1) >= '0' && coordenada.charAt(1) <= '2') {
                    // Retornar true
                    return true;
                }
            }
        }
        
        // Retornar false, quan no es compleix la condició
        return false;
    }
}
