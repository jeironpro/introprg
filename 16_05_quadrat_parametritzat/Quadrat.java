/* Programa que rep un nombre per la linia de comanda i dibuixa un quadrat */
public class Quadrat {
    public static void main(String[] args) {
        // Agafar el argument 0 
        int num = Integer.parseInt(args[0]);
        // Possar-li el argument 0 al modul quadrat
        quadrat(num);
    }
    
    public static void quadrat(int num) {
        // Fer les línies
        for (int linia = 1; linia <= num; linia++) {
            // Fer les columnes
            for (int columna = 1; columna <= num; columna++) {
                // Mostrar les X
                System.out.print(" X");
            }
            // Salt de línia que separa cada línia de X's dibuixada
            System.out.println();
        }
    }  
}
