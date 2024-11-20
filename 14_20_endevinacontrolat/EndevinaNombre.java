/* Aquest programa és un petit joc que repta els usuaris a endevinar un nombre. 
* El nombre es passa per línia de comandes.
* Els usuaris ha d'introduir enters entre el 1 i el 100 fins que endevini el 
* nombre que s'ha passat per la línia de comandes.
* Si s'introdueix un nombre més petit, més gran o fora de rang 
* us mostrarà un missatge indicant aquestes condicions.
* Quan ho endevini us mostrarà un missatge que l'heu endevinat.
* Ara si vols finalitzar l'execució pots fer-ho pressionant enter.
* Aquesta nova versió acepta ell signes + i -
* Si s'introdueix lletres et mostrarà un missatge dient que "només nombres".
*/

public class EndevinaNombre {
    public static void main(String[] args) {
        // Demanar nombre
        System.out.println("Nombre?");
        String cadena = Entrada.readLine();
        // Prendre el primer argument de la línia de comanda
        int valorEndevinar = Integer.parseInt(args[0]);
        // Declarar e inicialitzar la variable valor amb 0
        int valor = 0;
        // Declarar e incialitzar enter com false
        boolean enter = false;
        
        // Utilitzant un bucle infinit que acaba amb break
        while (true) {
            // Verificar que la cadena no està buida
            if (!cadena.isEmpty()) {
                // Fer un for per iterar tots els caràcter de la cadena
                for (int i = 0; i < cadena.length(); i++) {
                    // Verificar si tots el caràcter són dígits
                    if (Character.isDigit(cadena.charAt(i))) {
                        // Com són dígits convertir a int
                        valor = Integer.parseInt(cadena);
                        // i enter és true
                        enter = true;
                    // Del contrari
                    } else {
                        // enter és false
                        enter = false;
                    }
                }
                // Verificar si el caràcter 0 és un signe de - o +
                if (cadena.charAt(0) == '-' || cadena.charAt(0) == '+') {
                    // Verificar si el caràcter 1 és un dígit
                    if (Character.isDigit(cadena.charAt(1))) {
                        // Com el caràcter 0 es un signe i el caràcter 1 és un dígit, enter es true
                        enter = true;
                    }                            
                }
                // Verificar si enter és false
                if (!enter) {
                    System.out.println("Només nombres");
                // Verificar si el valor està fora del rang
                } else if (valor <= 0 || valor > 100) {
                    // Mostrar aquest missatge
                    System.out.println("Fora de rang"); 
                // Verificar si el valor és major al valor a endevinar                   
                } else if (valor > valorEndevinar) {
                    // Mostrar aquest missatge
                    System.out.println("Massa gran");
                // Verificar si el valor és menor al valor a endevinar
                } else if (valor < valorEndevinar) {
                    // Mostrar aquest missatge
                    System.out.println("Massa petit");
                } else {
                    // Mostrar aquest missatge
                    System.out.println("Encertat!");
                    // Finalitzar el programa
                    break;
                }
            } else {
                // Mostrar aquest missatge
                System.out.println("Cancel·lat!");
                // Finalitzar el programa
                break;            
            }
            // Tornar a demanar la cadena a dins del bucle
            System.out.println("Nombre?");
            cadena = Entrada.readLine();
        }
    }
}
