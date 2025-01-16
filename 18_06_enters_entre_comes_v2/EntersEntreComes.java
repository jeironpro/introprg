/* 
* Programa que demana cinc valors i ho emmagatzema en un array de enter
* i mostra aquest valor separat per coma.
*/

public class EntersEntreComes {
    public static void main(String[] args) {
        // Declarar e inicialitzar el array de enters numeros amb cinc valors
        int[] numeros = new int[5];
        // Declarar e inicialitzar el int comptador en 0 
        int comptador = 0;
        // Declarar e incialitzar el int numValor en 1
        int numValor = 1;
        // Fer un while que s'execute mentre comptador sigui menor que la longitud del array numeros
        while (comptador < numeros.length) {
            // Demanar el(s) valor(s)
            System.out.println("Valor " + numValor + "?");
            // Llegir el(s) valor(s)
            int valor = Integer.parseInt(Entrada.readLine());
            // Guardar el valor en l'index corresponent
            numeros[comptador] = valor;
            // Augmentar en 1 comptador
            comptador++;
            // Augmentar en 1 numValor
            numValor++;
        }
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
