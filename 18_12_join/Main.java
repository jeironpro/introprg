 /* Aquest programa comprova el funcionament de la funció UtilSTring.junta() */
 public class Main {
     public static void main(String[] args) {
         System.out.println("Separador?");
         String separador = Entrada.readLine();
         System.out.println("Darrer separador?");
         String darrerSeparador = Entrada.readLine();
         System.out.println("Valors:");
         if (args.length > 0) {
             for (int i=0; i < args.length; i++) {
                 System.out.printf("- \"%s\"%n", args[i]);
             }
         } else {
             System.out.println("Cap valor");
         }
         System.out.printf("junta(valors, \"%s\", \"%s\") -> \"%s\"%n",
                             separador, darrerSeparador,
                             UtilString.junta(args, separador, darrerSeparador));
     }
 }
