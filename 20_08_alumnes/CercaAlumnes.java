/*
 * Programa que llegeix les notes de un alumne des de un fitxer de tipus csv.
 * Espera un argument (nom o criteri de cerca) pel línia de comanda i et mostra
 * els dades del(s) alumne(s) que correspongui a l nom o al criteri de cerca. 
 */

// Importar FileReader des del seu paquet
import java.io.FileReader;

// Importar BufferedReader des del seu paquet
import java.io.BufferedReader;

// Importar IOException des del seu paquet
import java.io.IOException;

public class CercaAlumnes {

    // Crear una agrupació de dades
    static class Alumne {
        String nom;
        String email;
        int edat;
        boolean esOient;
        int[] notes;
    }
    
    public static void main(String[] args) throws IOException {
        // Verificar si hi ha arguments
        if (args.length > 0) {
            // Ruta del fitxer
            String ruta = "alumnes.csv";
            // Obrir i llegir el fitxer
            BufferedReader entrada = new BufferedReader(new FileReader(ruta));
            
            // Ignorar la primera línia
            String linia = entrada.readLine();
            
            // Bucle infinit
            while (true) {
                // Llegir la linia
                linia = entrada.readLine();
                // Si la línia és null, aturar el bucle
                if (linia == null) break;
                
                // Crear un agrupador Alumne (des de el mòdul csvAAlumne i li passem la línia)
                Alumne alumne = csvAAlumne(linia);
                
                // Crear un array de String amb el nom de l'alumne utilitzant el split
                String[] nomAlumne = alumne.nom.split(" ");
                // Crear un array de String amb l'email de l'alumne utilitzant el split
                String[] emailAlumne = alumne.email.split("@");
                
                // Filtro pel argument
                args[0] = UtilString.filtraVocalCatala(args[0]).strip();
                
                // Filtro pel email
                emailAlumne[0] = UtilString.filtraVocalCatala(emailAlumne[0]).strip();
                
                // Si el nom es troba en el fitxer
                if (nomTrobat(nomAlumne, emailAlumne[0], args[0])) {
                    // Mostrar les dades de l'alumne
                    mostraAlumne(alumne);
                    return;
                // Del contrari
                } else {
                    // Mostrar aquest missatge
                    System.out.println("No s'ha trobat cap alumne");
                }
            }
            
            // Tancar el fitexer            
            entrada.close();            
        }
    }
    
    public static boolean nomTrobat(String[] nomAlumne, String emailAlumne, String argsCero) {
        // Si el nom o criteri és un substring de l'email
        if (UtilString.esSubstring(emailAlumne, argsCero)) {
            // Retornar true
            return true;
        }
        
        // Iterar la longitud de l'array nomAlumne
        for (int i = 0; i < nomAlumne.length; i++) {
            // Filtro pel nom
            nomAlumne[i] = UtilString.filtraVocalCatala(nomAlumne[i]).strip();
            // Si el nom o criteri és un substring del nom complet
            if (UtilString.esSubstring(nomAlumne[i], argsCero)) {
                // Retornar true
                return true;
            }
        }
        // Si no es trobat, retornar false
        return false;
    }
    
    public static Alumne construeixAlumne(String nom, 
                                          String email,
                                          int edat, 
                                          boolean esOient,
                                          int[] notes) {
        // Crear un agrupador Alumne
        Alumne alumne = new Alumne();
        // Assignar-li el nom
        alumne.nom = nom;
        // Assignar-li l'email
        alumne.email = email;
        // Assignar-li l'edat
        alumne.edat = edat;
        // Assignar-li el boolean
        alumne.esOient = esOient;
        // Assignar-li l'array de notes
        alumne.notes = notes;  
        // Retornar el alumne amb les dades
        return alumne;                                    
    }
    
    public static void mostraAlumne(Alumne alumne) {
        // Mostrar el nom
        System.out.println("Alumne: " + alumne.nom);
        // Mostrar l'email
        System.out.println("- email: " + alumne.email);
        // Mostrar l'edat
        System.out.println("- edat: " + alumne.edat);
        // Mostrar si es o no oient
        System.out.println("- és oïent: " + (alumne.esOient ? "Sí" : "No"));
        // Mostrar les notes
        System.out.println("- notes: " + notesACsv(alumne.notes));
    }
    
    public static String alumneAString(Alumne alumne) {
        // Retornar el String formatat amb les dades de l'alumne
        return String.format(
            "Alumne(nom: \"%s\", email: \"%s\", " +
            "edat: %d, esOient: %b, notes: {%s})",
            alumne.nom, alumne.email, alumne.edat, alumne.esOient,
            notesACsv(alumne.notes)
        );
    }
    
    public static String notesACsv(int[] notes) {
        // String buit
        String notesCsv = "";
        
        // Guardar la primera nota amb una coma en devant
        notesCsv += ((notes[0] != -1) ? notes[0] : "NP" + ",");
        // Iterar la longitud de l'array notes
        for (int i = 1; i < notes.length; i++) {
            // Guardar les notes a partir de la primera amb una coma al darrer
            notesCsv += "," + ((notes[i] != -1) ? notes[i] : "NP");
        }
        // Retornar el String amb les notes
        return notesCsv;
    }
    
    public static String alumneACsv(Alumne alumne) {
        // Retornar el String formatat amb les dades de l'alumne (com una linia de un csv)
        return String.format(
            "%s,%s,%d,%b,%s",
            alumne.nom, alumne.email, alumne.edat, alumne.esOient,
            notesACsv(alumne.notes)
        );
    }
    
    public static Alumne csvAAlumne(String csv) {
        // Crear un String amb la linia del fitxer utilitzant el split
        String[] dades = csv.split(",");
        
        // Crear un agrupador Alumne
        Alumne alumne = new Alumne();
        // Assignar-li el nom
        alumne.nom = dades[0];
        // Assignar-li l'email
        alumne.email = dades[1];
        // Assignar-li l'edat        
        alumne.edat = Integer.parseInt(dades[2]);
        // Si el String de dades en la posició 3 té com valor "true"
        if (dades[3].equals("true")) {
            // Assignar-li true a esOient
            alumne.esOient = true;
        // Del contrari, té com valor "false"
        } else if (dades[3].equals("false")) {
            // Assignar-li false a esOient
            alumne.esOient = false;
        }
        
        // Crear un array de enter 
        int[] notesCsv = new int[dades.length-4];
        // j a 0 per utilitzar com index
        int j = 0;
        // Iterar la longitud de l'array deades
        for (int i = 4; i < dades.length; i++) {
            // Si dades en la posicio de i és igual a NP
            if (dades[i].equals("NP")) {
                // Assignar-li -1 a notesCsv
                notesCsv[j] = -1;
                // Augmentar en 1 a j
                j++;
            // Del contrari
            } else {
                // Converteix la nota a enter
                int nota = Integer.parseInt(dades[i]);
                // Assignar-li la nota a notesCsv
                notesCsv[j] = nota; 
                // Augmentar en 1 a j  
                j++;                         
            }
        } 
        // Assignar-li les notes
        alumne.notes = notesCsv;
        // Retornar el agrupador alumne
        return alumne; 
    }
}
