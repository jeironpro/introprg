/* Aquest programa demana enters positius i quan rep un negatiu finalitzará la execució 
* i et mostrarà el mínim, la mitjana i el màxim dels valors vàlids. 
*/

public class Estadistiques {
    public static void main(String[] args) {
        // Demanar el valor
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
        // Declarar e inicialitzar la variable valorMaxim amb valor
        // Aquesta variable guarda el valor màxim 
        int valorMaxim = valor;
        // Declarar e inicialitzar la variable valorMinim amb valor
        // aquesta variable guarda el valor mínim
        int valorMinim = valor;
        // Declarar e inicialitzar variable cantitadNota amb 0
        // Aquesta variable guarda la quantitat de notes introduïdes
        double cantidadValor = 0;
        // Declarar e inicialitzar la variable sumaNotes amb 0
        // Aquesta variable guarda la suma de totes les notes introduïdes 
        double sumaValor = 0;
        
        // Verificar si el valor és negativo
        if (valor < 0) {
            // Com es negativo, mostrar aquest missatge
            System.out.println("Cap valor vàlid introduït");
        // Del contrari, és positivo
        } else {
            // El bucle s'executarà mentre el valor sigui positiu
            while (valor >= 0) {
                // Sempre que el valor sigui major a valor maxim
                if (valor >= valorMaxim) {
                    // El valor màxim serà valor
                    valorMaxim = valor;
                // Sempre que el valor és menor a valor mínim i valor mínim sigui menor a màxim
                } else if (valor < valorMinim && valorMinim <= valorMaxim) {
                    // El valor mínim serà valor
                    valorMinim = valor;
                // Del contrari
                } else {
                    // Valor mínim serà valor mínim
                    valorMinim = valorMinim;
                }
                // Guardar cada nota introduïda
                sumaValor = sumaValor + valor;
                // Sumar les notes
                cantidadValor = cantidadValor + 1;
                
                // Tornar a demanar el valor a dins del bucle
                System.out.println("Introdueix un valor");
                valor = Integer.parseInt(Entrada.readLine());
            }
            // Mostrar el valor mínim
            System.out.println("El mínim és: " + valorMinim);
            // Mostrar la mijtana
            System.out.println("La mitjana és: " + (sumaValor / cantidadValor));
            // Mostrar el valor màxim
            System.out.println("El màxim és: " + valorMaxim);        
        }
    }
}
