/* Programa que mostra tres valor que estan emmagatzemats en un array de enters */

public class EntersEntreComes {
    public static void main(String[] args) {
        // Declaració del array numeros
        int[] numeros;
        // Inicialització del array numeros
        numeros = new int[3];
        // Assignar-li un valor en l'index 0
        numeros[0] = 1;
        // Assignar-li un valor en l'index 1
        numeros[1] = 2;
        // Assignar-li un valor en l'index 2
        numeros[2] = 3;
        // Mostrar el valor en l'index 0
        System.out.print(numeros[0]);
        // Fer un for per iterar el array a partir de la posició 1
        for (int i = 1; i < numeros.length; i++) {
            // Mostrar els valor de l'array en la posició de i com una coma abans
            System.out.print(", " + numeros[i]);
        }
        // Fer un salt de línia
        System.out.println();
    }
}
