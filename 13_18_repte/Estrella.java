/* Aquest programa dibuixa una estrella, amb un aspecte semblant a l'estrella de
* David, s'utilitzen les bases del programa triangles, i s'ajusta fins a
* aconseguir l'objectiu. 
* No puc fer-ho com un exercici habitual perquè no es mostraria de manera
* correcta.
*/

public class Estrella  {
    public static void main(String[] args) {
        // Fer un for (decreixent) que itere el números des de 13 fins al 0 
        for(int i = 13; i >= 0; i--) {
            // Fer una linia vertical divisora de la estrella i el border del editor 
            System.out.print(" ");
            // Quan i sigui major o igual a 3 i menor o igual a 13 
            if (i >= 3 && i <= 13) {
                // Aquest for dibuixa el vèrtex superior de l'esquerre
                for (int j = 3; j < i; j++) {
                    if (i == 10) {
                        System.out.print("*");
                    } else if (i == 9 && j >= 4) {
                        System.out.print("*");
                    } else if (i == 8 && j >= 5) {
                        System.out.print("*");
                    } else if (i == 7 && j >= 6) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");                
                    }
                }
                // Aquests dos for dibuixen la base de l'estrella que és el triangle que inclou el vèrtex superior, el centre i els vèrtexs inferiors de l'esquerra i la dreta
                for (int j = i; j <= 13; j++) {
                    System.out.print("*");
                }
                for (int j = 12; j >= i; j--) {
                    System.out.print("*");
                }
                
                // Aquest for dibuixa el vèrtex superior de la dreta
                for (int j = 3; j < i; j++) {
                    if (i == 10) {
                        System.out.print("*");
                    } else if (i == 9 && j <= 7) {
                        System.out.print("*");
                    } else if (i == 8 && j <= 5) {
                        System.out.print("*");
                    } else if (i == 7 && j <= 3) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");                
                    }
                }            
            // Del contrari, quan sigui 2, 1 i 0
            } else {
                // Fer un for per dibuixar el vèrtex inferior
                for (int j = 0; j < 21; j++) {
                    if (i == 2) {
                        if (j <= 7 || j >= 13) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*"); 
                        }
                    } else if (i == 1) {
                        if (j <= 8 || j >= 12) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*"); 
                        }
                    } else if (i == 0) {
                        if (j <= 9 || j >= 11) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*"); 
                        }
                    }
                }
            }
            // Fer un salt de línia per cada iteració de i
            System.out.println();
        }
    }
}
