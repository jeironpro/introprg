/* 
* Programa que demana un text principal i un subtext i si desitja que el programa vaig actuar 
* de manera estricta o flexible, on si la seva resposta és positiva és estricte i negativa és flexible.
* Quan rep les dades demanats, mostra si el subtext introduït és el començament o la terminació del text.
*/
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
