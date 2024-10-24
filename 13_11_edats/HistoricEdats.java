/* Aquest programa demana el nom, la edat i l'any actual i et mostra el historic 
* de la teva edat des de que naixes fins a l'any actual.
*/

public class HistoricEdats {
    public static void main(String[] args) {
        System.out.println("nom?");
        String nom = Entrada.readLine();
        System.out.println("edat?");
        int edat = Integer.parseInt(Entrada.readLine());
        System.out.println("any actual?");
        int anyActual = Integer.parseInt(Entrada.readLine());
        
        
        
        if (nom.isBlank() || edat < 0 || anyActual < 1971) {
            System.out.println("Entrada incorrecta");
        } else {
            int anyNaixement = anyActual - edat;
            System.out.println("El " + anyNaixement + " vau néixer");                  
            edat = 0;
            
            for (int i = anyNaixement + 1; i < anyActual; i++) {
                edat = edat + 1;
                if (edat == 1) {
                    System.out.println("El " + i + " teníeu " + edat + " any");
                } else {
                    System.out.println("El " + i + " teníeu " + edat + " anys");  
                }
            }
            System.out.println("Adéu " + nom);
        }
    }
}
