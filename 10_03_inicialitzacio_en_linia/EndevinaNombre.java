/*
* Aquest programa mostra capacitats d'endevinació
*
* Per executar-ho, fes
* $ java EndevinaNombre 42
*/

public class EndevinaNombre {
    public static void main(String[] args) {
        
        // Pensa un número
        int numeroPensat = Integer.parseInt(args[0]);
        System.out.print("El número pensat es ");
        System.out.println(numeroPensat);
        
        // Multiplica'l per 3
        int numero = numeroPensat * 3;
        System.out.print("Quan el multipliques per 3 obtens ");
        System.out.println(numero);
        
        // Suma-li 6
        numero = numero + 6;
        System.out.print("Quan li sumes 6 arriba a ");
        System.out.println(numero);
        
        // Divideix-ho tot per 3
        numero = numero / 3;
        System.out.print("Un cop dividit per 3 queda ");
        System.out.println(numero);
        
        // Resta-li el numero pensat
        numero = numero - numeroPensat;
        System.out.print("Finalment, en restar-li el valor inicial, queda ");
        System.out.println(numero);
        
        // Compara el resultat
        System.out.println("A que el resultat és 2?");
    }
}
