/* Programa que demana un text i et mostrarà tots les vocals en majúscules i la resta en minúscules */
public class VocalsMajuscules {
    public static void main(String[] args) {
        // Demanara el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Passar-li el valor del text al mòdul
        majusculitzaVocals(text);
    }
    
    public static void majusculitzaVocals(String text) {
         // Fer un for per iterar tots els caràcters 
        for (int i = 0; i < text.length(); i++) {
            // Declarar e inicialitzar el String vocals amb les vocals que s'accepten
            String vocals = "aeiou";
            // Declarar e inicialitzar el boolean esVocal en false
            boolean esVocal = false;
            // Declarar e inicialitzar el char c amb els caràcters del text
            char c = text.charAt(i);
            
            // For per iterar totes les vocals que s'accepten
            for (int j = 0; j < vocals.length(); j++) {
                // Declarar e inicialitzar el char v amb les vocals
                 char v = vocals.charAt(j);
                 
                 // Verificar si el caràcter en minúscula és una vocal
                 if (Character.toLowerCase(c) == v) {
                    // esVocal serà true
                    esVocal = true;
                 }
            }
            
            // Verificar si esVocal es true
            if (esVocal) {
                // Mostrar la vocal en majúscula
                System.out.print(Character.toUpperCase(c));
            // Del contrari
            } else {
                // Mostrar el caràcter en minúscula
                System.out.print(Character.toLowerCase(c));
            }
        }
    }
}
