/* Aquest programa demana tres nombres enters no negatius (valor inicial, valor final i salt)
* i et mostra els números entre el valor inicial i el valor final, augmentant des del valor incial 
* amb els salts indicats fins a arribar al valor final. 
* Ara amb for.
*/

public class NaturalsEntre {
    public static void main(String[] args) {
        System.out.println("Valor inicial?");
        int valorInicial = Integer.parseInt(Entrada.readLine());
        
        if (valorInicial < 0) {
            System.out.println("Valor no vàlid");
        } else {
            System.out.println("Valor final?");
            int valorFinal = Integer.parseInt(Entrada.readLine());
            
            if (valorFinal < 0) {
                System.out.println("Valor no vàlid");
            } else if (valorInicial > valorFinal) {
                System.out.println("Valor no vàlid");
            } else {
                System.out.println("Salt?");
                int salt = Integer.parseInt(Entrada.readLine());
                
                if (salt <= 0) {
                    System.out.println("Valor no vàlid");
                } else {
                    for (int i = valorInicial; i <= valorFinal; i = i + salt) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
