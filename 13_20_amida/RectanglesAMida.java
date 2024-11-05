/* Aquest programa demana nombres enters fins que rebi un número negatiu, una cadena buida
* o formada per espais en blanc. Cada vegada que introduiex un nombre dibuixarà un rectangle
* d'asteriscs, la columna va ser el nombre introduït i la fila començarà en 1, despres que introdueix
* un segon nombre la fila sera el nombre introduït anteriorment.
* Per ultim, et mostrarà un resum amb el nombre de rectangles i punts dibuixats o un missatge
* "Cap rectangle dibuixat". 
*/

/* Aquest programa té molta redundància, vaig enviar-ho però estaré traballant en la eliminació de la redundància  */

public class RectanglesAMida {
    public static void main(String[] args) {
        int fila = 1;
        System.out.println(fila + " x ?");
        String columna = Entrada.readLine();
        int rectangle = 0;
        int punts = 0;
        int contadorPunts = 0;
        int valorColumnaTmp = 0;
        boolean continuar = true;
        
        while (continuar) {
            if (!columna.isBlank()) {
                int valorColumna = Integer.parseInt(columna);
                valorColumnaTmp = valorColumna;
                if (valorColumna > 0) {
                    System.out.print("  ");
                    for (int i = 0; i < valorColumna; i++) {
                        if (i <= 9) {
                            System.out.print(i);                
                        } else {
                            valorColumna = valorColumna - i;
                            for (int j = 0; j < valorColumna; j++) {
                                System.out.print(j);                    
                            }
                        }
                    }
                    for (int i = 0; i < fila; i++) {
                        contadorPunts = fila * valorColumnaTmp;
                        if (i <= 9) {
                            System.out.println();
                            System.out.print(i + " ");  
                            for (int k = 0; k < valorColumnaTmp; k++) {
                                System.out.print("*");
                            }               
                        } else {
                            fila = fila - i;
                            for (int j = 0; j < fila; j++) {
                                System.out.println();
                                System.out.print(j + " ");
                                for (int k = 0; k < valorColumnaTmp; k++) {
                                    System.out.print("*");
                                }
                            }
                        }
                    }
                    System.out.println();
                    fila = valorColumnaTmp;
                    System.out.println(fila + " x ?");
                    columna = Entrada.readLine();
                    rectangle++; 
                    punts += contadorPunts;     
                } else {
                    continuar = false;
                    if (rectangle <= 0) {
                        System.out.println("Cap rectangle dibuixat");
                    } else {                
                        System.out.println("Rectangles: " + rectangle);
                        System.out.println("Punts: " + punts);
                    }
                }
            } else {
                continuar = false;
                if (rectangle <= 0) {
                    System.out.println("Cap rectangle dibuixat");
                } else {                
                    System.out.println("Rectangles: " + rectangle);
                    System.out.println("Punts: " + punts);
                }
            }
        }
    }
}
