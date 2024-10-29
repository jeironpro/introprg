/* Aquest programa demana quatre valors numèric dos valors inicial i final que son
* els primers operands i dos valors incial i final que son els segons operands i 
* realitzarà una taula de multiplicar personalitzada amb els valors que has introduït.
*/

public class TaulaMultiplicar {
    public static void main(String[] args) {
        /*
        System.out.println("El primer argument és " + args[0]);
        System.out.println("El segon argument és " + args[1]);
        System.out.println("El tercer argument és " + args[2]);
        System.out.println("El quart argument és " + args[3]);
        */
        int argsCero = Integer.parseInt(args[0]);
        int argsUno = Integer.parseInt(args[1]);
        int argsDos = Integer.parseInt(args[2]);
        int argsTres = Integer.parseInt(args[3]);
        int multiplicacio = 0;
        
        for (int i = argsCero; i <= argsUno; i++) {
            for (int j = argsDos; j <= argsTres; j++) {
                multiplicacio = i * j;
                System.out.println(i + " x " + j + " = " + multiplicacio); 
            }
            System.out.println();
        }
    }
}
