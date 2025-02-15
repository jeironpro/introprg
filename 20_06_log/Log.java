/*
 * Aquest programa és la meva biblioteca de logs, compta amb les següents funcions:
 * Una funció que rep un String amb un error i el guarda formatat en un fitxer, i retorna un String amb el mateix error formatat. printError(String)
 *
 * Una funció que rep un String amb un warning i el guarda formatat en un fitxer, i retorna un String amb el mateix warning formatat. printWarning(String)
 *
 * Una funció que rep un String amb una info i el guarda formatat en un fitxer, i retorna un String amb la mateixa info formatat. printInfo(String)
 *
 * Una funció que rep un String amb un debug i el guarda formatat en un fitxer, i retorna un String amb el mateix debug formatat. printDebug(String)
 */
 
// Importar BufferedReader des del seu paquet
import java.io.BufferedReader;
// Importar FileReader des del seu paquet
import java.io.FileReader;
// Importar BufferedWriter des del seu paquet
import java.io.BufferedWriter;
// Importar FileWriter des del seu paquet
import java.io.FileWriter;
// Importar IOException des del seu paquet
import java.io.IOException;

public class Log {
    // Variable global numLog inicialitzat en 0
    private static int numLog = 0;
    // Variable global amb la ruta del fitxer log
    private static final String rutaLog = "log.txt";
    
    public static String printError(String error) throws IOException {
        // Sumar-li 1 a numLog
        numLog = numLog+1;
        // Obrir el fitxer en mode ampliació
        FileWriter escriptorError = new FileWriter(rutaLog, true);
        // Escriptor del fitxer obert
        BufferedWriter sortidaError = new BufferedWriter(escriptorError);
        
        // Escriure l'error en el fitxer
        sortidaError.write(String.format("[%d] ERROR: %s", numLog, error));
        // Escriure un salt de línia
        sortidaError.newLine();
        // Tancar el fitxer
        sortidaError.close();
        // Retornar l'error
        return String.format("[%d] ERROR: %s", numLog, error);
    }
    
    public static String printWarning(String warning) throws IOException {
        // Sumar-li 1 a numLog
        numLog = numLog+1;
        // Obrir el fitxer en mode ampliació
        FileWriter escriptorWarning = new FileWriter(rutaLog, true);
        // Escriptor del fitxer obert
        BufferedWriter sortidaWarning = new BufferedWriter(escriptorWarning);
        
        // Escriure el warning en el fitxer
        sortidaWarning.write(String.format("[%d] WARNING: %s", numLog, warning));
        // Escriure un salt de línia
        sortidaWarning.newLine();
        // Tancar el fitxer
        sortidaWarning.close();
        // Retornar el warning
        return String.format("[%d] WARNING: %s", numLog, warning);
    }
    
    public static String printInfo(String info) throws IOException {
        // Sumar-li 1 a numLog
        numLog = numLog+1;
        // Obrir el fitxer en mode ampliació
        FileWriter escriptorInfo = new FileWriter(rutaLog, true);
        // Escriptor del fitxer obert
        BufferedWriter sortidaInfo = new BufferedWriter(escriptorInfo);
        
        // Escriure l'info en el fitxer
        sortidaInfo.write(String.format("[%d] INFO: %s", numLog, info));
        // Escriure un salt de línia
        sortidaInfo.newLine();
        // Tancar el fitxer
        sortidaInfo.close();
        // Retornar l'info
        return String.format("[%d] INFO: %s", numLog, info);
    }
    
    public static String printDebug(String debug) throws IOException {
        // Sumar-li 1 a numLog
        numLog = numLog+1;
        // Obrir el fitxer en mode ampliació
        FileWriter escriptorDebug = new FileWriter(rutaLog, true);
        // Escriptor del fitxer obert
        BufferedWriter sortidaDebug = new BufferedWriter(escriptorDebug);
        
        // Escriure el debug en el fitxer
        sortidaDebug.write(String.format("[%d] DEBUG: %s", numLog, debug));
        // Escriure un salt de línia
        sortidaDebug.newLine();
        // Tancar el fitxer
        sortidaDebug.close();
        // Retornar el debug
        return String.format("[%d] DEBUG: %s", numLog, debug);
    }
    
    public static void reset() {
        // Reiniciar el numLog a 0
        numLog = 0;
    }
}
