/* 
 * Programa que mostra missatge per sortida estàndard mitjançant
 * la herencia de mètodes de altres classes.
 */
class DemoCrides extends Feli {
    public static void main(String[] args) {
        Feli feli = new Feli();
        Gat gat = new Gat();
        GatRenat renat = new GatRenat();

        /* Si faig un System.out.println(feli o gat o rentat)
        * em mostra la posicio de mèmoria de l'objecte*/
        
        feli.netejaUrpes();
        gat.netejaUrpes();
        renat.netejaUrpes();
        gat.miola();
        renat.miola();

        /* Si crec aquesta instància de Menjar en altre linia, 
        * es mostra el missatge en altre posicio */
        Menjar menja = new Menjar("bacallà");
        renat.menja(menja);
    }
}
