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
            mostraTitol(args[i]);
            
            // Si el fitxer o directori existeix
            if (fitxer.exists()) {
                // Obtenir els permisos
                obtenirPermisos(fitxer); 
                
                // Si es un fitxer obtenir el tipus i el contingut
                if (fitxer.isFile()) processaFitxer(fitxer);
                // Si es un directori obtenir el tipus i el contingut
                if (fitxer.isDirectory()) processaDirectori(fitxer);
            // Del contrari
            } else {            
                // Mostrar aquest missatge
                System.out.println("No trobat");        
            }
        }
    }
    
    // Mostra titol
    public static void mostraTitol(String arg) {
        String titol = String.format("Processant argument: %s", arg);
        String divisio = "=".repeat(titol.length());
        
        System.out.println(titol);
        System.out.println(divisio);
        System.out.println();
    }
    
    public static void processaFitxer(File fitxer) throws IOException {
        // Guardar el tipus en inspeccio
        System.out.print("fitxer ");
        
        // Si el fitxer té una longitud major a 0
        if (fitxer.length() > 0) {
            // Guardar la mida en inspeccio
            System.out.printf("de mida en bytes: %d%n", fitxer.length());
            
            System.out.printf("Amb els continguts:%n");
            
            // Mostrar contingut del fitxer
            mostraContingutFitxer(fitxer);
        // Del contrari
        } else {
            // Guardar buit en inspeccio
            System.out.println("buit");
        }
    }
    
    public static void mostraContingutFitxer(File fitxer) throws IOException {
        // Llegir el fitxer
        BufferedReader lector = new BufferedReader(new FileReader(fitxer));
            
        // Bucle infinit
        while (true) {
            // Llegir la línia
            String linia = lector.readLine();
            // Si la línia és null retornar
            if (linia == null) return;
            
            // Guardar cada línia en inspeccio
            System.out.printf("|%s|%n", linia);
        }
    }
    
    public static void processaDirectori(File fitxer) {
        // Guardar el tipus en inspeccio
        System.out.print("directori ");
        
        // Crear un array de String amb list() 
        String[] contingut = fitxer.list();
        // Ordenar l'array
        Arrays.sort(contingut);
        
        // Si el contingut és major a 0
        if (contingut.length > 0) {
            // Guardar el primer element del directori en inspeccio
            System.out.printf("que conté: %s", contingut[0]);
            
            // Iterar el contigut
            for (int i = 1; i < contingut.length; i++) {
                // Llegir cada element
                String conte = contingut[i];
                // Guardar l'element en inspeccio
                System.out.printf(", %s", contingut[i]);
            }
            System.out.println();
        // Del contrari
        } else {
            // Guardar buit en inspeccio
            System.out.print("buit");
        }
    }
    
    public static void obtenirPermisos(File fitxer) {
        String permisos = "";
        
        // Si el fitxer o directori té permis de lectura
        if (fitxer.canRead()) {
            // Guardar el simbol de lectura en inspeccio
            System.out.print("r");
        // Del contrari
        } else {
            // Guardar el simbol sense permis de lectura
            System.out.print("-");
        }
        
        // Si el fitxer o directori té permis d'escriptura
        if (fitxer.canWrite()) {
            // Guardar el simbol d'escriptura en inspeccio
            System.out.print("w");
        // Del contrari
        } else {
            // Guardar el simbol sense permis d'escriptura
            System.out.print("-");
        }
        
        // Si el fitxer o directori té permis d'execució
        if (fitxer.canExecute()) {
            // Guardar el simbol d'execució en inspeccio
            System.out.print("x ");
        // Del contrari
        } else {
            // Guardar el simbol sense permis d'execució
            System.out.print("- ");
        }
    }
}
