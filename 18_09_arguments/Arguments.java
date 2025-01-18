/* Programa que verifica si el valor introduït per línia de comanda és enter o no */

public class Arguments {
    public static void main(String[] args) {
        // Fer un for per iterar la longitud de arguments introduït
        for (int i = 0; i < args.length; i++) {
            int valorEnter = Integer.parseInt(args[i]);
            // Si el argument en la posició de i és enter
            if (valorEnter < 0 || valorEnter > 0) {
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
