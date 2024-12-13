/* Aquest programa demana una text i et mostra els caràcter següent 
* de cada caràcter del text sempre i quan sigui minúscula.
* Cada caràcter té un codi ASCII i mitjant aquest codi poden obtenir 
* el següent caràcter
*/

public class CodificaBasic {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // llegir el text
        String text = Entrada.readLine();
        // Demanar la quantitat
        System.out.println("Quants?");
        // Llegir la quantitat
        int quants = Integer.parseInt(Entrada.readLine());
        // Passar-li els valors llegits al mòdul
        codifica(text, quants);
    }
    
    public static void codifica(String text, int quants) {
        // Verificar que quants sigui major o igual a 0
        if (quants > 0) {
            int contador = 0;
            // Fer un for per iterar els caràcters del text
            for (int i = 0; i < text.length(); i++) {
                // Declarar e inicialitzar el char c amb els caràcters del text
                char c = text.charAt(i);
                
                // Verificar si el caràcter està en el rang des de l'a fins a l'z
                if (c >= 'a' && c <= 'z') {
                    if ((c + quants) > 122) {
                        quants = (c + quants) - 123;
                    }
                    
                    if (quants > 26) {
                        quants = quants % 26;
                    }
                    if ((c + quants) <= 122) {
                        if (c == 'z') {
                            // El caràcter serà l'a
                            c = 96;
                        }  
                        System.out.print((char)(c+quants));                    
                    } else {
                        c = 96;
                        quants++;
                        // Mostrar el caràcter corresponent a la suma
                        System.out.print((char)(c+quants));   
                    }
                // Del contrari
                } else {
                    // Mostrar els altres caràcters 
                    System.out.print(c);
                }
            }   
        // Del contrari     
        } else if (quants == 0) {
            System.out.println(text);
        } else {
            // Mostrar aquest missatge d'error
            System.out.println("No s'accepten números negatius");
        }
    }
}
