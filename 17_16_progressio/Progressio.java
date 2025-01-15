/**/

public class Progressio {
    public static void main(String[] args) {
        System.out.println("Introduïu text. Enter per finalitzar.");
        System.out.println("Estricte?");
        boolean estricte = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());
        
        while (true) {
            String text = Entrada.readLine();
            if (text.isEmpty()) {
                break;
            }
            
            text = text.strip();
            text = text + " ";
            String paraula = "";
            boolean paraulaValida = false;
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (!Character.isWhitespace(c)) {
                    paraula += c;
                } else {
                    if (paraula.length() >= 3) {
                        paraulaValida = true;
                        if (UtilString.esCreixent(paraula, estricte)) {
                            System.out.println("\"" + paraula + "\"" + " és creixent");
                        } else if (UtilString.esDecreixent(paraula, estricte)) {
                            System.out.println("\"" + paraula + "\"" + " és decreixent");
                        } else if (UtilString.esCreixiDecri(paraula, estricte)) {
                            System.out.println("\"" + paraula + "\"" + " és creixidecri");
                        } else if (UtilString.esDecriCreixi(paraula, estricte)) {
                            System.out.println("\"" + paraula + "\"" + " és decricreixi");
                        } else {
                            System.out.println("\"" + paraula + "\"" + " és normaleta");
                        }
                    }                
                    paraula = "";
                }
            }
            if (!paraulaValida) {
                System.out.println("Cap paraula vàlida");
            }
        }
        System.out.println("Adéu");
    }
}
