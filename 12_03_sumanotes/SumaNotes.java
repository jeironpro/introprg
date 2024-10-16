/* Aquest programa demana les notes que has obtingut i les suma */

public class SumaNotes {
    public static void main(String[] args) {
        int sumaNotes = 0;
        int nota = 0;
        
        while (nota >= 0 && nota <= 100) {
            System.out.println("Introdueix una nota");
            nota = Integer.parseInt(Entrada.readLine());
            
            if (nota >= 0 && nota <= 100) {
                sumaNotes = sumaNotes + nota;                
            }
        }
        System.out.println("La suma de les notes vàlides és " + sumaNotes);
    }
}
