/*
 * Programa que utilitza la classe Botiga, per crear una botiga i li afegeix vins,
 * també utilitza els metodes de instància de la botiga.
 */

public class UsaBotiga {
    public static void main(String[] args) {
        System.out.println("Creem uns quants vins");
        Vi[] vins = {
            new Vi("Roura Blanc", 1234, 42),
            new Vi("Cercium", 535, 30),
            new Vi("Llum d'Alba Blanc", 1750, 12)
        };

        for (int i=0; i<vins.length; i++) {
            System.out.println("Creat" + vins[i]);
        }

        Botiga botiga = new Botiga(vins.length - 1);    // no hi cabran tots els vins
        System.out.println("Afegim els vins creats a la botiga");

        for (int i=0; i<vins.length; i++) {
            Vi resposta = botiga.afegeix(vins[i]);
            System.out.println("En afegir" + vins[i] + "la botiga ens respon " + resposta);
        }

        System.out.printf("%nCerquem uns vins%n");
        String nomVi = vins[1].getNom();
        Vi resposta = botiga.cerca(nomVi);
        System.out.println("En cercar " + nomVi + " botiga ens respon " + resposta);
        nomVi = vins[vins.length - 1].getNom();
        resposta = botiga.cerca(nomVi);
        System.out.println("En cercar " + nomVi + " botiga ens respon " + resposta);
    }
}
