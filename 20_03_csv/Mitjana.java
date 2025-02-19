/*
 * Programa que calcula la mitjana de les notes dels exàmens dels estudiants
 * que conté un fitxer amb format csv.
 */

// Importar BufferedReader des del seu paquet
import java.io.BufferedReader;

// Importar FileReader des del seu paquet
import java.io.FileReader;

// Importar IOException des del seu paquet
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
        
        // Si els arguments tenen longitud major a 0 i l'argument 0 és un enter
        if (args.length > 0 && UtilString.esEnter(args[0])) {
            // Si el nombre d'examens és menor a 2
            if (Integer.parseInt(args[0]) < 2) {
                // Mostrar aquest missatge
                System.out.println("Com a mínim 2 exàmens.");
                // Tancar fitxer
                entrada.close();
                // Retornar
                return;
            }
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
            // Tancar el fitxer
            entrada.close();
            // Retornar
            return;
        }
        // Bucle infinit
        while (true) {
            // Float per guardar la suma de les notes
            float suma = 0;
            // Converteix a un array la línia, 
            String[] notes = linia.split(","); 
            
            
            // Si la longitud de les notes és menor a la quantitat d'examens
            if (notes.length < quantsExams) {
                // Cridar el mòdul que crea un nou array en la longitud de la quantitat de examens
                notes = novesNotes(notes, quantsExams);
            }
                        
            // For per iterar totes les notes de la quantitat de exàmens indicat
            for (int i = 0; i <= quantsExams; i++) {
                if (notes[0].isBlank() || UtilString.esEnter(notes[0])) break;
                
                // Netejar els espais del lateral del string
                notes[i] = notes[i].strip();
                
                // Si la nota és un enter
                if (UtilString.esEnter(notes[i])) {
                    // Converteix la nota a enter
                    int nota = Integer.parseInt(notes[i]);
                    // Sumar-li a suma la nota
                    suma += nota;
                }
            }
            System.out.printf("%s (%.2f)%n", notes[0].strip(), (suma/quantsExams));
            
            // Llegir cada línia, a partir de la tercera
            linia = entrada.readLine();
            // Si la línia està buit, aturar el bucle 
            if (linia == null) break;
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
