/*
* Aquest programa mostra capacitats d'endevinació
*
* Per executar-ho, fes
* $ java EndevinaNombre 42
*/

public class EndevinaNombre {
    public static void main(String[] args) {
        
        int numeroPensat;   // guardará el número pensat
        int numero;         // guardará els calculs intermitjos
        
        // Pensa un número
        numeroPensat = Integer.parseInt(args[0]);
        System.out.println("El número pensat és " + numeroPensat);
        
        // Multiplica'l per 3
        numero = numeroPensat * 3;
        System.out.println("Quan el multipliques per 3 obtens " + numero);
        
        // Suma-li 6
        numero = numero + 6;
        System.out.println("Quan li sumes 6 arriba a " + numero);
        
        // Divideix-ho tot per 3
        numero = numero / 3;
        System.out.println("Un cop dividit per 3 queda " + numero);
        
        // Resta-li el numero pensat
        numero = numero - numeroPensat;
        System.out.println("Finalment, en restar-li el valor inicial, queda " + numero);
        
        // Compara el resultat
        System.out.println("A que el resultat és 2?");
    }
}
