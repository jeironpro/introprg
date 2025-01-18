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
*/
public class UtilString {
    public static boolean esVocal(char caracter) {
        // Almacenar en el String vocals les vocals inclòs les catalanes
        String vocals = "aàeèéiíïoóòuúü";
        // Fer un for per iterar totes les vocals
        for (int i = 0; i < vocals.length(); i++) {
            // Agafar els caràcters del String vocals en la posició de i
            char v = vocals.charAt(i);
            // Si el caràcter en minúscula és una vocal, retornar true
            if (Character.toLowerCase(caracter) == v) {
                // Retornar true
                return true;                   
            }
        }     
        // Si no retorna true, retornar false
        return false;
    }
    
    public static String nomesLletres(String text) {
        // Declarar e inicialitzar el String nouText buit
        String nouText = "";
        // Fer un for per iterar tots els caràcters del text
        for (int i = 0; i < text.length(); i++) {
            // Agafar els caràcters del String text en la posició de i
            char c = text.charAt(i);
            // Si el caràcter és una lletra
            if (Character.isLetter(c)) {
                // Guardar el caràcter en nouText
                nouText += c;
            }
        }
        // Retornar nouText amb només les lletres
        return nouText;
    }
    
    public static String lletresSeparades(String text) {
        // Declarar e inicialitzar el String nouText buit
        String nouText = "";
        // Fer un for per iterar tots els caràcters del text
        for (int i = 0; i < text.length(); i++) {
            // Agafar els caràcters del String text en la posició de i
            char c = text.charAt(i);
            // Si i és menor a la longitud del text - 1
            if (i < text.length()-1) {
                // Guardar el caràcter separat amb coma
                nouText += c + ", ";
            // Del contrari
            } else {
                // Guardar el caràcter sense coma
                nouText += c;
            }
        }
        // Retornar nouText amb les lletres separat per coma
        return nouText;
    }
    
    public static String intervalString(String text, int ini, int fi) {
        // Declarar e inicialitzar el String intervalCaracters buit
        String intervalCaracters = "";
        // Si el valor de ini és menor o igual a la longitud del text 
        if (ini >= text.length()) {
            // El valor de ini és igual a la longitud del text -1
            ini = text.length()-1;
        }
        // Si el valor de fi és menor o igual a la longitud del text 
        if (fi >= text.length()) {
            // El valor de fi és igual a la longitud del text -1
            fi = text.length()-1;
        }
        // Si el valor de ini és negatiu
        if (ini < 0) {
            // El valor de ini és igual a 0
            ini = 0;
        }
        // Si el valor de fi és negatiu
        if (fi < 0) {
            // El valor de fi és igual a 0
            fi = 0;
        }
        // Si el valor de ini és menor o igual al valor de fi       
        if (ini <= fi) {
            // Fer un for creixent que itere tots els carácters del text en el rang de ini i fi ambdos inclòs
            for (int i = ini; i <= fi; i++) {
                // Agafar els carácters del text en el rang de ini fins a fi ambdos inclòs
                char c = text.charAt(i);
                // En cada iteració, sumar-li al String intervalCaracters el carácter en la posició de i
                intervalCaracters += c;
            }
            // Retornar els carácters guardat en el intervalCaracters 
            return intervalCaracters;
        // Del contrari, si el valor de ini és mayor al valor de fi 
        } else {
            // Fer un for decreixent que itere tots els carácters del text en el rang de ini fins a fi ambdos inclòs
            for (int i = ini; i >= fi; i--) {
                // Agafar els carácters del text en el rang de ini fins a fi ambdos inclòs
                char c = text.charAt(i);
                // En cada iteració, sumar-li al String intervalCaracters el carácter en la posició de i
                intervalCaracters += c;
            }
            // Retornar els carácters guardat en el intervalCaracters
            return intervalCaracters;
        }
    }
    
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
    
    public static int aEnter(String text) {
        // Retornar el text convertit a enter
        return Integer.parseInt(text);
    }
    
    public static int aEnter(String text, boolean estricte) {
        // Si estrice és true
        if (estricte) {
            // Retornar el resultat del text passat a la funció aEnter(String)
            return aEnter(text);  
        // Del contrari      
        } else {
            // Declarar e inicialitzar el String nouText buit
            String nouText = "";
            // Si la funció esEnter(String, boolean) retorna true
            if (esEnter(text, estricte)) {
                // Fer un for per iterar tots el carácters del text
                for (int i = 0; i < text.length(); i++) {
                    // Agafar els caràcters del String text en la posició de i
                    char c = text.charAt(i);
                    // Si el carácter és un dígit o '-' o '+'
                    if (Character.isDigit(c) || c == '-' || c == '+') {
                        // Guardar en nouText el carácter
                        nouText += c;
                    }
                }
            }
            // Retornar el nouText convertit a enter
            return Integer.parseInt(nouText);        
        }
    }
    
    public static String cadenaContinua(String text, int quantitat) {
        // Declarar e inicialitzar el String caractersResultant buit
        String caractersResultant = "";
        // Fer un for per iterar tots els carácters en el rang de 0 i quantitat
        for (int i = 0; i < quantitat; i++) {
            // Agafar els carácters en la posició de i residu de la longitud del text
            char c = text.charAt(i % text.length());
            // Guadar el carácter en caractersResultant
            caractersResultant += c;
        }
        // Retornar caractersResultant amb els carácters resultant
        return caractersResultant;
    }
    
    public static boolean esSubstring(String text, String subtext) {
        // Si la longitud del text és igual a 0 o la longitud del subtext és major a la longitud del text 
        if (text.length() == 0 || subtext.length() > text.length()) {
            // Retorna false
            return false;
        }
        // Si la longitud del text és major a 0 i la longitud del subtext és igual a 0
        if (text.length() > 0 && subtext.length() == 0) {
            // Retorna true
            return true;
        }
        
        // Fer un for per iterar tots els carácters del text
        for (int i = 0; i < text.length(); i++) {
            // Declarar e inicialitzar el int igualtat en 0
            int igualtat = 0;   
            // Fer un for per iterar tots els carácters del subtext
            for (int j = 0; j < subtext.length(); j++) {
                // Si i + igualtat és menor a la longitud del text
                if (i + igualtat < text.length()) {
                    // Si el carácter del text en la posició i + igualtat és igual a al carácter del subtext en la posició de j
                    if (text.charAt(i + igualtat) == subtext.charAt(j)) {
                        // Sumar-li 1 a igualtat, per verificar sí tots els caràcters del subtext estén en el text de manera seqüencial
                        igualtat++;
                    }
                // Del contrari
                } else {
                    // Aturar el bucle del subtext
                    break;
                }
            }
            // Si l'igualtat és igual a la longitud del subtext
            if (igualtat == subtext.length()) {
                // Retorna true
                return true;
            }
        }
        // Si cap condició retorna true, retornar false
        return false;
    }
    
    public static boolean esSubstring(String text, String subtext, boolean estricte) {
        // Si estricte és true
        if (estricte) {
            // Retorna el resultat de la funció esSubstrig(amb el text com argument)
            return esSubstring(text, subtext);
        // Del contrari
        } else {
            // Si la longitud del text és igual a 0 o la longitud del subtext és major a la longitud del text 
            if (text.length() == 0 || subtext.length() > text.length()) {
                // Retorna false
                return false;
            }
            // Si la longitud del text és major a 0 i la longitud del subtext és igual a 0
            if (text.length() > 0 && subtext.length() == 0) {
                // Retorna true
                return true;
            }
            // Converteix el text a minúscula
            text = text.toLowerCase();
            // Converteix el subtext a minúscula
            subtext = subtext.toLowerCase();
            // Declarar e incialitzar el String nouSubtext amb la funció filtraVocalsCatala i li passem el subtext
            String nouSubtext = filtraVocalsCatala(subtext);
            // Declarar e incialitzar el String nouSubtext amb la funció filtraVocalsCatala i li passem el subtext
            String nouText = filtraVocalsCatala(text);
            // Retornar el resultat de esSubstring amb el nouText i el nouSubtext com arguments
            return esSubstring(nouText, nouSubtext);    
        }
    }
    
    // Versió 1
    public static String filtraVocalCatala(String text) {
        // Declarar e inicialitzar el nouText buit
        String nouText = "";
        // Fer un for per iterar tots els carácters del text
        for (int i = 0; i < text.length(); i++) {
            // Agafar els caràcters del String text en la posició de i
            char caracter = Character.toLowerCase(text.charAt(i));
            // Fer un switch expression que retorna un carácter
            char vocalCatala = switch (caracter) {
                case 'à' -> 'a';
                case 'è', 'é' -> 'e';
                case 'í', 'ï' -> 'i';
                case 'ò', 'ó' -> 'o';
                case 'ù', 'ú', 'ü' -> 'u';
                default -> caracter;
            };
            // Guardar el carácter en nouText
            nouText += vocalCatala;
        }
        // Retornar el nouText
        return nouText;
    }
    
    // Versió 2
    public static String filtraVocalsCatala(String text) {
        // Declarar e inicialitzar el String nouText buit 
        String nouText = "";
        // Almacenar en el String vocals les vocals catalanes, com addicional incloem la ç
        String vocalsCatala = "àèéíïòóùúüç";
        // Almacenar en el String vocals les vocals, com addicional incloem la c
        String vocals = "aeeiioouuuc";
        
        // Fer un for per iterar tots els carácters del text
        for (int i = 0; i < text.length(); i++) {
            // Declarar e inicialitzar el boolean reemplazo en false
            boolean reemplazo = false;
            // Agafar els caràcters del String text en la posició de i
            char c = text.charAt(i);
            
            // Fer un for per iterar els carácters de les vocals catalanes
            for (int j = 0; j < vocalsCatala.length(); j++) {
                // Agafar els caràcters del String vocals en la posició de j
                char v = vocals.charAt(j);
                // Agafar els caràcters del String vocalsCatala en la posició de j
                char vc = vocalsCatala.charAt(j);
                
                // Si el carácter del text és igual a una vocal catalana
                if (c == vc) {
                    // Guardar en nouText la vocal corresponent a la catalana
                    nouText += v;
                    // reemplazo és true
                    reemplazo = true;
                }
            }
            // Si reemplazo és false
            if (!reemplazo) {
                // Guardar en nouText el carácter tal qual
                nouText += c;
            }
        }
        // Retornar nouText
        return nouText;
    }
    
    public static boolean esSimbol(char caracter) {
        // Si el carácter no és una lletra i no és un dígit i no és un espai
        if (!Character.isLetter(caracter) && !Character.isDigit(caracter) && !Character.isWhitespace(caracter)) {
            // Retornar true
            return true;
        }
        // Retornar false
        return false;
    }
    
    public static String cadenaSenseEspais(String text) {
        // Declarar e inicialitzar el String nouText buit 
        String nouText = "";
        // Fer un for per iterar els carácters del text
        for (int i = 0; i < text.length(); i++) {
            // Agafar els caràcters del String text en la posició de i
            char c = text.charAt(i);
            // Si el carácter no és un espai
            if (!Character.isWhitespace(c)) {
                // Guardar el carácter en nouText
                nouText += c;
            }
        }
        // Retornar nouText
        return nouText;
    }
    
    public static boolean esPrefix(String text, String prefix) {
        // Si la longitud del text és igual a 0 o la longitud del prefix és major a la longitud del text 
        if (text.length() == 0 || prefix.length() > text.length()) {
            // Retorna false
            return false;
        }
        // Si la longitud del text és major a 0 i la longitud del prefix és igual a 0
        if (text.length() > 0 && prefix.length() == 0) {
            // Retorna true
            return true;
        }
        
        // Declarar e inicialitzar el int igualtat en 0
        int igualtat = 0;
        // Fer un for per iterar els carácter del prefix
        for (int i = 0; i < prefix.length(); i++) {
            // Si el carácter de prefix i text en la posicio de i son iguals
            if (prefix.charAt(i) == text.charAt(i)) {
                // Sumar-li 1 a igualtat, per verificar sí tots els caràcters del prefix estén en el text de manera seqüencial
                igualtat++;
            }
            // Si l'igualtat és igual a la longitud del prefix
            if (igualtat == prefix.length()) {
                // Retornar true
                return true;
            }
        }
        // Si cap condició retorna true, retornar false
        return false;
    }
    
    public static boolean esPrefix(String text, String prefix, boolean estricte) {
        // Si estricte és true
        if (estricte) {
            // Retornar el resultat de la funció esPrefix amb el text i sufix com arguments
            return esPrefix(text, prefix);
        // Del contrari
        } else {
            // Si la longitud del text és igual a 0 o la longitud del prefix és major a la longitud del text 
            if (text.length() == 0 || prefix.length() > text.length()) {
                // Retorna false
                return false;
            }
            // Si la longitud del text és major a 0 i la longitud del prefix és igual a 0
            if (text.length() > 0 && prefix.length() == 0) {
                // Retorna true
                return true;
            }
            
            // Converteix el text a minúscula
            text = text.toLowerCase();
            // Converteix el prefix a minúscula
            prefix = prefix.toLowerCase();
            // Declarar e incialitzar el String nouText amb la funció filtraVocalsCatala i li passem el text
            String nouText = filtraVocalsCatala(text);
            // Declarar e incialitzar el String nouPrefix amb la funció filtraVocalsCatala i li passem el prefix
            String nouPrefix = filtraVocalsCatala(prefix);
            // Retornar el resultat de esPrefix amb el nouText i el nouPrefix com arguments
            return esPrefix(nouText, nouPrefix);    
        }
    }
    
    public static boolean esSufix(String text, String sufix) {
        // Si la longitud del text és igual a 0 o la longitud del sufix és major a la longitud del text 
        if (text.length() == 0 || sufix.length() > text.length()) {
            // Retorna false
            return false;
        }
        // Si la longitud del text és major a 0 i la longitud del sufix és igual a 0
        if (text.length() > 0 && sufix.length() == 0) {
            // Retorna true
            return true;
        }
        // Declarar e inicialitzar el int igualtat en 0
        int igualtat = 0;
        // Declarar e inicialitzar el int j amb el valor de la longitud de sufix -1
        int j = sufix.length()-1;
        // Fer un for per iterar tots els carácters del text de manera decreixent
        for (int i = text.length()-1; i >= 0; i--) {
            // Si el carácter de sufix i de text en la darrera posició son igual 
            if (sufix.charAt(j) == text.charAt(i)) {
                // Sumar-li 1 a igualtat, per verificar sí tots els caràcters del sufix estén en el text de manera seqüencial
                igualtat++;
            }
            // Si j és major o igual a 1 (no permetre que i passi a -1)
            if (j >= 1) {
                // Decrementar en 1 a j
                j--;
            }
            // Si l'igualtat és igual a la longitud del sufix
            if (igualtat == sufix.length()) {
                // Retornar true
                return true;
            }
        }
        // Si cap condició retorna true, retornar false
        return false;
    }
    
    public static boolean esSufix(String text, String sufix, boolean estricte) {
        // Si estricte és true
        if (estricte) {
            // Retornar el resultat de la funció esSufix amb el text i sufix com arguments
            return esSufix(text, sufix);
        // Del contrari
        } else {
            // Si la longitud del text és igual a 0 o la longitud del sufix és major a la longitud del text 
            if (text.length() == 0 || sufix.length() > text.length()) {
                // Retorna false
                return false;
            }
            // Si la longitud del text és major a 0 i la longitud del sufix és igual a 0
            if (text.length() > 0 && sufix.length() == 0) {
                // Retorna true
                return true;
            }
            
            // Converteix el text a minúscula
            text = text.toLowerCase();
            // Converteix el sufix a minúscula
            sufix = sufix.toLowerCase();
            // Declarar e incialitzar el String nouText amb la funció filtraVocalsCatala i li passem el text
            String nouText = filtraVocalsCatala(text);
            // Declarar e incialitzar el String nouSufix amb la funció filtraVocalsCatala i li passem el sufix
            String nouSufix = filtraVocalsCatala(sufix);
            // Retornar el resultat de esPrefix amb el nouText i el nouSufix com arguments
            return esSufix(nouText, nouSufix);    
        }
    }
    
    public static int quants(String text, String subtext) {
        if (text.length() == 0 || subtext.length() == 0) {
            return 0;
        }
        // Declarar e inicialitzar el int subtextRepetit en 0
        int subtextRepetit = 0;
        // Fer un for per iterar tots els carácters del text
        for (int i = 0; i < text.length(); i++) {
            // Declarar e inicialitzar el int igualtat en 0
            int igualtat = 0;   
            // Fer un for per iterar tots els carácters del subtext
            for (int j = 0; j < subtext.length(); j++) {
                // Si i + igualtat és menor a la longitud del text
                if (i + igualtat < text.length()) {
                    // Si el carácter del text en la posició i + igualtat és igual a al carácter del subtext en la posició de j
                    if (text.charAt(i + igualtat) == subtext.charAt(j)) {
                        // Sumar-li 1 a igualtat, per verificar sí tots els caràcters del subtext estén en el text de manera seqüencial
                        igualtat++;
                    }
                }
            }
            // Si l'igualtat és igual a la longitud del subtext
            if (igualtat == subtext.length()) {
                // Sumar-li 1 a subtextRepetit, per verificar quantes vegades es troba el subtext en el text
                subtextRepetit++;
            }
        }
        // Retornar el valor de subtextRepetit
        return subtextRepetit;
    }
    
    public static int quants(String text, String subtext, boolean estricte) {
        // Si estricte és true
        if (estricte) {
            // Retornar el resultat de quants amb el text i subtext com arguments
            return quants(text, subtext);
        // Del contrari
        } else {
            // Converteix el text a minúscula
            text = text.toLowerCase();
            // Converteix el subtext a minúscula
            subtext = subtext.toLowerCase();
            // Declarar e incialitzar el String nouText amb la funció filtraVocalsCatala i li passem el text
            String nouText = filtraVocalsCatala(text);
            // Declarar e incialitzar el String nouSubtext amb la funció filtraVocalsCatala i li passem el sufix
            String nouSubtext = filtraVocalsCatala(subtext);
            // Retornar el resultat de quants amb el nouText i el nouSubtext com arguments
            return quants(nouText, nouSubtext);    
        }
    }
    
    public static boolean esCreixent(String text) {
        boolean paraulaCreixent = false;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (i < text.length()-1) {            
                char cs = text.charAt(i+1);
                if ((int)(c) < (int)(cs)) {
                    paraulaCreixent = true;                
                } else {
                    return false;
                }
            }
        }
        if (paraulaCreixent) {
            return true;
        } 
        return false;
    }

    public static boolean esDecreixent(String text) {
        boolean paraulaDecreixent = false;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (i < text.length()-1) {            
                char cs = text.charAt(i+1);
                if ((int)(c) > (int)(cs)) {
                    paraulaDecreixent = true;                
                } else {
                    return false;
                }
            }
        }
        if (paraulaDecreixent) {
            return true;
        } 
        return false;
    }
    
    public static boolean esCreixiDecri(String text) {
        boolean paraulaCreixent = false;
        boolean paraulaCreixiDecri = false;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (i < text.length()-1) {            
                char cs = text.charAt(i+1);
                
                if (!paraulaCreixiDecri && (int)(c) < (int)(cs)) {
                    paraulaCreixent = true;
                } else if (paraulaCreixent && (int)(c) > (int)(cs)) {
                    paraulaCreixent = false;
                    paraulaCreixiDecri = true;
                } else {
                    return false;
                }
            }
        }
        if (paraulaCreixiDecri) {
            return true;
        } 
        return false;
    }

    
    public static boolean esDecriCreixi(String text) {
        boolean paraulaDecreixent= false;
        boolean paraulaDecriCreixi = false;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (i < text.length()-1) {   
                char cs = text.charAt(i+1);        
                if (!paraulaDecriCreixi && (int)(c) > (int)(cs)) {
                    paraulaDecreixent = true;
                } else if (paraulaDecreixent && (int)(c) < (int)(cs)) {
                    paraulaDecreixent = false;
                    paraulaDecriCreixi = true;
                } else {
                    return false;
                }
            }
            
        }
        if (paraulaDecriCreixi) {
            return true;
        } 
        return false;
    }
    /* ----------------------------------------------------------------------------------------------------------------------------------------------------------- */    
    public static boolean esCreixent(String text, boolean estricta) {
        if (estricta) {
            return esCreixent(text);
        } else {
            boolean paraulaCreixent = false;
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                
                if (i < text.length()-1) {            
                    char cs = text.charAt(i+1);

                    if ((int)(c) <= (int)(cs)) {
                        paraulaCreixent = true;                
                    } else {
                        return false;
                    }
                }
            }
            if (paraulaCreixent) {
                return true;
            } 
            return false;       
        }
    }
    
    public static boolean esDecreixent(String text, boolean estricta) {
        if (estricta) {
            return esDecreixent(text);
        } else {
            boolean paraulaDecreixent = false;
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                
                if (i < text.length()-1) {            
                    char cs = text.charAt(i+1);
                    
                    if ((int)(c) >= (int)(cs)) {
                        paraulaDecreixent = true;                
                    } else {
                        return false;
                    }
                }
            }
            if (paraulaDecreixent) {
                return true;
            } 
            return false;
        }
    }
    
    public static boolean esCreixiDecri(String text, boolean estricta) {
        if (estricta) {
            return esCreixiDecri(text);
        } else {
            boolean paraulaCreixent = false;
            boolean paraulaCreixiDecri = false;
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                
                if (i < text.length()-1) {            
                    char cs = text.charAt(i+1);
                    
                    if ((int)(c) <= (int)(cs)) {
                        paraulaCreixent = true;
                    } else if ((int)(c) >= (int)(cs)) {
                        paraulaCreixent = false;
                        paraulaCreixiDecri = true;
                    } else {
                        return false;
                    }
                }
            }
            if (paraulaCreixiDecri) {
                return true;
            } 
            return false;
        }
    }
    
    public static boolean esDecriCreixi(String text, boolean estricta) {
        if (estricta) {
            return esDecriCreixi(text);
        } else {
            boolean paraulaDecreixent= false;
            boolean paraulaDecriCreixi = false;
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                
                if (i < text.length()-1) {   
                    char cs = text.charAt(i+1);        
                    if ((int)(c) >= (int)(cs)) {
                        paraulaDecreixent = true;
                    } else if ((int)(c) <= (int)(cs)) {
                        paraulaDecreixent = false;
                        paraulaDecriCreixi = true;
                    } else {
                        return false;
                    }
                }
                
            }
            if (paraulaDecriCreixi) {
                return true;
            } 
            return false;
        }
    }
    
    public static String filtraAlfabetCatala(String text) {
        String nouText = "";
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (c >= 'a' && c <= 'z' || c == 'ç') {
                nouText += c;
            }
        }
        return nouText;
    }
}
