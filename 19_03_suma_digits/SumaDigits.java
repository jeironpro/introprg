/* Programa que demana un text i agafa els nombres i ho suma */

public class SumaDigits {
    public static void main(String[] args){
        // Demanar el text
        System.out.println("Text?");
        // Llegir el text
        String text = Entrada.readLine();
        // Declarar e inicialitzar el int nombres amb la funció sumaDigits i li passen el text
        int nombres = sumaDigits(text);
        // Mostrar la suma
        System.out.println(nombres);
    }
    
    // Variable global suma
    public static int suma = 0;
    public static int sumaDigits(String text) {
        // cas base
        // Si el text està buit
        if (text.isEmpty()) {
            // Retornar 0
            return 0;
        }

        // tracta pas actual
        char primer = text.charAt(0);

        // tracta pas recursiu
        // Si el caràcter és un dígit
        if (Character.isDigit(primer)) {
            // Converteix el caràcter a enter
            int digit = Integer.parseInt("" + primer);
            // sumar el dígit a suma
            suma = suma + digit;
        }
        
        // composa resultat
        int restaText = sumaDigits(text.substring(1));
        // Retornar la suma
        return suma;
    }

}
