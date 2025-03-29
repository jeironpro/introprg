/*
 * Programa que comprova que la implementació de les interfícies funcionen 
 * correctament.
 */

public class UsaInterfagats {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        Garfield garfield = new Garfield();
        GatSalvatge gatSalvatge = new GatSalvatge();
        Gat gargamel = new Gat("Gargamel");
        Ensinistrable[] ensinistrables = { renat };
        AnimalDeCompanyia[] animalsDeCompanyia = { renat, garfield };
        EsserViu[] essersVius = {renat, garfield, gatSalvatge, gargamel };
        Gat[] gats = { renat, garfield, gatSalvatge, gargamel };

        System.out.println("Comprovem els mètodes de ensinistrable");
        System.out.println("======================================");
        // per cada element de l'array ensinistrable crida els
        // serveis següents en l'ordre indicat i mostra el seu resultat:
        for (Ensinistrable ensinistrable: ensinistrables) {
            // 1. demana que s'aixequi
            System.out.println(ensinistrable.aixecat());
            // 2. demana si està dret
            System.out.println(ensinistrable.esDret());
            // 3. demana que segui
            System.out.println(ensinistrable.seu());
            // 4. demana si està assegut
            System.out.println(ensinistrable.esAssegut());
            // 5. demana que s'estiri
            System.out.println(ensinistrable.estirat());
            // 6. demana si està estirat
            System.out.println(ensinistrable.esEstirat());
        }

        System.out.println();
        System.out.println("Comprovem els mètodes d'AnimalDeCompanyia");
        System.out.println("=========================================");
        // per cada element de l'array animalsDeCompanyia crida els
        // serveis següents en l'ordre indicat i mostra el seu resultat:
        for (AnimalDeCompanyia animalDeCompanyia: animalsDeCompanyia) {
            // 1. demana que es deuxi estimar
            System.out.println(animalDeCompanyia.deixatEstimar());
        }


        System.out.println();
        System.out.println("Comprovem els mètodes d'Esser viu");
        System.out.println("=================================");
        // per cada element de l'array essersVius crida els
        // serveis següents en l'ordre indicat i mostra el seu resultat:
        for (EsserViu esserViu: essersVius) {
            // 1. demana si està viu
            System.out.println(esserViu.esViu());
            // 2. demana que mori
            System.out.println(esserViu.mor());
            // 3. demana que revisqui
            System.out.println(esserViu.reviu());
        }

        System.out.println();
        System.out.println("Comprovem els mètodes de Gat");
        System.out.println("============================");
        // per cada element de l'array gats crida els
        // serveis següents en l'ordre indicat i mostra el seu resultat:
        for (Gat gat: gats) {
            // 1. demana el nom
            System.out.println(gat.getNom());
            // 2. assigna-li una única vida
            gat.setVides(1);
            // 3. demana que revisqui
            System.out.println(gat.reviu());
            // 4. demana que mori
            System.out.println(gat.mor());
            // 5. demana que mori un altre cop
            System.out.println(gat.mor());
            // 6. demana si està viu
            System.out.println(gat.esViu());
            // 7. demana que revisqui
            System.out.println(gat.reviu());
            // 8. demana quantes vides li queden
            System.out.println(gat.getVides());
        }
    }
}
