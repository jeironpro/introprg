/* Aquest programa demana un text i compta quantes vocals conté, 
* incloent les vocals del català. */

public class ComptaVocals {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        String text = Entrada.readLine();
        // Declarar e inicialitzar la variable contador amb 0
        int contador = 0;
        // Declarar e incialitzar la variable vocals amb les vocals
        String vocals = "aàeéèiíïoóòuúü";
        
        // Fer un for per iterar tots els caràcter del text
        for (int i = 0; i < text.length(); i++) {
            // Fer un for per iterar las vocals
            for (int j = 0; j < vocals.length(); j++) {
                // Verificar si els caràcters del text és una vocal
                if (Character.toLowerCase(text.charAt(i)) == Character.toLowerCase(vocals.charAt(j))) {
                    // Si és una vocal, sumar-li 1 a contador
                    contador += 1;
                }
            }
        }
        // Mostrar la quantitat de vocals hi ha al text
        System.out.println(contador);
    }
}
