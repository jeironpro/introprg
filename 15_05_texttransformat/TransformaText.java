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
            Character.toLowerCase(text.charAt(i)) == 'a' ||
            Character.toLowerCase(text.charAt(i)) == 'à' ||
            Character.toLowerCase(text.charAt(i)) == 'e' || 
            Character.toLowerCase(text.charAt(i)) == 'è' ||
            Character.toLowerCase(text.charAt(i)) == 'é' || 
            Character.toLowerCase(text.charAt(i)) == 'i' ||
            Character.toLowerCase(text.charAt(i)) == 'í' ||
            Character.toLowerCase(text.charAt(i)) == 'ï' || 
            Character.toLowerCase(text.charAt(i)) == 'o' ||
            Character.toLowerCase(text.charAt(i)) == 'ó' ||
            Character.toLowerCase(text.charAt(i)) == 'ò' || 
            Character.toLowerCase(text.charAt(i)) == 'u' ||
            Character.toLowerCase(text.charAt(i)) == 'ú' || 
            Character.toLowerCase(text.charAt(i)) == 'ü'
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
