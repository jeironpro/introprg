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
        System.out.printf("Introduït:%s%n", botiga.afegeix(vi));
    }

    public void processaCerca() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (!nom.isBlank()) {
            if (botiga.cerca(nom) != null) {
                System.out.printf("Trobat:%s%n", botiga.cerca(nom));
                return;
            } else {
                System.out.println("No trobat");
            }
        }
    }
    
    public void processaModifica() {
        System.out.print("nom (enter cancel·la)> ");
        String nomVi = Entrada.readLine();
        
        if (botiga.cerca(nomVi) == null) {
            System.out.println("No trobat");
            return;
        }
        Vi vi = botiga.cerca(nomVi);
        
        System.out.printf("preu (enter %d)> ", vi.getPreu());
        String preu = Entrada.readLine();
        if (!preu.isBlank()) {
            if (esEnter(preu)) {
                int preuEnter = aEnter(preu);
                if (preuEnter >= 0) {
                    vi.setPreu(preuEnter);
                } else {
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
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
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
            }
        }
        
        System.out.printf("Modificat:%s%n", botiga.cerca(nomVi));
    }    
    
    public void processaElimina() {
        System.out.print("nom (enter cancel·la)> ");
        String nomVi = Entrada.readLine();
        if (botiga.cerca(nomVi) == null) {
            System.out.println("No trobat");
            return;
        }
        System.out.printf("A eliminar:%s%n", botiga.cerca(nomVi));
        System.out.print("Segur?> ");
        boolean confirmacio = respostaABoolean(Entrada.readLine());
        if (confirmacio) { 
            Vi viEliminar = botiga.elimina(nomVi);
            if (viEliminar == null) {
                System.out.println("ERROR: no s'ha pogut eliminar");
                return;
            }
            System.out.println("Eliminat"); 
        }
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
