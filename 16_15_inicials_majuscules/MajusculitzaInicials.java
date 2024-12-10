/* Programa que demana un text i et mostra el text transformat a capitalize (el primer caràcter de cada paraula en majúscula). */
public class MajusculitzaInicials {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Passar-li el valor del text al mòdul
        majusculitzaInicials(text);
    }
    
    public static void majusculitzaInicials(String text) {
        // Verificar si el text no està buit
        if (!text.isEmpty()) {
            // Mostrar el primer caràcter en majúscula
            System.out.print(Character.toUpperCase(text.charAt(0)));
            
            // For per iterar tots els caràcters del text
            for (int i = 1; i < text.length(); i++) {
                // Verificar si el caràcter abans a i és un espai en blanc o un guió
                if ((!Character.isLetter(text.charAt(i-1)) && !Character.isDigit(text.charAt(i-1))) || Character.isWhitespace(text.charAt(i-1)) || text.charAt(i-1) == '-') {
                    // Mostrar el caràcter en majúscula
                    System.out.print(Character.toUpperCase(text.charAt(i)));
                // Del contrari
                } else {
                    // Mostrar el caràcter en minuscula
                    System.out.print(Character.toLowerCase(text.charAt(i)));
                }
            }    
        }
    }
}
