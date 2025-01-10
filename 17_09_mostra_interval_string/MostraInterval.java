/* Aquest programa demana un text, un nombre de inici i un altre final
* et mostrarà les lletres que estan al rang del valor inici i valor final
* pots ser de manera creixent i decreixent amb móduls de un altre fitxer.
*/

public class MostraInterval {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Demanar el número de inici
        System.out.println("inici?");
        // Llegir el número de inici
        int ini = Integer.parseInt(Entrada.readLine());
        // Demanar el número final
        System.out.println("final?");
        // Llegir el número final
        int fi = Integer.parseInt(Entrada.readLine());
        // Mostrar el resultat de la funció intervalString(li passem el text, número de inici i número final)
        System.out.println(UtilString.intervalString(text, ini, fi));
    }
}
