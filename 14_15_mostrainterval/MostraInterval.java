/* Aquest programa demana un text, un nombre de inici i un altre final
* et mostrarà les lletres que estan al rang del valor inici i valor final
* pots ser de manera creixent i decreixent.
*/

public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("text?");
        String text = Entrada.readLine();
        
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
        
        System.out.println("final?");
        int finall = Integer.parseInt(Entrada.readLine());
        
        // Verificar si el valor inici és negatiu
        if (inici < 0) {
            // Com és negatiu, li assigno 0
            inici = 0;
        } 
        // Verificar si el valor finall és negatiu
        if (finall < 0) {
            // Com és negatiu, li assigno 0
            finall = 0;
        }
        // Verificar si valor inici és menor a valor final. Si ho és fer un for creixent
        if (inici < finall) {
            // Verificar si valor final és major a la longitud del text.
            if (finall >= text.length()) {
                // Possar-li el valor final de la longitud del text a finall
                finall = text.length()-1;
            }
            // for creixent, per iterar les lletres que estan en el rang (inici, finall)
            for (int i = inici; i <= finall; i++) {
                // Mostrar les lletres
                System.out.println(text.charAt(i));                    
            }
        // De lo contrario. Fer un for decreixent 
        } else {
            // Verificar si valor inici és major a la longitud del text.
            if (inici >= text.length()) {
                // Possar-li el valor final de la longitud del text a inici
                inici = text.length()-1;
            }
            // for decreixent, per iterar les lletres que estan en el rang (inici, finall)
            for (int j = inici; j >= finall; j--) {
                // Mostrar les lletres
                System.out.println(text.charAt(j));
            }
        }
    }
}
