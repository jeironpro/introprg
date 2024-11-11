/* Aquest programa demana un text principal, un text secundari i un número positiu
i et mostra un inform amb algunes utilitats en base als textos introduïts i el número. */

public class InformeString {
    public static void main(String[] args) {
        // Text principal
        System.out.println("Text principal?");
        String textPrincipal = Entrada.readLine();
        
        // Tex secundari
        System.out.println("Text secundari?");
        String textSecundari = Entrada.readLine();
        
        // Número positiu
        System.out.println("Número positiu?");
        int num = Integer.parseInt(Entrada.readLine());
        
        // Obtenir la longitud (nombre de caràcters) del text principal.
        System.out.println("" + "" + textPrincipal + ".length(): " + textPrincipal.length());
        
        // Verificar si el text principal comença per el text secundari.
        System.out.println("textPrincipal.startsWith(textSecundari): " + textPrincipal.startsWith(textSecundari));
        
        // Verificar si el text principal acaba per el text secundari.
        System.out.println("textPrincipal.endsWith(textSecundari): " + textPrincipal.endsWith(textSecundari));
        
        // Verificar si el text principal és equal que el text secundari.
        System.out.println("textPrincipal.equals(textSecundari): " + textPrincipal.equals(textSecundari));
        
        // Verificar si el text principal és equal que el text secundari ignorant les majúscules.
        System.out.println("textPrincipal.equalsIgnoreCase(textSecundari): " + textPrincipal.equalsIgnoreCase(textSecundari));
        
        // Verificar si el text principal està buit.
        System.out.println("textPrincipal.isBlank(): " + textPrincipal.isBlank());
        
        // Verificar si el text principal està buit.
        System.out.println("textPrincipal.isEmpty(): " + textPrincipal.isEmpty());
        
        // Verificar quina lletra està a la posició num.
        System.out.println("textPrincipal.charAt(num): " + textPrincipal.charAt(num));
        
        // Unir (sumar-li) text principla amb text secundari.
        System.out.println("textPrincipal.concat(textSecundari): " + textPrincipal.concat(textSecundari));
        
        // Repeteix text principal el número de vegades indicat per num.
        System.out.println("textPrincipal.repeat(num): " + textPrincipal.repeat(num));
        
        // Convertir text principal amb totes les lletres en majúscules.
        System.out.println("textPrincipal.toUpperCase(): " + textPrincipal.toUpperCase());
        
        // Convertir text principal amb totes les lletres en minúscules.
        System.out.println("textPrincipal.toLowerCase(): " + textPrincipal.toLowerCase());
    }
}
