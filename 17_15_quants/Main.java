 /* Aquest programa comprova el funcionament de la funció UtilSTring.quants() */
 public class Main {
     public static void main(String[] args) {
         System.out.println("Text principal?");
         String principal = Entrada.readLine();
         System.out.println("Subtext?");
         String subtext = Entrada.readLine();
         System.out.println("Estricte?");
         boolean estricte = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());
         System.out.printf("quants(\"%s\", \"%s\", %b) -> %d%n",
                           principal, subtext, estricte,
                           UtilString.quants(principal, subtext, estricte));
     }
 }
