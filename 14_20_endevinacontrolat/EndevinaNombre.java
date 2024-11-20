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
        System.out.println("Nombre?");
        String cadena = Entrada.readLine();
        int valorEndevinar = Integer.parseInt(args[0]);
        int valor = 0;
        boolean enter = false;
           
        while (true) {
            if (!cadena.isEmpty()) {
                for (int i = 0; i < cadena.length(); i++) {
                    if (Character.isDigit(cadena.charAt(i))) {
                        enter = true;
                        valor = Integer.parseInt(cadena);
                    } else {
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
                if (!enter) {
                    System.out.println("Només nombres");
                } else if (valor <= 0 || valor > 100) {
                    System.out.println("Fora de rang");                    
                } else if (valor > valorEndevinar) {
                    System.out.println("Massa gran");
                } else if (valor < valorEndevinar) {
                    System.out.println("Massa petit");
                } else {
                    System.out.println("Encertat!");
                    break;
                }
            } else {
                System.out.println("Cancel·lat!");
                break;            
            }
            System.out.println("Nombre?");
            cadena = Entrada.readLine();
        }
    }
}
