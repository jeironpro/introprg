/**/

public class EndevinaNombre {
    public static void main(String[] args) {
        System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
        int valorEndevinar = Integer.parseInt(args[0]);
        
        while (valor > valorEndevinar || valor < valorEndevinar) {
            
            if (valor <= 0) {
                System.out.println("Com a mínim 1");                    
            } else if (valor > 100) {
                System.out.println("Com a màxim 100");
            } else if (valor > valorEndevinar) {
                System.out.println("És més petit que " + valor);
            } else {
                System.out.println("És més gran que " + valor);
            }
            
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
        }
        System.out.println("Has encertat!");
    }
}
