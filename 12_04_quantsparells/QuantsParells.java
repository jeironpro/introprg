/* Aquest programa demana números enters positius i mostrarà el nombre de valors parells
* i finalitza l'execució quan se introduixen números negatius.
*/

public class QuantsParells {
    public static void main(String[] args) {
        // Declarar e inicialitzar la variable valor amb 0
        int valor = 0;
        // Declarar e inicialitzar la variable valorParell amb 0
        // Aquesta variable emmagatzema la quantitat de vegades que el bucle troba un numero parell
        int valorParell = 0;
        
        // El bucle s'executarà mentra el valor sigui positiu
        while (valor > 0) {
            // Demanar el valor
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            
            // Verificar si el valor és parell
            if (valor % 2 == 0) {
                // Sumar un cada vegades que trobe un valor parell
                valorParell = valorParell + 1;
            }
        }
        // Mostrar la quantitat de números parell trobats
        System.out.println("Nombre de parells introduïts: " + valorParell);
    }
}
