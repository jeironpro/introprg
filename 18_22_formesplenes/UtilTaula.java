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
* Un procediment
*
* Un procediment
*
* Un procediment
*
* Un procediment
*
* Un procediment
*z
* Un procediment
*
* Un procediment
*
* Un procediment
*
* Un procediment
*
* Un procediment
*
* Un procediment
*
* Un procediment
*
* Un procediment
*
* Un procediment
*
* Un procediment
*
* Un procediment
*
* Un procediment
*
* Un procediment
*
* Un procediment
*
* Un procediment
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
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si fila és igual a col
                if (fila == col) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posicio de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaVerticalMig(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Math.round(float a): Torna el més proper inta l'argument, amb els lligams arrodonir fins a l'infinit positiu.
                // Si col és igual a la mitad redondeada del nombre de columnes menys 1
                if (col == Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaHoritzontalMig(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Math.round(float a): Torna el més proper inta l'argument, amb els lligams arrodonir fins a l'infinit positiu.
                // Si fila és igual a la mitad redondeada del nombre de columnes menys 1
                if (fila == Math.round(taula.length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaQuarts(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Math.round(float a): Torna el més proper inta l'argument, amb els lligams arrodonir fins a l'infinit positiu.
                // Si fila és igual a la mitad redondeada del nombre de columnes menys 1
                if (fila == Math.round(taula.length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si col és igual a la mitad redondeada del nombre de columnes menys 1
                } else if (col == Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaSegonaDiagonal(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Totes les posicions en false
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Assignar-li false a la posició de fila, col
                taula[fila][col] = false;
            }
            // Segona diagonal
            // Declarar e inicialitzar el int indexSegDia amb la longitud de les columnes -1 -fila
            int indexSegDia = taula[fila].length -1 -fila;
            // Si l'index és major a 0 i menor a la longitud de les columnes de la taula
            if (indexSegDia >= 0 && indexSegDia < taula[fila].length) {
                // Assignar-li true a posició de fila, indexSegDia
                taula[fila][indexSegDia] = true;
            }
        }
    }
    
    public static void inicialitzaCreu(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Primera diagonal
                // Si fila és igual a col
                if (fila == col) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Del contrari, resta de posicions
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
            // Segona diagonal
            // Declarar e inicialitzar el int indexSegDia amb la longitud de les columnes -1 -fila
            int indexSegDia = taula[fila].length -1 -fila;
            // Assignar-li true a posició de fila, indexSegDia
            taula[fila][indexSegDia] = true;
        }
    }
    
    public static void inicialitzaPasVianants(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
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
    }
    
    public static void inicialitzaZebra(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si la fila és senar
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
    }
    
    public static void inicialitzaEscacs(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si fila és parell i col és senar
                if (fila % 2 == 0 && col % 2 != 0) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;      
                // Del contrari, si fila és senar i col és parell         
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
    }
    
    public static void inicialitzaPrimeraDiagonalPrimerPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si la col és menor o igual a la fila
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
    }
    
    public static void inicialitzaPrimeraDiagonalSegonPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si la col és menor o igual a la fila
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
    }
    
    public static void inicialitzaSegonaDiagonalPrimerPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si col es menor a la longitud de la col -fila
                if (col < taula[0].length-fila) {
                    // Assignar-li true a la posició fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaSegonaDiagonalSegonPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si la fila és menor o igual a la longitud de la taula -1 i col +1 és major o igual a la longitud de la taula -fila
                if (fila <= taula.length-1 && col+1 >= taula.length-fila) {
                    // Assignar-li true a la posició fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaVerticalMigPrimerPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si la col és menor o igual a la mitad redondeada de la longitud de la col -1
                if (col <= Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaVerticalMigSegonPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si col és major o igual a la mitad redondeada de la longitud de la col -1
                if (col >= Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaHoritzontalMigPrimerPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si fila és menor o igual a la mitad redondeada de la longitud de la taula -1
                if (fila <= Math.round(taula.length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaHoritzontalMigSegonPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si fila és major o igual a la mitad redondeada de la longitud de la taula -1
                if (fila >= Math.round(taula.length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaQuartsNOPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si fila és menor a la mitad redondeada de la longitud de la taula -1 i col és menor a la mitad redondeada de la longitud de la col -1
                if (fila < Math.round(taula.length/2.00)-1 && col < Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si fila és igual a la mitad redondeada de la longitud de la taula -1
                } else if (fila == Math.round(taula.length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si col és igual a la mitad redondeada de la longitud de la col -1
                } else if (col == Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaQuartsSOPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si fila és major a la mitad redondeada de la longitud de la taula -1 i  col és menor a la mitad redondeada de la longitud de la col -1
                if (fila > Math.round(taula.length/2.00)-1 && col < Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si fila és igual a la mitad redondeada de la longitud de la taula -1
                } else if (fila == Math.round(taula.length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si col és igual a la mitad redondeada de la longitud de la col -1
                } else if (col == Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaQuartsNEPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si fila és menor a la mitad redondeada de la longitud de la taula -1 i col és major a la mitad redondeada de la longitud de la col -1
                if (fila < Math.round(taula.length/2.00)-1 && col > Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si fila és igual a la mitad redondeada de la longitud de la taula -1
                } else if (fila == Math.round(taula.length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si col és igual a la mitad redondeada de la longitud de la col -1
                } else if (col == Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaQuartsSEPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si fila és major a la mitad redondeada de la longitud de la taula -1 i col és major a la mitad redondeada de la longitud de la col -1
                if (fila > Math.round(taula.length/2.00)-1 && col > Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si fila és igual a la mitad redondeada de la longitud de la taula -1
                } else if (fila == Math.round(taula.length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si col és igual a la mitad redondeada de la longitud de la col -1
                } else if (col == Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaQuartsNOSEPlens(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si fila és menor o igual a la mitad redondeada de la longitud de la taula -1 i col és menor o igual a la mitad redondeada de la longitud de la col -1
                if (fila <= Math.round(taula.length/2.00)-1 && col <= Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si fila és major o igual a la mitad redondeada de la longitud de la taula -1 i col és major o igual a la mitad redondeada de la longitud de la col -1
                } else if (fila >= Math.round(taula.length/2.00)-1 && col >= Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaQuartsSONEPlens(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Si fila és major o igual a la mitad redondeada de la longitud de la taula -1 i col és menor o igual a la mitad redondeada de la longitud de la col -1
                if (fila >= Math.round(taula.length/2.00)-1 && col <= Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari, si fila és menor o igual a la mitad redondeada de la longitud de la taula -1 i col és major o igual a la mitad redondeada de la longitud de la col -1
                } else if (fila <= Math.round(taula.length/2.00)-1 && col >= Math.round(taula[0].length/2.00)-1) {
                    // Assignar-li true a la posició de fila, col
                    taula[fila][col] = true;
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
        }
    }
    
    public static void inicialitzaCreuNPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Primera diagonal
                // Si fila és igual a col
                if (fila == col) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Llenado del quadrant nord
                // Del contrari, si fila és menor a la mitad redondeada de la longitud de la taula -1
                } else if (fila < Math.round(taula.length/2.00)-1 ) {
                    // Si col-fila és major a 0 i col+fila és menor a la longitud de la col -1
                    if (col-fila > 0 && col+fila < taula[0].length-1) {
                        // Assignar-li true a la posicio de fila, col
                        taula[fila][col] = true;
                    }
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
            // Segona diagonal
            // Declarar e inicialitzar el int indexSegDia amb la longitud de les columnes -1 -fila
            int indexSegDia = taula[fila].length -1 -fila;
            // Assignar-li true a posició de fila, indexSegDia
            taula[fila][indexSegDia] = true;
        }
    }
    
    public static void inicialitzaCreuOPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Primera diagonal
                // Si fila és igual a col
                if (fila == col) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Llenado del quadrant oest
                // Del contrari, si col és menor a la mitad redondeada de la longitud de la col -1 
                } else if (col < Math.round(taula[0].length/2.00)-1 ) {
                    // Si fila-col és major o igual a 0 i fila+col és menor a la longitud de la taula -1
                    if (fila-col >= 0 && fila+col < taula.length-1) {
                        // Assignar-li true a la posicio de fila, col
                        taula[fila][col] = true;
                    }
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
            // Segona diagonal
            // Declarar e inicialitzar el int indexSegDia amb la longitud de les columnes -1 -fila
            int indexSegDia = taula[fila].length -1 -fila;
            // Assignar-li true a posició de fila, indexSegDia
            taula[fila][indexSegDia] = true;
        }
    }
    
    public static void inicialitzaCreuSPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Primera diagonal
                // Si fila és igual a col
                if (fila == col) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Llenado del quadrant sur
                // Del contrari, si la fila és menor a la longitud redondeada de la taula -1
                } else if (fila > Math.round(taula.length/2.00)-1) {
                    // Si col+fila divit entre 2 és major a la mitad redondeada de la longitud de la col -1 i col és menor o igual a fila
                    if (col+fila/2 > Math.round(taula[0].length/2.00)-1 && col <= fila) {   
                        // Assignar-li true a la posicio de fila, col
                        taula[fila][col] = true;
                    }
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
            // Segona diagonal
            // Declarar e inicialitzar el int indexSegDia amb la longitud de les columnes -1 -fila
            int indexSegDia = taula[fila].length -1 -fila;
            // Assignar-li true a posició de fila, indexSegDia
            taula[fila][indexSegDia] = true;
        }
    }
    
    public static void inicialitzaCreuEPle(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Primera diagonal
                // Si fila és igual a col
                if (fila == col) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Llenado del quadrant est
                // Del contrari, si col és menor a la mitad redondeada de la longitud de la col -1
                } else if (col > Math.round(taula[0].length/2.00)-1 ) {
                    // Si fila+col divit entre 2 és major a la mitad redondeada de la longitud de la taula -1 i fila és menor o igual a la col
                    if (fila+col/2 > Math.round(taula.length/2.00)-1 && fila <= col) {
                        // Assignar-li true a la posicio de fila, col
                        taula[fila][col] = true;
                    }
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
            // Segona diagonal
            // Declarar e inicialitzar el int indexSegDia amb la longitud de les columnes -1 -fila
            int indexSegDia = taula[fila].length -1 -fila;
            // Assignar-li true a posició de fila, indexSegDia
            taula[fila][indexSegDia] = true;
        }
    }
    
    public static void inicialitzaCreuNSPlens(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Primera diagonal
                // Si fila és igual a col
                if (fila == col) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Llenado del quadrant nord
                // Del contrari, si fila és major a la mitad redondeada de la longitud de la taula -1
                } else if (fila < Math.round(taula.length/2.00)-1 ) {
                    // Si col-fila és major a 0 i col+fila és menor a la longitud de la taula -1
                    if (col-fila > 0 && col+fila < taula[0].length-1) {
                        // Assignar-li true a la posicio de fila, col
                        taula[fila][col] = true;
                    }
                // Llenado del quadrant sur
                // Del contrari, si la fila és major a la mitad redondeada de la longitud de la taula -1
                } else if (fila > Math.round(taula.length/2.00)-1) {
                    // Si col+fila divit entre 2 és major a la mitad redondeada de la longitud de la col -1 i col és menor o igual a la fila
                    if (col+fila/2 > Math.round(taula[0].length/2.00)-1 && col <= fila) {
                        // Assignar-li true a la posicio de fila, col
                        taula[fila][col] = true;
                    }
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
            // Segona diagonal
            // Declarar e inicialitzar el int indexSegDia amb la longitud de les columnes -1 -fila
            int indexSegDia = taula[fila].length -1 -fila;
            // Assignar-li true a posició de fila, indexSegDia
            taula[fila][indexSegDia] = true;
        }
    }
    
    public static void inicialitzaCreuOEPlens(boolean[][] taula) {
        // Fer un for per iterar les files
        for (int fila = 0; fila < taula.length; fila++) {
            // Fer un for per iterar les columnes
            for (int col = 0; col < taula[0].length; col++) {
                // Primera diagonal
                // Si fila és igual a col
                if (fila == col) {
                    // Assignar-li true a la posicio de fila, col
                    taula[fila][col] = true;
                // Llenado del quadrant oest
                // Del contrari, si col és menor a la mitad redondeada de la longitud de la col -1
                } else if (col < Math.round(taula[0].length/2.00)-1 ) {
                    // Si fila-col és major a 0 i fila+col és menor a la longitud de la taula -1
                    if (fila-col >= 0 && fila+col < taula.length-1) {
                        // Assignar-li true a la posicio de fila, col
                        taula[fila][col] = true;
                    }
                // Llenado del quadrant est
                // Del contrari, si col és major a la mitad redondeada de la longitud de la col -1
                } else if (col > Math.round(taula[0].length/2.00)-1 ) {
                    // Si fila+col divit entre 2 és major a la mitad redondeada de la longitud de la taula -1 i fila és menor o igual a col
                    if (fila+col/2 > Math.round(taula.length/2.00)-1 && fila <= col) {
                        // Assignar-li true a la posicio de fila, col
                        taula[fila][col] = true;
                    }
                // Del contrari
                } else {
                    // Assignar-li false a la posició de fila, col
                    taula[fila][col] = false;
                }
            }
            // Segona diagonal
            // Declarar e inicialitzar el int indexSegDia amb la longitud de les columnes -1 -fila
            int indexSegDia = taula[fila].length -1 -fila;
            // Assignar-li true a posició de fila, indexSegDia
            taula[fila][indexSegDia] = true;
        }
    }
    
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
