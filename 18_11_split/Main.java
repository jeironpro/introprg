    /* Aquest programa comprova el funcionament de la funció UtilSTring.separa() */
    public class Main {
        public static void main(String[] args) {
            System.out.println("Text principal?");
            String principal = Entrada.readLine();
            System.out.println("Inclou espais?");
            boolean inclouBlancs = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());
            String[] paraules = UtilString.separa(principal, inclouBlancs);
            System.out.printf("separa(\"%s\", %b) ->%n", principal, inclouBlancs);
            if (paraules.length > 0) {
                for (int i=0; i < paraules.length; i++) {
                    System.out.printf("- \"%s\"\n", paraules[i]);
                }
            } else {
                System.out.println("Cap resultat");
            }
        }
    }

