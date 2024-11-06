/* Aquest programa crea un mega triangle 
* M'imagino que no es fa d'aquesta manera, però aviat ho faré bé.
*/

public class Trilal {
    public static void main(String[] args) {
        for(int j = 9; j >= 0; j--) {
            for (int k = 0; k < j*2; k++) {
                System.out.print(".");
            }
            for (int l = j; l <= 9; l++) {
                System.out.print(".");
            }
            for (int l = j; l <= 9; l++) {
                System.out.print(l);
            }
            for (int m = 8; m >= j; m--) {
                System.out.print(m);
            }
            for (int k = 0; k <= j*2; k++) {
                System.out.print(".");
            }
            for (int m = 8; m >= j; m--) {
                System.out.print(".");
            }
            System.out.println();
        }        
        for(int j = 9; j >= 0; j--) {
            for (int k = 0; k < j; k++) {
                System.out.print(".");
            }
            for (int l = j; l <= 9; l++) {
                System.out.print(l);
            }
            for (int m = 8; m >= j; m--) {
                System.out.print(m);
            }
            for (int k = 0; k <= j*2; k++) {
                System.out.print(".");
            }
            for (int l = j; l <= 9; l++) {
                System.out.print(l);
            }
            for (int m = 8; m >= j; m--) {
                System.out.print(m);
            }
            for (int n = 0; n < j; n++) {
                System.out.print(".");
            }
            System.out.println();
        }          
    }
}
