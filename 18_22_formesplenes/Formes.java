/*
* programa que rep per línia de comanda especificacions de taules (amb formes plenes) i les dibuixa.
*
* Les especificacions permesa són:
*   - \: primera diagonal
*   - |: vertical al mig
*   - -: horitzontal al mig
*   - +: quarts
*   - /: segona diagonal
*   - x: creu
*   - =: pas de vianants
*   - ||: zebra
*   - ++: taulell d'escacs
*   - ?: taula buida
*
*   Formes plenes
*   - *\: primera diagonal amb primer triangle ple
*   - \*: primera diagonal amb segon triangle ple
*   - *\/: segona diagonal amb primer triangle ple
*   - /*: segona diagonal amb segon triangle ple
*   - *|: vertical al mig amb primer costat ple
*   - |*: vertical al mig amb segon costat ple
*   - *-: horitzontal al mig amb primer costat ple
*   - -*: horitzontal al mig amb segon costat ple
*   - *+: quarts amb quadrant nord-oest ple
*   - **+: quarts amb quadrant sud-oest ple
*   - +*: quarts amb quadrant nord-est ple
*   - +**: quarts amb quadrant sud-est ple
*   - *+**: quarts amb quadrant nord-oest i sud-est plens
*   - **+*: quarts amb quadrant sud-oest i nord-est plens
*   - *x: creu amb quadrant nord ple
*   - **x: creu amb quadrant oest ple
*   - x*: creu amb quadrant est ple
*   - x**: creu amb quadrant est ple
*   - *x*: creu amb quadrants nord i sud plens
*   - **x**: creu amb quadrants oest i est plens
*
* Exemple per cada especificació:
*   Especificacions
*   - 5x6\ -> primera diagonal
*   - 4x4| -> vertical al mig
*   - 7x5- -> horizontal al mig
*   - 5x5+ -> quarts
*   - 7x7/ -> segona diagonal
*   - 3x5x -> creu
*   - 7x4= -> pas de vianants
*   - 4x7|| -> zebra
*   - 8x8++ -> taulell d'escacs
*   - 2x3?: taula buida
*
*   Formes plenes
*   - *\ -> primera diagonal amb primer triangle ple
*   - \* -> primera diagonal amb segon triangle ple
*   - *\/ -> segona diagonal amb primer triangle ple
*   - /* -> segona diagonal amb segon triangle ple
*   - *| -> vertical al mig amb primer costat ple
*   - |* -> vertical al mig amb segon costat ple
*   - *- -> horitzontal al mig amb primer costat ple
*   - -* -> horitzontal al mig amb segon costat ple
*   - *+ -> quarts amb quadrant nord-oest ple
*   - **+ -> quarts amb quadrant sud-oest ple
*   - +* -> quarts amb quadrant nord-est ple
*   - +** -> quarts amb quadrant sud-est ple
*   - *+** -> quarts amb quadrant nord-oest i sud-est plens
*   - **+* -> quarts amb quadrant sud-oest i nord-est plens
*   - *x -> creu amb quadrant nord ple
*   - **x -> creu amb quadrant oest ple
*   - x* -> creu amb quadrant est ple
*   - x** -> creu amb quadrant est ple
*   - *x* -> creu amb quadrants nord i sud plens
*   - **x** -> creu amb quadrants oest i est plens
*
* Si s'introduiex cap de les especificacions anteriors, mostrar un missatge d'error.
*/

public class Formes {
    public static void main(String[] args){
        // Fer un for per iterar els arguments
        for (int i = 0; i < args.length; i++) {
            // Mostrar cada argument introduït
            System.out.println(args[i]);
            // Declarar e inicialitzar el int files amb la funcio obteFiles i passar-li el argument en la posició de i
            int files = obteFiles(args[i]);
            // Declarar e inicialitzar el int columnes amb la funcio obteColumnes i passar-li el argument en la posició de i
            int columnes = obteColumnes(args[i]);
            
            // Si les files o columnes són menor a 0
            if (files < 1 || columnes < 1) {
                // Mostrar aquest missatge d'error
                System.out.println("Especificació no vàlida");
            // Del contrari
            } else {
                // Declarar e inicialitzar l'array bidemensional a dimension obtingudes de files x columnes
                boolean[][] taula = new boolean[files][columnes];
                
                // Declarar e inicialitzar el String valorPerEspecificacio buit
                String valorPerEspecificacio = "";
                // Declarar e inicialitzar el String especificacio buit
                String especificacio = "";
                
                // Fer un for decreixent per iterar l'argument en la posició de i
                for (int j = args[i].length()-1; j >= 0; j--) {
                    // Agafar el caràcter de args[i] en la posicio de j
                    char c = args[i].charAt(j);
                    
                    // Si el caràcter no és un dígit ni un espai
                    if (!Character.isDigit(c) && !Character.isWhitespace(c)) {
                        // Guardar el caràcter en valorPerEspecificacio
                        valorPerEspecificacio += c;
                    // del contrari
                    } else {
                        // Aturar el bucle
                        break;
                    }
                }
                
                // Fer un for decreixent per iterar valorPerEspecificacio
                for (int j = valorPerEspecificacio.length()-1; j >= 0; j--) {
                    // Guardar els caràcter en especificacio
                    especificacio += valorPerEspecificacio.charAt(j);
                }
                
                // Fer un switch per especificacio
                switch (especificacio) {
                    // Caràcter per cridar inicialitzaPrimeraDiagonal
                    case "\\": UtilTaula.inicialitzaPrimeraDiagonal(taula);
                        break;
                    // Caràcter per cridar inicialitzaVerticalMig
                    case "|": UtilTaula.inicialitzaVerticalMig(taula);
                        break;
                    // Caràcter per cridar inicialitzaHoritzontalMig
                    case "-": UtilTaula.inicialitzaHoritzontalMig(taula);
                        break;
                    // Caràcter per cridar inicialitzaQuarts
                    case "+": UtilTaula.inicialitzaQuarts(taula);
                        break;
                    // Caràcter per cridar inicialitzaSegonaDiagonal
                    case "/": UtilTaula.inicialitzaSegonaDiagonal(taula);
                        break;
                    // Caràcter per cridar inicialitzaCreu
                    case "x": UtilTaula.inicialitzaCreu(taula);
                        break; 
                    // Caràcter per cridar inicialitzaPasVianants
                    case "=": UtilTaula.inicialitzaPasVianants(taula);
                        break;
                    // Caràcters per cridar inicialitzaZebra
                    case "||": UtilTaula.inicialitzaZebra(taula);
                        break;
                    // Caràcters per cridar inicialitzaEscacs
                    case "++": UtilTaula.inicialitzaEscacs(taula);
                        break;
                    // Caràcters per cridar inicialitzaPrimeraDiagonalPrimerPle
                    case "*\\": UtilTaula.inicialitzaPrimeraDiagonalPrimerPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaPrimeraDiagonalSegonPle
                    case "\\*": UtilTaula.inicialitzaPrimeraDiagonalSegonPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaSegonaaDiagonalPrimerPle
                    case "*/": UtilTaula.inicialitzaSegonaDiagonalPrimerPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaSegonaDiagonalSegonPle
                    case "/*": UtilTaula.inicialitzaSegonaDiagonalSegonPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaVerticalMigPrimerPle
                    case "*|": UtilTaula.inicialitzaVerticalMigPrimerPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaVerticalMigSegonPle
                    case "|*": UtilTaula.inicialitzaVerticalMigSegonPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaHoritzontalMigPrimerPle
                    case "*-": UtilTaula.inicialitzaHoritzontalMigPrimerPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaHoritzontalMigSegonPle
                    case "-*": UtilTaula.inicialitzaHoritzontalMigSegonPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaQuartsNOPle
                    case "*+": UtilTaula.inicialitzaQuartsNOPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaQuartsSOPle
                    case "**+": UtilTaula.inicialitzaQuartsSOPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaQuartsNEPle
                    case "+*": UtilTaula.inicialitzaQuartsNEPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaQuartsSEPle
                    case "+**": UtilTaula.inicialitzaQuartsSEPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaQuartsNOSEPlens
                    case "*+**": UtilTaula.inicialitzaQuartsNOSEPlens(taula);
                        break;
                    // Caràcters per cridar inicialitzaQuartsSONEPlens
                    case "**+*": UtilTaula.inicialitzaQuartsSONEPlens(taula);
                        break;
                    // Caràcters per cridar inicialitzaCreuNPle
                    case "*x": UtilTaula.inicialitzaCreuNPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaCreuOPle
                    case "**x": UtilTaula.inicialitzaCreuOPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaCreuSPle
                    case "x*": UtilTaula.inicialitzaCreuSPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaCreuEPle
                    case "x**": UtilTaula.inicialitzaCreuEPle(taula);
                        break;
                    // Caràcters per cridar inicialitzaCreuNSPlens
                    case "*x*": UtilTaula.inicialitzaCreuNSPlens(taula);
                        break;
                    // Caràcters per cridar inicialitzaCreuOEPlens
                    case "**x**": UtilTaula.inicialitzaCreuOEPlens(taula);
                        break;
                    // Per defecte cridar inicialitzaFalse
                    default: UtilTaula.inicialitzaFalse(taula);
                }
                // Declarar e inicialitzar el String resultat amb la funció taulaToString
                String resultat = UtilTaula.taulaToString(taula, 'X', '·');
                // Mostrar la taula cridat a especificacio convertida a String
                System.out.println(resultat);
            }
        }
    }

    public static int obteFiles(String especificacio) {
        /* Aquesta funció espera l'especificació de la forma d'una taula.
         * En cas que l'especificació sigui correcta, retornarà l'enter
         * corresponent als primers dígits. Per exemple, si especificacio
         * és "12x5", retornarà 12.
         * Altrament, retornarà el valor -1.  */
         
        String files = "";   
        for (int i = 0; i < especificacio.length(); i++) {
            char c = especificacio.charAt(i);
            if (Character.isDigit(c)) {          
                files += c;
            } else {
                break;
            }
        }
        if (!files.isEmpty()) {
            if (Integer.parseInt(files) >= 1 && Integer.parseInt(files) <= 99) {
                return Integer.parseInt(files);            
            }
        }
        return -1;
    }

    public static int obteColumnes(String especificacio) {
        /* Aquesta funció espera l'especificació de la forma d'una taula.
         * En cas que l'especificació sigui correcta, retornarà l'enter
         * corresponent als segons dígits. Per exemple, si especificacio
         * és "12x5", retornarà 5.
         * Altrament, retornarà el valor -1.  */
        
        String columnes = "";
        for (int i = 0; i < especificacio.length(); i++) {
            char c = especificacio.charAt(i);
            if (c == 'x') {
                for (int j = i+1; j < especificacio.length(); j++) {
                    char ch = especificacio.charAt(j);
                    if (Character.isDigit(ch)) {
                        columnes += ch;
                    }
                }
            }
            if (columnes.length() > 2) {
                columnes = columnes.substring(0, 2);
                break;
            }
        }
        if (!columnes.isEmpty()) {
            if (Integer.parseInt(columnes) >= 1 && Integer.parseInt(columnes) <= 99) {
                return Integer.parseInt(columnes);            
            }
        }
        return -1;        
    }
}
