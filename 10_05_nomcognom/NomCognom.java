/*
* Aquest programa demana el nom i el primer cognom als usuaris
*i els mostra un missatge amistós.
*
* El programa no controla valor no adequats d'entrada
*/

public class NomCognom {
    public static void main(String[] args) {
        
        // Obté el nom
        System.out.println("Nom?");
        String nom = Entrada.readLine();
        
        // Obté el cognom
        System.out.println("Cognom?");
        String cognom = Entrada.readLine();
        
        // Mostra resultat
        System.out.println("El " + nom + ", tinc una amiga que també és " + cognom);
    }
}
