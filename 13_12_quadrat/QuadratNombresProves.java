/* Aquest programa rep valors enters des de l'1 fins a 9, i et mostra un quadrat de nombres
* fins al nombre introduït. Si s'introdueix valors menor a 1 o major a 9,
* et mostrarà un missatge de error.
 */

public class QuadratNombresProves {
    public static void main(String[] args) {
        System.out.println("Valor final?");
        int valor = Integer.parseInt(Entrada.readLine());
        
        if (valor <= 0 || valor > 9) {
            System.out.println("Valor inadequat");
        } else {
            // FILA
            for (int i = 1; i <= valor; i++) {
                // COLUMNA
                for (int j = 1; j <= valor; j++) {
                    if (j % 2 == 0) {
                        System.out.print("x");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }        
        }
    }
}
// PROVES 
// Què passa si li treus el salt de línia del bucle extern?
/* es mostra la repetició de nombres en una fila */

// I si li poses salt de línia al print() del recorregut intern?
/* es mostra la repetició de nombres en una columna */

// Què passaria si en comptes de mostrar el valor de columna mostres el de linia?
/* es mostra la repeticio de les files en cada columna */

// Què passa si en comptes de mostrar el valor de columna mostres el de linia + columna
/* es mostra la repeteció dels valors de la fila i al costat es repeteix el número de columna */

// I si mostres el de linia * valorFinal + columna ?
/* es mostra el resultat de la multiplicació i al costat es repeteix el número de columna */

// I si fas el recorregut de linia o el de columna decreixents?
/* si faig el de linia es mostra el mateix quadrat de nombres i si faig el de columna es mostra el quadrat nombres començant per el valor introduit */

// I si fas que el recorregut de columna comenci en comptes de per 1 per linia?
/* es mostra un triangle invertit */

// I si fas que el recorregut de columna finalitzi, en comptes de pel valor final, pel valor de linia?
/* es mostra un triangle */

// Què passa si en comptes de mostrar el valor de columna mostres una X si el valor de columna és parell i un · si és senar?
/* es mostra un quadrat i on el número es parell mostra una x i on es senar mostra un . */
