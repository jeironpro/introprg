/* Aquest programa demana un text i et mostra cada paraula del text de manera invertida */

public class ParaulesReves {
    public static void main(String[] args) {
         // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Afegirle un espai al final del text
        // Per poder mostrar els texts (paraules) que no tinguin espai al final
        text = text + " ";
        // Declarar e inicialitzar el String paraula buit
        // Per almacenar cada paraula del text
        String paraula = "";
        
        // Fer un for per iterar cada caràcter del text
        for (int i = 0; i < text.length(); i++) {
            // Verificar si els caràcters és una lletra
            if (Character.isLetter(text.charAt(i))) {
                // Guardar les lletres a paraula
                paraula += text.charAt(i);
            // Del contrari
            } else {
                // Fer un for per iterar de manera invetida la paraula guardada
                for (int j = paraula.length()-1; j >= 0; j--) {
                    // Mostrar la paraula de manera invertida
                    System.out.print(paraula.charAt(j));
                }
                // Reinciar la paraula, després que s'hagi mostrat
                // Guardar la següent paraula 
                paraula = "";
            }
            // Per a evitar mostrar l'espai al final del text
            // Verificar si i és diferent a la longitud del text -1
            if (i != text.length()-1) {
                // Verificar que el caràcter no sigui una lletra
                if (!Character.isLetter(text.charAt(i))) {
                    // Mostrar els caràcter que no sigui una lletra després de cada paraula
                    System.out.print(text.charAt(i));            
                }            
            }
        }
        
    }
}
