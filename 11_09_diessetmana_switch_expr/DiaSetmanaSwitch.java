/* Aquest programa prendrà el primer argument
* (que ha de ser un número del 1 al 7) 
* per tornar el dia de la setmana que correspongui a aquest numero.
* Si s'introdueix un altre número el programa dirà que és un error.
*
* Ara, en comptes de fer servir switch, 
* utilitzem l'estructura switch expression.
*/

public class DiaSetmanaSwitch {
    public static void main(String[] args) {
    
        int numeroDia = Integer.parseInt(args[0]);
        String nomDia = switch (numeroDia) {
            case 1 -> "Dilluns";
            case 2 -> "Dimarts";
            case 3 -> "Dimecres";
            case 4 -> "Dijous";
            case 5 -> "Divendres";
            case 6 -> "Dissabte";
            case 7 -> "Diumenge";
            default -> "Error";
        };
        System.out.println(nomDia);
    }
}
