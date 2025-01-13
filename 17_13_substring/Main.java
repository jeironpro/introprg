/* Aquest programa es utilitza per provar la funció esSubstring */

public class Main {
    public static void main(String[] args) {
        System.out.println("Text principal?");
        String principal = Entrada.readLine();
        System.out.println("Subtext?");
        String subtext = Entrada.readLine();
        System.out.println("Estricte?");
        boolean estricte = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());
        System.out.printf("esSubstring(\"%s\", \"%s\", %b) -> %b%n",
                          principal, subtext, estricte,
                          UtilString.esSubstring(principal, subtext, estricte));
    }
}
