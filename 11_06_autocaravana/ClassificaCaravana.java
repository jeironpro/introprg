/* Aquest programa classifica la categoria de les autocaravanes 
* en Econòmica, Genera i luxe. 
* Segon el preu que l'indiques et dirà de quina categoria és.
*/

public class ClassificaCaravana {
    public static void main(String[] args){
        int preu = Integer.parseInt(args[0]);
        
        if (preu < 50000) {
            System.out.println("Econòmica");
        } else if (preu > 500000 || preu <= 175000) {
            System.out.println("General");
        } else {
            System.out.println("Luxe");
        }
    }
}
