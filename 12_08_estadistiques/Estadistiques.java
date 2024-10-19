/**/

public class Estadistiques {
    public static void main(String[] args) {
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
        int valorMaxim = 0;
        int valorMinim = 0;
        double sumaValor = 0;
        double cantidadValor = 0;
        
        if (valor < 0) {
            System.out.println("Cap valor vàlid introduït");
        } else {
            while (valor >= 0) {
                if (valor >= valorMaxim) {
                    valorMaxim = valor;
                } else if (valor < valorMinim && valorMinim <= valorMaxim) {
                    valorMinim = valor;
                } else {
                    valorMinim = valorMinim;
                }
                
                if (valor >= 0 && valor <= 100) {
                    sumaValor = sumaValor + valor;
                    cantidadValor = cantidadValor + 1; 
                }
                System.out.println("Introdueix un valor");
                valor = Integer.parseInt(Entrada.readLine());
            }
            System.out.println("El mínim és: " + valorMinim);
            System.out.println("La mitjana és: " + (sumaValor / cantidadValor));
            System.out.println("El màxim és: " + valorMaxim);        
        }
    }
}
