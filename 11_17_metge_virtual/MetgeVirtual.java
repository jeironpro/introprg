/* Aquest programa funcionés com metge virtual,
* et farà algunes preguntes sobre el teu estat de salut
* i et dirà si tens que prendre algú medicament, recomanarà algú caramel 
* o anar a la seva consulta presencial.
*/

public class MetgeVirtual {
    public static void main(String[] args) {
        System.out.println("esternuts? (sí o no)");
        String esternut = Entrada.readLine();
        
        
        if (esternut.equals("sí")) {
            System.out.println("mal de cap? (sí o no)");
            String malCap = Entrada.readLine();
            
            if (malCap.equals("sí")) {
                System.out.println("problemes d'estómac? (sí o no)");
                String problemesEstomac = Entrada.readLine();
                
                if (problemesEstomac.equals("sí")) {
                    System.out.println("pren paracetamol");
                } else if (problemesEstomac.equals("no")) {
                    System.out.println("pren aspirina");
                }
            } else if (malCap.equals("no")) {
                System.out.println("tos? (sí o no)");
                String tos = Entrada.readLine();
                
                if (tos.equals("sí")) {
                    System.out.println("edat?");
                    int edat = Integer.parseInt(Entrada.readLine());
                    
                    if (edat < 12) {
                        System.out.println("pren un carmel de mel");
                    } else {
                        System.out.println("pren un carmel d'eucaliptus"); 
                    }
                }
            }
        }
    }
}
