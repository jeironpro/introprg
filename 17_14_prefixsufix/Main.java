/* Aquest programa comprova el funcionament de les funció UtilSTring.esPrefix() i esSufix() */
public class Main {
    public static void main(String[] args) {
        System.out.println("Text principal?");
        String principal = Entrada.readLine();
        System.out.println("Subtext?");
        String subtext = Entrada.readLine();
        System.out.println("Estricte?");
        boolean estricte = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());
        System.out.printf("esPrefix(\"%s\", \"%s\", %b) -> %b%n",
                principal, subtext, estricte,
                UtilString.esPrefix(principal, subtext, estricte));
        System.out.printf("esSufix(\"%s\", \"%s\", %b) -> %b%n",
                principal, subtext, estricte,
                UtilString.esSufix(principal, subtext, estricte));
    }
}
