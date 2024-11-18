/*
* Programa que indica si el número proporcionat com a primer argument
* és parell o senar.
* Si no s'especifica cap número, el resultat és indeterminat.
*/

public class ParellSenar {
    public static void main(String[] args) {
        // Obtenir el argumento 0 (primer) de la línia de comanda
        int numero = Integer.parseInt(args[0]);
        
        // Operador ternari que verifica si un nombre és parell o senar
        String resultat = (numero % 2 == 0) ? "El número " + numero + " és parell" : "El número " + numero + " és senar";
        
        // Mostrar resultat
        System.out.println(resultat);
    }
}
