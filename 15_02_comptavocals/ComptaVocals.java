/* Aquest programa demana un text i compta quantes vocals conté, 
* incloent les vocals del català. */

public class ComptaVocals {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        String text = Entrada.readLine();
        // Declarar e inicialitzar la variable contador amb 0
        int contador = 0;
        String vocals = "aàeéèiíïoóòuúü";
        
        // Fer un for per iterar tots els caràcter del text
        for (int i = 0; i < text.length(); i++) {
            /*// Verificar si alguns dels caràcters coincideixen amb les vocals
            if (
            text.charAt(i) == 'a' || 
            text.charAt(i) == 'à' || 
            text.charAt(i) == 'e' || 
            text.charAt(i) == 'è' || 
            text.charAt(i) == 'é' || 
            text.charAt(i) == 'i' || 
            text.charAt(i) == 'í' || 
            text.charAt(i) == 'ï' || 
            text.charAt(i) == 'o' || 
            text.charAt(i) == 'ó' || 
            text.charAt(i) == 'ò' || 
            text.charAt(i) == 'u' || 
            text.charAt(i) == 'ú' || 
            text.charAt(i) == 'ü') {
                // Si algun coincideix, sumar-li 1 a contador
               contador += 1;
            }*/
            for (int j = 0; j < vocals.length(); j++) {
                if (text.charAt(i) == vocals.charAt(j)) {
                    contador += 1;
                }
            }
        }
        // Mostrar la quantitat de vocals hi ha al text
        System.out.println(contador);
    }
}
