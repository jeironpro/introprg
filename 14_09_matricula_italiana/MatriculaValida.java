/* Aquest programa demana una matrícula i et dira si és o no una matrícula italiana vàlida */

public class MatriculaValida {
    public static void main(String[] args) {
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();
        
        if (matricula.length() == 7 && Character.isUpperCase(matricula.charAt(0)) && matricula.charAt(0) >= 'A' && matricula.charAt(0) <= 'Z' && matricula.charAt(0) != 'I' &&matricula.charAt(0) != 'O' && matricula.charAt(0) != 'Q' && matricula.charAt(0) != 'U' && Character.isUpperCase(matricula.charAt(1)) && matricula.charAt(1) >= 'A' && matricula.charAt(1) <= 'Z' && matricula.charAt(1) != 'I' && matricula.charAt(1) != 'O' && matricula.charAt(1) != 'Q' && matricula.charAt(1) != 'U' && Character.isDigit(matricula.charAt(2)) && Character.isDigit(matricula.charAt(3)) && Character.isDigit(matricula.charAt(4)) && Character.isUpperCase(matricula.charAt(5)) && matricula.charAt(5) >= 'A' && matricula.charAt(5) <= 'Z' && matricula.charAt(5) != 'I' && matricula.charAt(5) != 'O' && matricula.charAt(5) != 'Q' && matricula.charAt(5) != 'U' && Character.isUpperCase(matricula.charAt(6)) && matricula.charAt(6) >= 'A' && matricula.charAt(6) <= 'Z' && matricula.charAt(6) != 'I' && matricula.charAt(6) != 'O' && matricula.charAt(6) != 'Q' && matricula.charAt(6) != 'U') {        
            System.out.println("És una matrícula italiana vàlida");
        } else {
            System.out.println("No és una matrícula italiana vàlida");
        }
    }
}
