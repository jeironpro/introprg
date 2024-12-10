/* Programa que dibuixa un quadrat de 5 línies i 5 columnes amb "X" */
public class Quadrats {
    public static void main(String[] args) {
        // Demanar la quantitat i dibuixar el(s) quadrat(s)
        dibuixaQuadrats();
    }
    
    public static void dibuixaQuadrats() {
        // Demanar la quantitat
        System.out.println("Quants?");
        // Llegir la quantitat
        int quantitat = Integer.parseInt(Entrada.readLine());
        
        // Fer la quantitat de quadrat como s'indique
        for (int i = 0; i < quantitat; i++) {
            dibuixaQuadrat();    
            // Línia que separa els quadrats
            System.out.println();
        }        
    }

    public static void dibuixaQuadrat() {
        // Fer les línies
        for (int linia = 1; linia <= 5; linia++) {
            dibuixaLinia();
        }
    }
    
    public static void dibuixaLinia() {
        // Fer les columnes
        for (int columna = 1; columna <= 5; columna++) {
            // Mostrar les X
            System.out.print(" X");
        }
        // Salt de línia que separa cada línia de X's
        System.out.println();
    }
}
