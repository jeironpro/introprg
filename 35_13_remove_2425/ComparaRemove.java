/*
    Aquest programa realitza una comparació de l'operació remove() en
    ArrayList i LinkedList eliminant per l'inici, pel final i pel mig.

    El funcionament de cada prova és el següent:
    - primer s'inicialitza una nova List<Integer> amb la implementació a evaluar.
    - a continuació, s'emplena la llista creada amb enters del 0 a longitud - 1.
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
	test remove(0) LinkedList:     3,135,532
	test remove(0) ArrayList:    359,211,222

	Comparació quan eliminem sempre del final
	test remove(últim) LinkedList:   3,117,985
	test remove(últim) ArrayList:    1,532,920

	Comparació quan eliminem sempre del mig
	test remove(mig) LinkedList:   2,922,600,824
	test remove(mig) ArrayList:      143,857,236

    Segona execució:
    ================
	Comparant l'eficiència de les llistes
	
	Comparació quan eliminem sempre de l'inici
	test remove(0) LinkedList:     2,694,991
	test remove(0) ArrayList:    346,738,908

	Comparació quan eliminem sempre del final
	test remove(últim) LinkedList:   3,240,374
	test remove(últim) ArrayList:    1,516,915

	Comparació quan eliminem sempre del mig
	test remove(mig) LinkedList:   4,473,456,800
	test remove(mig) ArrayList:      145,806,399

    Tercera execució:
    =================
	Comparant l'eficiència de les llistes

	Comparació quan eliminem sempre de l'inici
	test remove(0) LinkedList:     3,975,838
	test remove(0) ArrayList:    288,895,099

	Comparació quan eliminem sempre del final
	test remove(últim) LinkedList:   2,686,791
	test remove(últim) ArrayList:    1,271,954

	Comparació quan eliminem sempre del mig
	test remove(mig) LinkedList:   4,442,961,678
	test remove(mig) ArrayList:      143,097,491

    Resultats
    =========
	========== ===================== ==================== ====================
	**prova**  **linkedList**         **ArrayList**        **resultat**
	---------- --------------------- -------------------- --------------------
	inici          3.268.787         331.615.076          101
	final          3.015.050           1.440.596            2
	mig        3.946.339.767         144.253.708           27
	========== ===================== ==================== ====================
	
    Per calcular cada columna:
    * la cel·la (1, 1) correspon al temps mig de la implementació LinkedList 
      eliminant des de l'inici

      Es calcula sumant els valors obtinguts a les tres execucions i 
      dividint-los per 3


    * el resultat per la fila inici indica quantes vegades és més ràpid un que 
      l'altre. Per fer-ho, dividim

      el valor més gran pel més petit i arrodonim a l'enter.

    Conclusions
    ===========
    En vistes als resultats, en cas que hagi de fer servir una List per eliminar
    molts valors, escolliré: 
    · si es tracta d'eliminar per l'inici escolliré LinkedList
    · si es tracta d'eliminar pel mig o final escolliré ArrayList 
*/

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class ComparaRemove {
    private static int longitud;
    private static List<Integer> llista;

    // mètode emplenaLlista() que emplena la variable llista amb enters del 0 a longitud - 1
    private static void emplenaLLista() {
    	for (int i = 0; i < longitud; i++) {
    		llista.add(i);
    	}
    }

    // mètode testRemove0() que elimina un a un tots els elements de la llista per la posició 0
    private static long testRemove0() {
        long tempsInicial = System.nanoTime();

        for (int i = 0; i < llista.size(); i++) {
        	llista.remove(0);
        }
        return System.nanoTime() - tempsInicial;
    }

    // mètode testRemove() que elimina un a un tots els elements de la llista per la darrera posició
    private static long testRemove() {
    	long tempsInicial = System.nanoTime();
    	
    	for (int i = 0; i < llista.size(); i++) {
    		int fi = llista.size()-1;
    		llista.remove(fi);
    	}
    	return System.nanoTime() - tempsInicial;
    }

    // mètode testRemoveMig() que elimina un a un tots els elements de la llista per la posició mig
    private static long testRemoveMig() {
    	long tempsInicial = System.nanoTime();
    	
    	for(int i = 0; i < llista.size(); i++) {
    		int mig = llista.size() / 2;
    		llista.remove(mig);
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

        System.out.println("Comparant l'eficiència de les llistes");
        System.out.println();

        System.out.println("Comparació quan eliminem sempre de l'inici");

        llista = new LinkedList<Integer>();
        emplenaLLista();
		
		long testIniLinkedList = testRemove0();
        System.out.printf("test remove(0) LinkedList:     %20d%n", testIniLinkedList);

        llista = new ArrayList<Integer>();
        emplenaLLista();
		
		long testIniArrayList = testRemove0();
        System.out.printf("test remove(0) ArrayList:      %20d%n", testIniArrayList);
        System.out.println();

        System.out.println("Comparació quan eliminem sempre del final");

        llista = new LinkedList<Integer>();
        emplenaLLista();
		
		long testFiLinkedList = testRemove();
        System.out.printf("test remove(últim) LinkedList: %20d%n", testFiLinkedList);

        llista = new ArrayList<Integer>();
        emplenaLLista();
		
		long testFiArrayList = testRemove();
        System.out.printf("test remove(últim) ArrayList:  %20d%n", testFiArrayList);
        System.out.println();

        System.out.println("Comparació quan eliminem sempre del mig");

        llista = new LinkedList<Integer>();
        emplenaLLista();
		
		long testMigLinkedList = testRemoveMig();
        System.out.printf("test remove(mig) LinkedList:   %20d%n", testMigLinkedList);

        llista = new ArrayList<Integer>();
        emplenaLLista();
		
		long testMigArrayList = testRemoveMig();
        System.out.printf("test remove(mig) ArrayList:    %20d%n", testMigArrayList);
        System.out.println();
        
        guardaTests(testIniLinkedList,testIniArrayList,testFiLinkedList,testFiArrayList,testMigLinkedList,testMigArrayList);
    }
    
    public static void guardaTests(long testIniLinkedList, 
    						  long testIniArrayList, 
    						  long testFiLinkedList, 
    						  long testFiArrayList, 
    						  long testMigLinkedList, 
    						  long testMigArrayList) throws IOException {
    	File fitxer = new File("tests.csv");
        FileWriter obrirFitxer = new FileWriter(fitxer, true);
        BufferedWriter entrada = new BufferedWriter(obrirFitxer);
        
        if (!fitxer.exists()) {
		    String capcelera = "Test,LinkedList,ArrayList";
		    entrada.write(capcelera);
		    entrada.newLine();        
        }
        
        String testInici = "inici" + "," + testIniLinkedList + "," + testIniArrayList;
        entrada.write(testInici);
        entrada.newLine();
        
        String testFinal = "final" + "," + testFiLinkedList + "," + testFiArrayList;
        entrada.write(testFinal);
        entrada.newLine();
        
        String testMig = "mig" + "," + testMigLinkedList + "," + testMigArrayList;
        entrada.write(testMig);
        entrada.newLine();
        entrada.close();
    }
    
    public static void obtenirResultats() throws IOException {
    	File fitxer = new File("tests.csv");
    	
    	if (fitxer.exists()) {
	    	FileReader obrirFitxer = new FileReader(fitxer);
	        BufferedReader lector = new BufferedReader(obrirFitxer);
        	long testsIniLinkedList = 0;
        	long testsFiLinkedList = 0;
        	long testsMigLinkedList = 0;
        	long testsIniArrayList = 0;
        	long testsFiArrayList = 0;
        	long testsMigArrayList = 0;
        	int comptadorTestIni = 0;
        	int comptadorTestFi = 0;
        	int comptadorTestMig = 0;
	        
	        while (true) {
	        	String linia = lector.readLine();
	        	
	        	if (linia == null) break;
	        	
	        	String[] valorTests = linia.split(",");
	        	
	        	String test = valorTests[0];
	        	if (test.equals("inici")) {
	        		testsIniLinkedList += Long.parseLong(valorTests[1]);
	        		testsIniArrayList += Long.parseLong(valorTests[2]);
	        		comptadorTestIni++;
	        	}
	        	
	        	if (test.equals("final")) {
	        		testsFiLinkedList += Long.parseLong(valorTests[1]);
	        		testsFiArrayList += Long.parseLong(valorTests[2]);
	        		comptadorTestFi++;
	        	}
	        	
	        	if (test.equals("mig")) {
	        		testsMigLinkedList += Long.parseLong(valorTests[1]);
	        		testsMigArrayList += Long.parseLong(valorTests[2]);
	        		comptadorTestMig++;
	        	}
	        }	
	        
	        long mitjaIniLinkedList = testsIniLinkedList / comptadorTestIni;
	        long mitjaIniArrayList = testsIniArrayList / comptadorTestIni;
	        long resultatIni = (Math.max(mitjaIniLinkedList, mitjaIniArrayList) / Math.min(mitjaIniLinkedList, mitjaIniArrayList));
	        
	        long mitjaFiLinkedList = testsFiLinkedList / comptadorTestFi;
	        long mitjaFiArrayList = testsFiArrayList / comptadorTestFi;
	        long resultatFi = (Math.max(mitjaFiLinkedList, mitjaFiArrayList) / Math.min(mitjaFiLinkedList, mitjaFiArrayList));
	        
	        long mitjaMigLinkedList = testsMigLinkedList / comptadorTestMig;
	        long mitjaMigArrayList = testsMigArrayList / comptadorTestMig;
	        long resultatMig = (Math.max(mitjaMigLinkedList, mitjaIniArrayList) / Math.min(mitjaMigLinkedList, mitjaMigArrayList));
	        
	        System.out.println("Resultat test inici LinkedList" + "(" + mitjaIniLinkedList +")" + " vs " + "ArrayList" + "(" + mitjaIniArrayList +")" + ": " +
							   ((testsIniLinkedList < testsIniArrayList) ? 
						   	   "LinkedList guanya per " + resultatIni : 
							   "ArrayList  guanya per " + resultatIni));
			
			System.out.println("Resultat test final LinkedList" + "(" + mitjaFiLinkedList +")" + " vs " + "ArrayList" + "(" + mitjaFiArrayList +")" + ": " +
							   ((testsFiLinkedList < testsFiArrayList) ? 
						   	   "LinkedList guanya per " + resultatFi : 
							   "ArrayList  guanya per " + resultatFi));
			
			System.out.println("Resultat test mig LinkedList" + "(" + mitjaMigLinkedList +")" + " vs " + "ArrayList" + "(" + mitjaMigArrayList +")" + ": " +
							   ((testsMigLinkedList < testsMigArrayList) ? 
						   	   "LinkedList guanya per " + resultatMig : 
							   "ArrayList  guanya per " + resultatMig));
	        lector.close();	           
        }  else {
        	System.out.println("No hi ha cap test");
        	return;
        }
    }
}
