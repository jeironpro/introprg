/* 
* Programa que demana les notes obtinguda i et mostra la nota més alta 
* i les notes introduïdes sense la més alta. 
*/
public class NotaMesAlta {
    public static void main(String[] args) {
        // Demanar les notes
        System.out.println("Introdueix les notes (-1 per finalitzar)");
        
        // Declarar e inicialitzar el int notaAlta en 0
        int notaAlta = 0;
        // Declarar e inicialitzar el int quants en 0
        int quants = 0;
        // Declarar e inicialitzar el String notes buit
        String notes = "";
        // Declarar e inicialitzar el String notesFormatat buit
        String notesFormatat = "";
        
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
                if (nota <= 10) {
                    // Guardar la nota en el String notes
                    notes += nota;
                    // Augmentar en 1 quants
                    quants++;                
                }
            }
        }
        // Quan el bucle finalitzi, si s'introdueix mes d'una nota
        if (quants > 1) {
            // Fer un for per iterar les notes     
            for (int i = 0; i < notes.length(); i++) {
                // Declarar e inicialitzar el int notesAEnter, que almacena el char de notes i el converteix a enter
                int notesAEnter = Integer.parseInt("" + notes.charAt(i));
                // Si la nota del String notes convertit a enter és igual a la nota més alta
                if (notes.length() <= 2 && notes.charAt(0) == notes.charAt(1)) {
                    System.out.println("La nota més alta és " + notaAlta + ". No queda cap altra nota.");
                    return;
                }
                if (notesAEnter == notaAlta) {
                    // Ignorar la nota
                   continue;
                }
                // Si i és 0 o la longitud de les notes és menor o igual a 2
                if (i == 0 || notes.length() <= 2) {
                    // Guardar la nota tal qual en el String notesFormatat
                    notesFormatat += notes.charAt(i);
                // Del contrari, si i és major 0 i menor a la longitud de les notes -1
                } else if (i > 0  && i < notes.length()-1) {
                    // Guardar la nota amb una coma i un espais abans en el String notesFormatat
                    notesFormatat += ", " + notes.charAt(i);
                // Del contrari, si i és igual a longitud de les notes -1
                } else {
                    // Guardar la nota amb una i abans en el String notesFormatat
                    notesFormatat += " i " + notes.charAt(i);
                }
            }
            // Mostrar el missatge de la nota més alta i la resta de notes introduïdes
            System.out.println("La nota més alta és " + notaAlta + ". La resta de notes és: " + notesFormatat);
        // Del contrari
        } else {
            // Mostrar aquest missatge
            System.out.println("Com a mínim calen dues notes");
        }
    }
}
