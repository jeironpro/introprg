/*
    Aquest programa realitza una comparació de l'operació remove() en
    HashMap i TreeMap eliminant per l'inici, pel final i pel mig.

    El funcionament de cada prova és el següent:
    - primer s'inicialitza un nou Map amb la implementació a evaluar.
    - a continuació, s'emplena el map creada amb enters del 0 a longitud - 1.
    - finalment s'executa el mètode corresponent que elimina tots els
      valors des de diferents posicions, i retorna el temps invertit.

    En aquesta capçalera, s'inclou un resum dels resultats obtinguts amb les 
    proves realitzades per l'autor/autora d'aquest lliurament:

    La longitud escollida ha estat: 100000

    Els resultats obtinguts han estat:

    Primera execució:
    =================
	Comparant l'eficiència de les llistes

	Comparació quan eliminem sempre de l'inici
	test remove(0) HashMap:
	test remove(0) TreeMap:

	Comparació quan eliminem sempre del final
	test remove(últim) HashMap:
	test remove(últim) TreeMap:

	Comparació quan eliminem sempre del mig
	test remove(mig) HashMap:
	test remove(mig) TreeMap:

    Segona execució:
    ================
	Comparant l'eficiència de les llistes
	
	Comparació quan eliminem sempre de l'inici
	test remove(0) HashMap:
	test remove(0) TreeMap:

	Comparació quan eliminem sempre del final
	test remove(últim) HashMap:
	test remove(últim) TreeMap:

	Comparació quan eliminem sempre del mig
	test remove(mig) HashMap:
	test remove(mig) TreeMap:

    Tercera execució:
    =================
	Comparant l'eficiència de les llistes

	Comparació quan eliminem sempre de l'inici
	test remove(0) HashMap:
	test remove(0) TreeMap:

	Comparació quan eliminem sempre del final
	test remove(últim) HashMap:
	test remove(últim) TreeMap:

	Comparació quan eliminem sempre del mig
	test remove(mig) HashMap:
	test remove(mig) TreeMap:

    Resultats
    =========
	========== ===================== ==================== ====================
	**prova**  **HashMap**         **TreeMap**        **resultat**
	---------- --------------------- -------------------- --------------------
	inici                            
	final                               
	mig                         
	========== ===================== ==================== ====================

    Conclusions
    ===========
    En vistes als resultats, en cas que hagi de fer servir una List per eliminar
    molts valors, escolliré: 
    · si es tracta d'eliminar per l'inici escolliré:
    · si es tracta d'eliminar pel mig o final escolliré:
*/

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class ComparaRemove {
    private static int longitud;
    private static Map<String, Integer> map;

    // mètode emplenamap() que emplena la variable map amb enters del 0 a longitud - 1
    private static void emplenamap() {
    	for (int i = 0; i < longitud; i++) {
    		String id = "id" + i;
    		map.put(id, i);
    	}
    }

    // mètode testRemove0() que elimina un a un tots els elements del map per la posició 0
    private static long testRemove0() {
        long tempsInicial = System.nanoTime();

        for (int i = 0; i < map.size(); i++) {
        	String id = "id" + i;
        	map.remove(id);
        }
        return System.nanoTime() - tempsInicial;
    }

    // mètode testRemove() que elimina un a un tots els elements del map per la darrera posició
    private static long testRemove() {
    	long tempsInicial = System.nanoTime();
    	
    	for (int i = 0; i < map.size(); i++) {
    		String id = "id" + (map.size()-1);
    		map.remove(id);
    	}
    	return System.nanoTime() - tempsInicial;
    }

    // mètode testRemoveMig() que elimina un a un tots els elements del map per la posició mig
    private static long testRemoveMig() {
    	long tempsInicial = System.nanoTime();
    	
    	for(int i = 0; i < map.size(); i++) {
    		String id = "id" + (map.size() / 2);
    		map.remove(id);
    	}
    	return System.nanoTime() - tempsInicial;
    }

    public static void main(String[] args) throws IOException {
        /* En cas que no es cridi amb un argument o bé aquest no sigui enter, 
           o aquest sigui menor de 100.000, cal mostrar missatge d'error
           corresponent i finalitzar.l'execució.Altrament, utilitzar el valor
           rebut per assignar-li a longitud
        */
        if (args.length == 0) {
        	System.out.println("Vull obtenir resultats?");
        	boolean confirmacio = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());
        	
        	if (confirmacio) {
        		obtenirResultats();
        		return;
        	}
        	System.out.println("Ha d'introduir un argument");
        	return;
        }
        
        if (!UtilString.esEnter(args[0])) {
        	System.out.println("L'argument ha de ser un enter");
        	return;
        }
        
        if (UtilString.aEnter(args[0]) < 100000) {
        	System.out.println("El valor no pot ser menor a 100.000");
        	return;
        }
    	longitud = UtilString.aEnter(args[0]);

        System.out.println("Comparant l'eficiència dels maps");
        System.out.println();

        System.out.println("Comparació quan eliminem sempre de l'inici");

        map = new HashMap<String, Integer>();
        emplenamap();
		
		long testIniHashMap = testRemove0();
        System.out.printf("test remove(0) HashMap:     %20d%n", testIniHashMap);

        map = new TreeMap<String, Integer>();
        emplenamap();
		
		long testIniTreeMap = testRemove0();
        System.out.printf("test remove(0) TreeMap:      %20d%n", testIniTreeMap);
        System.out.println();

        System.out.println("Comparació quan eliminem sempre del final");

        map = new HashMap<String, Integer>();
        emplenamap();
		
		long testFiHashMap = testRemove();
        System.out.printf("test remove(últim) HashMap: %20d%n", testFiHashMap);

        map = new TreeMap<String, Integer>();
        emplenamap();
		
		long testFiTreeMap = testRemove();
        System.out.printf("test remove(últim) TreeMap:  %20d%n", testFiTreeMap);
        System.out.println();

        System.out.println("Comparació quan eliminem sempre del mig");

        map = new HashMap<String, Integer>();
        emplenamap();
		
		long testMigHashMap = testRemoveMig();
        System.out.printf("test remove(mig) HashMap:   %20d%n", testMigHashMap);

        map = new TreeMap<String, Integer>();
        emplenamap();
		
		long testMigTreeMap = testRemoveMig();
        System.out.printf("test remove(mig) TreeMap:    %20d%n", testMigTreeMap);
        System.out.println();
        
        guardaTests(testIniHashMap,testIniTreeMap,testFiHashMap,testFiTreeMap,testMigHashMap,testMigTreeMap);
    }
    
    public static void guardaTests(long testIniHashMap, 
    						  long testIniTreeMap, 
    						  long testFiHashMap, 
    						  long testFiTreeMap, 
    						  long testMigHashMap, 
    						  long testMigTreeMap) throws IOException {
    	File fitxer = new File("tests.csv");
        FileWriter obrirFitxer = new FileWriter(fitxer, true);
        BufferedWriter entrada = new BufferedWriter(obrirFitxer);
        
        if (!fitxer.exists()) {
		    String capcelera = "Test,HashMap,TreeMap";
		    entrada.write(capcelera);
		    entrada.newLine();        
        }
        
        String testInici = "inici" + "," + testIniHashMap + "," + testIniTreeMap;
        entrada.write(testInici);
        entrada.newLine();
        
        String testFinal = "final" + "," + testFiHashMap + "," + testFiTreeMap;
        entrada.write(testFinal);
        entrada.newLine();
        
        String testMig = "mig" + "," + testMigHashMap + "," + testMigTreeMap;
        entrada.write(testMig);
        entrada.newLine();
        entrada.close();
    }
    
    public static void obtenirResultats() throws IOException {
    	File fitxer = new File("tests.csv");
    	
    	if (fitxer.exists()) {
	    	FileReader obrirFitxer = new FileReader(fitxer);
	        BufferedReader lector = new BufferedReader(obrirFitxer);
        	long testsIniHashMap = 0;
        	long testsFiHashMap = 0;
        	long testsMigHashMap = 0;
        	long testsIniTreeMap = 0;
        	long testsFiTreeMap = 0;
        	long testsMigTreeMap = 0;
        	int comptadorTestIni = 0;
        	int comptadorTestFi = 0;
        	int comptadorTestMig = 0;
	        
	        while (true) {
	        	String linia = lector.readLine();
	        	
	        	if (linia == null) break;
	        	
	        	String[] valorTests = linia.split(",");
	        	
	        	String test = valorTests[0];
	        	if (test.equals("inici")) {
	        		testsIniHashMap += Long.parseLong(valorTests[1]);
	        		testsIniTreeMap += Long.parseLong(valorTests[2]);
	        		comptadorTestIni++;
	        	}
	        	
	        	if (test.equals("final")) {
	        		testsFiHashMap += Long.parseLong(valorTests[1]);
	        		testsFiTreeMap += Long.parseLong(valorTests[2]);
	        		comptadorTestFi++;
	        	}
	        	
	        	if (test.equals("mig")) {
	        		testsMigHashMap += Long.parseLong(valorTests[1]);
	        		testsMigTreeMap += Long.parseLong(valorTests[2]);
	        		comptadorTestMig++;
	        	}
	        }	
	        
	        long mitjaIniHashMap = testsIniHashMap / comptadorTestIni;
	        long mitjaIniTreeMap = testsIniTreeMap / comptadorTestIni;
	        long resultatIni = (Math.max(mitjaIniHashMap, mitjaIniTreeMap) / Math.min(mitjaIniHashMap, mitjaIniTreeMap));
	        
	        long mitjaFiHashMap = testsFiHashMap / comptadorTestFi;
	        long mitjaFiTreeMap = testsFiTreeMap / comptadorTestFi;
	        long resultatFi = (Math.max(mitjaFiHashMap, mitjaFiTreeMap) / Math.min(mitjaFiHashMap, mitjaFiTreeMap));
	        
	        long mitjaMigHashMap = testsMigHashMap / comptadorTestMig;
	        long mitjaMigTreeMap = testsMigTreeMap / comptadorTestMig;
	        long resultatMig = (Math.max(mitjaMigHashMap, mitjaIniTreeMap) / Math.min(mitjaMigHashMap, mitjaMigTreeMap));
	        
	        System.out.println("Resultat test inici HashMap" + "(" + mitjaIniHashMap +")" + " vs " + "TreeMap" + "(" + mitjaIniTreeMap +")" + ": " +
							   ((testsIniHashMap < testsIniTreeMap) ? 
						   	   "HashMap guanya per " + resultatIni : 
							   "TreeMap  guanya per " + resultatIni));
			
			System.out.println("Resultat test final HashMap" + "(" + mitjaFiHashMap +")" + " vs " + "TreeMap" + "(" + mitjaFiTreeMap +")" + ": " +
							   ((testsFiHashMap < testsFiTreeMap) ? 
						   	   "HashMap guanya per " + resultatFi : 
							   "TreeMap  guanya per " + resultatFi));
			
			System.out.println("Resultat test mig HashMap" + "(" + mitjaMigHashMap +")" + " vs " + "TreeMap" + "(" + mitjaMigTreeMap +")" + ": " +
							   ((testsMigHashMap < testsMigTreeMap) ? 
						   	   "HashMap guanya per " + resultatMig : 
							   "TreeMap  guanya per " + resultatMig));
	        lector.close();	           
        }  else {
        	System.out.println("No hi ha cap test");
        	return;
        }
    }
}
