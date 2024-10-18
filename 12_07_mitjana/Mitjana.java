/* Aquest programa demana les notes que has obtingut i les suma.
* Si per primera vegada introduiexes un número negatiu et dirà que
* Cap nota vàlida introduïda.  
*/

public class Mitjana {
    public static void main(String[] args) {
        System.out.println("Introdueix un valor");
        int nota = Integer.parseInt(Entrada.readLine());   
        double cantidadNota = 0;
        double sumaNotes = 0;       
        
        if (nota < 0 || nota > 100) {
            System.out.println("Cap nota vàlida introduïda");
        }

        while (nota >= 0 && nota <= 100) {
            if (nota >= 0 && nota <= 100) {
                cantidadNota = cantidadNota + 1;
                sumaNotes = sumaNotes + nota;
            }
            System.out.println("Introdueix un valor");
            nota = Integer.parseInt(Entrada.readLine());           
        }
        if (nota > 0 && nota <= 100) {
            System.out.println("La mitjana de les notes vàlides és " + (sumaNotes / cantidadNota));    
        }
    }
}
