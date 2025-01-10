/* Aquest programa demana texts fins que rebre una entrada buida.
* Per cada text introduït et dira si és un enter o no amb móduls.
*/

public class EsEnter {
    public static void main(String[] args) {
        // Demanar els texts
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        // Bucle infinit
        while (true) {
            // Llegir els texts
            String text = Entrada.readLine();
            // Si el text no está buit
            if (!text.isBlank()) {
                // Eliminar els espais que apareixen davant i darrere del text
                text = text.trim();
                // Declarar e inicialitzar el boolean confirmaEnter amb la funció esEnter(li passem el text com argument) que está en el fitxer UtilString
                boolean confirmaEnter = UtilString.esEnter(text);
                // Si confirmaEnter és true
                if (confirmaEnter) {
                    // Mostrar aquest missatge
                    System.out.println("És enter");
                // Del contrari
                } else {
                    // Mostrar aquest missatge
                    System.out.println("No és enter");
                }
            // Del contrari
            } else {
                // Mostrar aquest missatge
                System.out.println("Adéu");
                // Aturar el bucle
                break;
            }        
        }
    }
}
