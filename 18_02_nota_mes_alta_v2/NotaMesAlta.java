/* 
* Programa que demana les notes obtinguda i et mostra la nota més alta 
* i les notes introduïdes. 
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
                    notes += nota + ", ";
                    // Augmentar en 1 quants
                    quants++;                
                }
            }
        }
        // Quan el bucle finalitzi, si s'introdueix mes d'una nota
        if (quants > 1) {   
            // Declarar e inicialitzar el int longitudNotes amb la longitude de les notes -2
            int longitudNotes = notes.length()-2;
            // Fer un for per iterar les notes en la longitudNotes    
            for (int i = 0; i < longitudNotes; i++) {
                // Agafar el carácter de notes en la posició de i
                char c = notes.charAt(i);
                // Si i és igual a la longitud del text menys 3 o menys 4 i el carácter és igual a una coma
                if ((i == longitudNotes-3 || i == longitudNotes-4) && c == ',') {
                    // Guardar en notesFormatat un espai i la i
                    notesFormatat += " i";
                // Del contrari
                } else {
                    // Guardar el carácter tal qual
                    notesFormatat += c;
                }
            }
            // Mostrar el missatge de la nota més alta i les notes introduïdes
            System.out.println("La nota més alta és " + notaAlta + " de les introduïdes: " + notesFormatat);
        // Del contrari
        } else {
            // Mostrar aquest missatge
            System.out.println("Com a mínim calen dues notes");
        }
    }
}
