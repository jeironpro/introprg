/* Aquest programa demana un text i et mostra un nou text amb
* Les vocales en minúscules
* Les altres lletres en majúscules
* Els nombres a dins de parèntesis
* I Nomes els caràcter en blancs, els altres s'eliminessin
*/

public class TransformaText {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        text = text + " ";
        // Declarar e inicialitzar el String nouText buit
        String nouText = "";
        // Declarar e inicialitzar el String vocals amb les vocals que s'accepten
        String vocals = "aàeèéiíïoòóuúü";
        // Declarar e inicialitzar el String nombre buit
        String nombre = "";
        
        // Fer un for per iterar tots els caràcters del text
        for (int i = 0; i < text.length(); i++) {
            // Declarar e inicialitzar el boolean esVocal en false
            boolean esVocal = false;
            // Declarar e inicialitzar el boolean esNombre en false
            boolean esNombre = false;
            
            // Fer un for per iterar totes les vocals que s'accepten
            for (int j = 0; j < vocals.length(); j++) {
                // Verificar si els caràcters del texts són vocals
                if (Character.toLowerCase(text.charAt(i)) == vocals.charAt(j)) {
                    // esVocal serà true
                    esVocal = true;
                } 
            }
            
            // Verificar si és un dígits
            if (Character.isDigit(text.charAt(i))) {
                // Guardar els dígits en el String nombre
                nombre += text.charAt(i);
            // Del contrari, verificar si el String nombre no està buit
            } else if (!nombre.isEmpty()) {
                // Guardar els nombres en el String nouText
                nouText += "(" + nombre + ")";
                // Tornar a possar el String nombre buit, perquè guardi els altres nombres
                nombre = "";
            }
            
            // Verificar si esVocal és true
            if (esVocal) {
                // Guardar la vocal en el String nouText 
                nouText += Character.toLowerCase(text.charAt(i));
            }
            
            // Verificar si és un lletra
            if (Character.isLetter(text.charAt(i)) && !esVocal) {
                // Guardar la lletra en el String nouText
                nouText += Character.toUpperCase(text.charAt(i)); 
            }
            
            // Verificar si és un espai en blanc
            if (i != text.length()-1) {
                if (Character.isWhitespace(text.charAt(i))) {
                    // Guardar l'espai en el String nouText
                    nouText += text.charAt(i);
                }
            }
        }
        // Mostrar el text transformat
        System.out.println(nouText);
    }
}
