/* Programa que demana texts i categoritza les paraules del text en:
* - Crexient: paraula que el caràcter següent és major a l'anterior.
* - Decreixent: paraula que el caràcter següent és menor a l'anterior.
* - CreixiDecri: paraula que el caràcter següent és major a l'anterior i el següent és menor que l'anterior.
* - DecriCreixi: paraula que el caràcter següent és menor a l'anterior i el següent és major que l'anterior.
  A les paraules passen uns filtres que solo accepta lletres de l'alfabet català i vocals normals.
* Les paraules poden ser estricta o no, les no estricta poden tenir caràcters iguals.
*/

public class Progressio {
    public static void main(String[] args) {
        // Demanar el(s) text(s)
        System.out.println("Introduïu text. Enter per finalitzar.");
        // Fer un while infinit
        while (true) {
            // Llegir el(s) text(s)
            String text = Entrada.readLine();
            // Si el text està buit                
            if (text.isEmpty()) {
                // Aturar el bucle
                break;
            }
            // Eliminar els espais en blancs dels laterals del text
            text = text.strip();
            // Afegir un espai en blanc al final del text
            text = text + " ";
            // Declarar e inicialitzar el String paraula buit
            String paraula = "";
            boolean paraulaValida = false;
            // Fer un for per iterar tots els caràcters del text
            for (int i = 0; i < text.length(); i++) {
                // Agafar els caràcters del text
                char c = text.charAt(i);
                // Si el caràcter no és un espai
                if (!Character.isWhitespace(c)) {
                    // Guardar el caràcter en paraula
                    paraula += c;
                // Del contrari
                } else {
                    if (paraula.length() >= 3) {
                        paraulaValida = true;
                        // La funció esCreixent de UtilString verifica si la paraula és creixent
                        if (UtilString.esCreixent(paraula)) {
                            // Mostrar aquest missatge
                            System.out.println("\"" + paraula + "\"" + " és creixent");
                        // Del contrari, la funció esDecreixent de UtilString verifica si la paraula és decreixent
                        } else if (UtilString.esDecreixent(paraula)) {
                            // Mostrar aquest missatge
                            System.out.println("\"" + paraula + "\"" + " és decreixent");
                        // Del contrari, la funció esCreixiDecri de UtilString verifica si la paraula és creixidecri
                        } else if (UtilString.esCreixiDecri(paraula)) {
                            // Mostrar aquest missatge
                            System.out.println("\"" + paraula + "\"" + " és creixidecri");
                        // Del contrari, la funció esDecriCreixi de UtilString verifica si la paraula és decricreixi
                        } else if (UtilString.esDecriCreixi(paraula)) {
                            // Mostrar aquest missatge
                            System.out.println("\"" + paraula + "\"" + " és decricreixi");
                        // Del contrari, és normaleta
                        } else {
                            // Mostrar aquest missatge
                            System.out.println("\"" + paraula + "\"" + " és normaleta");
                        }   
                        // Reiniciar el String paraula          
                        paraula = "";
                    }
                }
            }
            // Si cap paraula és vàlida
            if (!paraulaValida) {
                // Mostrar aquest missatge
                System.out.println("Cap paraula vàlida");
            }
        }
        // Al finalitzar el bucle, mostrar aquest missatge
        System.out.println("Adéu");
    }
}
