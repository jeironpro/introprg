/* Aquest programa demostra el funcionament de la classe GatRenat amb la funcionalitat Picarol.
* El programa crea un gat i un picarol, fa sonar el picarol sense gat i després li posa
* i el fa moure perquè soni.
* Aquesta versió en realitat no fa cap soroll. */

public class Soroll {
    public static void main(String[] args) {
        Picarol picarol = new Picarol();
        picarol.sona();   // el picarol funciona fins i tot sense gat!
        GatRenat renat = new GatRenat();
        System.out.println(renat.aixecat());
        renat.agafaPicarol(picarol);
        System.out.println(renat.seu());      // ha de sonar el picarol
        System.out.println(renat.seu());      // no sona el picarol doncs no es mou!
        renat.deixaPicarol();
        System.out.println(renat.estirat());  // no sona el picarol doncs ja no el té
        System.out.println("Nombre de cops que sona el picarol: " + picarol.vegades());
    }
}
