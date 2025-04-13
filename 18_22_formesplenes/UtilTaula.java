/* 
* Aquest programa és la meva biblioteca d'utilitats de taules, compta amb les següents funcions:

* Una funció que rep un array de char bidimensional, un char d'origen i un altre per substitueix, retornar un nou array bidimensional amb el char de substitució en les posicions on es trobava el char d'origen. (substitueix)
*
* Una procediment que inicialitza un array bidimensional amb l' 1 com valor en cada posicio. (inicialitzaTaula)
*
* Una funció que inicialitza cada posoció de un array bidimensional amb els valors de manera seqüencial des de l'1 fins a la quantitat d'array demanat. (inicialitzaSequencial)
*
* Un procediment que inicialitza la primera diagonal \ de un array bidimensional en true i la resta a false. (inicialitzaPrimeraDiagonal) 
*
* Un procediment que inicialitza la vertical del mig | (si les columnes són parell s'inicialitzarà la vertical del mig que està a la columna menor de les dues del mig) de una array bidimensional en true i la resta a false. (inicialitzaVerticalMig)
*
* Un procediment que inicialitza la horizontal del mig - (si les files són parell s'inicialitzarà la horizontal del mig que està a la columna menor de les dues del mig) de una array bidimensional en true i la resta a false. (inicialitzaHoritzontalMig)
*
* Un procediment que inicialitza la vertical i la horizontal del mig + (si les files i columnes són parell s'inicialitzarà la vertical i la horizontal del mig que està a la columna menor de les dues del mig) de una array bidimensional en true i la resta a false. (inicialitzaQuarts)
*
* Un procediment que inicialitza la segona diagonal / de un array bidimensional en true i la resta a false. (inicialitzaSegonaDiagonal) 
*
* Un procediment que inicialitza la primera i segona diagonal x de un array bidimensional en true i la resta a false. (inicialitzaCreu)
*
* Un procediment que inicialitza les files senar = de un array bidimensional en true i la resta a false. (inicialitzaPasVianants)
*
* Un procediment que inicialitza les columnes senar || de un array bidimensional en true i la resta a false. (inicialitzaZebra) 
*
* Un procediment que inicialitza les files i columnes senar ++ de un array bidimensional en true i la resta a false. (inicialitzaEscacs)
*
* Un procediment que inicialitza la primera diagonal amb el primer triangle ple. (inicialitzaPrimeraDiagonalPrimerPle)
*
* Un procediment que inicialitza la primera diagonal amb el segon triangle ple. (inicialitzaPrimeraDiagonalSegonPle)
*
* Un procediment que inicialitza la segona diagonal amb el primer triangle ple. (inicialitzaSegonaDiagonalPrimerPle) 
*
* Un procediment que inicialitza la segona diagonal amb el segon triangle ple.(inicialitzaSegonaDiagonalSegonPle)
*
* Un procediment que inicialitza la vertical del mig amb el primer costat ple. (inicialitzaVerticalMigPrimerPle)
*
* Un procediment que inicialitza la vertical del mig amb el segon costat ple. (inicialitzaVerticalMigSegonPle)
*
* Un procediment que inicialitza la horizontal del mig amb el primer costat ple. (inicialitzaHoritzontalMigPrimerPle)
*
* Un procediment que inicialitza la horizontal del mig amb el segon costat ple. (inicialitzaHoritzontalMigSegonPle)
*
* Un procediment que inicialitza els quarts amb el quadrant nord-oest ple. (inicialitzaQuartsNOPle)
*
* Un procediment que inicialitza els quarts amb el quadrant sud-oest ple. (inicialitzaQuartsSOPle)
*
* Un procediment que inicialitza els quarts amb el quadrant nord-est ple. (inicialitzaQuartsNEPle)
*
* Un procediment que inicialitza els quarts amb el quadrant sud-est ple. (inicialitzaQuartsSEPle)
*
* Un procediment que inicialitza els quarts amb els quadrants nord-oest i sud-est plens  (inicialitzaQuartsNOSEPlens)
*
* Un procediment que inicialitza els quarts amb els quadrants sud-oest i nord-est plens. (inicialitzaQuartsSONEPlens)
*
* Un procediment que inicialitza la creu amb el quadrant nord ple. (inicialitzaCreuNPle)
*
* Un procediment que inicialitza la creu amb el quadrant oest ple. (inicialitzaCreuOPle)
*
* Un procediment que inicialitza la creu amb el quadrant sud ple. (inicialitzaCreuSPle)
*
* Un procediment que inicialitza la creu amb el quadrant est ple. (inicialitzaCreuEPle)
*
* Un procediment que inicialitza la creu amb els quadrants nord i sud plnes. (inicialitzaCreuNSPlens)
*
* Un procediment que inicialitza la creu amb els quadrants oest i est plens. (inicialitzaCreuOEPlens)
*
* Un procediment que inicialitza les files i columnes a false de un array bidimensional. (inicialitzaFalse)
*
* Una funció que rep un array de int bidimensional i compon un String amb els valors de l'array separant les files amb espais en blanc des de 7 fins a 0 depenent del nombre de dígits en cada posició de l'array i retornar el String resultant. (taulaToString)
*
* Una funció que rep un array de int bidimensional, un char que representa el ompliment i un altre que representa el buidatge de les posició de l'array i compon un String amb el char de ompliment en una posiició indicat i la resta amb el char de buidatge i retornar el String resultant. (taulaToString)
*/

public class UtilTaula {
    public static char[][] substitueix(char[][] origen, char inici, char fi) {
        char[][] resultat = new char[origen.length][origen[0].length];
        for (int fila = 0; fila < origen.length; fila++) {
            for (int col = 0; col < origen[0].length; col++) {
                if (origen[fila][col] == inici) {
                    resultat[fila][col] = fi;
                } else {
                    resultat[fila][col] = origen[fila][col];
                }
            }
        }
        return resultat;
    }

    public static void inicialitzaTaula(int[][] taula, int valor) {
        for (int fila = 0; fila < taula.length; fila++) {
            for (int col = 0; col < taula[0].length; col++) {
                taula[fila][col] = valor;
            }
        }
    }
    
    public static void inicialitzaSequencial(int[][] taula, int valorInicial) {
        for (int fila = 0; fila < taula.length; fila++) {
            for (int col = 0; col < taula[0].length; col++) {
                taula[fila][col] = valorInicial++;
            }
        }
    }
    
     public static void inicialitzaPrimeraDiagonal(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
         
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila == col) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaVerticalMig(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final int M_COLS = (taula[0].length/2);
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (col == M_COLS) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaHoritzontalMig(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final int M_FILES = (taula.length/2);
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila == M_FILES) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaQuarts(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final int M_FILES = (taula.length/2);
        final int M_COLS = (taula[0].length/2);
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila == M_FILES) {
                    taula[fila][col] = true;
                } else if (col == M_COLS) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaSegonaDiagonal(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (col+1 == N_COLS-fila) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaCreu(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (col == fila) {
                    taula[fila][col] = true;
                } else if (col+1 == N_COLS-fila) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaPasVianants(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila % 2 != 0) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaZebra(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (col % 2 != 0) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaEscacs(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila % 2 == 0 && col % 2 != 0) {
                    taula[fila][col] = true;      
                } else if (fila % 2 != 0 && col % 2 == 0) {
                    taula[fila][col] = true; 
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    // 18_22 ampliacio
    public static void inicialitzaPrimeraDiagonalPrimerPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (col <= fila) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaPrimeraDiagonalSegonPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (col >= fila) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaSegonaDiagonalPrimerPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (col < N_COLS-fila) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaSegonaDiagonalSegonPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (col < N_COLS-fila-1) {
                    taula[fila][col] = false;
                } else {
                    taula[fila][col] = true;
                }
            }
        }
    }
    
    public static void inicialitzaVerticalMigPrimerPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final int M_COLS = (taula[0].length/2);
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (col <= N_COLS/2) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaVerticalMigSegonPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_COLS = Math.round(taula[0].length/2.00)-1;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (col >= M_COLS) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaHoritzontalMigPrimerPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(taula.length/2.00)-1;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila <= M_FILES) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaHoritzontalMigSegonPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(taula.length/2.00)-1;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila >= M_FILES) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaQuartsNOPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(taula.length/2.00)-1;
        final float M_COLS = Math.round(taula[0].length/2.00)-1;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila < M_FILES && col < M_COLS) {
                    taula[fila][col] = true;
                } else if (fila == M_FILES) {
                    taula[fila][col] = true;
                } else if (col == M_COLS) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaQuartsSOPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(taula.length/2.00)-1;
        final float M_COLS = Math.round(taula[0].length/2.00)-1;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila > M_FILES && col < M_COLS) {
                    taula[fila][col] = true;
                } else if (fila == M_FILES) {
                    taula[fila][col] = true;
                } else if (col == M_COLS) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaQuartsNEPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(taula.length/2.00)-1;
        final float M_COLS = Math.round(taula[0].length/2.00)-1;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila < M_FILES && col > M_COLS) {
                    taula[fila][col] = true;
                } else if (fila == M_FILES) {
                    taula[fila][col] = true;
                } else if (col == M_COLS) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaQuartsSEPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(taula.length/2.00)-1;
        final float M_COLS = Math.round(taula[0].length/2.00)-1;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila > M_FILES && col > M_COLS) {
                    taula[fila][col] = true;
                } else if (fila == M_FILES) {
                    taula[fila][col] = true;
                } else if (col == M_COLS) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaQuartsNOSEPlens(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(taula.length/2.00)-1;
        final float M_COLS = Math.round(taula[0].length/2.00)-1;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila <= M_FILES && col <= M_COLS) {
                    taula[fila][col] = true;
                } else if (fila >= M_FILES && col >= M_COLS) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaQuartsSONEPlens(boolean[][] taula) {  
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(taula.length/2.00)-1;
        final float M_COLS = Math.round(taula[0].length/2.00)-1;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila >= M_FILES && col <= M_COLS) {
                    taula[fila][col] = true;
                } else if (fila <= M_FILES && col >= M_COLS) {
                    taula[fila][col] = true;
                } else {
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaCreuNPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila == col) {
                    taula[fila][col] = true;
                } else if (fila <= col && col <= N_COLS-fila-1) {
                    taula[fila][col] = true;
                } else if (col == N_COLS-fila-1) {
                    taula[fila][col] = true;
                }
            }
        }
    }
    
    public static void inicialitzaCreuOPle(boolean[][] taula) {
        int N_FILES = taula.length;
        int N_COLS = taula[0].length;
        int M_FILES = (taula.length/2);
        
        if (N_FILES > N_COLS) {
            N_FILES = N_COLS;
        }
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (col+1 == N_COLS-fila) {
                    taula[fila][col] = true;
                } else if (fila <= M_FILES && col > fila) {
                    taula[fila][col] = false;
                } else if (fila >= M_FILES && col > fila) {
                    taula[fila][col] = false;
                } else if (fila < col && col+1 < N_COLS-fila) {
                    taula[fila][col] = false;
                } else if (fila >= col+1 && col+fila >= N_COLS) {
                    taula[fila][col] = false;
                } else {
                    taula[fila][col] = true;
                }
            }
        }
    }
    
    public static void inicialitzaCreuSPle(boolean[][] taula) {
        int N_FILES = taula.length;
        int N_COLS = taula[0].length;
        int M_FILES = (taula.length/2);
        int M_COLS = (taula[0].length/2);
        
        if (N_FILES > N_COLS) {
            N_FILES = N_COLS;
        }
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila == col) {
                    taula[fila][col] = true;
                } else if (fila >= col && col >= N_COLS-fila-1) {
                    taula[fila][col] = true;
                } else if (col == N_COLS-fila-1) {
                    taula[fila][col] = true;
                }
            }
        }
    }
    
    public static void inicialitzaCreuEPle(boolean[][] taula) {
        int N_FILES = taula.length;
        int N_COLS = taula[0].length;
        int M_FILES = (taula.length/2);
        int M_COLS = (taula[0].length/2);
        
        if (N_FILES > N_COLS) {
            N_FILES = N_COLS;
        }
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (col+1 == N_COLS-fila) {
                    taula[fila][col] = true;
                }else if (fila <= M_FILES && col < fila) {
                    taula[fila][col] = false;
                } else if (fila > M_FILES && col < fila) {
                    taula[fila][col] = false;
                } else if (fila < col && col+1 < N_COLS-fila) {
                    taula[fila][col] = false;
                } else if (fila >= col+1 && col+fila >= N_COLS) {
                    taula[fila][col] = false;
                } else {
                    taula[fila][col] = true;
                }
            }
        }
    }
    
    public static void inicialitzaCreuNSPlens(boolean[][] taula) {
        int N_FILES = taula.length;
        int N_COLS = taula[0].length;
        int M_FILES = (taula.length/2);
        int M_COLS = (taula[0].length/2);
        
        if (N_FILES > N_COLS) {
            N_FILES = N_COLS;
        }
        
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila == col) {
                    taula[fila][col] = true;
                } else if (fila <= col && col <= N_COLS-fila-1) {
                    taula[fila][col] = true;
                } else if (fila >= col && col >= N_COLS-fila-1) {
                    taula[fila][col] = true;
                } else if (col == N_COLS-fila-1) {
                    taula[fila][col] = true;
                }
            }
        }
    }
    
    public static void inicialitzaCreuOEPlens(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;

        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                if (fila < col && col+1 < N_COLS-fila) {
                    taula[fila][col] = false;
                } else if (fila >= col+1 && col+fila >= N_COLS) {
                    taula[fila][col] = false;
                } else {
                    taula[fila][col] = true;
                }
            }
        }
    }
    
    public static void inicialitzaFalse(boolean[][] taula) {
        for (int fila = 0; fila < taula.length; fila++) {
            for (int col = 0; col < taula[0].length; col++) {
                taula[fila][col] = false;
            }
        }
    }

    public static String taulaToString(int[][] taula) {
        String resultat = "";

        for (int fila = 0; fila < taula.length; fila++) {
            for (int col = 0; col < taula[0].length; col++) {
                resultat += String.format("%8d", taula[fila][col]);
            }
            resultat += String.format("%n");
        }
        return resultat;
    }
    
    public static String taulaToString(boolean[][] taula, char caracterTrue, char caracterFalse) {
        String resultat = "";

        for (int fila = 0; fila < taula.length; fila++) {
            for (int col = 0; col < taula[0].length; col++) {
                if (taula[fila][col] == true) {
                    resultat += String.format("%c", caracterTrue);  
                } else {
                    resultat += String.format("%c", caracterFalse); 
                }
            }
            resultat += String.format("%n");
        }

        return resultat;
    }
}
