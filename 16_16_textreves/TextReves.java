/* Programa que demana un text i ho inverteix. Et mostrarà tots els caràcters invertit separat amb coma incloent l'espais. */
public class TextReves {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Passar-li el valor del text al mòdul
        mostraReves(text);
    }
    
    public static void mostraReves(String text) {
        // Fer un for per iterar tots els caràcter des de l'últim fins al primer
        for (int i = text.length()-1; i >= 0; i--) {
            // Declarar e inicialitzar el char c amb els caràcters del text
            char c = text.charAt(i);
            // Verificar que i sigui diferent a 0
            if (i != 0) {
                // Mostrar el caràcter amb coma
                System.out.print(c + ", ");
            // Del contrari
            } else {
                // Mostrar el caràcter sense coma
                System.out.print(c);
            }
        }
    }
}
