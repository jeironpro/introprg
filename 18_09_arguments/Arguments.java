/* Programa que verifica si el valor introduït per línia de comanda és enter o no */

public class Arguments {
    public static void main(String[] args) {
        // Fer un for per iterar la longitud de arguments introduït
        for (int i = 0; i < args.length; i++) {
            // Si el argument en la posició de i és enter
            if (UtilString.esEnter(args[i], true)) {
                // Mostrar aquest missatge
                System.out.println("[" + i + "] " + "\"" + args[i] + "\":" + " és enter");
            // Del contrari
            } else {
                // Mostrar aquest missatge
                System.out.println("[" + i + "] " + "\"" + args[i] + "\":" + " no és enter");
            }
        }
    }
}
