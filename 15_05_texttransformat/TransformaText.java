/* Aquest programa demana un text i et mostra un nou text amb
* Les vocales en minúscules
* Les altres lletres en majúscules
* Els nombres a dins de parèntesis
* I Nomes els caràcter en blancs, els altres s'eliminessin
*/

public class TransformaText {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String nouText = "";
        // String vocals = "aàeèéiíïoòóuúü";
        
        for (int i = 0; i < text.length(); i++) {
            if (
            text.charAt(i) == 'a' || text.charAt(i) == 'à' ||
            text.charAt(i) == 'e' || text.charAt(i) == 'è' ||
            text.charAt(i) == 'é' || text.charAt(i) == 'i' ||
            text.charAt(i) == 'í' || text.charAt(i) == 'ï' ||
            text.charAt(i) == 'o' || text.charAt(i) == 'ó' ||
            text.charAt(i) == 'ò' || text.charAt(i) == 'u' ||
            text.charAt(i) == 'ú' || text.charAt(i) == 'ü'
            ) {
                nouText += Character.toLowerCase(text.charAt(i));
            } else if (Character.isDigit(text.charAt(i))) {
                if (Character.isDigit(text.charAt(i+1))) {
                    nouText += "(" + text.charAt(i) + "" + text.charAt(i+1) + ")";
                }
            } else if (Character.isWhitespace(text.charAt(i))) {
                if (Character.isLetter(text.charAt(i+1))) {
                    nouText += text.charAt(i);
                }
            } else if (Character.isLetter(text.charAt(i))) {
                nouText += Character.toUpperCase(text.charAt(i));            
            }
        }
        System.out.println(nouText);
    }
}
