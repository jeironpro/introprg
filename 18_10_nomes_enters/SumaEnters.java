/* 
* Programa que compta amb tres mòduls:
* Una funció que verifica quants valors enters s'introdueixen per la línia de comanda. (quantsEnter)
*
* Una funció que filtra els arguments introduïts per la línia de comanda i retorna un array d'enters (amb la longitud que retorna quantsEnters) amb els valors enters. (filtraEnters)
*
* Una funció que suma els valors filtrats de la funció filtraEnters. (sumaEnters)
*
* Finalment mostra el valor que retorna sumaEnters.
*/

public class SumaEnters {
    public static void main(String[] args) {
        // Cridar el mòdul quantsEnters(passar-li els args)
        quantsEnters(args);
        // Cridar el mòdul filtraEnters(passar-li els args)
        filtraEnters(args);
        // Mostrar el resultat del mòdul sumaEnters(obtener el resultat de filtraEnters(passar-li els args))
        System.out.println(sumaEnters(filtraEnters(args)));
    }
    
    public static int quantsEnters(String[] valors) {
        // Declarar e inicialitzar el int quants en 0
        int quants = 0;
        // Fer un for per iterar la longitud de l'array valors
        for (int i = 0; i < valors.length; i++) {
            // Si esEnter retorna true amb el valor del array en la posició de i
            if (UtilString.esEnter(valors[i])) {
                // Augmentar en 1 quants
                quants++;
            }
        }
        // Retornar quants valor enter hi ha en l'array
        return quants;
    }
    
    public static int[] filtraEnters(String[] valors) {
        // Declarar e inicialitzar l'array enters a la longitud del resultat de quantsEnters
        int[] enters = new int[quantsEnters(valors)];
        // Declarar e inicialitzar el int index en 0
        int index = 0;
        // Fer un for per iterar la longitud de l'array valors
        for (int i = 0; i < valors.length; i++) {
            // Si esEnter retorna true amb el valor del array en la posició de i
            if (UtilString.esEnter(valors[i])) {
                // Converteix el valor a enter
                int valorEnter = Integer.parseInt(valors[i]);
                // Guardar en el array enters i en la posició de i el valor convertit a enter
                enters[index] = valorEnter;
                // Augmentar en 1 index
                index++;
            }
        }
        // Retornar el array con el valor filtrat
        return enters;
    }
    
    public static int sumaEnters(int[] valors) {
        // Declarar e inicialitzar el int sumaValorsEnter en 0
        int sumaValorsEnter = 0;
        // Fer un for per iterar la longitud de l'array valors
        for (int i = 0; i < valors.length; i++) {
            // Sumar-li a sumaValorsEnter el valors en la posició de i
            sumaValorsEnter += valors[i];
        }
        // Retornar la suma dels valors
        return sumaValorsEnter;
    }
}
