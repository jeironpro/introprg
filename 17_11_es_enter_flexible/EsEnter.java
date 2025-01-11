/* Aquest programa demana texts fins que rebre una entrada buida.
* Per cada text introduït et dira si és un enter o no.
* Aquesta versió ignora els espais en blanc, els punts i guions baixos
* sempre que es trobin entre dos números amb móduls de un altre fitxer.
*/

public class EsEnter {
    public static void main(String[] args) {
        // Agafar en un String el agument 0 de la línia de comanda
        String modalitat = args[0];
        
        // Si la cadena del argument 0 és diferent a estricte o flexible
        if (!modalitat.equals("estricte") && !modalitat.equals("flexible")) {
            // Mostrar aquest missatge de error
            System.out.println("Modalitat no reconeguda");
        // Del contrari
        } else {
            // Declarar e inicialitzar el boolean confirmaEnterEstricte en false
            boolean confirmaEnterEstricte = false;
            // Declarar e inicialitzar el boolean confirmaEnterFlexible en false
            boolean confirmaEnterFlexible = false;
            // Demanar els texts
            System.out.println("Introdueix texts (enter sol per finalitzar)");
            // Bucle infinit
            while (true) {
                // Llegir els texts
                String text = Entrada.readLine();
                // Si el text no está buit
                if (!text.isBlank()) {
                    // Si la modalitat és estricte
                    if (modalitat.equals("estricte")) {
                        // Assignar a confirmaEnterEstricte la funció esEnter(li passem el text i true com arguments) que está en el fitxer UtilString
                        confirmaEnterEstricte = UtilString.esEnter(text, true);
                    }
                    // Si la modalitat és flexible
                    if (modalitat.equals("flexible")) {
                        // Assignar a confirmaEnterFlexible la funció esEnter(li passem el text i false com arguments) que está en el fitxer UtilString
                        confirmaEnterFlexible = UtilString.esEnter(text, false);                    
                    }
                    // Si confirmaEnterEstricte o confirmaEnterFlexible és true
                    if (confirmaEnterEstricte || confirmaEnterFlexible) {
                        // Mostrar aquest missatge
                        System.out.println("És enter");
                    // Del contrari
                    } else {
                        // Mostrar aquest missatge
                        System.out.println("No és enter");
                    }
                // Del contrari
                } else {
                    // Mostrar aquest missatge
                    System.out.println("Adéu");
                    // Aturar el bucle
                    break;
                }        
            }
        }        
    }
}
