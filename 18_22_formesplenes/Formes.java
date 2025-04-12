/*
 * Programa que rep per línia de comanda especificacions de taules i les dibuixa.
 */

public class Formes {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            int files = obteFiles(args[i]);
            int columnes = obteColumnes(args[i]);
            
            if (files < 1 || columnes < 1) {
                System.out.println("Especificació no vàlida");
            } else {
                boolean[][] taula = new boolean[files][columnes];
                String especificacioTmp = "";
                String especificacio = "";
                String especificacions = args[i];
                
                for (int j = especificacions.length()-1; j >= 0; j--) {
                    char c = especificacions.charAt(j);
                    if (!Character.isDigit(c)) {
                        especificacioTmp += c;
                    } else {
                        break;
                    }
                }
                
                for (int j = especificacioTmp.length()-1; j >= 0; j--) {
                    char c = especificacioTmp.charAt(j);
                    if (!Character.isDigit(c)) {
                        especificacio += c;
                    }
                }
                
                switch (especificacio) {
                    case "\\": UtilTaula.inicialitzaPrimeraDiagonal(taula);
                        break;
                    case "|": UtilTaula.inicialitzaVerticalMig(taula);
                        break;
                    case "-": UtilTaula.inicialitzaHoritzontalMig(taula);
                        break;
                    case "+": UtilTaula.inicialitzaQuarts(taula);
                        break;
                    case "/": UtilTaula.inicialitzaSegonaDiagonal(taula);
                        break;
                    case "x": UtilTaula.inicialitzaCreu(taula);
                        break; 
                    case "=": UtilTaula.inicialitzaPasVianants(taula);
                        break;
                    case "||": UtilTaula.inicialitzaZebra(taula);
                        break;
                    case "++": UtilTaula.inicialitzaEscacs(taula);
                        break;
                    case "*\\": UtilTaula.inicialitzaPrimeraDiagonalPrimerPle(taula);
                        break;
                    case "\\*": UtilTaula.inicialitzaPrimeraDiagonalSegonPle(taula);
                        break;
                    case "*/": UtilTaula.inicialitzaSegonaDiagonalPrimerPle(taula);
                        break;
                    case "/*": UtilTaula.inicialitzaSegonaDiagonalSegonPle(taula);
                        break;
                    case "*|": UtilTaula.inicialitzaVerticalMigPrimerPle(taula);
                        break;
                    case "|*": UtilTaula.inicialitzaVerticalMigSegonPle(taula);
                        break;
                    case "*-": UtilTaula.inicialitzaHoritzontalMigPrimerPle(taula);
                        break;
                    case "-*": UtilTaula.inicialitzaHoritzontalMigSegonPle(taula);
                        break;
                    case "*+": UtilTaula.inicialitzaQuartsNOPle(taula);
                        break;
                    case "**+": UtilTaula.inicialitzaQuartsSOPle(taula);
                        break;
                    case "+*": UtilTaula.inicialitzaQuartsNEPle(taula);
                        break;
                    case "+**": UtilTaula.inicialitzaQuartsSEPle(taula);
                        break;
                    case "*+**": UtilTaula.inicialitzaQuartsNOSEPlens(taula);
                        break;
                    case "**+*": UtilTaula.inicialitzaQuartsSONEPlens(taula);
                        break;
                    case "*x": UtilTaula.inicialitzaCreuNPle(taula);
                        break;
                    case "**x": UtilTaula.inicialitzaCreuOPle(taula);
                        break;
                    case "x*": UtilTaula.inicialitzaCreuSPle(taula);
                        break;
                    case "x**": UtilTaula.inicialitzaCreuEPle(taula);
                        break;
                    case "*x*": UtilTaula.inicialitzaCreuNSPlens(taula);
                        break;
                    case "**x**": UtilTaula.inicialitzaCreuOEPlens(taula);
                        break;
                    default: UtilTaula.inicialitzaFalse(taula);
                }
                String resultat = UtilTaula.taulaToString(taula, 'X', '·');
                System.out.println(resultat);
            }
        }
    }

    public static int obteFiles(String especificacio) {
        /* Aquesta funció espera l'especificació de la forma d'una taula.
         * En cas que l'especificació sigui correcta, retornarà l'enter
         * corresponent als primers dígits. Per exemple, si especificacio
         * és "12x5", retornarà 12.
         * Altrament, retornarà el valor -1.  
         */
         
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
         * Altrament, retornarà el valor -1.  
         */
        
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
