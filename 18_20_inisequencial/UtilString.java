/* Aquest programa és la meva biblioteca on es troben algunes utilitats de Strings com:
* Una funció per verificar si una paraula comença o acaba per vocal i retorna un valor boolean (esVocal).
*
* Una funció que filtra un text i retorna un String amb només les lletres del text (nomesLletres).
*
* Una funció que separa un text de només lletres i retorna un String amb les lletres separat per comes (lletresSeparades).
*
* Una funció que rep un text, un valor inicial i un valor final i retorna un interval del text en el rang d'inici i final ambdós inclosos (intervalString).
*
* Una funció que rep un text i retorna si és un valor enter o no, el valor pot ser negatiu o positiu, o pot tenir espai en blanc en els laterals (esEnter estricte).
*
* Una funció que rep un text i un boolean i retorna si és un valor enter o no, el valor pot ser negatiu o positiu, o pot tenir espai en blanc en qualsevol joc, o punt o guió baix entre dos nombres (esEnter flexible).
*
* Una funció que rep un text i el converteix a enter des del mètode Integer.parseInt (aEnter estricte).
*
* Una funció que rep un text i el converteix a enter des del mètode Integer.parseInt, el valor pot ser negatiu o positiu, o pot tenir espai en blanc en qualsevol joc, punt o guió baix entre dos nombres (aEnter flexible).
*
* Una funció que rep un text i una quantitat i retorna un String format per la repetició circular de carácters fins a la quantitat (cadenaContinua).
*
* Una funció que rep un text i un subtext i retornar si és substring o no, com l'utilitat de String contains (esSubstring estricte).
*
* Una funció que rep un text i un subtext (el text i subtext pot ser en majúscules, minúscules, contenir vocals catalanes i la ç) i un boolean i retornar si és substring o no, com la utilitat de String contains (esSubstring flexible).
*
* Una funció que filtra un text normalitzant les vocals catalanes per les vocals normals (filtraVocalsCatala(versió 1 amb dos for) i filtraVocalsCatala(versió 2 amb un for i un switch)).
*
* Una funció que rep un carácter i retorna si és simból o no (esSimbol).
*
* Una funció que rep un text i retorna el text sense espai (cadenaSenseEspais).
*
* Una funció que rep un text i un prefix i retornar si és el començament del text de manera seqüencial o no, com l'utilitat de String startsWith (esPrefix estricte).
*
* Una funció que rep un text i un prefix (el text i prefix pot ser en majúscules, minúscules, contenir vocals catalanes i la ç) i un boolean i retornar si és el prefix és el començament del text de manera seqüencial o no, com la utilitat de String startsWith (esPrefix flexible).
*
* Una funció que rep un text i un sufix i retornar si és la terminació del text de manera seqüencial o no, com l'utilitat de String endsWith (esSufix estricte).
*
* Una funció que rep un text i un sufix (el text i sufix pot ser en majúscules, minúscules, contenir vocals catalanes i la ç) i un boolean i retornar si és el sufix és la terminació del text de manera seqüencial o no, com la utilitat de String endsWith (esSufix flexible).
*
* Una funció que rep un text i un subtext i retorna quantes vegades es troba el subtex en el text, com la utilitat de String count de altres llenguatges de programació (quants estricte).
*
* Una funció que rep un text i un subtext (el text i subtext pot ser en majúscules, minúscules, contenir vocals catalanes i la ç) i un boolean i retorna quantes vegades es troba el subtext en el text, com la utilitat de String count de altres llenguatges de programació (quants flexible).
*
* Falten les funcions de l'exercici 17_16 
*
* Una funció que rep un array d'enters i un char separador i retorna un String con els valors de l'array separat pel separador, en cas que no s'introdueix cap separador, el separador serà la coma (entreComes).
*
* Una funció que rep un String i mentre el valor no sigui convertible a enter tornarà a demanar-ho, quan el valor ho sigui retornarà el valor convertit a enter (valorEnter).
*
* Una funció que rep un String i si el String no està buit agafar el primer caràcter del text i ho retorna com separador, en cas que el String està buit retornar la coma com separador (separadorArray).
*
* Una funció que rep un text i retorna un array de String sense separador (espai en blanc), com la utilitat de String split (separa(String)).
*
* Una funció que rep un text i un boolean, si el boolean és false retorna el resultat de la funció separa(String), en cas que el boolean sigui true retorna un array de String amb  els espais inclòs, com la utilitat de String split (separa(String, boolean)).
*
* Una funció que verifica si un text acaba en un espai o lletra, en cas que no retorna el text amb l'espai o la lletra agregat segons correspon (ultimCaracterEsEspaiEsLletra).
*
* Una funció que rep un text i compta quantes paraules hi ha en el text i retorna aquesta quantitat. Aquesta funció fa servir la funció ultimCaracterEsEspai per agregar l'espai al text i comptar de manera funcional les paraules (quantsParaules).
*
* Una funció que rep un text i compta quants espais en blanc té i retorna aquesta quantitat. Aquesta funció fa servir la funció ultimCaracterEsEspai per agregar la lletra al text i comptar de manera funcional els espais (quantsEspais).
*
* Una funció que rep un array de Strings i un String com separador i retorna un String amb el array separat pel separador, com la utilitat de String join (junta(String[], String)).
*
* Una funció que rep un array de Strings, un String com separador i un String com darrer separador i retorna un String amb el array separat pels separadors en l'ordre indicat, com la utilitat de String join (junta(String[], String, String)).
*
* Una funció que rep una paraula i retornar si és creixent de manera estricta o no (esCreixent(String)).
*
* Una funció que rep una paraula i retornar si és decreixent de manera estricta o no (esDecreixent(String)).
*
* Una funció que rep una paraula i retornar si és creixidecri de manera estricta o no (esCreixiDecri(String)).
*
* Una funció que rep una paraula i retornar si és decricreixi de manera estricta o no (esDecriCreixi(String)).
*
* Una funció que rep una paraula i retornar si és creixent de manera flexible o no (esCreixent(String, boolean)).
*
* Una funció que rep una paraula i retornar si és decreixent de manera flexible o no (esDecreixent(String, boolean)).
*
* Una funció que rep una paraula i retornar si és creixidecri de manera flexible o no (esCreixiDecri(String, boolean)).
*
* Una funció que rep una paraula i retornar si és decricreixi de manera flexible (esDecriCreixi(String, boolean)).
*
* Una funció que un text i retornar un nou text filtrat amb només les lletres de l'alfabet català inclosa la ç (filtraAlfabetCatala(String))
*
* Una funció que rep un text i compta quants caràcters diferents té i retorna la quantitat. (quantsCaracterDiferent)
*
* Una funció que rep un text i verifica si el text acaba amb espai o no, s'acaba en espai li agrega una lletra, si no li agrega un espai. (ultimCaracterEsEspai)
*/
public class UtilString {
    
    
    public static boolean esEnter(String text) {
        // Si el text está buit
        if (text.isBlank()) {
            // Retornar false
            return false;     
        } 
        
        // Fer un for per iterar tots els caràcters del text
        for (int i = 0; i < text.length(); i++) {
            // Agafar els caràcters del String text en la posició de i
            char c = text.charAt(i);
            // Si la longitud del text és major a 1 i el primer carácter és '-' o '+'
            if (text.length() > 1 && i == 0 && (c == '-' || c == '+')) {
                // Si el següent carácter no és un dígit 
                if (!Character.isDigit(text.charAt(i+1))) {
                    // Retornar false
                    return false;
                }
            // Del contrari, si el carácter no és un dígit
            } else if (!Character.isDigit(c)) {
                // Retornar false
                return false;
            }
        }
        // Si cap de les condicions anterior no es compleixen, retornar true
        return true; 
    }
    
    public static boolean esEnter(String text, boolean estricte) {
        // Si estricte és true
        if (estricte) {
            // Retornar el resultat del text passat com argument a la funció esEnter(String)
            return esEnter(text);
        // Del contrari
        } else {
            // Si el text está buit
            if (text.isBlank()) {
                // Retornar false
                return false;
            }
            // Declarar e inicialitzar el nouText buit
            String nouText = "";
            // Fer un for per iterar tots els carácter del text
            for (int i = 0; i < text.length(); i++) {
                // Agafar els caràcters del String text en la posició de i
                char c = text.charAt(i);
                // Si el carácter és una lletra o un dígit o '-' o '+' o '.' o '_'
                if (Character.isLetter(c) || Character.isDigit(c) || c == '-' || c == '+' || c == '.' || c == '_') {
                    // Guardar el carácter en el nouText
                    nouText += c;
                }
            }
            
            // Fer un for per iterar tots els caràcters del nouText
            for (int i = 0; i < nouText.length(); i++) {
                // Agafar els caràcters del String nouText en la posició de i
                char c = nouText.charAt(i);
                // Si la longitud del nouText és major a 1 i el primer carácter és '-' o '+'
                if (nouText.length() > 1 && i == 0 && (c == '-' || c == '+')) {
                    // Si el següent carácter no és un dígit 
                    if (!Character.isDigit(nouText.charAt(i+1))) {
                        // Retornar false
                        return false;
                    }
                // Del contrari, si el carácter és '.' o '_' i no es troba en els laterals 
                } else if (i-1 >= 0 && i+1 < nouText.length() && (c == '.' || c == '_')) {
                    // Si el carácter anterior i el següent no és un dígit
                    if (!Character.isDigit(nouText.charAt(i-1)) || !Character.isDigit(nouText.charAt(i+1))) {
                        // Retornar false
                        return false;
                    }
                // Del contrari, si no és un dígit
                } else if (!Character.isDigit(c)) {
                    // Retornar false
                    return false;
                }
            }
            // Si cap de les condicions anterior no es compleixen, retornar true
            return true;
        }
    }
}
