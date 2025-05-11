/* 
 * Aquest programa és la meva biblioteca de String: Conte les següents 
   utilitats:
 *
 * Una funció per verificar si un caràcter es vocal i retorna un valor boolean
   (esVocal).
 *
 * Una funció que filtra un text i retorna un String amb només les lletres del
   text (nomesLletres).
 *
 * Una funció que separa un text de només lletres i retorna un String amb les
   lletres separat per comes (lletresSeparades).
 * 
 * Una funció que rep un text, un valor inicial i un valor final i retorna un
   interval del text en el rang d'inici i final ambdós inclosos 
   (intervalString).
 * 
 * Una funció que rep un text i un enter retorna 0 sí és negtiu
   i si és major o igual a la longitud del text retorna la longitud del
   text -1, altrament retorna el valor de l'enter. (posicioText) 
 *
 * Una funció que rep un text i retorna si és un valor enter o no, el valor pot
   ser negatiu o positiu, o pot tenir espai en blanc en els laterals 
   (esEnter estricte).
 * 
 * Una funció que rep un text i un boolean i retorna si és un valor enter o no,
   el valor pot ser negatiu o positiu, o pot tenir espai en blanc en qualsevol
   joc, o punt o guió baix entre dos nombres (esEnter flexible).
 *
 * Una funció que rep un text i el converteix a enter des del mètode
   Integer.parseInt (aEnter estricte).
 *
 * Una funció que rep un text i el converteix a enter des del mètode
   Integer.parseInt, el valor pot ser negatiu o positiu, o pot tenir espai en
   blanc en qualsevol joc, punt o guió baix entre dos nombres (aEnter flexible).
 * 
 * Una funció que rep un text i una quantitat i retorna un String format per la
   repetició circular de carácters fins a la quantitat (cadenaContinua).
 * 
 * Una funció que rep un text i filtra les vocals catalanes, les canvia per les
   vocals normals i retorna un nou text. (filtraVocalCatala v1)
 *
 * Una funció que rep un text i filtra les vocals catalanes, les canvia per les 
   vocals normals i retorna un nou text. (filtraVocalCatalaAvanzat v2)
 *
 * Una funció que rep un text i un subtext i retornar si és substring o no, com
   l'utilitat de String contains (esSubstring estricte).
 *
 * Una funció que rep un text i un subtext (el text i subtext pot ser en
   majúscules, minúscules, contenir vocals catalanes i la ç) i un boolean per
   inidicar si es estricte o flexible i retornar si és substring o no, com la
   utilitat de String contains (esSubstring flexible).
 *
 * Una funció que rep un text i un prefix i retornar si és el començament del
   text de manera seqüencial o no, com l'utilitat de String startsWith 
   (esPrefix estricte).
 *
 * Una funció que rep un text i un prefix (el text i prefix pot ser en
   majúscules, minúscules, contenir vocals catalanes i la ç) i un boolean i
   retornar si és el prefix és el començament del text de manera seqüencial o 
   no, com la utilitat de String startsWith (esPrefix flexible).
 *
 * Una funció que rep un text i un sufix i retornar si és la terminació del text
   de manera seqüencial o no, com l'utilitat de String endsWith 
   (esSufix estricte).
 *
 * Una funció que rep un text i un sufix (el text i sufix pot ser en majúscules,
   minúscules, contenir vocals catalanes i la ç) i un boolean i retornar si és
   el sufix és la terminació del text de manera seqüencial o no, com la 
   utilitat de String endsWith (esSufix flexible).
 * 
 * Una funció que rep un text i un subtext i retorna quantes vegades es troba el
   subtext en el text, com la utilitat de String count de altres llenguatges de
   programació (quants estricte).
 *
 * Una funció que rep un text i un subtext (el text i subtext pot ser en
   majúscules, minúscules, contenir vocals catalanes i la ç) i un boolean i
   retorna quantes vegades es troba el subtext en el text, com la utilitat de
   String count de altres llenguatges de programació (quants flexible).
 * 
 * Una funció que rep una paraula i retornar si és creixent de manera estricta o
   no (esCreixent(String)).
 *
 * Una funció que rep una paraula i retornar si és decreixent de manera 
   estricta o no (esDecreixent(String)).
 *
 * Una funció que rep una paraula i retornar si és creixidecri de manera 
   estricta o no (esCreixiDecri(String)).
 *
 * Una funció que rep una paraula i retornar si és decricreixi de manera 
   estricta o no (esDecriCreixi(String)).
 *
 * Una funció que rep una paraula i retornar si és creixent de manera flexible o
   no (esCreixent(String, boolean)).
 *
 * Una funció que rep una paraula i retornar si és decreixent de manera flexible
   o no (esDecreixent(String, boolean)).
 *
 * Una funció que rep una paraula i retornar si és creixidecri de manera 
  flexible o no (esCreixiDecri(String, boolean)).
 *
 * Una funció que rep una paraula i retornar si és decricreixi de manera 
   flexible (esDecriCreixi(String, boolean)).
 *
 * Una funció que rep un text i filtra tots els seus caràcters a l'alfabet 
   catalá (filtraAlfabetCatala)
 *
 * Una funcion que rep un text i retorna quants caràcters diferents té.
   (quantsCaractersDiferents)
 *
 * Una funció que verifica si un text acaba en un espai o lletra, en cas que no
   retorna el text amb l'espai o la lletra agregat segons correspon 
   (espaiLletraFinal).
 *
 * Una funció que rep un text i compta quantes paraules hi ha en el text i
   retorna aquesta quantitat. Aquesta funció fa servir la funció 
   espaiLletraFinal per agregar l'espai al text i comptar de manera funcional 
   les paraules (quantsParaules).
 *
 * Una funció que rep un text i compta quants espais en blanc té i retorna
   aquesta quantitat. Aquesta funció fa servir la funció espaiLletraFinal per
   agregar la lletra al text i comptar de manera funcional els espais 
   (quantsEspais).
 *
 * Una funció que rep un array d'enters i un char separador i retorna un String
   con els valors de l'array separat pel separador, en cas que no s'introdueix
   cap separador, el separador serà la coma (entreComes).
 * 
 * Una funció que rep un text i elimina els espais en blancs del text i retorna
   un nou text. (filtraEspais)
 *
 * Una funció que rep un valor de tipus text i si la funció esEnter retorna 
   true, això és que es pot converteix a enter i ho retorna com enter fent 
   servir Integer.parseInt. (valorEnter)
 *
 * Una funció que rep un text i retorna un array de String sense separador 
   (espai en blanc), com la utilitat de String split (separa(String)).
 *
 * Una funció que rep un text i un boolean, si el boolean és false retorna el
   resultat de la funció separa(String), en cas que el boolean sigui true 
   retorna un array de String amb  els espais inclòs, com la utilitat de String 
   split (separa(String, boolean)).
 * 
 * Una funció que rep un separador de tipus text, si el text no està buit agafar
   el primer caràcter i ho retorna com el separador, en cas que el text està
   buit retornar la coma com separador. (separadorArray)
 *
 * Una funció que rep un array de Strings i un String com separador i retorna un
   String amb el array separat pel separador, com la utilitat de String join 
   (junta(String[], String)).
 *
 * Una funció que rep un array de Strings, un String com separador i un String 
   com darrer separador i retorna un String amb el array separat pels 
   separadors en l'ordre indicat, com la utilitat de String join 
   (junta(String[], String, String)).
 *
 * Una funció que rep un String de notes amb les notes separat per comes i 
   espais (ex: (9, 8, ) o (10, 9, 8, )) i li aplica una nova estructura de 
   separació (9 i 8) o (10, 9 i 8). (separadorNotes)
 *
 * Una funció que rep un valor de tipus text i verifica si la longitud del valor
   és igual a 2 i si són dos nombres entre 0 i 2, per ser vàlid per l'índex 
   d'un array bidimensional de dimensió 3x3. (verificaCoordenada)
 *
 * Una funció que rep un text i el normalitza eliminant els espais dels laterals
   i entre mig de cada paraula. (normalitzaString)
 * 
 * Una funció que rep una plantilla i un text i verifica si la plantilla és un
   valor null, buit o està format per espai en blanc, retorna true, altrament
   normalitza la plantilla i el text i verifica si són iguals o el text és el 
   començament de la plantilla i retorna true, del contrari retorna false.
 *
 * Una funció que rep un text i verifica si només està format per lletres.
   (conteNomesLletres)
 */

 public class UtilString {
    public static boolean esVocal(char caracter) {
        String vocals = "aàeèéiíïoóòuúü";
        
        for (int i = 0; i < vocals.length(); i++) {
            char v = vocals.charAt(i);
            if (Character.toLowerCase(caracter) == v) {
                return true;                   
            }
        }     
        return false;
    }
    
    public static String nomesLletres(String text) {
        String nouText = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                nouText += c;
            }
        }
        return nouText;
    }
    
    public static String lletresSeparades(String text) {
        String nouText = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (i < text.length()-1) {
                nouText += c + ", ";
            } else {
                nouText += c;
            }
        }
        return nouText;
    }

    public static String intervalString(String text, int inici, int fi) {
        String intervalCadena = "";

        inici = posicioText(text, inici);
        fi = posicioText(text, fi);

        if (inici < fi) {
            for (int i = inici; i <= fi; i++) {
                char c = text.charAt(i);
                intervalCadena += c;
            }
        } else {
            for (int i = inici; i >= fi; i--) {
                char c = text.charAt(i);
                intervalCadena += c;
            }
        }
        return intervalCadena;
    }
    
    public static int posicioText(String text, int pos) {
        if (pos < 0) {
            return 0;
        }

        if (pos >= text.length()) {
            return text.length()-1;
        }
        return pos;
    }

    public static boolean esEnter(String text) {
    	if (text.isEmpty()) return false;
        text = text.strip();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
            if (text.charAt(0) != '-' || text.charAt(0) != '+') {
                if (i > 0) {
                    if (!Character.isDigit(c)) {
                        return false;
                    }
                }
            } 
        }
        return true;
    }

    public static boolean esEnter(String text, boolean estricte) {
        if (estricte) {
            return esEnter(text);
        }
		
        if (text.isBlank()) {
            return false;
        }
        
        text = text.strip();
        if (text.charAt(0) == '.' || text.charAt(0) == '_') return false;
        if (text.charAt(0) == '.' || text.charAt(text.length()-1) == '_') return false;
        
        for (int i = 0; i < text.length(); i++) {
            if (i > 0 && i < text.length()-1) {
                if (text.charAt(i) == '.' || text.charAt(i) == '_') {
                    if (!Character.isDigit(text.charAt(i-1)) || !Character.isDigit(text.charAt(i+1))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static int aEnter(String text) {
        return Integer.parseInt(text);
    }

    public static int aEnter(String text, boolean estricte) {
        if (estricte) {
            return aEnter(text);
        }
        if (esEnter(text, estricte)) {
            String nouText = "";

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);

                if (Character.isDigit(c) || c == '-' || c == '+') {
                    nouText += c;
                }
            }
            return Integer.parseInt(nouText);
        }
        return Integer.parseInt(text);
    }

    public static String cadenaContinua(String text, int nombre) {
        String textContinuo = "";
        for (int i = 0; i < nombre; i++) {
            char c = text.charAt(i % text.length());
            textContinuo += c;
        }
        return textContinuo;
    }

    // Versió 1
    public static String filtraVocalsCatalaV1(String text) {
        String nouText = "";
        for (int i = 0; i < text.length(); i++) {
            char caracter = text.charAt(i);
            char vocalCatala = switch (caracter) {
                case 'à' -> 'a';
                case 'è', 'é' -> 'e';
                case 'í', 'ï' -> 'i';
                case 'ò', 'ó' -> 'o';
                case 'ù', 'ú', 'ü' -> 'u';
                case 'ç' -> 'c';
                case 'À' -> 'A';
                case 'È', 'É' -> 'E';
                case 'Í', 'Ï' -> 'I';
                case 'Ò', 'Ó' -> 'O';
                case 'Ù', 'Ú', 'Ü' -> 'U';
                case 'Ç' -> 'C';
                default -> caracter;
            };
            nouText += vocalCatala;
        }
        return nouText;
    }
    
    // Versió 2
    public static String filtraVocalsCatalaV2(String text) {
        String nouText = "";
        String vocalsCatala = "àèéíïòóùúüç";
        String vocals = "aeeiioouuuc";
        
        for (int i = 0; i < text.length(); i++) {
            boolean reemplazo = false;
            char c = text.charAt(i);

            for (int j = 0; j < vocalsCatala.length(); j++) {
                char v = vocals.charAt(j);
                char vc = vocalsCatala.charAt(j);
                
                if (c == vc) {
                    nouText += v;
                    reemplazo = true;
                }
            }
            if (!reemplazo) {
                nouText += c;
            }
        }
        return nouText;
    }

    public static boolean esSubstring(String text, String subtext) {
        if (text.length() == 0 || subtext.length() > text.length()) {
            return false;
        }

        if (text.length() > 0 && subtext.length() == 0) {
            return true;
        }

        for (int i = 0; i < text.length(); i++) {
            int igualtat = 0;
            for (int j = 0; j < subtext.length(); j++) {
                if (i + igualtat < text.length()) {
                    if (text.charAt(i + igualtat) == subtext.charAt(j)) {
                        igualtat++;
                    }
                } else {
                    break;
                }
                if (igualtat == subtext.length()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean esSubstring(String text, String subtext, boolean estricte) {
        if (estricte) {
            return esSubstring(text, subtext);   
        }

        if (text.length() == 0 || subtext.length() > text.length()) {
            return false;
        }

        if (text.length() > 0 && subtext.length() == 0) {
            return true;
        }

        text = text.toLowerCase();
        subtext = subtext.toLowerCase();
        text = filtraVocalsCatalaV2(text);
        subtext = filtraVocalsCatalaV2(subtext);

        return esSubstring(text, subtext);
    }

    public static boolean esPrefix(String text, String prefix) {
        if (text.length() == 0 || prefix.length() > text.length()) {
            return false;
        }

        if (text.length() > 0 && prefix.length() == 0) {
            return true;
        }

        int igualtat = 0;
        for (int i = 0; i < prefix.length(); i++) {
            if (prefix.charAt(i) == text.charAt(i)) {
                igualtat++;
            }

            if (igualtat == prefix.length()) {
                return true;
            }
        }
        return false;
    }

    public static boolean esPrefix(String text, String prefix, boolean estricte) {
        if (estricte) {
            return esPrefix(text, prefix);
        }

        if (text.length() == 0 || prefix.length() > text.length()) {
            return false;
        }

        if (text.length() > 0 && prefix.length() == 0) {
            return true;
        }

        text = text.toLowerCase();
        prefix = prefix.toLowerCase();
        text = filtraVocalsCatalaV2(text);
        prefix = filtraVocalsCatalaV2(prefix);

        return esPrefix(text, prefix);
    }

    public static boolean esSufix(String text, String sufix) {
        if (text.length() == 0 || sufix.length() > text.length()) {
            return false;
        }

        if (text.length() > 0 && sufix.length() == 0) {
            return true;
        }

        int igualtat = 0;
        int j = text.length()-1;
        for (int i = sufix.length()-1; i >= 0; i--) {
            if (sufix.charAt(i) == text.charAt(j)) {
                igualtat++;
            }
            j--;
            if (igualtat == sufix.length()) {
                return true;
            }
        }
        return false;
    }

    public static boolean esSufix(String text, String sufix, boolean estricte) {
        if (estricte) {
            return esSufix(text, sufix);
        }

        if (text.length() == 0 || sufix.length() > text.length()) {
            return false;
        }

        if (text.length() > 0 && sufix.length() == 0) {
            return true;
        }

        text = text.toLowerCase();
        sufix = sufix.toLowerCase();
        text = filtraVocalsCatalaV2(text);
        sufix = filtraVocalsCatalaV2(sufix);

        return esSufix(text, sufix);
    }

    public static int quants(String text, String subtext) {
        if (text.length() == 0 || subtext.length() == 0) {
            return 0;
        }

        int quantsCops = 0;

        for (int i = 0; i < text.length(); i++) {
            int igualtat = 0;
            for (int j = 0; j < subtext.length(); j++) {
                if (i + igualtat < text.length()) {
                    if (text.charAt(i + igualtat) == subtext.charAt(j)) {
                        igualtat++;
                    }
                } else {
                    break;
                }
                if (igualtat == subtext.length()) {
                    quantsCops++;
                }
            }
        }
        return quantsCops;
    }

    public static int quants(String text, String subtext, boolean estricte) {
        if (estricte) {
            return quants(text, subtext);
        }

        if (text.length() == 0 || subtext.length() > text.length()) {
            return 0;
        }

        if (text.length() > 0 && subtext.length() == 0) {
            return 0;
        }

        text = text.toLowerCase();
        subtext = subtext.toLowerCase();
        text = filtraVocalsCatalaV2(text);
        subtext = filtraVocalsCatalaV2(subtext);

        return quants(text, subtext);
    }

    public static boolean esCreixent(String paraula) {
        paraula = filtraAlfabetCatala(filtraVocalsCatalaV2(paraula));
        
        if (paraula.length() < 3 || quantsCaractersDiferents(paraula) < 3) { return false; }
        for (int i = 0; i < paraula.length(); i++) {
            char ca = paraula.charAt(i);
            
            if (i < paraula.length()-1) {
                char cs = paraula.charAt(i+1);
                
                if (Character.isWhitespace(ca) || Character.isWhitespace(cs)) {
                    continue;
                }  
                
                if ((int)(ca) > (int)(cs)) {
                    return false;   
                }
            }
        }
        return true;
    }

    public static boolean esDecreixent(String paraula) {
        paraula = filtraAlfabetCatala(filtraVocalsCatalaV2(paraula));
        
        if (paraula.length() < 3 || quantsCaractersDiferents(paraula) < 3) { return false; }
        for (int i = 0; i < paraula.length(); i++) {
            char ca = paraula.charAt(i);
            
            if (i < paraula.length()-1) {  
                char cs = paraula.charAt(i+1);
                
                if (Character.isWhitespace(ca) || Character.isWhitespace(cs)) {
                    continue;
                }  
                
                if ((int)(ca) < (int)(cs)) {
                    return false;  
                }
            }
        }
        return true;
    }
    
    public static boolean esCreixiDecri(String paraula) {
        paraula = filtraAlfabetCatala(filtraVocalsCatalaV2(paraula));

        boolean paraulaCreixent = false;
        boolean paraulaCreixiDecri = false;
        int creixi = 0;
        
        if (paraula.length() < 3 || quantsCaractersDiferents(paraula) < 3) { return false; }
        for (int i = 0; i < paraula.length(); i++) {
            char ca = paraula.charAt(i);
            
            if (i < paraula.length()-1) {     
                char cs = paraula.charAt(i+1);
                
                if (Character.isWhitespace(ca) || Character.isWhitespace(cs)) {
                    continue;
                }  
                
                if (!paraulaCreixiDecri && (int)(ca) < (int)(cs)) {
                    paraulaCreixent = true;
                    creixi++;
                } else if (creixi > 0 && (int)(ca) > (int)(cs)) {
                    paraulaCreixent = false;
                    paraulaCreixiDecri = true;
                } else {
                    return false;
                }
            }
        }
        return paraulaCreixiDecri;
    }

    
    public static boolean esDecriCreixi(String paraula) {
        paraula = filtraAlfabetCatala(filtraVocalsCatalaV2(paraula));

        boolean paraulaDecreixent= false;
        boolean paraulaDecriCreixi = false;
        int decri = 0;
        
        if (paraula.length() < 3 || quantsCaractersDiferents(paraula) < 3) { return false; }
        for (int i = 0; i < paraula.length(); i++) {
            char ca = paraula.charAt(i);
            
            if (i < paraula.length()-1) {   
                char cs = paraula.charAt(i+1);    
                
                if (Character.isWhitespace(ca) || Character.isWhitespace(cs)) {
                    continue;
                }  
                
                if (!paraulaDecriCreixi && (int)(ca) > (int)(cs)) {
                    paraulaDecreixent = true;
                    decri++;
                } else if (decri > 0 && (int)(ca) < (int)(cs)) {
                    paraulaDecreixent = false;
                    paraulaDecriCreixi = true;
                } else {
                    return false;
                }
            }
        }
        return paraulaDecriCreixi;
    }
       
    public static boolean esCreixent(String paraula, boolean estricta) {
        if (estricta) {
            return esCreixent(paraula);
        }
        
        paraula = filtraAlfabetCatala(filtraVocalsCatalaV2(paraula));
        
        if (paraula.length() < 3 || quantsCaractersDiferents(paraula) < 3) { return false; }
        for (int i = 0; i < paraula.length(); i++) {
            char ca = paraula.charAt(i);
            
            if (i < paraula.length()-1) {
                char cs = paraula.charAt(i+1);
                
                if (Character.isWhitespace(ca) || Character.isWhitespace(cs)) {
                    continue;
                }  
                
                if ((int)(ca) >= (int)(cs)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean esDecreixent(String paraula, boolean estricta) {
        if (estricta) {
            return esDecreixent(paraula);
        } 
        
        paraula = filtraAlfabetCatala(filtraVocalsCatalaV2(paraula));
        
        if (paraula.length() < 3 || quantsCaractersDiferents(paraula) < 3) { return false; }
        for (int i = 0; i < paraula.length(); i++) {
            char ca = paraula.charAt(i);
            
            if (i < paraula.length()-1) {  
                char cs = paraula.charAt(i+1);
                
                if (Character.isWhitespace(ca) || Character.isWhitespace(cs)) {
                    continue;
                }  
                
                if ((int)(ca) <= (int)(cs)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean esCreixiDecri(String paraula, boolean estricta) {
        if (estricta) {
            return esCreixiDecri(paraula);
        }

        paraula = filtraAlfabetCatala(filtraVocalsCatalaV2(paraula));
        
        boolean paraulaCreixent = false;
        boolean paraulaCreixiDecri = false;
        int creixi = 0;
        
        if (paraula.length() < 3 || quantsCaractersDiferents(paraula) < 3) { return false; }
        for (int i = 0; i < paraula.length(); i++) {
            char ca = paraula.charAt(i);
            
            if (i < paraula.length()-1) {     
                char cs = paraula.charAt(i+1);
                
                if (Character.isWhitespace(ca) || Character.isWhitespace(cs)) {
                    continue;
                }  
                
                if (!paraulaCreixiDecri && (int)(ca) <= (int)(cs)) {
                    paraulaCreixent = true;
                    creixi++;
                } else if (creixi > 0 && (int)(ca) >= (int)(cs)) {
                    paraulaCreixent = false;
                    paraulaCreixiDecri = true;
                } else {
                    return false;
                }
            }
        }       
        return paraulaCreixiDecri;
    }
    
    public static boolean esDecriCreixi(String paraula, boolean estricta) {
        if (estricta) {
            return esDecriCreixi(paraula);        
        }

        paraula = filtraAlfabetCatala(filtraVocalsCatalaV2(paraula));
        
        boolean paraulaDecreixent= false;
        boolean paraulaDecriCreixi = false;
        int decri = 0;
        
        if (paraula.length() < 3 || quantsCaractersDiferents(paraula) < 3) { return false; }
        for (int i = 0; i < paraula.length(); i++) {
            char ca = paraula.charAt(i);
            
            if (i < paraula.length()-1) {
                char cs = paraula.charAt(i+1);  
                
                if (Character.isWhitespace(ca) || Character.isWhitespace(cs)) {
                    continue;
                }   
                
                if (!paraulaDecriCreixi && (int)(ca) >= (int)(cs)) {
                    paraulaDecreixent = true;
                    decri++;
                } else if (decri > 0 && (int)(ca) <= (int)(cs)) {
                    paraulaDecreixent = false;
                    paraulaDecriCreixi = true;
                } else {
                    return false;
                }
            }
        }
        return paraulaDecriCreixi;
    }
    
    public static String filtraAlfabetCatala(String text) {
        String nouText = "";
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (c >= 'a' && c <= 'z') {
                nouText += c;
            } else if (c == 'ç') {
                nouText += 'c';
            }
        }
        return nouText;
    }
    
    public static int quantsCaractersDiferents(String text) {
        int quants = 1;
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (i < text.length()-1) {
                char cs = text.charAt(i+1);
                if (c != cs) {
                    quants++;
                }
            }
        }
        return quants;
    }

    public static String espaiLletraFinal(String text) {
        String nouText = "";
        
        if (!text.isEmpty()) {
            char ultimCaracter = text.charAt(text.length()-1); 
            
            if (Character.isWhitespace(ultimCaracter)) {
                nouText = text + "a";
            } else if (!Character.isWhitespace(ultimCaracter)) {
                nouText = text + " ";
            } else {
                nouText = text;
            }        
        }
        return nouText;
    }
    
    public static int quantsParaules(String text) {
        String nouText = UtilString.espaiLletraFinal(text);
        String paraula = "";
        int quants = 0;
        
        for (int i = 0; i < nouText.length(); i++) {
            char c = nouText.charAt(i);
            if (!Character.isWhitespace(c)) {
                paraula += c;
            } else if (!paraula.isEmpty()) {
                quants++;
                paraula = "";
            }
        }
        return quants;
    }
    
    public static int quantsEspais(String text) {
        String nouText = UtilString.espaiLletraFinal(text);
        String blancs = "";
        int quants = 0;
    
        for (int i = 0; i < nouText.length(); i++) {
            char c = nouText.charAt(i);
            if (Character.isWhitespace(c)) {
                blancs += c;
            } else if (!blancs.isEmpty()) {
                quants++;
                blancs = "";
            }
        }
        return quants;
    }
    
    public static String entreComes(int[] numeros, char separador) {
        String arraySeparat = "";

        for (int i = 0; i < numeros.length; i++) {
            arraySeparat += numeros[i];
            if (i != numeros.length-1) {
                arraySeparat += separador + " ";            
            }
        }
        return arraySeparat;
    }
    
    public static String filtraEspais(String text) {
        String nouText = "";
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isWhitespace(c)) {
                nouText += c;
            }
        }
        return nouText;
    }
    
    public static int valorEnter(String valor) {
        while (!UtilString.esEnter(valor)) {
            System.out.println("Per favor, un valor enter");
            valor = Entrada.readLine();
        }
        return Integer.parseInt(valor);
    }
    
    public static String[] separa(String text) {
        String[] paraules = new String[quantsParaules(text)];
        String paraula = "";
        int index = 0;
        text = espaiLletraFinal(text);
    
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
    
            if (!Character.isWhitespace(c)) {
                paraula += c;
            } else if (!paraula.isEmpty()) {
                paraules[index] = paraula;
                index++;
                paraula = "";
            }
        }
        return paraules;
    }
    
    public static String[] separa(String text, boolean inclouBlancs) {
        if (!inclouBlancs) {
            return separa(text);
        }
    
        String[] paraulesBlancs = new String[quantsParaules(text) + quantsEspais(text)];
        String paraula = "";
        String blanc = "";
        int index = 0;
        text = espaiLletraFinal(text);
    
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
    
            if (!Character.isWhitespace(c)) {
                paraula += c;
            } else if (!paraula.isEmpty()) {
                paraulesBlancs[index] = paraula;
                index++;
                paraula = "";
            }
    
            if (Character.isWhitespace(c)) {
                blanc += c;
            } else if (!blanc.isEmpty()) {
                paraulesBlancs[index] = blanc;
                index++;
                blanc = "";
            }
        }
        return paraulesBlancs;
    }
    
    public static char separadorArray(String separador) {
        if (separador.isBlank()) {
            return ',';
        } else {
            return separador.charAt(0);
        }
    }

    public static String junta(String[] cadenes, String separador) {
        String cadenesSeparat = "";
    
        for (int i = 0; i < cadenes.length; i++) {
            if (i < cadenes.length-1) {
                cadenesSeparat += cadenes[i] + separador;
            } else {
                cadenesSeparat += cadenes[i];
            }
        }
        return cadenesSeparat;
    }
    
    public static String junta(String[] cadenes, String separador, String darrerSeparador) {
        String cadenesSeparat = "";
    
        for (int i = 0; i < cadenes.length; i++) {
            if (i < cadenes.length-2) {
                cadenesSeparat += cadenes[i] + separador;
            } else if (i == cadenes.length-2) {
                cadenesSeparat += cadenes[i] + darrerSeparador;
            } else {
                cadenesSeparat += cadenes[i];
            }
        }
        return cadenesSeparat;
    }
    
    public static String separadorNotes(String notes) {
        String notesSeparat = "";
        int longitudNotes = notes.length()-2;

        for (int i = 0; i < longitudNotes; i++) {
            char c = notes.charAt(i);
            if ((i == longitudNotes-3 || i == longitudNotes-4) && c == ',') {
                notesSeparat += " i";
            } else {
                notesSeparat += c;
            }
        }
        return notesSeparat;
    }
    
    public static boolean verificaCoordenada(String coordenada) {
        if (coordenada.length() == 2) {
            if (Character.isDigit(coordenada.charAt(0)) && coordenada.charAt(0) >= '0' && coordenada.charAt(0) <= '2') { 
                if (Character.isDigit(coordenada.charAt(1)) && coordenada.charAt(1) >= '0' && coordenada.charAt(1) <= '2') {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static String normalitzaString(String cadena) {
        if (cadena == null || cadena.isBlank()) {
            return null;
        }

        String normalitzat = "";
        boolean espai = false;
        cadena = cadena.strip();
        
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            
            if (!Character.isWhitespace(c)) {
                normalitzat += c;
                espai = false;
            } else {
                if (!espai) {
                    normalitzat += " ";
                }
                espai = true;            
            }
        }
        return normalitzat;
    }
    
    public static boolean esPlantillaDeText(String plantilla, String text) {
    	if (plantilla == null || plantilla.isBlank()) {
    		return true;
    	}
    	
    	plantilla = normalitzaString(plantilla);
    	text = normalitzaString(text);
    	
    	if (plantilla.equalsIgnoreCase(text)) {
    		return true;
    	}
    	
    	if (esPrefix(text.toLowerCase(), plantilla.toLowerCase())) {
    		return true;
    	}
    	return false;
    }
    
    public static boolean nomesConteLletres(String text) {
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			
			if (!Character.isLetter(c)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean formatCorrecte(String text) {
		String format = "-_.+";
		
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			
			for (int j = 0; j < format.length(); j++) {
				char f = format.charAt(j);
				
				if (!Character.isDigit(c) && !Character.isLetter(c) && c != f) {
					return false;
				}
			}
		}
		return true;
	}
}
