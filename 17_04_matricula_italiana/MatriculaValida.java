/* Aquest programa demana una matrícula i et dira si és o no una matrícula italiana vàlida */

public class MatriculaValida {
    public static void main(String[] args) {
        // Demanar la matrícula
        System.out.println("Introduïu una matrícula");
        // Llegir la matrícula
        String matricula = Entrada.readLine();
        // Declarar e inicialitzar el boolean verificarLletra en true
        boolean verificarLletra = true;
        // Declarar e inicialitzar el boolean verificarNombre en false
        boolean verificarNombre = false;
        // Verificar si la matrícula és de longitud correcta
        if (matricula.length() == 7) {
            // Fer un for per iterar tots els caràcters de la matrícula
            for (int i = 0; i < matricula.length(); i++) {
                // Verificar si i és major o igual a 2 i menor o igual a 4
                if (i >= 2 && i <= 4) {
                    // Ignorar els caràcters en aquestes posicions
                    continue;
                }
                // Declarar e inicialitzar el char c amb tots els caràcter de matríçcula
                char c = matricula.charAt(i);
                // Assigar-li la funció esLletraValidaPerMatriculaItaliana al boolean verificarLletra
                verificarLletra = esLletraValidaPerMatriculaItaliana(c);
                
                // Verificar si verificarLletra és false
                if (!verificarLletra) {
                    // Aturar el bucle
                    break;
                }
            }
            // Verificar si els caràcter en les posicions des del 2 fins a 4 són dígits.
            if (Character.isDigit(matricula.charAt(2)) && Character.isDigit(matricula.charAt(3)) && Character.isDigit(matricula.charAt(4))) {
                // verificarNombre será true
                verificarNombre = true;
            }
        }
        // Verificar si verificarLletra i verificarNombre són true
        if (verificarLletra && verificarNombre) {
            // Mostrar aquest missatge
            System.out.println("És una matrícula vàlida");
        }
        // Verificar si la longitud de la matrícula no és correcta o verificarLletra és false o verificarNombre és false
        if (matricula.length() > 7 || !verificarLletra || !verificarNombre) {
            // Mostrar aquest missatge
            System.out.println("No és una matrícula vàlida");
        }
        
    }
    
    public static boolean esLletraValidaPerMatriculaItaliana(char c) {
        // Declarar e inicilitzar el String lletresEspecials amb les lletres que no s'accepten en la matrícula
        String lletresEspecials = "IOQU";
        // Fer un for per iterar tots els caràcters que no s'accepten en la matrícula
        for (int i = 0; i < lletresEspecials.length(); i++) {
            // Declarar e inicialitzar el char ch amb tots els caràcters de lletresEspecials
            char ch = lletresEspecials.charAt(i);
            // Verificar si la lletra és majúscula o el caràcter que rep la funció és igual a els que no s'accepten
            if (!Character.isUpperCase(c) || c == ch) {
                // La funció retornarà false
                return false;
            }
        } 
        // La funció retorna true per defecte
        return true;
    }
}
