/* Programa que demana un text i mostra la quantitat de vegades que apareix
* cada una de les vocals catalanes. 
*/

public class ComptaVocals {
    public static void main(String[] args) {
        // Demanar el text
        System.out.println("Introdueix un text");
        // Llegir el text
        String text = Entrada.readLine();
        // Declarar e incialitzar el String vocals amb les vocals
        String vocals = "aàeèéiíïoóòuúü";
        
        // Fer un for per iterar totes les vocals
        for (int i = 0; i < vocals.length(); i++) {
            // Cridar la funció quantesOcurrencies i passar-i els arguments, text i cada vocal
            int quantitat = quantesOcurrencies(text, vocals.charAt(i));
            // Cridar el módul mostraOcurrencies i passar-li els arguments, cada vocal i el valor retornat per la funció quantesOcurrencies
            mostraOcurrencies(vocals.charAt(i), quantitat);
        }
    }
    
    public static void mostraOcurrencies(char lletra, int quantes) {
        // Mostrar aquest missatge per cada vegada que es crida el mòdul
        System.out.println("Nombre de '" + lletra + "'s: " + quantes);
    }
    
    public static int quantesOcurrencies(String text, char lletra) {
        // Declarar e inicialitzar el int comptador en 0
        int comptador = 0;
        // Fer un for per iterar tots els caràcters del text
        for (int i=0; i < text.length(); i++) {
            // Verificar si els caràcters del text són igual que la lletra
            if (text.charAt(i) == lletra) {
                // Augmentar-li 1 a comptador
                comptador += 1;
            }
        }
        // Quan finalitza el bucle retornar el valor de comptador
        return comptador;
    }
}
