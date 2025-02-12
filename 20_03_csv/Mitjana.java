/*
 * Programa que calcula la mitjana de les notes dels exàmens dels estudiants
 * que conté un fitxer amb format csv.
 */

// Importar BufferedReader des de la seva biblioteca
import java.io.BufferedReader;

// Importar FileReader des de la seva biblioteca
import java.io.FileReader;

// Importar IOException des de la seva biblioteca
import java.io.IOException;

public class Mitjana {
    public static void main(String[] args) throws IOException {
        // Establir la ruta del fitxer en un String
        String ruta = "notes.csv";
        // Lector d'arxiu per obrir i llegeix caràcter per caràcter l'arxiu de la ruta indicat
        FileReader lectorArxiu = new FileReader(ruta);
        // Lector de dades per llegir l'arxiu línia per línia en la ruta indicat
        BufferedReader entrada = new BufferedReader(lectorArxiu);
        
        // Enter per guardar el nombre d'exàmens 
        int quantsExams = 0;
        
        // Si els arguments té longitud major a 0 i l'argument 0 és un enter
        if (args.length>0 && UtilString.esEnter(args[0])) {
            // Assignar-li el argument convertit a enter a quantsExamns
            quantsExams = Integer.parseInt(args[0]);
        // Del contrari
        } else {
            // Assignar-li 6 a quantsExams (Valor per defecte)
            quantsExams = 6;
        }
        
        // Mostrar aquest missatge amb el nombre d'exàmens
        System.out.printf("Càlcul de la mitjana de notes per %d exàmens%n", quantsExams);
        
        // Agafar la primera línia per ignorar-la
        String linia = entrada.readLine();
        // Llegir la segona línia
        linia = entrada.readLine();
        
        // Si la segona línia és null
        if (linia == null) {
            // Mostrar aquest missatge
            System.out.println("El fitxer notes.csv no conté cap nota.");
            // Retornar
            return;
        // Del contrari
        } else {
            // Bucle infinit
            while (true) {
                // Float per guardar la suma de les notes
                float suma = 0;
                // Boolean per verificar si el nom existeix
                boolean nomExisteix = false;
                // Converteix a un array la línia, 
                String[] notes = linia.split(","); 
                
                // Si la longitud de les notes és menor a la quantitat d'examens
                if (notes.length < quantsExams) {
                    // Cridar el mòdul que crea un nou array en la longitud de la quantitat de examens
                    notes = novesNotes(notes, quantsExams);
                }
                
                // Si el primer element de l'array notes no està buit i no és un enter
                if (!notes[0].isBlank() && !UtilString.esEnter(notes[0])) {
                    // Possar a true nomExisteix
                    nomExisteix = true;
                    // Mostrar el nom
                    System.out.printf("%s", notes[0]);
                }
                            
                // For per iterar totes les notes de la quantitat de exàmens indicat
                for (int i = 1; i <= quantsExams; i++) {
                    // Si el nom no existeix, aturar el bucle
                    if (!nomExisteix) break;
                    
                    // Si la nota és un enter
                    if (UtilString.esEnter(notes[i])) {
                        // Converteix la nota a enter
                        int nota = Integer.parseInt(notes[i]);
                        // Sumar-li a suma la nota
                        suma += nota;
                    }
                }
                // Si el nom existeix mostrar la mitjana
                if (nomExisteix) System.out.printf(" (%.2f)%n", suma/quantsExams);
               
                // Llegir cada línia, a partir de la primera
                linia = entrada.readLine();
                // Si està buit, aturar el bucle 
                if (linia == null) break;
            }
        }
        // Cerrar el fitxer
        entrada.close();
    }
    
    public static String[] novesNotes(String[] notes, int quantsNotes) {
        // Crear un nou array amb longitud de la quantitat d'exams
        String[] nouArray = new String[quantsNotes+1];
        
        // For per iterar les posicions del nou array
        for (int i = 0; i <= quantsNotes; i++) {
            // Valor buit per cada posició de l'array
            nouArray[i] = "";
            
            // Si i és menor a la longitud de la notes
            if (i < notes.length) {
                // Assignar-li el valor de notes al nou array
                nouArray[i] += notes[i];
            // Del contrari
            } else {
                // Assignar-li "NP" a les altres posicions del nou array
                nouArray[i] += "NP";
            }
        }
        
        // Retornar el nou array
        return nouArray;
    }
}
