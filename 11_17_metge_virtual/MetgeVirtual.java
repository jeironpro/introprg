/* Aquest programa funcionés com metge virtual,
* et farà algunes preguntes sobre el teu estat de salut
* i et dirà si tens que prendre algú medicament, recomanarà algú caramel 
* o anar a la seva consulta presencial.
*/

public class MetgeVirtual {
    public static void main(String[] args) {
        System.out.println("esternuts? (sí o no)");
        String esternut = Entrada.readLine();
        System.out.println("mal de cap? (sí o no)");
        String malCap = Entrada.readLine();
        System.out.println("problemes d'estómac? (sí o no)");
        String problemesEstomac = Entrada.readLine();
        System.out.println("tos? (sí o no)");
        String tos = Entrada.readLine();
        System.out.println("edat?");
        int edat = Integer.parseInt(Entrada.readLine());
        
        if (esternut.equals("sí") && malCap.equals("sí") && problemesEstomac.equals("sí") && tos.equals("no") && edat > 12) {
            System.out.println("pren paracetamol");
        } else if (esternut.equals("sí") && malCap.equals("sí") && problemesEstomac.equals("no") && tos.equals("no") && edat > 12) {
            System.out.println("prendre àcid acetil salicílic");
        } else if (esternut.equals("no") && malCap.equals("no") && problemesEstomac.equals("no") && tos.equals("sí") && edat < 12) {
            System.out.println("pren un carmel de mel");
        } else if (esternut.equals("no") && malCap.equals("no") && problemesEstomac.equals("no") && tos.equals("sí") && edat > 12) {
            System.out.println("pren un carmel d'eucaliptus");
        } else if (esternut.equals("no") && malCap.equals("no") && problemesEstomac.equals("no") && tos.equals("no")) {
            System.out.println("vine a la consulta");
        }
    }
}
