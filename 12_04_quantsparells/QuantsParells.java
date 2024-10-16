/* Aquest programa demana números enters positius i mostrarà el nombre de valors parells
* i finalitza l'execució quan se introduixen números negatius.
*/

public class QuantsParells {
    public static void main(String[] args) {
        int valor = 0;
        int valorParell = 0;
        
        
        while (valor >= 0) {
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            
            if (valor >= 0) {
                if (valor % 2 == 0) {
                    valorParell = valorParell + 1;
                }
            }
        }
        System.out.println("Nombre de parells introduïts: " + valorParell);
    }
}
