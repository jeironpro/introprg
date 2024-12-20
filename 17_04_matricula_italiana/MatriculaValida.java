/* Aquest programa demana una matrícula i et dira si és o no una matrícula italiana vàlida */

public class MatriculaValida {
    public static void main(String[] args) {
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();
        boolean verificarLletra = false;
        if (matricula.length() == 7) {
            for (int i = 0; i < matricula.length(); i++) {
                char c = matricula.charAt(i);
                verificarLletra = esLletraValidaPerMatriculaItaliana(c);
            }
        } else {
            System.out.println("No és una matrícula italiana vàlida");
        }
        if (verificarLletra) {
            System.out.println("És una matrícula italiana vàlida");
        }
    }
    
    public static boolean esLletraValidaPerMatriculaItaliana(char c) {
        String lletresEspecials = "IOQU";
        boolean conteLletresEspecials = false;
        for (int i = 0; i < lletresEspecials.length(); i++) {
            char ch = lletresEspecials.charAt(i);
            if (c == ch) {
                conteLletresEspecials = true;
            }
        }
        if ((c >= 'A' && c <= 'Z') && !conteLletresEspecials) {
            return true;
        }
        return false;
    }
}
