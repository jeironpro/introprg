/*
 * Classe vi, amb vuit propietats, ref (que és final), nom (que és final), preu,
 * estoc, lloc, origen, tipus, collita dels vins.
 * Un constructor específic un per construir un vi amb tots els atributs.
 * Getter i setter per cada propietat, excepte que les propietats ref i nom no 
 * tenen setter per què no es pot modificar, els setters de preu i estoc no
 * permetran valors negatius.
 * Un mètode esValid que verifica sí les dades del vi són vàlids.
 * Una funció de classe normalitzaString que rep un String i el retorna
 * normalitzat si no és buit, altrament retorna null.
 * Sobreescrit el toString per mostra la instància de manera personalitzada.
 * 
 * Ara, per poder simplificar la lectura i el guardat del vins de la Botiga
 * s'han agregat dos mètodes d'instancia:
 * Mètode aArrayString que converteix un vi en un array de Strings.
 * Mètode deArrayString que rep un array de Strings i retorna un vi si els
 * dades són vàlides.
 */

public class Vi {
    private final String ref;
    private final String nom;
    private int preu;
    private int estoc = 0;
    private String lloc;
    private String origen;
    private String tipus;
    private String collita;
    
    public Vi(String ref, String nom, int preu, int estoc, String lloc, String origen, String tipus, String collita) {
        this.ref = normalitzaString(ref);
        this.nom = normalitzaString(nom);
        
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
        
        this.lloc = normalitzaString(lloc);
        this.origen = normalitzaString(origen);
        this.tipus = normalitzaString(tipus);
        this.collita = normalitzaString(collita);
    }

    public String getRef() {
        return this.ref;
    }
    
    public String getNom() { 
        return this.nom; 
    }
    
    public int getPreu() { 
        return this.preu; 
    }
    
    public void setPreu(int preu) { 
        if (preu >= 0) { 
            this.preu = preu; 
        } 
    }
    
    public int getEstoc() { 
        return this.estoc; 
    }
    
    public void setEstoc(int estoc) { 
        if (estoc >= 0) { 
            this.estoc = estoc; 
        } 
    }

    public String getLloc() {
        return this.lloc;
    }

    public void setLloc(String lloc) {
        this.lloc = lloc;
    }

    public String getOrigen() {
        return this.origen;
    }

    public String getTipus() {
        return this.tipus;
    }

    public String getCollita() {
        return this.collita;
    }
    
    public boolean esValid() {
        String[] atributs = new String[] {
            this.ref, this.nom, this.lloc, this.origen, this.tipus, this.collita
        };

        for (String atribut: atributs) {
            if (atribut == null) {
                return false;
            }
        }

        if (this.preu == -1) { 
            return false; 
        }
        
        if (this.estoc == -1) { 
            return false; 
        }
        return true;
    }
    
    public String[] aArrayString() {
        String ref = this.getRef();
        String nom = this.getNom();
        int preu = this.getPreu();
        int estoc = this.getEstoc();
        String lloc = this.getLloc();
        String origen = this.getOrigen();
        String tipus = this.getTipus();
        String collita = this.getCollita();
        
        String[] viArray = new String[] {
            ref, nom, "" + preu, "" + estoc, lloc, origen, tipus, collita
        };
        return viArray;
    }
    
    public static String normalitzaString(String cadena) {
        if (cadena == null || cadena.isBlank()) {
            return null;
        }

        String normalitzat = "";
        boolean espai = false;
        cadena = cadena.strip();
        
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            
            if (!Character.isWhitespace(c)) {
                normalitzat += c;
                espai = false;
            } else {
                if (!espai) {
                    normalitzat += " ";
                }
                espai = true;            
            }
        }
        return normalitzat;
    }
    
    public static Vi deArrayString(String[] atributsVi) {
        if (atributsVi.length != 8) {
            return null;
        }
        if (!UtilString.esEnter(atributsVi[2])) {
            return null;
        }
        if (!UtilString.esEnter(atributsVi[3])) {
            return null;
        }

        String ref = atributsVi[0];
        String nom = atributsVi[1];
        int preu = UtilString.aEnter(atributsVi[2]);
        int estoc = UtilString.aEnter(atributsVi[3]);
        String lloc = atributsVi[4];
        String origen = atributsVi[5];
        String tipus = atributsVi[6];
        String collita = atributsVi[7];
        
        Vi vi = new Vi(ref, nom, preu, estoc, lloc, origen, tipus, collita);
        
        if (!vi.esValid()) { 
            return null; 
        }
        return vi;
    }
    
    @Override
    public String toString() {
        return String.format("%n    Ref: %s%n    Nom: %s%n    Preu: %d%n    Estoc: %d%n    Lloc: %s%n    D.O.: %s%n    Tipus: %s%n    Collita: %s%n", ref, nom, preu, estoc, lloc, origen, tipus, collita);
    }
}
