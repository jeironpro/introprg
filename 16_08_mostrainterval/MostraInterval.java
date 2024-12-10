/* Programa que rep un text i dos nombres, uno d'inici i un altre de final, i et mostra els caràcters que se troban en el rang  */
public class MostraInterval {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Demanar el número de inici
        System.out.println("inici?");
        // Llegir el número de inici
        int inici = Integer.parseInt(Entrada.readLine());
        // Demanar el número final
        System.out.println("final?");
        // Llegir el número final
        int fi = Integer.parseInt(Entrada.readLine());
        // Passar-li els valors llegits
        mostraInterval(text, inici, fi);
    }
    
    public static void mostraInterval(String text, int inici, int fi) {
        // Verificar si el valor inici és negatiu
        if (inici < 0) {
            // Com és negatiu, li assigno 0
            inici = 0;
        } 
        // Verificar si el valor fi és negatiu
        if (fi < 0) {
            // Com és negatiu, li assigno 0
            fi = 0;
        }
        // Verificar si valor inici és major a la longitud del text.
        if (inici >= text.length()) {
            inici = text.length()-1;
        }
        // Verificar si valor fi és major a la longitud del text.
        if (fi >= text.length()) {
            fi = text.length()-1;
        }
        // Verificar si valor inici és menor a valor fi.
        if (inici < fi) {
            // for creixent, per iterar les lletres que estan en el rang (inici, fi)
            for (int i = inici; i <= fi; i++) {
                // Mostrar les lletres
                System.out.println(text.charAt(i));                    
            }        
        } else {
            // for decreixent, per iterar les lletres que estan en el rang (inici, fi)
            for (int i = inici; i >= fi; i--) {
                // Mostrar les lletres
                System.out.println(text.charAt(i));
            }        
        }
    }
}
