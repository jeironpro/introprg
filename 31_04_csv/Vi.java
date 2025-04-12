/*
 * Classe vi, amb tres propietats, nom (que és final), preu, estoc dels vins.
 * Dos constructors específics un per construir vi amb nom i preu 
 * (l'estoc per defecte serà 0), l'altre per construir vi amb estoc.
 * Getter i setter per cada propietat, excepte que la propietat nom no té
 * setter per què no es pot modificar, els setters de preu i estoc no permetran
 * valors negatius.
 * Un mètode esValid que verifica sí les dades del vi són vàlids.
 * Una funció de classe normalitzaNom que rep el nom intruit a la propietat nom
 * i el retorna normalitzat si no és buit, sinó retorna "NOM NO VÀLID!"
 * Sobreescrit el toString per mostra la instància de manera personalitzada.
 */

public class Vi {
    private final String nom;
    private int preu;
    private int estoc = 0;
    
    public Vi(String nom, int preu) {
        this.nom = normalitzaNom(nom);
        if (preu < 0) {
            this.preu = -1;
        } else {
            this.preu = preu;
        }
    }
    
    public Vi(String nom, int preu, int estoc) {
        this.nom = normalitzaNom(nom);
        if (preu < 0) {
            this.preu = -1;
        } else {
            this.preu = preu;
        }
        
        if (estoc < 0) {
            this.estoc = -1;
        } else {
            this.estoc = estoc;
        }
    }
    
    public String getNom() { return this.nom; }
    
    public int getPreu() { return this.preu; }
    
    public void setPreu(int preu) { 
        if (preu > 0) { this.preu = preu; } 
    }
    
    public int getEstoc() { return this.estoc; }
    
    public void setEstoc(int estoc) { 
        if (estoc > 0) { this.estoc = estoc; } 
    }
    
    public boolean esValid() {
        if (this.nom.equals("NOM NO VÀLID!")) { return false; }
        if (this.preu == -1) { return false; }
        if (this.estoc == -1) { return false; }
        return true;
    }
    
    public String[] aArrayString() {
        String[] viArray = new String[3];
        String nom = this.getNom();
        int preu = this.getPreu();
        int estoc = this.getEstoc();
        
        viArray[0] = nom;
        viArray[1] = "" + preu;
        viArray[2] = "" + estoc;
        return viArray;
    }
    
    public static String normalitzaNom(String nom) {
        if (nom.isBlank()) {
            return "NOM NO VÀLID!";
        }
        String nomNormalitzat = "";
        boolean espai = false;
        nom = nom.strip();
        
        for (int i = 0; i < nom.length(); i++) {
            char c = nom.charAt(i);
            
            if (!Character.isWhitespace(c)) {
                nomNormalitzat += c;
                espai = false;
            } else {
                if (!espai) {
                    nomNormalitzat += " ";
                }
                espai = true;            
            }
        }
        return nomNormalitzat;
    }
    
    public static Vi deArrayString(String[] atributsVi) {
        if (atributsVi.length < 3 || atributsVi.length > 3) {
            return null;
        }
        if (!esEnter(atributsVi[1]) || !esEnter(atributsVi[2])) {
            return null;
        }
        String nom = atributsVi[0];
        int preu = aEnter(atributsVi[1]);
        int estoc = aEnter(atributsVi[2]);
        
        Vi vi = new Vi(nom, preu, estoc);
        
        if (!vi.esValid()) { return null; }
        return vi;
    }
    
    @Override
    public String toString() {
        return String.format("%n    Vi: %s%n    Preu: %d%n    Estoc: %d%n", nom, preu, estoc);
    }
    
    /*
     * Aquestes dues següents funcions estan repetides en dos programa diferents
     * perquè estic reestructurant el programa UtilString
    */
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
}
