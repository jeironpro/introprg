/* Programa que rep un nombre per la linia de comanda i dibuixa un quadrat */
public class Quadrat {
    public static void main(String[] args) {
        // Agafar el argument 0 
        int num = Integer.parseInt(args[0]);
        dibuixaQuadrat(num);
    }
    
     public static void dibuixaQuadrat(int num) {
        // Fer les línies
        for (int linia = 1; linia <= num; linia++) {
            dibuixaLinia(num);
            // Salt de línia que separa cada línia de X's dibuixada
            System.out.println();
        }
    }
    
    public static void dibuixaLinia(int num) {
        // Fer les columnes
        for (int columna = 1; columna <= num; columna++) {
            // Mostrar les X
            System.out.print(" X");
        }
    }
}
