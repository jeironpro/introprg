/**/

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
            
           
            /*
            if (valor >= 0) {
                if (valorCambiat >= valor) {
                    valorMaxim = valorCambiat;            
                } else {
                    valorMaxim = valorMaxim;
                }
            } else if (valorCambiat >= 0 && valor < 0) {
                valorMaxim = valorCambiat;
            } */          
        }
        System.out.println("El màxim és " + valorMaxim);
    }
}
