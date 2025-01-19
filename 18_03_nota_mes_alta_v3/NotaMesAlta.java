/* 
* Programa que demana les notes obtinguda i et mostra la nota més alta 
* i les notes introduïdes sense la més alta. 
*/

/* Aquest programa no m'agrada, molt redundant. Trobaré altre forma més simplificat de fer-ho */
public class NotaMesAlta {
    public static void main(String[] args) {
        // Demanar les notes
        System.out.println("Introdueix les notes (-1 per finalitzar)");
        // Declarar e inicialitzar el int notaAlta en 0
        int notaAlta = 0;
        // Declarar e inicialitzar el int quants en 0
        int quants = 0;
        // Declarar e inicialitzar el String restNotes buit
        String restNotes = "";
        
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
                    // Guardar la nota en restNotes
                    restNotes += nota + ",";
                    // Augmentar en 1 quants
                    quants++;                
                }
            }
        }
        // Quan el bucle finalitzi, si s'introdueix mes d'una nota
        if (quants > 1) {
            // Declarar e inicialitzar el String notesASeparar buit
            String notesASeparar = "";
            // Declarar e inicialitzar el String notaPerEnter buit
            String notaPerEnter = "";
            // Declarar e inicialitzar el boolean notesIguals en false
            boolean notesIguals = false;
            // Declarar e inicialitzar el boolean notesIguals en false
            boolean notesDiferent = false;
            
            // Fer un for per iterar el rest de notes
            for (int i = 0; i < restNotes.length(); i++) {
                // Agafar el carácter de restNotes en la posició de i
                char c = restNotes.charAt(i);
                // Si el caràcter és un dígit
                if (Character.isDigit(c)) {
                    // Guardar el caràcter en notaPerEnter
                    notaPerEnter += c;
                // Del contrari, si notaPerEnter no està buit
                } else if (!notaPerEnter.isEmpty()) {
                    // Converteix notaPerEnter a enter
                    int notaEnter = Integer.parseInt(notaPerEnter);
                    // Si la notaEnter és diferent a notaAlta
                    if (notaEnter != notaAlta) {
                        // notesDiferent serà true
                        notesDiferent = true;
                        // Guardar la nota convertit en notesASeparar
                        notesASeparar += notaEnter + ", ";
                    // Del contrari
                    } else {
                        // notesIguals serà true
                        notesIguals = true;
                    }
                    // Reiniciar notaPerEnter
                    notaPerEnter = "";
                }
            }
            // Si notesIguals és true i notesDiferent és false
            if (notesIguals && !notesDiferent) {
                // Mostrar aquest missatge
                System.out.println("La nota més alta és " + notaAlta + ". No queda cap altra nota.");   
            // Del contrari 
            } else {
                // Obtener del mòdul separadorNotes les notes separat
                String notesFinal = separadorNotes(notesASeparar);
                // Mostrar aquest missatge
                System.out.println("La nota més alta és " + notaAlta + ". La resta de notes és: " + notesFinal);
            }
        // Del contrari
        } else {    
            // Mostrar aquest missatge
            System.out.println("Com a mínim calen dues notes");
        }
    }
    
    public static String separadorNotes(String notes) {
        // Declarar e inicialitzar el String notesSeparat buit
        String notesSeparat = "";
        // Declarar e inicialitzar el int longitudNotes amb la longitud de les notes -2
        int longitudNotes = notes.length()-2;
        // Fer un for per iterar les notes en la longitudNotes    
        for (int i = 0; i < longitudNotes; i++) {
            // Agafar el carácter de notes en la posició de i
            char c = notes.charAt(i);
            // Si i és igual a la longitud de les notes menys 3 o menys 4 i el carácter és igual a una coma
            if ((i == longitudNotes-3 || i == longitudNotes-4) && c == ',') {
                // Guardar en notesSeparat un espai i la i
                notesSeparat += " i";
            // Del contrari
            } else {
                // Guardar el carácter tal qual
                notesSeparat += c;
            }
        }
        // Retornar les notes separat correctament
        return notesSeparat;
    }
}
