/*
 * Programa principal de la Botiga, que conté amb un prompt interactiu que rep
 * comandes per realitzar les accions d'afegir, cercar, modificar i eliminar
 * vins. Fa servir utilitats de confirmació i utilitats de String. El programa
 * inicialment, mostra un missatge de benvinguda, seguit el prompt i un missatge
 * de comiat quan rep el comanda surt. El comanda ajuda mostra els comandes
 * disponibles.
 * Mètodes de classe:
 *  - mostraBenvinguda() -> mostra el missatge de benvinguda.
 *  - mostraPrompt() -> mostra el prompt.
 *  - mostraAjuda() -> mostra les comandes disponibles.
 *  - mostraErrorComandaDesconeguda() -> mostra el missatge d'error quan
 *    s'introdueix una comanda desconeguda.
 *  - mostraComiat() -> mostra el missatge de comiat.
 *
 * Propietats i mètodes d'instància:
 *  - Propietat botiga: instància global de la botiga.
 *  - Mètode processaCerca() -> demana un nom per cercar un vi, sí el vi es 
 *    troba en la botiga el mostra.
 * Les accions es poden cancel·lar pressionant enter. 
 *
 * Ara el programa no perd dades, amb la persistencia poden guardar els dades
 * dels vins en un fitxer, per fer això s'han agregat una variable global de
 * classe i dos mètodes d'instància:
 *  - Variable de classe quantsVins -> compta quants vins hi ha en el fitxer
 *    botiga.csv.
 *  - Mètode d'instància carregaVins() -> compta i afegeix els vins que hi ha en
 *    el fitxer botiga.csv a la Botiga. 
 *  - Mètode d'instància guardaVins() -> guarda en el fitxer botiga.csv els vins
 *    que hi ha guardat en la Botiga.
 *
 * Ara el programa ja no fa servir els mètodes afegeix, modificar i eliminar, 
 * pel que els comandes no estén disponibles.
 *
 * El mètode cerca, ara processa la cerca amb la referència del vi, o mitjançant
 * una plantilla d'un vi que pot rebre valor especificar per fer la cerca.
 *
 */

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;

public class Entorn {
    private final Botiga botiga = new Botiga();
    private static final String ruta = "botiga.csv";
    private static int quantsVins = 0;
    
    public static void main(String[] args) throws IOException {
        Entorn entorn = new Entorn();
        mostraBenvinguda();
        entorn.carregaVins();        
        
        while (true) {
            mostraPrompt();
            String comanda = Entrada.readLine();
            
            if (comanda.isEmpty()) { continue; }
            if (comanda.equals("surt")) { break; }
            
            switch (comanda) {
                case "ajuda": mostraAjuda();
                    break;
                case "afegeix": mostraComandaNoDisponible();
                    break;
                case "cerca": entorn.processaCerca();
                    break;
                case "modifica": mostraComandaNoDisponible();
                    break;
                case "elimina": mostraComandaNoDisponible();
                    break;
                default: mostraErrorComandaDesconeguda();
            };
        }
        mostraComiat();
    }
    
    public static void mostraBenvinguda() {
        System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
    }
    
    public static void mostraPrompt() {
        System.out.print("botiga> ");
    }
    
    public static void mostraAjuda() {
        System.out.println("Comandes disponibles:");
        System.out.println("ajuda");
        System.out.println("cerca");
        System.out.println("surt");
    }
    
    public static void mostraErrorComandaDesconeguda() {
        System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
    }
    
    public static void mostraComandaNoDisponible() {
    	System.out.println("Comanda temporalment no disponible");
    }
    
    public static void mostraComiat() {
        System.out.println("adéu");
    }
    
    public static String llegirValorPropietat(String propietat) {
    	System.out.print(propietat);
    	String valor = Entrada.readLine();
    	return valor;
    } 

    public void processaCerca() {
        System.out.print("ref> ");
        String ref = Entrada.readLine();

        if (ref.equals("!")) {
            return;
        }
        
    	try {
        	if (!ref.isBlank()) {
		    	Vi cercaRef = botiga.cerca(ref);        	
		    	if (cercaRef != null) {
				    System.out.printf("Trobat:%s%n", cercaRef);
				    return;
				} else {
				    System.out.println("No trobat");
				    return;
				}
		    } else {
		        processaCercaPlantilla();
		    }
        } catch (Exception e) {
    		System.out.println(e);
    	}
    }
    
    public void processaCercaPlantilla() {
    	String ref = "";
    	String nom = "";
        String preu = "";
        String estoc = "";
        String lloc = "";
        String origen = "";
        String tipus = "";
        String collita = "";
        int preuEnter = -1;
        int estocEnter = -1;

        while (true) {
            nom = llegirValorPropietat("nom> ");

            if (nom.equals("!")) {
            	nom = "";
                break;
            }
            
            preu = llegirValorPropietat("preu max.> ");

            if (preu.equals("!")) {
                break;
            }
            
            if (!preu.isEmpty() && !UtilString.esEnter(preu)) {
            	System.out.println("ERROR: el valor ha de ser un enter positiu");
            	return;
            } else if (!preu.isEmpty() && UtilString.esEnter(preu)) {
                preuEnter = UtilString.aEnter(preu);                   
            }
    
            estoc = llegirValorPropietat("estoc min.> ");

            if (estoc.equals("!")) {
                break;
            }
            
            if (!estoc.isEmpty() && !UtilString.esEnter(estoc)) {
            	System.out.println("ERROR: el valor ha de ser un enter positiu");
            	return;
            } else if (!estoc.isEmpty() && UtilString.esEnter(estoc)) {
                estocEnter = UtilString.aEnter(estoc);                   
            }

            lloc = llegirValorPropietat("lloc> ");

            if (lloc.equals("!")) {
            	lloc = "";
                break;
            }
    
            origen = llegirValorPropietat("D.O.> ");

            if (origen.equals("!")) {
            	origen = "";
                break;
            }
    
            tipus = llegirValorPropietat("tipus> ");

            if (tipus.equals("!")) {
            	tipus = "";
                break;
            }
    
            collita = llegirValorPropietat("collita> ");

            if (collita.equals("!")) {
            	collita = "";
                break;
            }
            break;
        }
        try {
		    List<Vi> cercatPlantilla = botiga.cerca(new Vi(ref, nom, preuEnter, estocEnter, lloc, origen, tipus, collita));
		    
		    if (cercatPlantilla.size() == 0) {
			    System.out.println("No trobat");
				return;		    	
		    }
		    System.out.printf("Trobat:%n");
		    for (Vi vi: cercatPlantilla) {
		    	System.out.println(vi);
	    	}
    	} catch (Exception e) {
    		System.out.println(e);
    	}
    }
    
    public void carregaVins() throws IOException {
        File fitxer = new File(ruta);
        if (fitxer.exists()) {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            
            while (true) {
                String dadesVi = lector.readLine();
                if (dadesVi == null) { break; }
                
                String[] arrayVi = dadesVi.split(";");
                Vi vi = Vi.deArrayString(arrayVi);
                if (vi != null) {
		            botiga.afegeix(vi);
	                quantsVins++;
                }
            }
            lector.close();
        } 
        System.out.printf("Referències llegides: %s%n", quantsVins);
    }
}
