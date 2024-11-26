/* Aquest programa demana texts i distribueix les vocals, consonants,
* nombres i simbols sense repetir els caràcters que ja han estat guardats.
*/

public class Distribuidor {
    public static void main (String[] args) {
        // Demanar els texts
        System.out.println("Introduïu texts (INTRO per finalitzar)");
        // Declarar i inicialitzar el String text amb caràcter
        // Perquè el bucle s'execute
        String text = "true";
        // Declarar i inicialitzar el String vocals buit
        String vocals = "";
        // Declarar i inicialitzar el String consonants buit
        String consonants = "";
        // Declarar i inicialitzar el String nombres buit
        String nombres = "";
        // Declarar i inicialitzar el String simbols buit
        String simbols = "";
        // Declarar i inicialitzar el String vocalAccept amb les vocals que s'accepten
        String vocalAccept = "aàeéèiïoóòuúü";
        
        // Fer un while que s'execute mentre el text no està buit
        while (!text.isEmpty()) {
            // Legir els texts
            text = Entrada.readLine();
            // Fer un for per iterara tots el caràcters del text
            for (int i = 0; i < text.length(); i++) {
                // Declarar i inicialitzar el boolean conteVocal en false
                boolean conteVocal = false;
                // Declarar i inicialitzar el boolean conteConsonant en false
                boolean conteConsonant = false;
                // Declarar i inicialitzar el boolean conteNombre en false
                boolean conteNombre = false;
                // Declarar i inicialitzar el boolean conteSimbol en false
                boolean conteSimbol = false;
                // Declarar i inicialitzar el boolean esVocal en false
                boolean esVocal = false;
                
                // Fer un for per iterar les vocals que s'accepten
                for (int j = 0; j < vocalAccept.length(); j++) {
                    // Vericar si els caràcters del text coincideixen amb els caràcters de vocalAccept
                    if (Character.toLowerCase(text.charAt(i)) == vocalAccept.charAt(j)) {
                        // esVocal serà true
                        esVocal = true;
                    }
                }
                for (int j = 0; j < vocals.length(); j++) {
                    if (Character.toUpperCase(text.charAt(i)) == vocals.charAt(j)) {
                        conteVocal = true;
                    }
                }
                for (int j = 0; j < consonants.length(); j++) {
                    if (Character.toUpperCase(text.charAt(i)) == consonants.charAt(j)) {
                        conteConsonant = true;
                    }
                }
                for (int j = 0; j < nombres.length(); j++) {
                    if (text.charAt(i) == nombres.charAt(j)) {
                        conteNombre = true;
                    }
                }
                for (int j = 0; j < simbols.length(); j++) {
                    if (text.charAt(i) == simbols.charAt(j)) {
                        conteSimbol = true;
                    }
                }
                
                if (esVocal) {
                    if (!conteVocal) {
                        vocals += Character.toUpperCase(text.charAt(i));                    
                    }
                    conteVocal = true;
                } 
                if (!esVocal && Character.isLetter(text.charAt(i))) {
                    if (!conteConsonant) {
                        consonants += Character.toUpperCase(text.charAt(i));                    
                    }
                    conteConsonant = true;
                }
                if (Character.isDigit(text.charAt(i))) {
                    if (!conteNombre) {
                        nombres += text.charAt(i);                    
                    }
                    conteNombre = true;
                } 
                if (!esVocal && !Character.isWhitespace(text.charAt(i)) && !Character.isLetter(text.charAt(i))) {
                    if (!conteSimbol) {
                        simbols += text.charAt(i);
                    }
                    conteSimbol = true;
                }
            }
        }
        if (vocals.length() > 0) {
            System.out.println("Vocals: " + vocals);
        }
        if (consonants.length() > 0) {
            System.out.println("Consonants: " + consonants);
        }
        if (nombres.length() > 0) {
            System.out.println("Nombres: " + nombres);
        }
        if (simbols.length() > 0) {
            System.out.println("Símbols: " + simbols);
        }
    }
}
