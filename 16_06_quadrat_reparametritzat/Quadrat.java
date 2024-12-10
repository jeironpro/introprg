/* Programa que rep un nombre per la linia de comanda i dibuixa un quadrat */
public class Quadrat {
    public static void main(String[] args) {
        // Agafar el argument 0 
        int num = Integer.parseInt(args[0]);
        // Agafar el argument 1
        char caracter = args[1].charAt(0);
        // Possar-li els argument al mòdul
        dibuixaQuadrat(num, caracter);
    }
    
     public static void dibuixaQuadrat(int num, char caracter) {
        // Fer les línies
        for (int linia = 1; linia <= num; linia++) {
            dibuixaLinia(num, caracter);
            // Salt de línia que separa cada línia de X's dibuixada
            System.out.println();
        }
    }
    
    public static void dibuixaLinia(int num, char caracter) {
        // Fer les columnes
        for (int columna = 1; columna <= num; columna++) {
            // Mostrar les X
            System.out.print(" " + caracter);
        }
    }
}
