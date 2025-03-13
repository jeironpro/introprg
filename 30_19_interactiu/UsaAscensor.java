/*
 * Programa que utilitza la classe del programa Ascensor per fer servir les seves 
 * propietats privats mitjançant els mòduls getter i setter, també fer-li preguntes
 * mitjançant els mètodes que inclou.
 */

public class UsaAscensor {
    public static int llegeixEnter() {
        // Demana la resposta
        String resposta = Entrada.readLine();
        // Si la resposta no és un enter
        if (!UtilString.esEnter(resposta)) {
            // Retorna -2
            return -2;
        }
        // Retorna resposta convertit a enter
        return Integer.parseInt(resposta);
    }

    public static void main(String[] args) {
        // Crear una instància de l'Ascensor 
        Ascensor ascensor = new Ascensor();
        // Mostrar el pis inicial
        System.out.println("Pis inicial");
        // Setear el pis retornat per llegeixEnter
        ascensor.setPis(llegeixEnter());
        // Mostrar com està l'ascensor incialment
        System.out.printf("Inicialment l'ascensor està %s%n", ascensor.comEsta());
        // aturat a pujant
        boolean resposta = ascensor.arrencaAmunt();
        // Mostrar com està l'ascensor en arrencar amunt
        System.out.printf("En arrencar amunt l'ascensor respon %b i està %s%n", resposta, ascensor.comEsta());
        // demanem que baixi sense aturar
        resposta = ascensor.arrencaAbaix();
        // Mostrar com està l'ascensor en arrencar a abaix
        System.out.printf("En arrencar a baix l'ascensor respon %b i està %s%n", resposta, ascensor.comEsta());
        // passem del pis indicat al la planta baixa
        System.out.println("Anant a la planta baixa quan està " + ascensor.comEsta());
        
        // Mentre l'ascensor no està abaix
        while (!ascensor.esAbaix()) {
            ascensor.seguentPis();       // passa al següent pis
            System.out.println("\t ara està "+ ascensor.comEsta());
        }
        // Aturar l'ascensor
        ascensor.aturat();
        // Mostrar com està l'ascensor finalment
        System.out.printf("Està %s. Final de trajecte!%n", ascensor.comEsta());
    }
}
