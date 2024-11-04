/* Aquest programa demana nombres enters fins que rebi un número negatiu, una cadena buida
* o formada per espais en blanc. Cada vegada que introduiex un nombre dibuixarà un rectangle
* d'asteriscs, la columna va ser el nombre introduït i la fila començarà en 1, despres que introdueix
* un segon nombre la fila sera el nombre introduït anteriorment.
* Per ultim, et mostrarà un resum amb el nombre de rectangles i punts dibuixats o un missatge
* "Cap rectangle dibuixat". 
*/

public class RectanglesAMida {
    public static void main(String[] args) {
        int fila = 1;
        System.out.println(fila + " x ?");
        String columna = Entrada.readLine();
        int rectangle = 0;
        int punts = 0;
        int contadorPunts = 0;
        boolean continuar = true;
        
        while (continuar) {
            if (!columna.isBlank()) {
                int valorColumna = Integer.parseInt(columna);
                if (valorColumna > 0) {
                    System.out.print("  ");
                    for (int j = 0; j < valorColumna; j++) {
                        System.out.print(j);
                    }
                    for (int i = 0; i < fila; i++) {
                        System.out.println();
                        System.out.print(i + " "); 
                        contadorPunts = fila * valorColumna;
                        for (int k = 0; k < valorColumna; k++) {
                            System.out.print("*");
                            if (valorColumna == 9) {
                                k = 0;
                            }
                        }
                    }
                    System.out.println();
                    fila = valorColumna;
                    System.out.println(fila + " x ?");
                    columna = Entrada.readLine();
                    rectangle++; 
                    punts += contadorPunts;     
                } else {
                    continuar = false;
                    System.out.println("Rectangles: " + rectangle);
                    System.out.println("Punts: " + punts);
                }
            } else {
                continuar = false;
                System.out.println("Rectangles: " + rectangle);
                System.out.println("Punts: " + punts);
            }
        }
    }
}
