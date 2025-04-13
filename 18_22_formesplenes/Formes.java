/*
 * Programa que rep per línia de comanda especificacions de taules i les dibuixa.
 */

public class Formes {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            int files = obteFiles(args[i]);
            int columnes = obteColumnes(args[i]);
            String forma = obteForma(args[i]);
            
            if (files < 1 || columnes < 1) {
                System.out.println("Especificació no vàlida");
            } else {
                boolean[][] taula = new boolean[files][columnes];
                mostraForma(taula, forma);
            }
        }
    }

    public static int obteFiles(String especificacio) {
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
            int fila = Integer.parseInt(files);
            if (fila >= 1 && fila <= 99) {
                return fila;            
            }
        }
        return -1;
    }

    public static int obteColumnes(String especificacio) {
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
            int col = Integer.parseInt(columnes);
            if (col >= 1 && col <= 99) {
                return col;           
            }
        }
        return -1;        
    }
    
    public static String obteForma(String especificacio) {
        String formaTmp = "";
        String forma = "";
        
        for (int i = especificacio.length()-1; i >= 0; i--) {
            char c = especificacio.charAt(i);
            if (!Character.isDigit(c)) {
                formaTmp += c;
            } else {
                break;
            }
        }
        
        for (int i = formaTmp.length()-1; i >= 0; i--) {
            char c = formaTmp.charAt(i);
            if (!Character.isDigit(c)) {
                forma += c;
            }
        }
        return forma;
    }
    
    public static void mostraForma(boolean[][] taula, String forma) {
        switch (forma) {
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
