/*
 * Programa que accedeix a un fitxer origen (txt) amb un text, i un altre fitxer 
 * traducció (csv) amb claus i valors (valors separat per comes) i finalment escriu 
 * en un fitxer destinació (txt) la traducció del text origen amb els valors del fitxer
 * traducció. 
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

public class Traduccio {
    public static void main(String[] args) throws IOException {
        // Si la longitud dels arguments és major o igual a 3 
        if (args.length >= 3) {
            // Obtenir el primer argument (fitxer origen)
            String origen = args[0];
            // Obtenir el segon argument (fitxer traducció)
            String traduccio = args[1];
            // Obtenir el tercer argument (fitxer destinació)
            String destinacio = args[2];
            // Cridar el mòdul que fa la traducció i passar-li els arguments
            tradueix(origen, traduccio, destinacio);
        }
    } // Listo
    
    public static void tradueix(String fitxerOrigen, String fitxerTraduccio, String fitxerDestinacio) throws IOException {
        // Lector d'arxiu per obrir i llegeix caràcter per caràcter l'arxiu de la ruta indicat
        FileReader lectorOrigen = new FileReader(fitxerOrigen);
        // Lector de dades per llegir l'arxiu línia per línia en la ruta indicat
        BufferedReader entradaOrigen = new BufferedReader(lectorOrigen);
        
        // Escriptor d'arxiu per obrir i escriure caràcter per caràcter en l'arxiu de la ruta indicat
        FileWriter escritorDestinacio = new FileWriter(fitxerDestinacio);
        // Escriptor de dades per escriure línia per línia en l'arxiu de la ruta indicat
        BufferedWriter sortidaDestinacio = new BufferedWriter(escritorDestinacio);
        
        // Bucle infinit
        while (true) {
            // Guardar en un String cada línia llegida pel BufferedReader entradaOrigen
            String liniaOrigen = entradaOrigen.readLine();
            
            // Si la línia és null, surt del bucle
            if (liniaOrigen == null) break;
            
            // Agafar el valor de retorn del mòdul tradueixLinia
            String liniaTraduccio = tradueixLinia(liniaOrigen, fitxerTraduccio);
        
            // Escriure en el fitxer destinació cada línia resultant de liniaTraduccio 
            sortidaDestinacio.write(liniaTraduccio);
            // Escriure un salt de línia
            sortidaDestinacio.newLine();
        }
        // Tancar el fitxer origen
        entradaOrigen.close();
        // Tancar el fitxer destinació
        sortidaDestinacio.close();
    }
    
    public static String tradueixLinia(String linia, String fitxerTraduccio) throws IOException {
        // Guardar en un String la línia per traduir
        String traduccio = linia;
        
        // Lector d'arxiu per obrir i llegeix caràcter per caràcter l'arxiu de la ruta indicat
        FileReader lectorTraduccio = new FileReader(fitxerTraduccio);
        // Lector de dades per llegir l'arxiu línia per línia en la ruta indicat
        BufferedReader entradaTraduccio = new BufferedReader(lectorTraduccio);
        
        // Bucle infinit
        while (true) { 
            // Guardar en un String cada linia llegida pel BufferedReader entradaTraduccio
            String liniaTraduccio = entradaTraduccio.readLine();
            
            // Si la línia és null, surt del bucle
            if (liniaTraduccio == null) break;
            
            // Converteix la línia del fitxer traducció en un array de String
            String[] dicTraduccio = liniaTraduccio.split(",");
            
            // Guardar la clau de la línia del fitxer traducció
            String clau = dicTraduccio[0].strip();
            // Guardar el valor de la línia del fitxer traducció
            String valor = dicTraduccio[1].strip();
            // Reemplaçar cada coincidència de la línia del fitxer origen a la clau de la línia del fixter traducció
            traduccio = traduccio.replace(clau, valor);        
        }
        // Tancar el fitxer traduccio
        entradaTraduccio.close();
        // Retornar la traducció
        return traduccio;   
    }
    
    /*public static int quantesLinies(String fitxer) throws IOException {
        // Comptador de línies
        int comptador = 0;
        // Lector d'arxiu per obrir i llegeix caràcter per caràcter l'arxiu de la ruta indicat
        FileReader lector = new FileReader(fitxer);
        // Lector de dades per llegir l'arxiu línia per línia en la ruta indicat
        BufferedReader entrada = new BufferedReader(lector);
        
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
    }*/
}
