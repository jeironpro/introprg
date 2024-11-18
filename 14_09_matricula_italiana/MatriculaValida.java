/* Aquest programa demana una matrícula i et dira si és o no una matrícula italiana vàlida */

public class MatriculaValida {
    public static void main(String[] args) {
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();
        boolean primerPatro = false;
        boolean segonPatro = false;
        boolean tercerPatro = false;
        
        if (matricula.length() == 7) {
            for (int i = 0; i < matricula.length(); i++) {
                if (i >= 0 && i <= 1) {
                    if (Character.isUpperCase(matricula.charAt(i)) && matricula.charAt(i) >= 'A' && matricula.charAt(i) <= 'Z' && matricula.charAt(i) != 'I' && matricula.charAt(i) != 'O' && matricula.charAt(i) != 'Q' && matricula.charAt(i) != 'U') {
                        primerPatro = true;
                    }
                }
                if (i >= 2 && i <=4) {
                    if (Character.isDigit(matricula.charAt(i))) {
                        segonPatro = true;
                    }
                }
                if (i >= 5 && i <= 6) {
                    if (Character.isUpperCase(matricula.charAt(i)) && matricula.charAt(i) >= 'A' && matricula.charAt(i) <= 'Z' && matricula.charAt(i) != 'I' && matricula.charAt(i) != 'O' && matricula.charAt(i) != 'Q' && matricula.charAt(i) != 'U') {
                        tercerPatro = true;
                    }
                }
                
            }        
            if (primerPatro == true && segonPatro == true && tercerPatro == true) {
                System.out.println("És una matrícula italiana vàlida"); 
            } else {
                System.out.println("No és una matrícula italiana vàlida");
            }
        }
    }
}
