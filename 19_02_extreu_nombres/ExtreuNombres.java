/* XXX */

public class ExtreuNombres {
    public static void main(String[] args){
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Declarar e inicialitzar el String nombres amb la funció extreuNombres i passar-li el text
        String nombres = extreuNombres(text);
        // Mostrar els nombres
        System.out.println(nombres);
    }

    // extreu els nombres i els retorna concatenats
    public static String extreuNombres(String text) {
        // cas base
        if (text.isEmpty()) {
            // Retornar el text buit
            return text;
        }
        
        // Declarar e inicialitzar el String nomesNombres buit
        String nomesNombres = "";
        // tracta pas actual
        char primer = text.charAt(0);
        // Si el primer caràcter és un dígit
        if (Character.isDigit(primer)) {
            // Guardar el caràcter en nomesNombres
            nomesNombres += primer;
        }
        
        // tracta pas recursiu
        String restaText = extreuNombres(text.substring(1));
        // composa resultat
        nomesNombres += restaText;
        
        // Retornar els nombres del text
        return nomesNombres;
    }
}
