/**/

public class TrobaMaxim {
    public static void main(String[] args) {
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
        int valorMaxim = 0;
        
        while (valor >= 0) {
            int valorCambiat = valor;
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine()); 
            
            if (valor >= 0 && valorCambiat >= valor) {
                valorMaxim = valorCambiat;
            } else {
                valorMaxim = valorCambiat;
            }
            
            if (valor >= 0 && valor <= valorCambiat) {
                valorMaxim = valorCambiat;
            }
        }
        System.out.println("El màxim és " + valorMaxim);
    }
}
