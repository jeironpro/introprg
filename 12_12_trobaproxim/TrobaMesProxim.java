 /* Aquest programa demana una ancora i després valors enters positius
 * i quan vulgis finalitzar l'execució introdueix un valor negatiu i et mostrarà
 * el valor més proxim a l'ancora.
 */

public class TrobaMesProxim {
    public static void main(String[] args) {
        System.out.println("Introdueix l'àncora");
        int ancora = Integer.parseInt(Entrada.readLine());
        
        if (ancora < 0) {
            System.out.println("Àncora no vàlida");
        } else {
            System.out.println("Introdueix un valor");
            int valor = Integer.parseInt(Entrada.readLine());
            
            if (valor < 0) {
                System.out.println("No s'ha introduït cap valor positiu");
            } else {
                int valorMesProxim = valor;
                
                while (valor >= 0) {
                    int distancia = valor - ancora;
                    int distanciaNova = Math.abs(distancia);
                     
                    if (distancia < distanciaNova) {
                        valorMesProxim = valor;
                    }
                    
                    if (distancia == distanciaNova && valor < valorMesProxim) {
                        valorMesProxim = valor;
                    }
                    
                    System.out.println("Introdueix un valor");
                    valor = Integer.parseInt(Entrada.readLine());
                    
                    distancia = valor - ancora;
                }  
                    System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorMesProxim);          
            }
        }    
    }
}
