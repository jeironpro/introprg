/* Aquest programa rep un nombre positiu major a 0 i et mostra per pantalla
* tots els nombres en una lìnia des de 1 fins al numero que li has introduit i 
* en la següent lìnia disminuïrà el valor que li has introduït i així successivament
* fins a arribar a 1.
* Exemple:
* Si l'introduïm 3:
* 1, 2, 3
* 1, 2
* 1  
*/

public class TriangleInvertit {
    public static void main(String[] args) {
        System.out.println("Nombre?");
        int valor = Integer.parseInt(Entrada.readLine());
        
        if (valor <= 0 || valor > 9) {
            System.out.println("Valor inadequat");
        } else {
            for (int i = valor; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    if (i == 1) {
                        System.out.print(j);
                    } else if (j == i) {
                        System.out.print(j);
                    }
                     else {
                        System.out.print(j + ", ");                    
                    }
                }
                System.out.println();
            }
        }
    }
}
