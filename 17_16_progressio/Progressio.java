/**/

public class Progressio {
    public static void main(String[] args) {
        System.out.println("Introduïu text. Enter per finalitzar.");
        
        while (true) {
            String text = Entrada.readLine();
            if (text.isEmpty()) {
                break;
            }
            
            text = text.strip();
            text = text + " ";
            String paraula = "";
            String paraulaNormal = "";
            boolean paraulaValida = false;
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (!Character.isWhitespace(c)) {
                    paraula += Character.toLowerCase(c);
                    paraulaNormal += c;
                } else {
                    if (paraula.length() >= 3) {
                        paraulaValida = true;
                        if (UtilString.esCreixent(UtilString.filtraVocalCatala(paraula))) {
                            System.out.println("\"" + paraulaNormal + "\"" + " és creixent");
                        } else if (UtilString.esDecreixent(UtilString.filtraVocalCatala(paraula))) {
                            System.out.println("\"" + paraulaNormal + "\"" + " és decreixent");
                        } else if (UtilString.esCreixiDecri(UtilString.filtraVocalCatala(paraula))) {
                            System.out.println("\"" + paraulaNormal + "\"" + " és creixidecri");
                        } else if (UtilString.esDecriCreixi(UtilString.filtraVocalCatala(paraula))) {
                            System.out.println("\"" + paraulaNormal + "\"" + " és decricreixi");
                        } else {
                            System.out.println("\"" + paraulaNormal + "\"" + " és normaleta");
                        }
                    }                
                    paraula = "";
                    paraulaNormal = "";
                }
            }
            if (!paraulaValida) {
                System.out.println("Cap paraula vàlida");
            }
        }
        System.out.println("Adéu");
    }
}
