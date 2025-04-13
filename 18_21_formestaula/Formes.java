/*
* programa que rep per línia de comanda especificacions de taules i les dibuixa.
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
* Exemple per cada especificació:
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
* Si s'introduiex cap de les especificacions anteriors, mostrar un missatge d'error.
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
            default: UtilTaula.inicialitzaFalse(taula);
        }
        String resultat = UtilTaula.taulaToString(taula, 'X', '·');
        System.out.println(resultat);
    }
}
