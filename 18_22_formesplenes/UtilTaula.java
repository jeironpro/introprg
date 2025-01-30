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
    
    public static void inicialitzaSequencial(int[][] taula, int valorInicial) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Assignar-li el valor seqüencial a cada posició de l'array
                taula[fila][col] = valorInicial++;
            }
        }
    }
    
    public static void inicialitzaPrimeraDiagonal(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
         
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si fila és igual a col
                if (fila == col) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaVerticalMig(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_COLS = Math.round(N_COLS/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Math.round(float a): Torna el més proper inta l'argument, amb els lligams arrodonir fins a l'infinit positiu.
                // Si col és igual a la mitad arrodonida de la longitud de la columna menys 1
                if (col == M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaHoritzontalMig(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(N_FILES/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Math.round(float a): Torna el més proper inta l'argument, amb els lligams arrodonir fins a l'infinit positiu.
                // Si fila és igual a la mitad arrodonida de la longitud de la taula menys 1
                if (fila == M_FILES) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaQuarts(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(N_FILES/2.00)-1;
        final float M_COLS = Math.round(N_COLS/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Math.round(float a): Torna el més proper inta l'argument, amb els lligams arrodonir fins a l'infinit positiu.
                // Si fila és igual a la mitad arrodonida de la longitud de la taula menys 1
                if (fila == M_FILES) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si col és igual a la mitad arrodonida de la longitud de la columna menys 1
                } else if (col == M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaSegonaDiagonal(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la columna més 1 és igual a la longitud de la columna menys fila
                if (col+1 == N_COLS-fila) {
                    // Assignar-li true a la posició fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaCreu(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                
                // Si la columna és igual a la fila
                if (col == fila) {
                    // Assignar-li true a la posició fila, col
                    taula[fila][col] = true;
                // Del contrari, si la columna més 1 és igual a la longitud de la columna menys fila
                } else if (col+1 == N_COLS-fila) {
                    // Assignar-li true a la posició fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaPasVianants(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la fila és senar
                if (fila % 2 != 0) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaZebra(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la columna és senar
                if (col % 2 != 0) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaEscacs(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la fila és parell i la columna és senar
                if (fila % 2 == 0 && col % 2 != 0) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;      
                // Del contrari, si la fila és senar i la columna és parell         
                } else if (fila % 2 != 0 && col % 2 == 0) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true; 
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaPrimeraDiagonalPrimerPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la columna és menor o igual a fila
                if (col <= fila) {
                    // Assignar-li true a la posició fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaPrimeraDiagonalSegonPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la columna és menor o igual a fila
                if (col <= fila) {
                    // Assignar-li true a la posició col, fila
                    taula[col][fila] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Error (col, fila)
    
    public static void inicialitzaSegonaDiagonalPrimerPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la columna és menor a la longitud de la columna menys fila
                if (col < N_FILES-fila) {
                    // Assignar-li true a la posició fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaSegonaDiagonalSegonPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la fila és menor o igual a la longitud de la taula menys 1 i col més 1 és major o igual a la longitud de la taula menys fila
                if (fila <= N_FILES-1 && col+1 >= N_FILES-fila) {
                    // Assignar-li true a la posició fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaVerticalMigPrimerPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_COLS = Math.round(N_COLS/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la columna és menor o igual a la mitad arrodonida de la longitud de la columna menys 1
                if (col <= M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaVerticalMigSegonPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_COLS = Math.round(N_COLS/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la columna és major a la mitad arrodonida de la longitud de la columna menys 1
                if (col >= M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaHoritzontalMigPrimerPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(N_FILES/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la fila és menor o igual a la mitad arrodonida de la longitud de la taula menys 1
                if (fila <= M_FILES) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaHoritzontalMigSegonPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(N_FILES/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la fila és major o igual a la mitad arrodonida de la longitud de la taula menys 1
                if (fila >= M_FILES) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaQuartsNOPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(N_FILES/2.00)-1;
        final float M_COLS = Math.round(N_COLS/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la fila és menor a la mitad arrodonida de la longitud de la taula menys 1 i la columna és menor a la mitad arrodonida de la longitud de la columna menys 1
                if (fila < M_FILES && col < M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                    // Del contrari, si la fila és igual a la mitad arrodonida de la longitud de la taula menys 1
                } else if (fila == M_FILES) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                    // Del contrari, si la columna és igual a la mitad arrodonida de la longitud de la columna menys 1
                } else if (col == M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaQuartsSOPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(N_FILES/2.00)-1;
        final float M_COLS = Math.round(N_COLS/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la fila és major a la mitad arrodonida de la longitud de la taula menys 1 i la columna és menor a la mitad arrodonida de la longitud de la columna menys 1
                if (fila > M_FILES && col < M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si la fila és igual a la mitad arrodonida de la longitud de la taula menys 1
                } else if (fila == M_FILES) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si la columna és igual a la mitad arrodonida de la longitud de la columna menys 1
                } else if (col == M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaQuartsNEPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(N_FILES/2.00)-1;
        final float M_COLS = Math.round(N_COLS/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la fila és menor a la mitad arrodonida de la longitud de la taula menys 1 i la columna és major a la mitad arrodonida de la longitud de la columna menys 1
                if (fila < M_FILES && col > M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si la fila és igual a la mitad arrodonida de la longitud de la taula menys 1
                } else if (fila == M_FILES) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si la columna és igual a la mitad arrodonida de la longitud de la columna menys 1
                } else if (col == M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaQuartsSEPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(N_FILES/2.00)-1;
        final float M_COLS = Math.round(N_COLS/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la fila és major a la mitad arrodonida de la longitud de la taula menys 1 i la columna és major a la mitad arrodonida de la longitud de la columna menys 1
                if (fila > M_FILES && col > M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si la fila és igual a la mitad arrodonida de la longitud de la taula menys 1
                } else if (fila == M_FILES) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si la columna és igual a la mitad arrodonida de la longitud de la columna menys 1
                } else if (col == M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaQuartsNOSEPlens(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(N_FILES/2.00)-1;
        final float M_COLS = Math.round(N_COLS/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la fila és menor o igual a la mitad arrodonida de la longitud de la taula menys 1 i la columna és menor o igual a la mitad arrodonida de la longitud de la columna menys 1
                if (fila <= M_FILES && col <= M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si la fila és major o igual a la mitad arrodonida de la longitud de la taula menys 1 i la columna és major o igual a la mitad arrodonida de la longitud de la columna menys 1
                } else if (fila >= M_FILES && col >= M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaQuartsSONEPlens(boolean[][] taula) {  
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(N_FILES/2.00)-1;
        final float M_COLS = Math.round(N_COLS/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Si la fila és major o igual a la mitad arrodonida de la longitud de la taula menys 1 i la columna és menor o igual a la mitad arrodonida de la longitud de la columna menys 1
                if (fila >= M_FILES && col <= M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si la fila és menor o igual a la mitad arrodonida de la longitud de la taula menys 1 i la columna és major o igual a la mitad arrodonida de la longitud de la columna menys 1
                } else if (fila <= M_FILES && col >= M_COLS) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    // XXX Reestructurar les logiques dels procediments de CreuPle(ns)
    public static void inicialitzaCreuNPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(N_FILES/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Primera diagonal
                // Si la fila és igual a la columna
                if (fila == col) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Segona diagonal
                // Del contrari, si la columna més 1 és igual a la longitud de la columna menys fila
                } else if (col+1 == N_COLS-fila) {
                    // Assignar-li true a la posició fila, col
                    taula[fila][col] = true;
                // Llenado del quadrant nord
                // Del contrari, si la fila és menor a la mitad arrodonida de la longitud de la taula menys 1
                } else if (col > 0 && col < N_COLS-1 && fila < M_FILES) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaCreuOPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_COLS = Math.round(N_COLS/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Primera diagonal
                // Si la fila és igual a la columna
                if (fila == col) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Segona diagonal
                // Del contrari, si la columna més 1 és igual a la longitud de la columna menys fila
                } else if (col+1 == N_COLS-fila) {
                    // Assignar-li true a la posició fila, col
                    taula[fila][col] = true;
                // Llenado del quadrant oest
                // Del contrari, si la columna és menor a la mitad arrodonida de la longitud de la columna menys 1 
                } else if (col < M_COLS && fila-col > 0 && fila+col < N_FILES-1) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaCreuSPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(N_FILES/2.00)-1;
        final float M_COLS = Math.round(N_COLS/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Primera diagonal
                // Si la fila és igual a la columna
                if (fila == col) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Segona diagonal
                // Del contrari, si la columna més 1 és igual a la longitud de la columna menys fila
                } else if (col+1 == N_COLS-fila) {
                    // Assignar-li true a la posició fila, col
                    taula[fila][col] = true;
                // Llenado del quadrant sur
                // Del contrari, si la fila és menor a la longitud arrodonida de la taula menys 1
                } else if (fila > M_FILES && col+fila/2 > M_COLS && col <= fila) { 
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaCreuEPle(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(N_FILES/2.00)-1;
        final float M_COLS = Math.round(N_COLS/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Primera diagonal
                // Si la fila és igual a la columna
                if (fila == col) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Segona diagonal
                // Del contrari, si la columna més 1 és igual a la longitud de la columna menys fila
                } else if (col+1 == N_COLS-fila) {
                    // Assignar-li true a la posició fila, col
                    taula[fila][col] = true;
                // Llenado del quadrant est
                // Del contrari, si la columna és menor a la mitad arrodonida de la longitud de la columna menys 1
                } else if (col > M_COLS && fila+col/2 > M_FILES && fila <= col) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaCreuNSPlens(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(N_FILES/2.00)-1;
        final float M_COLS = Math.round(N_COLS/2.00)-1;
        
        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                // Primera diagonal
                // Si la fila és igual a la columna
                if (fila == col) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Segona diagonal
                // Del contrari, si la columna més 1 és igual a la longitud de la columna menys fila
                } else if (col+1 == N_COLS-fila) {
                    // Assignar-li true a la posició fila, col
                    taula[fila][col] = true;
                // Llenado del quadrant nord
                // Del contrari, si la fila és menor a la mitad arrodonida de la longitud de la taula menys 1
                } else if (fila < M_FILES && col-fila > 0 && col+fila < N_COLS-1) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Llenado del quadrant sur
                // Del contrari, si la fila és major a la mitad arrodonida de la longitud de la taula menys 1
                } else if (fila > M_FILES && col+fila/2 > M_COLS && col <= fila) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaCreuOEPlens(boolean[][] taula) {
        final int N_FILES = taula.length;
        final int N_COLS = taula[0].length;
        final float M_FILES = Math.round(N_FILES/2.00)-1;
        final float M_COLS = Math.round(N_COLS/2.00)-1;

        // Fer un for per iterar les files
        for (int fila = 0; fila < N_FILES; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < N_COLS; col++) {
                if (fila <= M_FILES && col <= fila) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                } else if (fila >= M_FILES && col >= fila) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                }

                if (fila < M_FILES && col+1 >= N_COLS-fila) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                } else if (fila > M_FILES && col+1 <= N_COLS-fila) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                }
            }
        }
    } // Correcte
    
    public static void inicialitzaFalse(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Assignar-li false a totes les posicions de fila, col
                taula[fila][col] = false;
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
    
    public static String taulaToString(boolean[][] taula, char caracterTrue, char caracterFalse) {
        // Declarar e inicialitzar el String resultat buit
        String resultat = "";

        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si en la posició de fila, col el boolean és true
                if (taula[fila][col] == true) {
                    // Guardar en resultat caracterTrue
                    resultat += String.format("%c", caracterTrue);  
                // Del contrari              
                } else {
                    // Guardar en resultat caracterFalse
                    resultat += String.format("%c", caracterFalse); 
                }
            }
            // Guardar en resultat un salt de línia en cada iteració de fila
            resultat += String.format("%n");
        }

        // Retornar el resultat
        return resultat;
    }
}