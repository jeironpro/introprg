/* Programa que demana un text i dues lletres i et mostra quantes vegades 
* apareix cada lletra en el text. */

public class ComptaOcurrencies {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String text = Entrada.readLine();
        
        System.out.println("Introdueix la primera lletra");
        char lletra1 = Entrada.readLine().charAt(0);
        
        System.out.println("Introdueix la segona lletra");
        char lletra2 = Entrada.readLine().charAt(0);
        
        comptaLletra(text, lletra1);
        comptaLletra(text, lletra2);
        comparaOcurrencies(text, lletra1, lletra2);
    }
    
    public static void comptaLletra(String text, char lletra) {
        int comptador = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador += 1;
            } 
        }
        System.out.println("Nombre de '" + lletra + "'s: " + comptador);
    }
    
    public static void comparaOcurrencies(String text, char lletra1, char lletra2) {
        int comptadorLletra1 = 0;
        int comptadorLletra2 = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == lletra1) {
                comptadorLletra1 += 1;
            }
            if (text.charAt(i) == lletra2) {
                comptadorLletra2 += 1;
            }
        }
        
        if (comptadorLletra1 > comptadorLletra2) {
            System.out.println("Hi ha més '" + lletra1 + "'s " + "que '" + lletra2 + "'s");
        } else if (comptadorLletra1 < comptadorLletra2) {
            System.out.println("Hi ha més '" + lletra2 + "'s " + "que '" + lletra1 + "'s");
        } else {
            System.out.println("Hi ha tantes '" + lletra1 + "'s " + "como '" + lletra2 + "'s");
        }
    }
}
