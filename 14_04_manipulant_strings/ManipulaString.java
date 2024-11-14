/*
 * Programa que demostra diferents manipulacions amb Strings
 */
public class ManipulaString {
    public static void main(String[] args){
        System.out.println("Paraula?");
        String paraula = Entrada.readLine();

        // Mostra la longitud de la paraula (quantes lletres conté)
        System.out.println("La longitud és " + paraula.length());

        // Mostra la segona lletra de la paraula
        System.out.println("La segona lletra és '" + paraula.charAt(1) + "'");

        // Mostra la darrera lletra de la paraula
        System.out.println("La darrera lletra és " + paraula.substring(paraula.length()-1));

        // Mostra la penúltima lletra de la paraula
        System.out.println("La penúltima lletra és " + paraula.charAt(paraula.length()-2));

        // Mostra la paraula amb totes les lletres en majúscules
        System.out.println("La paraula en majúscules és " + paraula.toUpperCase());

        // Una composició formada per la primera lletra de la paraula en
        // majúscules, seguida de les següents tres lletres en minúscules. Per
        // exemple, si la paraula és «nEkAnE», resultatà en «Neka».
        System.out.println("La composició de quatre primeres és " + paraula.toUpperCase().charAt(0) + paraula.toLowerCase().charAt(1) + paraula.toLowerCase().charAt(2) + paraula.toLowerCase().charAt(3));

        // Mostra una composició formada per la darrera lletra de la paraula,
        // seguida de les tres primeres. (ex. si la paraula és «Nekane»
        // mostrarà «eNek»)
        System.out.println("La composició de quatre és " + paraula.substring(paraula.length()-1) + paraula.charAt(0) + paraula.charAt(1) + paraula.charAt(2));

        // Com en el cas anterior però ara corregint les majúscules i
        // minúscules de manera que la primera sigui majúscules i la resta en
        // minúscules.  (ex. si la paraula és «Nekane» mostrarà «Enek»)
        System.out.println("La composició de quatre corregint majúscules és " + paraula.substring(paraula.length()-1).toUpperCase() + paraula.toLowerCase().charAt(0) + paraula.toLowerCase().charAt(1) + paraula.toLowerCase().charAt(2));
    }
}
