/* Programa que demana un text i dues lletres i et mostra quantes vegades 
* apareix cada lletra en el text. */

public class ComptaAiEs {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Introdueix un text");
        // Llegit el text
        String text = Entrada.readLine();
        // Cridar el mòdul comptaLletra i passar-li els argument text i el caràcter
        // Es crida dos vegades el mòdul comptaLletra, primero comptar la a, i després la e
        comptaLletra(text, 'i');
        comptaLletra(text, 'o');
        // Cridar el mòdul comparaOcurrencies i passar-li els arguments text, el primer i segon caràcter
        comparaOcurrencies(text, 'i', 'o');
    }
    
    public static void comptaLletra(String text, char lletra) {
        // Declarar e inicialitzar el int comptador en 0
        int comptador = 0;
        // Fer un for per iterar tots els caràcters del text
        for (int i = 0; i < text.length(); i++) {
            // Verificar si els caràcters del text són igual que la lletra
            if (text.charAt(i) == lletra) {
                // Augmentar-li 1 al comptador
                comptador += 1;
            } 
        }
        // Després de iterar tots els caràcters del text mostrar aquest missatge
        System.out.println("Nombre de '" + lletra + "'s: " + comptador);
    }
    
    public static void comparaOcurrencies(String text, char lletra1, char lletra2) {        
        // Declarar e inicialitzar el int comptadorLletra1 en 0
        int comptadorLletra1 = 0;
        // Declarar e inicialitzar el int comptadorLletra2 en 0
        int comptadorLletra2 = 0;
        // Fer un for per iterar tots els caràcters del text
        for (int i = 0; i < text.length(); i++) {
            // Verificar si els caràcters del text són igual que la lletra1
            if (text.charAt(i) == lletra1) {
                // Augmentar-li 1 a comptadorLletra1
                comptadorLletra1 += 1;
            }
            // Verificar si els caràcters del text són igual que la lletra2
            if (text.charAt(i) == lletra2) {
                // Augmentar-li 1 a comptadorLletra1
                comptadorLletra2 += 1;
            }
        }
        // Verificar si la primera lletra apareix mes vegades que la segona lletra
        if (comptadorLletra1 > comptadorLletra2) {
            // Mostrar aquest missatge
            System.out.println("Hi ha més '" + lletra1 + "'s " + "que '" + lletra2 + "'s");
        // Verificar si la primera lletra apareix menys vegades que la segona lletra
        } else if (comptadorLletra1 < comptadorLletra2) {
            System.out.println("Hi ha més '" + lletra2 + "'s " + "que '" + lletra1 + "'s");
        // Del contrari, apareixen per igual
        } else {
            // Mostrar aquest missatge
            System.out.println("Hi ha tantes '" + lletra1 + "'s " + "como '" + lletra2 + "'s");
        }
    }
}
