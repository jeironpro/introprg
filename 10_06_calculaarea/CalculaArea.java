/*
* El programa calcula l'area d'un cercle agafant el radi i les unitats introduit per l'usuari.
* Per Exemple: java CalculaArea
 Càlcul de l'area d'un cercle
 Introduïu el radi:
 2
 Introduïu les unitats (ex. cm):
 cm
 L'area és 78.53975 cm^2
*/

public class CalculaArea {
    public static void main(String[] args) {
        System.out.println("Càlcul de l'àrea d'un cercle");
        System.out.println("Introduïu el radi:");
        String linia = Entrada.readLine();
        System.out.println("Introduïu les unitats (ex. cm):");
        String unitats = Entrada.readLine();
        float radi = Float.parseFloat(linia);
        float area = (float)Math.PI * radi * radi;
        System.out.println("L'àrea és " + area + unitats);
    }
}
