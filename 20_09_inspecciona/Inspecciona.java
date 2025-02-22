/*
 * Programa que agafa els argument rebut pel línia de comanda
 * i el processa com rutes del sistema de fitxer i si és un
 * fitxer i existeix et mostra la mida en bytes i el contingut, 
 * si és un directori i existeix et mostra els fitxers i directoris
 * que conté.
 */

// Importar BufferedReader des del seu paquet
import java.io.BufferedReader;

// Importar FileReader des del seu paquet
import java.io.FileReader;

// Importar IOException des del seu paquet
import java.io.IOException;

// Importar File des del seu paquet
import java.io.File;

// Importar Arrays des del seu paquet
import java.util.Arrays;

public class Inspecciona {
    public static void main(String[] args) throws IOException {
        // Processar arguments
        for (int i = 0; i < args.length; i++) {
            // Embolicar la ruta del fitxer o directori en un File
            File fitxer = new File(args[i]);
            
            // Mostra l'argument que es processa
            mostraArgument(args[i]);
            
            // Si el fitxer o directori existeix
            if (fitxer.exists()) {
                // Obtenir els permisos
                obtenirPermisos(fitxer); 
                
                // Si es un fitxer obtenir el tipus i el contingut
                if (fitxer.isFile()) {
                    // Mostrar el tipus
                    System.out.print("fitxer ");
                    // Processar el fitxer
                    processaFitxer(fitxer, args[i]);
                }
                
                // Si es un directori obtenir el tipus i el contingut
                if (fitxer.isDirectory()) {
                    // Mostrar el tipus
                    System.out.print("directori ");
                    // Processa el directori
                    processaDirectori(fitxer);
                }
            // Del contrari
            } else {            
                // Mostrar aquest missatge
                System.out.println("No trobat");        
            }
        }
    }
    
    public static void mostraArgument(String arg) {
        // Crear amb String format
        String argument = String.format("Processant argument: %s", arg);
        // Crear la divisió repetint el separador el num de vegades de la longitud de l'argument
        String divisio = "=".repeat(argument.length());
        
        // Mostrar l'argument que es processa
        System.out.println(argument);
        // Mostrar la divisió
        System.out.println(divisio);
    }
    
    public static void obtenirPermisos(File fitxer) {
        // Si el fitxer o directori té permis de lectura o no
        System.out.print((fitxer.canRead()) ? "r" : "-");
        
        // Si el fitxer o directori té permis d'escriptura o no
        System.out.print((fitxer.canWrite()) ? "w" : "-");
        
        // Si el fitxer o directori té permis d'execució o no
        System.out.print((fitxer.canExecute()) ? "x " : "- ");
    }
    
    public static void processaFitxer(File fitxer, String ruta) throws IOException {
        // Si el fitxer té una longitud major a 0
        if (fitxer.length() > 0) {
            // Mostrar la mida
            System.out.printf("de mida en bytes: %d%n", fitxer.length());
            
            // Verifica extensió
            boolean obrir = verificaExtensio(ruta);
            
            // Si és una extensió coneguda
            if (obrir) {
                // Mostrar els continguts del fitxer
                System.out.printf("Amb els continguts:%n");
                mostraContingutFitxer(fitxer);           
            }
        // Del contrari
        } else {
            // Mostrar buit
            System.out.println("buit");
        }
    }
    
    public static String obtenirExtensio(String ruta) {
        // Strin buit pel extensió
        String extensio = "";
        
        // Iterar la ruta de manera decreixent
        for (int i = ruta.length()-1; i >= 0; i--) {
            // Agafar el caràcter en la posició de i 
            char c = ruta.charAt(i);
            
            // Si el caràcter és diferent a '.'
            if (c != '.') {
                // Guardar el caràcter en extensió
                extensio += c;
            // Del contrari
            } else {
                // Aturar el bucle
                break;
            }
        }
        // Retornar l'extensió
        return extensio;
    }
    
    public static boolean verificaExtensio(String ruta) {
        // Array amb les extensions conegudes
        String[] extensions = new String[] {"txt", "java"};
        // Obtenir l'extensió amb el mòdul obtenirExtensio(li passem ruta com argument)
        String extensio = obtenirExtensio(ruta);
        
        // Iterar les extensions
        for (int i = 0; i < extensions.length; i++) {
            // Si la extensió és igual a una de les extensions conegudes
            if (extensions[i].equals(extensio)) {
                // Retornar true
                return true;
            }
        }
        // Retornar false
        return false;
    }
    
    public static void mostraContingutFitxer(File fitxer) throws IOException {
        // Llegir el fitxer
        BufferedReader lector = new BufferedReader(new FileReader(fitxer));
    
        // Bucle infinit
        while (true) {
            // Llegir la línia
            String linia = lector.readLine();
            // Si la línia és null retornar
            if (linia == null) break;
            
            // Mostrar cada línia
            System.out.printf("|%s|%n", linia);
        }
        // Tancar el fitxer
        lector.close(); 
    }
    
    public static void processaDirectori(File fitxer) {
        // Crear un array de String amb list() 
        String[] contingut = fitxer.list();
        // Ordenar l'array
        Arrays.sort(contingut);
        
        // Si el contingut és major a 0
        if (contingut.length > 0) {
            // Mostrar el contingut del directori
            mostraContingutDirectori(contingut);
        // Del contrari
        } else {
            // Mostrar buit
            System.out.println("buit");
        }
    }
    
    public static void mostraContingutDirectori(String[] contingut) {
        // Mostrar el primer element del directori
        System.out.printf("que conté: %s", contingut[0]);
        
        // Iterar els contiguts
        for (int i = 1; i < contingut.length; i++) {
            // Llegir cada element
            String conte = contingut[i];
            // Mostrar l'element
            System.out.printf(", %s", contingut[i]);
        }
        // Fer un salt de línia
        System.out.println();
    }
}
