/* 
 * Programa que crear un array de ascensor i instancia a cadascun de els, 
 * a més li assigna el nombre de l'ascensor al pis de cadascun de els.
 */

public class Ascensor {
    // Propietats
    // pis
    int pis = 0;

    public static Ascensor[] creaAscensorsEnEscala(int quants) {
        // Crear l'array de ascensor
        Ascensor[] ascensors = new Ascensor[quants];
        // Iterar tots els ascensors
        for (int i = 0; i < ascensors.length; i++) {
            // Crear una instancia (objecte) per cada ascensor
            ascensors[i] = new Ascensor();
            // Assignar-li el valor de i a cada pis de cada ascensor
            ascensors[i].pis = i;
        }
        // Retornar l'ascensor
        return ascensors;
    }

    public static void main(String[] args) {
        if (args.length > 1 || !UtilString.esEnter(args[0]) || Integer.parseInt(args[0]) <= 0) {
            System.out.println("Cap ascensor");
            return;
        }
        // Agafar el primer argument de la línea de comanda
        int quants = Integer.parseInt(args[0]);
        // Cridar al módul que crea l'array d'ascensors
        Ascensor[] ascensors = creaAscensorsEnEscala(quants);
        // Iterar tots els ascensors
        for (int i = 0; i < ascensors.length; i++) {
            // Mostrar cada ascensor i en qui pis es troba
            System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);
        }
    }
}
