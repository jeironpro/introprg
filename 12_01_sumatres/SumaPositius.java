/* Aquest programa demana tres valors i només suma els positius */

public class SumaPositius {
    public static void main(String[] args) {
        
        // creem la variable on guardarem el resultat de suma
        int suma = 0;   // inicialment no hem sumat res i per tant és 0
        
        // demanem valors
        
        // declarem la variable que contindrá els valors llegits
        int valor;
        
        // processem el primer valor
        System.out.println("Introdueix el primer valor");
        valor = Integer.parseInt(Entrada.readLine());
        
        if (valor >= 0) {
            suma = suma + valor;
        }
        
        // processem el segon valor
        System.out.println("Introdueix el segon valor");
        valor = Integer.parseInt(Entrada.readLine());
        
        if (valor >= 0) {
            suma = suma + valor;
        }
        
        System.out.println("Introdueix el tercer valor");
        valor = Integer.parseInt(Entrada.readLine());
        
        if (valor >= 0) {
            suma = suma + valor;
        }
        
        // mostrem el resultat
        System.out.println("La suma és " + suma);
    }   
}
