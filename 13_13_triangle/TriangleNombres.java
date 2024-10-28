/* Aquest programa rep un valor enter des de l'1 fins a 9, i et mostra un triangle
* des de l'1 fins a l'1, és a dir, començarà en 1 fins que arribi al valor que li has introduït 
* i decrement a 1. 
* Exemple:
* Si el valor introduït és 3;
* el programa mostrarà aquest triagle:
* 1
* 21
* 321
*/

public class TriangleNombres {
    public static void main(String[] args) {
        System.out.println("Nombre?");
        int valor = Integer.parseInt(Entrada.readLine());
        
        if (valor <= 0 || valor > 9) {
            System.out.println("Valor inadequat");
        } else {
            for (int i = 1; i <= valor; i++) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
