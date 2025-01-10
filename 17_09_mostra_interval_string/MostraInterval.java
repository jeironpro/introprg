/**/

public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("text?");
        String text = Entrada.readLine();
        
        System.out.println("inici?");
        int ini = Integer.parseInt(Entrada.readLine());
        
        System.out.println("final?");
        int fi = Integer.parseInt(Entrada.readLine());
        
        System.out.println(UtilString.intervalString(text, ini, fi));
    }
}
