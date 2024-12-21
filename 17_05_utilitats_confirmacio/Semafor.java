/* Aquest programa demana de quin color està el semafor i et dirà que fer.
* Si passar, córrer o parar.
*/

public class Semafor {
    public static void main(String[] args) {
        // Demanar l'edat
        System.out.println("Ets major d'edat?");
        // Verificar si la funció respostaABoolean que s'troba en el fitxer UtilitatsConfirmacio retorna true amb la entrada de l'usuari
        if (UtilitatsConfirmacio.respostaABoolean(Entrada.readLine())) {
            // Demanar el color
            System.out.println("Color?");
            // Llegir el color
            String color = Entrada.readLine();
            
            // Utilitzant Switch Expressions
            String indicacio = switch (color) {
                case "verd" -> "passa";
                case "vermell" -> "espera";
                case "groc" -> "corre!";
                default -> "ves a l'oculista";
            };
            // Mostrar l'indicació del color introdüit
            System.out.println(indicacio);
        // Del contrari        
        } else {
            // Mostrar aquest missatge
            System.out.println("No pots fer servir aquest programa sense supervisió");
        }
    }
}
