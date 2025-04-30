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
 * Les accions es poden cancel·lar pressionat enter.  
 */
 
public class Entorn {
    private final Botiga botiga = new Botiga();
    public static void main(String[] args) {
        Entorn entorn = new Entorn();
        mostraBenvinguda();
        
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
           if (UtilString.esEnter(preu)) {
               preuEnter = UtilString.aEnter(preu);
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
           if (UtilString.esEnter(estoc)) {
               estocEnter = UtilString.aEnter(estoc);
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
            if (UtilString.esEnter(preu)) {
                int preuEnter = UtilString.aEnter(preu);
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
            if (UtilString.esEnter(estoc)) {
                int estocEnter = UtilString.aEnter(estoc);
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
        boolean confirmacio = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());
        
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
}
