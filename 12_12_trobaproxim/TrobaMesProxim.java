 /* Aquest programa demana una ancora i després valors enters positius
 * i quan vulgis finalitzar l'execució introdueix un valor negatiu i et mostrarà
 * el valor més proxim a l'ancora.
 */

public class TrobaMesProxim {
    public static void main(String[] args) {
        System.out.println("Introdueix l'àncora");
        int ancora = Integer.parseInt(Entrada.readLine());
        int valorMesProxim = 0;
        boolean valorEncontrat = false;
        
        if (ancora < 0) {
            System.out.println("Àncora no vàlida");
        } else {
            System.out.println("Introdueix un valor");
            int valor = Integer.parseInt(Entrada.readLine());
            
            if (valor < 0) {
                System.out.println("No s'ha introduït cap valor positiu");
            } else {
                while (valor >= 0) {                
                    
                    if (valor == (ancora - 1)) {
                        valorMesProxim = valor;
                        valorEncontrat = true;
                        if (valorEncontrat && valor < ancora) {
                            valorMesProxim = valor;
                            valorEncontrat = true;
                        }
                        if (!valorEncontrat && valor > ancora - 1 || valor == ancora) {
                            valorMesProxim = valor;
                            valorEncontrat = true;
                        } 
                    }
                    
                    System.out.println("Introdueix un valor");
                    valor = Integer.parseInt(Entrada.readLine());
                }  
                System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorMesProxim);          
            }
        }    
    }
}
