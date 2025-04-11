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
    
    public static String normalitzaNom(String nom) {
        if (nom.isBlank()) {
            return "NOM NO VÀLID!";
        }
        String nomNormalitzat = "";
        nom = nom.strip();
        
        boolean espai = false;
        for (int i = 0; i < nom.length(); i++) {
            espai = false;
            char c = nom.charAt(i);
            
            if (!Character.isWhitespace(c)) {
                nomNormalitzat += c;
            } else {
                if (!espai) {
                    nomNormalitzat += " ";
                    espai = true;
                }
            }            
            
        }
        return nomNormalitzat;
    }
    
    @Override
    public String toString() {
        return String.format("%n    Vi: %s%n    Preu: %d%n    Estoc: %d%n", nom, preu, estoc);
    }
}
