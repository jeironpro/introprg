/*
 * Programa amb el patró del lloro que demana paraules i les guarda en un fixter,
 * si la paraula està buida, et mostra totes les paraules guardats anterioment.
 */

// Importar BufferedReader des de la seva biblioteca
import java.io.BufferedReader;
// Importar FileReader des de la seva biblioteca
import java.io.FileReader;
// Importar BufferedWriter des de la seva biblioteca
import java.io.BufferedWriter;
// Importar FileWriter des de la seva biblioteca
import java.io.FileWriter;
// Importar IOException des de la seva biblioteca
import java.io.IOException;

public class Recorda {
    public static void main(String[] args) throws IOException {
        // Guardar la ruta de l'arxiu en un String
        String ruta = "records.txt";
        // Cridar el mòdul que processaEntrada(i li passem la ruta)
        processaEntrada(ruta);
        // Mostrar aquest missatge
        System.out.println("D'acord");
        // Cridar el mòdul que mostraRecords(i li passem la ruta)
        mostraRecords(ruta);
    }
    
    public static void processaEntrada(String ruta) throws IOException {
        // Escritor de dades que escriura línia per línia en l'arxiu
        BufferedWriter sortida = new BufferedWriter(new FileWriter(ruta));
        
        // Bucle infinit
        while (true) {
            // Demanar paraula
            System.out.println("El lloro pregunta paraula:");
            // Llegir la paraula
            String paraula = Entrada.readLine().strip();
            
            // Si la paraula està buida, surt del bucle
            if (paraula.isEmpty()) break;
            
            // Mostrar que el lloro registreix la paruala
            System.out.printf("El lloro registra: %s%n", paraula);
            // Escruira la paraula en el fixter
            sortida.write(String.format("%s%n", paraula));
        }    
        // Tancar el fitxer
        sortida.close();
    }
    
    public static void mostraRecords(String ruta) throws IOException {
        // Lector d'arxiu per llegir línia per línia l'arxiu
        BufferedReader entrada = new BufferedReader(new FileReader(ruta));

        // Llegir la primera línia de l'arxiu
        String linia = entrada.readLine();
        
        // Si la primera línia és null
        if (linia == null) {
            // Mostrar aquest missatge
            System.out.println("El lloro no recorda res");
        }  
              
        // Bucle infinit
        while (linia != null) {            
            // Mostrar cada línia
            System.out.printf("El lloro recorda: %s%n", linia);

            // Llegir a partir de la segona línia de l'arxiu
            linia = entrada.readLine();
            
            // Si la línia és null, surt del bucle
            if (linia == null) break;
        }
        // Mostrar aquest missatge
        System.out.println("Adéu");
        // Tancar el fitxer
        entrada.close();
    }
}
