/* Aquest programa demana dos valors enters i et mostra tots els valors
* que hi ha entre el primer i segon valor, i vicervesa. 
*/

public class MostraInterval {
    public static void main(String[] args) {
        // Demanar el prime valor
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
        // Demanar el segon valor
        System.out.println("final?");
        int finall = Integer.parseInt(Entrada.readLine());
        
        // Verificar si el valor inici és menor a valor finall
        if (inici < finall) {
            // Com es menor fer un for creixent
            for (int i = inici; i <= finall; i++) {
                // Mostrar el valor de manera creixent des de valor inici fins a valor finall
                System.out.println(i);
            }
        // Del contrari, valor inici és major a valor finall
        } else {
            // Fer un for decreixent
            for (int i = inici; i >= finall; i--) {
                // Mostrar el valor de manera decreixent des de valor inici fins a valor finall
                System.out.println(i);
            }
        }
    }
}
