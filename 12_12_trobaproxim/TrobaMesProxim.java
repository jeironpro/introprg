/**/

public class TrobaMesProxim {
    public static void main(String[] args) {
        System.out.println("Introdueix l'àncora");
        int ancora = Integer.parseInt(Entrada.readLine());
        int valorMesProxim = 0;
        int valorMaxim = 0;
        
        if (ancora < 0) {
            System.out.println("Àncora no vàlida");
        } else {
            System.out.println("Introdueix un valor");
            int valor = Integer.parseInt(Entrada.readLine());
            
            if (valor < 0) {
                System.out.println("No s'ha introduït cap valor positiu");
            } else {
                while (valor >= 0) {
                
                    if (valor <= (ancora - 1)) {
                        valorMesProxim = valor;
                    }
                    
                    if (valor > ancora) {
                        valorMaxim = valor;
                    }

                    System.out.println("Introdueix un valor");
                    valor = Integer.parseInt(Entrada.readLine());
                }
                if (valor <= (ancora - 1)) {
                    System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorMesProxim);  
                } else if (valor > ancora) {
                    System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorMaxim); 
                }            
            }
        }    
    }
}
