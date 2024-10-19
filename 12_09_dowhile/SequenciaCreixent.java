/**/

public class SequenciaCreixent {
    public static void main(String[] args) {
        System.out.println("Introdueix un valor");
        int valorCreixent = Integer.parseInt(Entrada.readLine());
        int valor = 0;
        int valorsCreixents = 0;
        
        do {
            if (valorCreixent > valor) {
                valorsCreixents = valorsCreixents + 1;
            }     
            valor = valorCreixent;  
              
            System.out.println("Introdueix un valor");
            valorCreixent = Integer.parseInt(Entrada.readLine());               
        } while (valorCreixent > valor);
        
        System.out.println("Longitud de la seqüencia creixent: " + valorsCreixents);
    }
}
