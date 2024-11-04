/* Aquest programa demana un número enter i dibuixa triangles com se le indique
* en el número introduït.
* Si el valor introduït es menor a 1, no et mostrarà cap.
*/

public class Triangle  {
    public static void main(String[] args) {
        System.out.println("quants");
        int quantitat = Integer.parseInt(Entrada.readLine());
        
        if (quantitat < 1) {
            System.out.print("");    
        } else {
            for (int i = 0; i < quantitat; i++) {
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
                    for (int n = 0; n < j; n++) {
                        System.out.print(".");
                    }
                    System.out.println();
                }          
            }
        }
    }
}
