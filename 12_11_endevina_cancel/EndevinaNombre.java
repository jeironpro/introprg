/* Aquest programa és un petit joc que repta els usuaris a endevinar un nombre. 
* El nombre es passa per línia de comandes.
* Els usuaris ha d'introduir enters entre el 1 i el 100 fins que endevini el nombre
* que s'ha passat per la línia de comandes.
* Si s'introdueix un nombre més petit, més gran o fora de rang us mostrarà un missatge.
* Quan ho endevini us mostrarà un missatge que l'heu endevinat.
* Ara si vols finalitzar l'execució pots fer-ho pressionant enter.
*/

public class EndevinaNombre {
    public static void main(String[] args) {
        System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
        System.out.println("Introdueix un valor");
        String cadena = Entrada.readLine();
        int valorEndevinar = Integer.parseInt(args[0]);
        
        if (!cadena.isEmpty()) {
            int valor = Integer.parseInt(cadena);
            while (!cadena.isEmpty() && valor != valorEndevinar) {
                if (valor <= 0) {
                    System.out.println("Com a mínim 1");                    
                } else if (valor > 100) {
                    System.out.println("Com a màxim 100");
                } else if (valor > valorEndevinar) {
                    System.out.println("És més petit que " + valor);
                } else if (valor < valorEndevinar) {
                    System.out.println("És més gran que " + valor);
                }
                System.out.println("Introdueix un valor");
                cadena = Entrada.readLine();
                valor = Integer.parseInt(cadena); 
                
                if (valor == valorEndevinar) {
                    cadena = "";
                }           
            }
            if (valor == valorEndevinar) {
                System.out.println("Has encertat!");            
            } else if (cadena.isEmpty()) {
                System.out.println("Cancel·lat!");   
            }
        } else {
            System.out.println("Cancel·lat!");        
        }
    }
}
