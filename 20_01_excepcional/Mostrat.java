/*
 * Programa que llegeix un arxiu, en cas que no ho trobi generarà una excepció
 * Pot ser, que l'arxiu no existeix, està bloquejat (no permet lectura)
 * o la ruta indicada està incorrecta o apunta a una altra cosa.
 */

// Importar BufferedReader des del seu paquet
import java.io.BufferedReader;

// Importar FileReader des del seu paquet
import java.io.FileReader;

// Importar IOException des del seu paquet
import java.io.IOException;

public class Mostrat {
    public static void main(String[] args) throws IOException {
        // Establir la ruta(path) com un String
        String cami = "/tmp";
        // Lector d'arxiu per obrir i llegeix caràcter per caràcter l'arxiu de la ruta indicat
        FileReader lectorArxiu = new FileReader(cami);
        // Lector de dades per llegir l'arxiu línia per línia en la ruta indicat
        BufferedReader entrada = new BufferedReader(lectorArxiu);
        
        // Bucle infinit
        while (true) {
            // Llegir cada línia de l'arxiu
            String linia = entrada.readLine();
            // Si està buit, aturar el bucle 
            if (null == linia) break;
            // Mostrar cada línia
            System.out.println(linia);
        }
        // tancar el fitxer
        entrada.close();
    }
}
