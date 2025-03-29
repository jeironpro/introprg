/*
 * Programa que fa servir la superclasse Gat i l'interfície AnimalDeCompanyia.
 * Conté un constructor per defecte, i sobreescriu el mètode deixatEstimar de
 * l'interfície AnimalDeCompanyia.
 */
 
class Garfield extends Gat implements AnimalDeCompanyia {
    // Constructor per defecte
    public Garfield() {
        super("Garfield");
    }
    
    @Override
    // Mètode de l'interfície AnimalDeCompanyia (sobreescrit)  
    public String deixatEstimar() {
        return "em deixo estimar, però només una mica";
    }
}
