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
 *  - Mètode processaAfegeix() -> demana un nom per afegir el vi, si no és buit
 *    demana el preu, si el preu buit ni negatiu, demana l'estoc si no és buit 
 *    ni negatiu afegeix el vi.
 *  - Mètode processaCerca() -> demana un nom per cercar un vi, sí el vi es 
 *    troba en la botiga el mostra.
 *  - Mètode processaModifica() -> demana un nom per modificar un vi, si no és
 *    buit i es troba en la botiga, demana el preu i l'estoc mostrant els valors
 *    anteriors, si el valor introduït per cada dada és major o igual a 0 el
 *    modifica, sinó es queda amb els anteriors.  
 *  - Mètode processaElimina() -> demana un nom per eliminar un vi, ho elimina
 *    si el nom no és buit i es troba en la botiga, abans d'eliminar-ho demana 
 *    Confirmació.
 * Les accions es poden cancel·lar pressionant enter.  
 */

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

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
                case "afegeix": entorn.processaAfegeix();
                    break;
                case "cerca": entorn.processaCerca();
                    break;
                case "modifica": entorn.processaModifica();
                    break;
                case "elimina": entorn.processaElimina();
                    break;
                default: mostraErrorComandaDesconeguda();
            };
        }
        entorn.guardaVins();
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
        System.out.println("afegeix");
        System.out.println("modifica");
        System.out.println("elimina");
        System.out.println("surt");
    }
    
    public static void mostraErrorComandaDesconeguda() {
        System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
    }
    
    public static void mostraComiat() {
        System.out.println("adéu");
    }
    
    public void processaAfegeix() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        
        if (nom.isBlank()) { return; }
        
        System.out.print("preu (en cèntims)> ");            
        String preu = Entrada.readLine();
        
        int preuEnter = 0;
        if (!preu.isBlank()) {
           if (esEnter(preu)) {
               preuEnter = aEnter(preu);
               if (preuEnter < 0) {
                   System.out.println("ERROR: cal un enter positiu");
                   return;
               }                   
           }
        }
        
        System.out.print("estoc (enter sense estoc)> ");
        String estoc = Entrada.readLine();
        
        int estocEnter = 0;
        if (!estoc.isBlank()) {
           if (esEnter(estoc)) {
               estocEnter = aEnter(estoc);
               if (estocEnter < 0) {
                   System.out.println("ERROR: cal un enter positiu");
                   return;
               }
           }
        }
        
        Vi vi = new Vi(nom, preuEnter, estocEnter);
        Vi afegit = botiga.afegeix(vi);
        
        if (afegit == null) {
            System.out.println("ERROR: no s'ha pogut afegir");
            return;
        }
        System.out.printf("Introduït:%s%n", afegit);
    }

    public void processaCerca() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        
        if (!nom.isBlank()) {
            Vi cercat = botiga.cerca(nom);
            if (cercat != null) {
                System.out.printf("Trobat:%s%n", cercat);
                return;
            } else {
                System.out.println("No trobat");
            }
        }
    }
    
    public void processaModifica() {
        System.out.print("nom (enter cancel·la)> ");
        String nomVi = Entrada.readLine();
        if (nomVi.isBlank()) { return; }
        
        Vi vi = botiga.cerca(nomVi);
        if (vi == null) {
            System.out.println("No trobat");
            return;
        }
        
        System.out.printf("preu (enter %d)> ", vi.getPreu());
        String preu = Entrada.readLine();
        if (!preu.isBlank()) {
            if (esEnter(preu)) {
                int preuEnter = aEnter(preu);
                if (preuEnter >= 0) {
                    vi.setPreu(preuEnter);
                } else {
                    System.out.println("ERROR: cal un enter positiu");
                    return;
                }
            }
        }
        System.out.printf("estoc (enter %d)> ", vi.getEstoc()); 
        String estoc = Entrada.readLine();
        if (!estoc.isBlank()) {
            if (esEnter(estoc)) {
                int estocEnter = aEnter(estoc);
                if (estocEnter >= 0) {
                    vi.setEstoc(estocEnter);
                } else {
                    System.out.println("ERROR: cal un enter positiu");
                    return;
                }
            }
        }
        
        System.out.printf("Modificat:%s%n", vi);
    }    
    
    public void processaElimina() {
        System.out.print("nom (enter cancel·la)> ");
        String nomVi = Entrada.readLine();
        
        if (nomVi.isBlank()) { return; }
        
        Vi cercat = botiga.cerca(nomVi);
        if (cercat == null) {
            System.out.println("No trobat");
            return;
        }
        
        System.out.printf("A eliminar:%s%n", cercat);
        System.out.print("Segur?> ");
        boolean confirmacio = respostaABoolean(Entrada.readLine());
        
        if (confirmacio) { 
            Vi eliminar = botiga.elimina(nomVi);
            if (eliminar == null) {
                System.out.println("ERROR: no s'ha pogut eliminar");
                return;
            }
            System.out.println("Eliminat"); 
        } else {
            System.out.println("No eliminat");
            return;
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
    
    public void guardaVins() throws IOException {
        BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta));
        int quantsViGuardat = 0;
        botiga.iniciaRecorregut();
        while (true) {
            Vi vi = botiga.getSeguent();
            if (vi == null) break;
    
            String dadesVi = "";
            String nom = vi.getNom();
            int preu = vi.getPreu();
            int estoc = vi.getEstoc();
            dadesVi += nom + ";" + preu + ";" + estoc; 
            escritor.write(dadesVi);
            escritor.newLine();
            quantsViGuardat++;
        }
        escritor.close();
        System.out.printf("Referències guardades: %s%n", quantsViGuardat);
    }
    
    public static boolean esEnter(String text) {
        if (text.isBlank()) {
            return false;     
        } 
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (text.length() > 1 && i == 0 && (c == '-' || c == '+')) {
                if (!Character.isDigit(text.charAt(i+1))) {
                    return false;
                }
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true; 
    }
    
    public static int aEnter(String text) {
        return Integer.parseInt(text);
    }
    
    public static boolean respostaABoolean(String resposta) {
        String nuevaResposta = "";
        for (int i = 0; i < resposta.length(); i++) {
            char c = resposta.charAt(i);
            if (Character.isLetter(c)) {
                nuevaResposta += c;
            }
        }
        if (null == nuevaResposta) {     
            return false;
        }
        
        nuevaResposta = nuevaResposta.toLowerCase();
        if (nuevaResposta.equals("s") || nuevaResposta.equals("y")) {
            return true;
        }
        if (nuevaResposta.equals("sí") || nuevaResposta.equals("yes")) {
            return true;
        }
        if (nuevaResposta.equals("si") || nuevaResposta.equals("vale") || nuevaResposta.equals("yeah")) {
            return true;
        }
        return false;
    }
}
