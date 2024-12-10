/* Programa que repeteix tot el que se li escriu per entrada estàndard */
public class LloroQuadrat {
    public static void main(String[] args) {
        // Fer un while infinit
        while (true) {
            // Demanara la paraula
            System.out.println("El lloro espera paraula:");
            // llegir la paraula
            String paraula = Entrada.readLine();
            
            // Verificar si la paraula no està buida
            if (!paraula.isEmpty()) {
                // Verificar si la paraula és igual a dibuixa quadrat
                if (paraula.equals("dibuixa quadrat")) {
                    dibuixaQuadrat();
                // Verificar si la paraula és igual a dibuixa rectangle
                } else if (paraula.equals("dibuixa rectangle")) {
                    dibuixaRectangle();
                // Del contrari,
                } else {
                    // Repeteix paraula
                    System.out.println("El lloro repeteix: " + paraula);                
                }
            // Del contrari
            } else {
                // Mostrar aquest missatge
                System.out.println("Adéu");
                // finalitzar el bucle
                break;            
            }
        }
    }
    // Modul per dibuixar quadrat
    public static void dibuixaQuadrat() {
        // Fer les línies
        for (int linia = 1; linia <= 5; linia++) {
            dibuixaLinia();
            // Salt de línia que separa cada línia de X's dibuixada
            System.out.println();
        }    
    }
    
    // Modul per dibuixar rectangle
    public static void dibuixaRectangle() {
        // Fer les línies
        for (int linia = 1; linia <= 5; linia++) {
            dibuixaLinia();
            dibuixaLinia();
            // Salt de línia que separa cada dues línies seguit de X's dibuixada
            System.out.println();
        }    
    }
    
    // Modul per dibuixar les línies del quadrat i rectangle
    public static void dibuixaLinia() {
        // Fer les columnes
        for (int columna = 1; columna <= 5; columna++) {
            // Mostrar les X
            System.out.print(" X");
        }
    }
}
