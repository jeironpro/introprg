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
        // Declarar e inicialitzar el String nuevaResposta buit
        String nuevaResposta = "";
        // Fer un for per iterar tots els caràcter de resposta
        for (int i = 0; i < resposta.length(); i++) {
            // Declarar e inicialitzar el char c amb tots els caràcters de resposta
            char c = resposta.charAt(i);
            // Verificar si el caràcter és una lletra
            if (Character.isLetter(c)) {
                // Guardar el caràcter en el String nuevaResposta 
                nuevaResposta += c;
            }
        }
        // si la resposta és null, la donem com a false
        if (null == nuevaResposta) {     
            return false;
        }
        
        // Converteix els caràcters de nuevaResposta a minúscula
        nuevaResposta = nuevaResposta.toLowerCase();
        // Si la nuevaResposta és igual a s o y, retorna true
        if (nuevaResposta.equals("s") || nuevaResposta.equals("y")) {
            return true;
        }
        // Si la nuevaResposta és igual a sí o yes, retorna true
        if (nuevaResposta.equals("sí") || nuevaResposta.equals("yes")) {
            return true;
        }
        // Si la nuevaResposta és igual a si o vale o yeah, retorna true
        if (nuevaResposta.equals("si") || nuevaResposta.equals("vale") || nuevaResposta.equals("yeah")) {
            return true;
        }
        // Si no és cap de la condició anterior retornar false
        return false;

    }

}
