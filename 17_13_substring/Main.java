/* 
* Programa que demana un text principal i un subtext i si desitja que el programa vaig actuar 
* de manera estricta o flexible, on si la seva resposta és positiva és estricte i negativa és flexible.
* Quan rep les dades demanats, mostra si el subtext introduït és part del text de manera seqüencial.
*/
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
