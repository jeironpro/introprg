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
        String vocals = "aàeèéiíïoòóuúü";
        
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vocals.length(); j++) {
                if (Character.toLowerCase(text.charAt(i)) == vocals.charAt(j)) {
                    nouText += Character.toLowerCase(text.charAt(i));
                }
            }
            
            if (Character.isDigit(text.charAt(i))) {
                if (Character.isDigit(text.charAt(i+1))) {
                    nouText += "(" + text.charAt(i) + text.charAt(i+1)+ ")";
                }
            } else if (Character.isWhitespace(text.charAt(i))) {
                nouText += text.charAt(i);
            } else if (Character.isLetter(text.charAt(i))) {
                nouText += Character.toUpperCase(text.charAt(i));            
            }
        }
        System.out.println(nouText);
    }
}
