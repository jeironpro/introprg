/* Aquest programa demana texts i distribueix les vocals, consonants,
* nombres i símbols sense repetir els caràcters que ja han estat guardats.
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
                
                // Fer un for per iterar tots els caràcter que es guarden en el String vocals
                for (int j = 0; j < vocals.length(); j++) {
                    // Verificar si la vocal ja està guardada
                    if (Character.toUpperCase(text.charAt(i)) == vocals.charAt(j)) {
                        // conteVocal serà true
                        conteVocal = true;
                    }
                }
                // Fer un for per iterar tots els caràcter que es guarden en el String consonants
                for (int j = 0; j < consonants.length(); j++) {
                    // Verificar si la consonant ja està guardada
                    if (Character.toUpperCase(text.charAt(i)) == consonants.charAt(j)) {
                        // conteConsonant serà true
                        conteConsonant = true;
                    }
                }
                // Fer un for per iterar tots els caràcter que es guarden en el String nombres
                for (int j = 0; j < nombres.length(); j++) {
                    // Verificar si el nombre ja està guardada
                    if (text.charAt(i) == nombres.charAt(j)) {
                        // conteNombre serà true
                        conteNombre = true;
                    }
                }
                // Fer un for per iterar tots els caràcter que es guarden en el String símbols
                for (int j = 0; j < simbols.length(); j++) {
                    // Verificar si el símbol ja està guardada
                    if (text.charAt(i) == simbols.charAt(j)) {
                        // conteSimbol serà true
                        conteSimbol = true;
                    }
                }
                
                // Verificar si és una vocal
                if (esVocal) { 
                    // Verificar que la vocal no estigui guardada
                    if (!conteVocal) {
                        // Guardar la vocal en el String vocals
                        vocals += Character.toUpperCase(text.charAt(i));                    
                    }
                    // La vocal ya està guardada
                    conteVocal = true;
                // Del contrari, si és una altra lletra
                } else if (Character.isLetter(text.charAt(i))) {
                    // Verificar que la lletra no estigui guardada
                    if (!conteConsonant) {
                        // Guardar la lletra en el String consonants
                        consonants += Character.toUpperCase(text.charAt(i));                    
                    }
                    // La lletra ya està guardada
                    conteConsonant = true;
                // Del contrari, si és un nombre
                } else if (Character.isDigit(text.charAt(i))) {
                    // Verificar que el nombre no estigui guardat
                    if (!conteNombre) {
                        // Guardar el nombre en el String nombres
                        nombres += text.charAt(i);                    
                    }
                    // El nombre ya està guardat
                    conteNombre = true;
                // Del contrari, si no és un espai en blanc, serà un símbol
                } else if (!Character.isWhitespace(text.charAt(i))) {
                    // // Verificar que el símbol no estigui guardat
                    if (!conteSimbol) {
                        // Guardar el simbol en el String símbols
                        simbols += text.charAt(i);
                    }
                    // El símbol ya està guardat
                    conteSimbol = true;
                }
            }
        }
        // Verificar si hi ha almenys una vocal guardada
        if (vocals.length() > 0) {
            // Mostrar les vocals guardades
            System.out.println("Vocals: " + vocals);
        }
        // Verificar si hi ha almenys una consonant guardada
        if (consonants.length() > 0) {
            // Mostrar les consonants guardades
            System.out.println("Consonants: " + consonants);
        }
        // Verificar si hi ha almenys un nombre guardat
        if (nombres.length() > 0) {
            // Mostrar els nombres guardats
            System.out.println("Nombres: " + nombres);
        }
        // Verificar si hi ha almenys un símbol guardat
        if (simbols.length() > 0) {
            // Mostrar els símbols guardats
            System.out.println("Símbols: " + simbols);
        }
    }
}
