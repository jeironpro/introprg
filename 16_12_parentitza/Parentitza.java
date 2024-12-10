/* Programa que demana un text i mostra cada lletra en parèntesis */
public class Parentitza {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Passar-li el valor del text al mòdul
        parentitza(text);
    }
    
    public static void parentitza(String text) {
        // For per iterar tots els caràcters del text
        for (int i = 0; i < text.length(); i++) {
            // Declarar e inicialitzar el char c amb els caràcters del text
            char c = text.charAt(i);
            
            // Verificar si el caràcter és una lletra
            if (Character.isLetter(text.charAt(i))) {
                // Mostrar la lletra amb parèntesi
                System.out.print("("+ c +")");        
            // Del contrari                    
            } else {
                // Mostrar el caracter sense parèntesi
                System.out.print(c);       
            } 
        }
    }
}
