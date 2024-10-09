/* Aquest programa demana un mes i un any i et torna
* un mes anterior i un mes següent.
*/

public class MesosAnys {
    public static void main(String[] args) {
        
        System.out.println("Mes?");
        int mes = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Any?");
        int any = Integer.parseInt(Entrada.readLine());
        
        if (mes == 1) {
            System.out.println("Mes anterior" + " " + "12" + "/" + (any - 1) + " " + "i mes següent" + " " + (mes + 1) + "/" + any);
        } else if (mes == 12) {
            System.out.println("Mes anterior" + " " + (mes - 1) + "/" + any + " " + "i mes següent" + " " + "1" + "/" + (any + 1));
        } else {
            System.out.println("Mes anterior" + " " + (mes - 1) + "/" + any + " " + "i mes següent" + " " + (mes + 1) + "/" + any);
        }
    }
}
