/* Programa que demana les notes obtinguda i et mostra la nota més alta */
public class NotaMesAlta {
    public static void main(String[] args) {
        // Demanar les notes
        System.out.println("Introdueix les notes (-1 per finalitzar)");
        
        // Declarar e inicialitzar el int notaAlta en 0
        int notaAlta = 0;
        // Declarar e inicialitzar el int quants en 0
        int quants = 0;
        // Fer un while infinit
        while (true) {
            // Llegir la nota
            int nota = Integer.parseInt(Entrada.readLine());
            // Si la nota és menor o igual a 10 i la notaAlta és menor a la nota
            if (nota <= 10 && notaAlta < nota) {
                // Assignar-li el valor de nota a notaAlta
                notaAlta = nota;
            }
            // Si la nota és negativa
            if (nota < 0) {
                // Finalitzar el bucle
                break;
            // Del contrari
            } else {
                // Si la nota és menor o igual a 10
                if (nota <= 10) {
                    // Augmentar en 1 quants
                    quants++;
                }
            }
        }
        // Quan el bucle finalitzi, si s'introdueix mes d'una nota
        if (quants > 1) {        
            // Mostrar el missatge de la nota més alta
            System.out.println("La nota més alta és " + notaAlta);
        // Del contrari
        } else {
            // Mostrar aquest missatge
            System.out.println("Com a mínim calen dues notes");
        }
    }
}
