/*
 * Donada una resposta textual, aquesta funció tradueix la resposta a
 * un booleà.
 * Considera true quan la resposta és, independentment de majúscules i
 * sense considerar espais a l'inici ni al final,
 * "sí", "s", "yes" o "y", i algunes variants amb errors ortogràfics.
 * Altrament considera false.
 */
public class UtilitatsConfirmacio {
    public static boolean respostaABoolean(String resposta) {
        String nuevaResposta = "";
        for (int i = 0; i < resposta.length(); i++) {
            char c = resposta.charAt(i);
            if (Character.isLetter(c)) {
                nuevaResposta += c;
            }
        }
        
        if (null == nuevaResposta) {     
            return false;
        }
        
        nuevaResposta = nuevaResposta.toLowerCase();
        if (nuevaResposta.equals("s") || nuevaResposta.equals("y")) {
            return true;
        }

        if (nuevaResposta.equals("sí") || nuevaResposta.equals("yes")) {
            return true;
        }
        
        if (nuevaResposta.equals("si") || nuevaResposta.equals("vale") || nuevaResposta.equals("yeah")) {
            return true;
        }
        return false;

    }
}
