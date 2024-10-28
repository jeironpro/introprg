/* Aquest programa rep valors enters des de l'1 fins a 9, i et mostra un quadrat de nombres
* fins al nombre introduït. Si s'introdueix valors menor a 1 o major a 9,
* et mostrarà un missatge de error.
 */

public class QuadratNombres {
    public static void main(String[] args) {
        System.out.println("Valor final?");
        int valor = Integer.parseInt(Entrada.readLine());
        
        if (valor <= 0 || valor > 9) {
            System.out.println("Valor inadequat");
        } else {
            for (int i = 1; i <= valor; i++) {
                for (int j = 1; j <= valor; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }        
        }
    }
}
