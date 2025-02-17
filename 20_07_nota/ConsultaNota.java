/*
 * Programa que conté un lloro i et demana el nom i la prova de 
 * l'alumne que vulguis veure la nota que està emmagatzemada en un fitxer 
 * i si existeix la mostra, altrament mostra un missatge d'error.
 */

// Importar FileReader des del seu paquet
import java.io.FileReader;

// Importar BufferedReader des del seu paquet
import java.io.BufferedReader;

// Importar IOException des del seu paquet
import java.io.IOException;
 
public class ConsultaNota {
    public static void main(String[] args) throws IOException {
        // Ruta del fitxer
        String ruta = "notes.csv";
        
        // Obrir i llegir el fitxer
        BufferedReader entrada = new BufferedReader(new FileReader(ruta));
        
        // Primera línia del fitxer
        String linia = entrada.readLine();
        // Si la línia és null
        if (linia == null) {
            // Mostrar aquest missatge d'error
            System.out.println("Error");
            // Finalitzar el programa
            return;
        }
        
        // Crear un array de la línia amb split
        String[] liniaNotes = linia.split(",");
        // Si en la posició 0, el String no es "alumne"
        if (!liniaNotes[0].equals("alumne")) {
            // Mostrar aquest missatge d'error
            System.out.println("Error");
            // Finalitzar el programa
            return;
        }
        // Tancar el fitxer
        entrada.close();
        
        // Bucle infinit
        while (true) {
            // Demanar l'alumne
            System.out.println("Alumne:");
            // Llegir l'alumne
            String alumne = Entrada.readLine();
            
            // Si el alumne està buit, aturar el bucle
            if (alumne.isEmpty()) break;
            
            // Demanar la prova
            System.out.println("Prova:");
            // Llegir la prova
            String prova = Entrada.readLine();
            
            // Si la prova està buida, aturar el bucle
            if (prova.isEmpty()) break;
            
            // Crear un array amb els noms dels alumnes
            String[] noms = carregaAlumnes(ruta);
            // Crear un array amb les proves
            String[] proves = carregaProves(ruta);
            // Crear un taulell amb les notes
            int[][] notes = carregaNotes(ruta, noms.length, proves.length);
            // Agafar la posició on es troba l'alumne en l'array noms
            int posAlumne = filaAlumne(alumne, noms);
            // Agafar la posició on es troba la prova en l'array proves
            int posProva = filaAlumne(prova, proves);
            
            // Mostrar la nota de l'alumne 
            System.out.printf("Nota: %d%n", notes[posAlumne][posProva]);
        }
        // Quan el bucle finalitzi, mostrar aquest missatge
        System.out.println("Adéu");
    }
    
    public static String[] carregaAlumnes(String nomFitxer) throws IOException {
        // Obrir i llegir el fitxer
        BufferedReader entrada = new BufferedReader(new FileReader(nomFitxer));
        
        // Obtenir quantes línies conté el fitxer
        int longFitxer = quantesLinies(nomFitxer);
        
        // Crear un array pels noms dels alumnes
        String[] nomsAlumnes = new String[longFitxer-1];
        
        // i a 0 per utilitzar-ho com index
        int i = 0;
        // Ignorar la primera línia
        String linia = entrada.readLine();
        
        // Bucle infinit     
        while (true) {
            // Llegeix la segona línia
            linia = entrada.readLine();
            // Si la línia és null, aturar el bucle
            if (linia == null) break;
            
            // Crear un array de la línia amb split
            String[] liniaNom = linia.split(",");
            // Reiniciar les valores de l'array 
            nomsAlumnes[i] = "";          
            // Guardar els nombres en l'array
            nomsAlumnes[i] += liniaNom[0].strip();
            // Augmentar en 1 a i
            i++;
        }
        // Tancar el fitxer
        entrada.close();
        // Retornar l'array amb els nombres
        return nomsAlumnes;
    }
    
    public static String[] carregaProves(String nomFitxer) throws IOException {
        // Obrir i llegir el fitxer
        BufferedReader entrada = new BufferedReader(new FileReader(nomFitxer));
        
        // Declarar l'array
        String[] proves;
        
        // Llegir la primera línia
        String linia = entrada.readLine();
        
        // Si la línia és null
        if (linia == null) {
            // Inicialitzar l'array en 0
            proves = new String[0];
            // Retornar l'array buit
            return proves;
        }     
        
        // Crear un array de la línia amb split
        String[] liniaProves = linia.split(",");
        // Inicialitzar l'array a la longitud de l'array de la línia
        proves = new String[liniaProves.length-1];
        
        // j a 1 per utilitzar-ho com index
        int j = 1;
        // Iterar la longitud de l'array de la línia
        for (int i = 0; i < liniaProves.length-1; i++) {
            // Reiniciar el valors de l'array
            proves[i] = "";
            
            // Guardar cada prova en l'array
            proves[i] += liniaProves[j];
            // Augmentar en 1 a j
            j++;
        }
        // Tancar el fitxer
        entrada.close();
        // Retornar l'array amb les poves
        return proves;
    }
    
    public static int[][] carregaNotes(String nomFitxer, int numAlumnes, int numProves) throws IOException {
        // Obrir i llegir el fitxer
        BufferedReader entrada = new BufferedReader(new FileReader(nomFitxer));
        
        // Crear un taulell amb dimensió de numAlumnes i numProves
        int[][] notes = new int[numAlumnes][numProves];
        
        // Ignorar la primera línia
        String linia = entrada.readLine();
        // Llegir la segona línia
        linia = entrada.readLine();
        
        // i a 0 per utilitzar-ho com index
        int i = 0;
        
        // Bucle infinit
        while (true) {  
            // Crear un array de la línia amb split        
            String[] liniaNotes = linia.split(",");
            
            // Iterar les files
            for (int fila = 0; fila < numAlumnes; fila++) {
                // Iterar la columna
                for (int col = 0; col < numProves; col++) {
                    // Si la nota és un enter
                    if (UtilString.esEnter(liniaNotes[col+1])) {
                        // Converteix la nota a enter
                        int valor = Integer.parseInt(liniaNotes[col+1]);
                        // Si la nota está en el rang entre 0 i 100 
                        if (valor >= 0 && valor <= 100) {
                            // Guardar la nota en el taulell
                            notes[i][col] = valor;
                        // Del contrari
                        } else {
                            // Guardar -2
                            notes[i][col] = -2;   
                        }
                    // Del contrari
                    } else {
                        // Guardar -1
                        notes[i][col] = -1;
                    }
                }
            }
            // Augmentar en 1 a i
            i++;                    
            
            // Llegir la línia
            linia = entrada.readLine();
            
            // Si la línia és null, aturar el bucle
            if (linia == null) break;
        }
        // Tancar el fitxer
        entrada.close();
        // Retornar el taulell amb les notes
        return notes;
    }
    
    public static int filaAlumne(String nomAlumne, String[] alumnes) {
        // Iterar la longitud de alumnes
        for (int i = 0; i < alumnes.length; i++) {
            // Filtro pel String de alumnes en la posició de i
            alumnes[i] = UtilString.filtraVocalCatala(alumnes[i]).strip();
            // Filtro pel nomAlumne
            nomAlumne = UtilString.filtraVocalCatala(nomAlumne).strip();
            // Si el nom del alumne és igual a qualsevol String de alumnes
            // Retornar la posició de i
            if (alumnes[i].equals(nomAlumne)) return i;
        }
        // Retornar -1 si no retorna cap valor
        return -1;
    }
    
    public static int columnaProva(String nomProva, String[] proves) {
        // Iterar la longitud de proves
        for (int i = 0; i < proves.length; i++) {
            // Filtro pel String de proves en la posició de i
            proves[i] = UtilString.filtraVocalCatala(proves[i]).strip();
            // Filtro pel nomProva
            nomProva = UtilString.filtraVocalCatala(nomProva).strip();
            // Si el nom de la prova és igual a qualsevol String de proves
            // Retornar la posició de i
            if (proves[i].equals(nomProva)) return i;
        }
        // Retornar -1 si no retorna cap valor
        return -1;
    }
    
    public static int quantesLinies(String fitxer) throws IOException {
        // Comptador de línies
        int comptador = 0;
        // Lector de dades per llegir l'arxiu línia per línia en la ruta indicat
        BufferedReader entrada = new BufferedReader(new FileReader(fitxer));
        
        // Bucle infinit
        while (true) {
            // Llegir cada linia del fitxer
            String linia = entrada.readLine();
            
            // Si la linia és null, surt de bucle
            if (linia == null) break;
            
            // Augmentar comptador en 1
            comptador++;
        }
        // Tancar el fitxer
        entrada.close();
        // Retornar la quantitat de línies
        return comptador;
    }
}
