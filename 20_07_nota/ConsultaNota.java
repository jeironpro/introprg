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
        if (!liniaNotes[0].strip().equals("alumne")) {
            // Mostrar aquest missatge d'error
            System.out.println("Error");
            // Finalitzar el programa
            return;
        }
        
        // Iterar la longitud de l'array de la línia
        for (int i = 0; i < liniaNotes.length; i++) {
            // Si la longitud de l'array és 1 o el String en la posicio de i està buit
            if (liniaNotes.length == 1 || liniaNotes[i].strip().isEmpty()) {
                // Mostrar aquest missatge d'error
                System.out.println("El fitxer notes.csv no es vàlid");
                // Finalitzar el programa
                return;
            }
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
            
            // Crear un array amb els noms dels alumnes
            String[] noms = carregaAlumnes(ruta);
            
            // Agafar la posició on es troba l'alumne en l'array noms
            int posAlumne = filaAlumne(alumne, noms);
            
            // Si la posició quer retorna filaAlumne és -1
            if (posAlumne == -1) {
                // Mostrar aquest missatge
                System.out.println("Alumne " + "\"" + alumne + "\"" + " no disponible");
                // Tornar a la següent iteració
                continue;
            }
            
            // Demanar la prova
            System.out.println("Prova:");
            // Llegir la prova
            String prova = Entrada.readLine();
            
            // Si la prova està buida, aturar el bucle
            if (prova.isEmpty()) break;
            
            // Crear un array amb les proves
            String[] proves = carregaProves(ruta);

            // Agafar la posició on es troba la prova en l'array proves
            int posProva = filaAlumne(prova, proves);
            
            // Si la posició que retorna filaAlumne és -1 
            if (posProva == -1) {
                // Mostrar aquest missatge
                System.out.println("Prova " + "\"" + prova + "\"" + " no disponible");
                // Tornar a la següent iteració
                continue;
            }
            
            // Crear un taulell amb les notes
            int[][] notes = carregaNotes(ruta, noms.length, proves.length);
            
            // Si la nota és -1
            if (notes[posAlumne][posProva] == -1) {
                // Mostrar aquest missatge
                System.out.println("No Presentat");
            // Del contrari, si la nota és -2
            } else if (notes[posAlumne][posProva] == -2) {
                // Mostrar aquest missatge
                System.out.println("Nota amb valor no numèric o fora de rang");
            // Del contrari, si la nota és -3
            } else if (notes[posAlumne][posProva] == -3) {
                // Mostrar aquest missatge
                System.out.println("Nota no disponible");
            // Del contrari
            } else {
                // Mostrar la nota de l'alumne 
                System.out.printf("Nota: %d%n", notes[posAlumne][posProva]);
            }
            
        }
        // Quan el bucle finalitzi, mostrar aquest missatge
        System.out.println("Arreveure");
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
            proves[i] += liniaProves[j].strip();
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
        
        // Crear un array de la línia amb split        
        String[] liniaNotes = linia.split(",");
        
        if (numProves > liniaNotes.length-1) {
            numProves = liniaNotes.length-1;
        }
        
        // Llegir la segona línia
        linia = entrada.readLine();
        
        // fila a 0 per utilitzar-ho com index
        int fila = 0;
        
        // Bucle infinit
        while (true) {  
            // Tornar a crear un array de la línia amb split        
            liniaNotes = linia.split(",");
            
            if (liniaNotes.length < numProves) {
                liniaNotes = novesNotes(liniaNotes, numProves);
            }
            
            // Iterar les files
            if (fila < numAlumnes) {
                // Iterar la columna
                for (int col = 0; col < numProves; col++) {
                    // Netejar els espais dels laterals
                    liniaNotes[col+1] = liniaNotes[col+1].strip();
                    // Si el valor de liniaNotes és igual a NP
                    if (liniaNotes[col+1].equals("NP")) {
                        // Guardar -2
                        notes[fila][col] = -1; 
                    // Si la nota és un enter
                    } else if (UtilString.esEnter(liniaNotes[col+1])) {
                        // Converteix la nota a enter
                        int valor = Integer.parseInt(liniaNotes[col+1]);
                        
                        // Si el valor és -2
                        if (valor == -3) {
                            // Guardar -3
                            notes[fila][col] = -3;
                        } else if (valor >= 0 && valor <= 100) {
                            // Guardar la nota en el taulell
                            notes[fila][col] = valor;
                        // Del contrari
                        } else {
                            // Guardar -2
                            notes[fila][col] = -2;   
                        }
                    } else {
                        // Guardar -2
                        notes[fila][col] = -2;
                    }
                }
                // Augmentar en 1 a fila
                fila++;
            }             
            
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
                nouArray[i] += "-3";
            }
        }
        
        // Retornar el nou array
        return nouArray;
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
