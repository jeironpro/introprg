/* Aquest programa demana tres nombres enters no negatius (valor inicial, valor final i salt)
* i et mostra els números entre el valor inicial i el valor final, augmentant des del valor incial 
* amb els salts indicats fins a arribar al valor final. 
*/

public class NaturalsEntre {
    public static void main(String[] args) {
        System.out.println("Valor inicial?");
        int valorInicial = Integer.parseInt(Entrada.readLine());
        System.out.println("Valor final?");
        int valorFinal = Integer.parseInt(Entrada.readLine());
        System.out.println("Salt?");
        int salt = Integer.parseInt(Entrada.readLine());
        int contador = valorInicial;
        
        if (valorInicial < 0 || valorFinal < 0 || salt <= 0 || valorInicial >= valorFinal) {
            System.out.println("Valor no vàlid");
        } else {
            while (contador < valorFinal) {
                System.out.println(contador);
                contador = contador + salt;
            }
        }
    }
}
