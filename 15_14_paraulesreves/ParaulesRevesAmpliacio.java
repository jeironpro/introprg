/* Aquest programa demana un text i et mostra cada paraula del text de manera
* invertida 
* Aquesta és una ampliació que mostra els caràcter que esten en majúscules en su mateixa posició.
*/

public class ParaulesRevesAmpliacio {
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
        // Declarar e inicialitzar el String paraulaAmbMajuscula buit
        String paraulaAmbMajuscula = "";
        
        // Fer un for per iterar cada caràcter del text
        for (int i = 0; i < text.length(); i++) {
            // Verificar si els caràcters és una lletra
            if (Character.isLetter(text.charAt(i))) {
                // Guardar les lletres a paraula
                paraula += text.charAt(i);
                // Guardar les lletres a paraulaAmbMajuscula
                paraulaAmbMajuscula += text.charAt(i);
            // Del contrari
            } else {
                // Declarar e inicialitzar el int m en 0
                int m = 0;
                // Fer un for per iterar de manera invetida la paraula guardada
                for (int j = paraula.length()-1; j >= 0; j--) {
                    // Mostrar la paraula de manera invertida
                    // Verificar si la paraula de manera creixent conté majuscula
                    if (Character.isUpperCase(paraulaAmbMajuscula.charAt(m))) {
                        // Mostrar el caràcter en la posició decreixent en majúscula
                        System.out.print(Character.toUpperCase(paraula.charAt(j)));
                    } else {
                        // Mostrar els altres caràcters en minúscula
                         System.out.print(Character.toLowerCase(paraula.charAt(j)));                    
                    }
                    // Augmentar en 1 m
                    m++;
                }
                // Reinciar la paraula, després que s'hagi mostrat
                // Guardar la següent paraula 
                paraula = "";
                // Reiniciar la paraula, després de verificar si conté majúscula
                // Guardar la següent paraula
                paraulaAmbMajuscula = "";
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
