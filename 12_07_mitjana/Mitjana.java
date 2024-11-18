/* Aquest programa demana les notes que has obtingut i les suma.
* Si per primera vegada introduiexes un número negatiu et dirà que
* Cap nota vàlida introduïda.  
*/

public class Mitjana {
    public static void main(String[] args) {
        // Demanar la nota fora del bucle
        System.out.println("Introdueix un valor");
        int nota = Integer.parseInt(Entrada.readLine());   
        // Declarar e inicialitzar variable cantitadNota amb 0
        // Aquesta variable guarda la quantitat de notes introduïdes
        double cantidadNota = 0;
        // Declarar e inicialitzar la variable sumaNotes amb 0
        // Aquesta variable guarda la suma de totes les notes introduïdes 
        double sumaNotes = 0;       
        
        // Verificar que la nota està a dins del rang
        if (nota < 0 || nota > 100) {
            // Com no està, mostrar aquest missatge
            System.out.println("Cap nota vàlida introduïda");
        // Del contrari, la nota està a dins del rang
        } else {
            // Fer un while para iterar la cantidad de notes introduïdes i sumar-les
            while (nota >= 0 && nota <= 100) {
                // Guardar cada nota introduïda
                cantidadNota = cantidadNota + 1;
                // Sumar les notes
                sumaNotes = sumaNotes + nota;
                
                // Demanar la nota a dins del bucle
                System.out.println("Introdueix un valor");
                nota = Integer.parseInt(Entrada.readLine());           
            }
            // Mostrar la mitjana
            System.out.println("La mitjana de les notes vàlides és " + (sumaNotes / cantidadNota));
        }

    }
}
