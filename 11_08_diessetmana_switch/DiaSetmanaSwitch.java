/* Aquest programa prendrà el primer argument
* (que ha de ser un número del 1 al 7) 
* per tornar el dia de la setmana que correspongui a aquest numero.
* Si s'introdueix un altre número el programa dirà que és un error.
*
* Ara, en comptes de fer servir if... else if... i else..., 
* utilitzem l'estructura switch.
*/

public class DiaSetmanaSwitch {
    public static void main(String[] args) {
    
        int numeroDia = Integer.parseInt(args[0]);
        String nomDia;
        
        switch (numeroDia) {
            case 1: 
                nomDia = "Dilluns";
                break;
            case 2: 
                nomDia = "Dimarts";
                break;
            case 3: 
                nomDia = "Dimecres";
                break;
            case 4: 
                nomDia = "Dijous";
                break;
            case 5: 
                nomDia = "Divendres";
                break;
            case 6: 
                nomDia = "Dissabte";
                break;
            case 7: 
                nomDia = "Diumenge";
                break;
            default:
                nomDia = "Error";
                break;
        }
        System.out.println(nomDia);
        
        /* ¿Pots fer el programa de aquesta manera també?  */
        /* switch (numeroDia) {
            case 1:
                System.out.println("Dilluns");
                break;
            case 2:
                System.out.println("Dimarts");
                break;
            case 3:
                System.out.println("Dimecres");
                break;
            case 4:
                System.out.println("Dijous");
                break;
            case 5:
                System.out.println("Divendres");
                break;
            case 6:
                System.out.println("Dissabte");
                break;
            case 7:
                System.out.println("Diumenge");
                break;
            default:
                System.out.println("Error");
        } */
    }
}
