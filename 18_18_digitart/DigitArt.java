/* 
* Programa que té una representació per cada dígit des del 0 fins al 9 ambdós inclòs i 
* llegeix els arguments introduïts per la línia d'ordres per mostrar aquesta representació
* substituint el caràcter per defecte que representa el nombre per el mateix nombre.
*/

public class DigitArt {
    // Representació del número 0 en la taula
    public static char[][] construeix0() {
        return new char[][] {
            {'·', '·', '·', '·', '·'},
            {'·', 'X', 'X', 'X', '·'},
            {'·', 'X', '·', 'X', '·'},
            {'·', 'X', '·', 'X', '·'},
            {'·', 'X', '·', 'X', '·'},
            {'·', 'X', 'X', 'X', '·'},
            {'·', '·', '·', '·', '·'}
        };
    }
    
    // Representació del número 1 en la taula
    public static char[][] construeix1() {
        return new char[][] {
            {'·', '·', '·', '·', '·'},
            {'·', 'X', 'X', '·', '·'},
            {'·', '·', 'X', '·', '·'},
            {'·', '·', 'X', '·', '·'},
            {'·', '·', 'X', '·', '·'},
            {'·', 'X', 'X', 'X', '·'},
            {'·', '·', '·', '·', '·'}
        };
    }
    
    // Representació del número 2 en la taula
    public static char[][] construeix2() {
        return new char[][] {
             {'·', '·', '·', '·', '·', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', '·', '·', '·', 'X', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', 'X', '·', '·', '·', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', '·', '·', '·', '·', '·'},
        };
    }
    
    // Representació del número 3 en la taula
    public static char[][] construeix3() {
        return new char[][] {
             {'·', '·', '·', '·', '·', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', '·', '·', '·', 'X', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', '·', '·', '·', 'X', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', '·', '·', '·', '·', '·'},
        };
    }
    
    // Representació del número 4 en la taula
    public static char[][] construeix4() {
        return new char[][] {
             {'·', '·', '·', '·', '·', '·'},
             {'·', 'X', '·', '·', 'X', '·'},
             {'·', 'X', '·', '·', 'X', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', '·', '·', '·', 'X', '·'},
             {'·', '·', '·', '·', 'X', '·'},
             {'·', '·', '·', '·', '·', '·'},
        };
    }
    
    // Representació del número 5 en la taula
    public static char[][] construeix5() {
        return new char[][] {
             {'·', '·', '·', '·', '·', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', 'X', '·', '·', '·', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', '·', '·', '·', 'X', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', '·', '·', '·', '·', '·'},
        };
    }
    
    // Representació del número 6 en la taula
    public static char[][] construeix6() {
        return new char[][] {
             {'·', '·', '·', '·', '·', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', 'X', '·', '·', '·', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', 'X', '·', '·', 'X', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', '·', '·', '·', '·', '·'},
        };
    }
    
    // Representació del número 7 en la taula
    public static char[][] construeix7() {
        return new char[][] {
             {'·', '·', '·', '·', '·', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', '·', '·', '·', 'X', '·'},
             {'·', '·', '·', '·', 'X', '·'},
             {'·', '·', '·', '·', 'X', '·'},
             {'·', '·', '·', '·', 'X', '·'},
             {'·', '·', '·', '·', '·', '·'},
        };
    }
    
    // Representació del número 8 en la taula
    public static char[][] construeix8() {
        return new char[][] {
             {'·', '·', '·', '·', '·', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', 'X', '·', '·', 'X', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', 'X', '·', '·', 'X', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', '·', '·', '·', '·', '·'},
        };
    }
    
    // Representació del número 9 en la taula
    public static char[][] construeix9() {
        return new char[][] {
             {'·', '·', '·', '·', '·', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', 'X', '·', '·', 'X', '·'},
             {'·', 'X', 'X', 'X', 'X', '·'},
             {'·', '·', '·', '·', 'X', '·'},
             {'·', '·', '·', '·', 'X', '·'},
             {'·', '·', '·', '·', '·', '·'},
        };
    }

    public static void mostraResultat(char[][] origen, char[][] resultat) {
        // Fer un for per iterar les files de l'array origen
        for (int fila = 0; fila < origen.length; fila++) {
            // Fer un for per iterar les columnes de l'array origen
            for (int colO = 0; colO < origen[0].length; colO++) {
                // Mostrar l'array origen
                System.out.print(origen[fila][colO]);
            }
            // Mostrar el separador en cada iteració de fila
            System.out.print(" -> ");
            
            // Fer un for per iterar les columnes de l'array resultat
            for (int colR = 0; colR < resultat[0].length; colR++) {
                // Mostrar per cada iteració de fila de l'array origen les files i columnes de resultat
                System.out.print(resultat[fila][colR]);            
            }
            // Fer un salt de línia per cada iteració de fila
            System.out.println();
        }
        
    }

    public static void processaCaracter(char ch) {
        // Declarar l'array bidimensional origen
        char[][] origen;
        
        // Fer un switch pel char ch
        switch (ch) {
            // Si el caràcter és el número 1, agafar la representació del 0 en una taula
            case '0': origen = construeix0();
                break;
            // Si el caràcter és el número 1, agafar la representació de l'1 en una taula
            case '1': origen = construeix1();
                break;
            // Si el caràcter és el número 2, agafar la representació de 2 en una taula
            case '2': origen = construeix2();
                break;
            // Si el caràcter és el número 3, agafar la representació de 3 en una taula
            case '3': origen = construeix3();
                break;
            // Si el caràcter és el número 4, agafar la representació de 4 en una taula
            case '4': origen = construeix4();
                break;
            // Si el caràcter és el número 5, agafar la representació de 5 en una taula
            case '5': origen = construeix5();
                break;
            // Si el caràcter és el número 6, agafar la representació de 6 en una taula
            case '6': origen = construeix6();
                break;
            // Si el caràcter és el número 7, agafar la representació de 7 en una taula
            case '7': origen = construeix7();
                break;
            // Si el caràcter és el número 8, agafar la representació de 8 en una taula
            case '8': origen = construeix8();
                break;
            // Si el caràcter és el número 9, agafar la representació de 9 en una taula
            case '9': origen = construeix9();
                break;
            default: return;    // no conec aquest caràcter
        }
        
        // Declarar e inicialitzar l'array bidimensional desti amb la funció que substitueix el char X pel nombre indicat
        char[][] desti = UtilTaula.substitueix(origen, 'X', ch);
        // Cridar mostraResultat i passar-li l'array de origen i desti
        mostraResultat(origen, desti);
        // Fer un salt de línia quan es mostri el resultat
        System.out.println();
    }

    public static void processaArgument(String arg) {
        // Fer un for per iterar arg
        for (int i = 0; i < arg.length(); i++) {
            // Agafar el caràcter de arg en la posició de i
            char c = arg.charAt(i);
            // Si el caràcter és un dígit
            if (Character.isDigit(c)) {
                // Converteix el caràcter i verificar si esta en el rang de 0 fins a 9 ambdos inclós
                if (Integer.parseInt("" + c) >= 0 && Integer.parseInt("" + c) <= 9) {
                    // Cridar processaCaracter i passar-li el caràcter
                    processaCaracter(c);
                }
            }
        }
    }

    public static void main(String[] args){
        // Verificar si hi ha almenys un argument
        if (args.length > 0) {
            // Fer un for per iterar tots els arguments
            for (int i = 0; i < args.length; i++) {
                // Cridar processaArgument i passar-li cada args
                processaArgument(args[i]);
            }
        }
    }
}
