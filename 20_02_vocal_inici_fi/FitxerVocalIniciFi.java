/*
 * Programa que llegeix un arxiu i mostra les paraules que comencen o acaben en
 * vocal catalana.
 */
 
// Importar BufferedReader des de la seva biblioteca
import java.io.BufferedReader;

// Importar FileReader des de la seva biblioteca
import java.io.FileReader;

// Importar IOException des de la seva biblioteca
import java.io.IOException;

public class FitxerVocalIniciFi {
    public static void main(String[] args) throws IOException {
        // Establir la ruta(path) com un String
        String ruta = "frases.txt";
        // Lector d'arxiu per obrir i llegeix caràcter per caràcter l'arxiu de la ruta indicat
        FileReader lectorArxiu = new FileReader(ruta);
        // Lector de dades per llegir l'arxiu línia per línia en la ruta indicat
        BufferedReader entrada = new BufferedReader(lectorArxiu);
        
        // Bucle infinit
        while(true) {
            // Llegir cada línia de l'arxiu
            String linia = entrada.readLine();
            // Si està buit, aturar el bucle 
            if (linia == null) break;
            
            // Agafar el primer caràcter de la línia
            char primer = linia.charAt(0);
            // Agafar l'últim caràcter de la línia
            char ultimCaracter = linia.charAt(linia.length()-1);
            
            // Si el primer o últim caràcter és una vocal catalana, mostrar la línia
            if (UtilString.esVocal(primer) || UtilString.esVocal(ultimCaracter)) System.out.println(linia);
        }
        // Cerrar l'arxiu
        entrada.close();
    }
}
