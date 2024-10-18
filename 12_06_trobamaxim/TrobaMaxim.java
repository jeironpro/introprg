/* Aquest programa demana número entero positius i s'introduiexi 
* qualsevol número negatiu finalitzarà l'execució i et mostrarà
* el número maxim.
*/

public class TrobaMaxim {
    public static void main(String[] args) {
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
        int valorMaxim = 0;
        
        while (valor >= 0) {
            if (valor >= valorMaxim) {
                valorMaxim = valor;            
            }
            
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());            
        }
        System.out.println("El màxim és " + valorMaxim);
    }
}
