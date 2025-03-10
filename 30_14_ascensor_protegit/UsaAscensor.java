/*
 * Programa que utilitza la classe del programa Ascensor i la seves propietats privats
 * mitjançant els mòduls getter i setter.
 */

public class UsaAscensor {
    public static void main(String[] args) {
        // Crear una instància de la classe Ascensor
        Ascensor ascensor = new Ascensor();
        // Mostrar el valor inicial de la propietat pis des de el mòdul getPis de la classe Ascensor
        System.out.println("Pis inicial: " + ascensor.getPis());
        // Mostrar el valor inicial de la propietat moviment des de el mòdul getMoviment de la classe Ascensor
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        // Si hi ha més o un argument
        if (args.length >= 1) {
            // Si l'argument 0 és un enter
            if (UtilString.esEnter(args[0])) {
                // Setear el nou pis
                ascensor.setPis(Integer.parseInt(args[0]));
            }
            // Si hi ha més de un argument
            if (args.length > 1) {
                // Setear el nou moviment
                ascensor.setMoviment(args[1]);
            }
        }
        
        // Mostrar el valor final de la propietat pis des de el mòdul getPis
        System.out.println("Pis final: " + ascensor.getPis());
        // Mostrar el valor final de la propietat moviment des de el mòdul getMoviment
        System.out.println("Moviment final: " + ascensor.getMoviment());
    }

}
