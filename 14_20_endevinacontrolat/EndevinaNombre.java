/**/

public class EndevinaNombre {
    public static void main(String[] args) {
        System.out.println("Nombre?");
        String cadena = Entrada.readLine();
        int valorEndevinar = Integer.parseInt(args[0]);
        int valor = 0;
        boolean enter = false;
           
        while (true) {
            if (!cadena.isEmpty()) {
                enter = true;
                for (int i = 0; i < cadena.length(); i++) {
                    if (!Character.isDigit(cadena.charAt(i))) {
                        enter = false;
                    } else {
                        valor = Integer.parseInt(cadena);
                    }
                }
                // Verificar si el caràcter 0 és un signe de - o +
                if (cadena.charAt(0) == '-' || cadena.charAt(0) == '+') {
                    // Verificar si el caràcter 1 és un dígit
                    if (Character.isDigit(cadena.charAt(1))) {
                        // Com el caràcter 0 es un signe i el caràcter 1 és un dígit, enter es true
                        enter = true;
                    }                            
                }
                if (enter == false) {
                    System.out.println("Nomes lletres");
                } else if (valor <= 0 || valor > 100) {
                    System.out.println("Fora de rang");                    
                } else if (valor > valorEndevinar) {
                    System.out.println("Massa gran");
                } else if (valor < valorEndevinar) {
                    System.out.println("Massa petit");
                }
            }
            
            if (cadena.isEmpty()) {
                System.out.println("Cancel·lat");
                break;            
            }
            if (valor == valorEndevinar) {
                System.out.println("Encertat!");
                break;
            } else {
                System.out.println("Nombre");
                cadena = Entrada.readLine();                
            }
        }
    }
}
