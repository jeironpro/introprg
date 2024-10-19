/* Aquest programa demana nombres enters creixents i deixa d'executar-se
* quan rep un nombre que no és més gran que l'anterior.
* Per exemple:
* 10, 20, 30, 40, 40 
* 10, 20, 30, 20.
* i finalment et dirà quants valors enters dels introduïts son creixents.
 */

public class SequenciaCreixent {
    public static void main(String[] args) {
        System.out.println("Introdueix un valor:");
        int valorCreixent = Integer.parseInt(Entrada.readLine());
        int valor = 0;
        int valorsCreixents = 0;
        
        do {
            if (valorCreixent > valor) {
                valorsCreixents = valorsCreixents + 1;
            }     
            valor = valorCreixent;  
              
            System.out.println("Introdueix un valor:");
            valorCreixent = Integer.parseInt(Entrada.readLine());               
        } while (valorCreixent > valor);
        
        System.out.println("Longitud de la seqüència creixent: " + valorsCreixents);
    }
}
