/*
 * Programa que conté una classe i tres propietats privades,
 * dos constructor, un constructor per defecte i un altre que
 * rep parámetres, els mètodes accessors per cada propietat, dos
 * mètode que permetren augmentar i disminuir el valor de un propietat
 * en especific, i dos versió mès dels mateixos mètodes que rebren
 * paràmetres, a més un mètode que compara dues instàncies de la classe. 
 * També sobreescriu amb l'anotació @override el mètode toString per 
 * representar la conversió de l'object a un String de manera personalitzada 
 * i no com ho faria java per defecte.
 */

public class Hora {
    // Propietats privades de la classe
    private int hores;
    private int minuts;
    private int segons;
    
    // Constructor per defecte
    public Hora() {
        // Settear la hora per defecte
        this(0, 0, 0);
    }
    
    // Constructor amb paràmetres
    public Hora(int hores, int minuts, int segons) {
        // Settear les hores que rep
        this.setHores(hores);
        // Settear els minuts que rep
        this.setMinuts(minuts);
        // Settear els segons que rep
        this.setSegons(segons);
    }
    
    // Mètode accessor getter de la propietat hores
    public int getHores() {
        // Retornar les hores actuals
        return this.hores;
    }
    
    // Mètode accessor getter de la propietat minuts
    public int getMinuts() {
        // Retornar els minuts actuals
        return this.minuts;
    }
    
    // Mètode accessor getter de la propietat segons
    public int getSegons() {
        // Retornar els segons actuals
        return this.segons;
    }
    
    // Mètode accessor setter de la propietat hores
    public void setHores(int hores) {
        // Si les hores que rep és entre 0 i 23
        if (hores >= 0 && hores <= 23) {
            // Setter les hores
            this.hores = hores;
        }
    }
    
    // Mètode accessor setter de la propietat minuts
    public void setMinuts(int minuts) {
        // Si els minuts que rep és entre 0 i 59
        if (minuts >= 0 && minuts <= 59) {
            // Settear els minuts
            this.minuts = minuts;
        }
    }
    
    // Mètode accessor setter de la propietat segons
    public void setSegons(int segons) {
        // Si els segons que rep és entre 0 i 59
        if (segons >= 0 && segons <= 59) {
            // Settear els segons
            this.segons = segons;
        }
    }
    
    // Mètode que permet incrementar 1 al valor de la propietat segons
    public void incrementa() {
        // Si els segons actual són 59
        if (this.segons == 59) {
            // Si els minuts són 59
            if (this.minuts == 59) {
                // Si les hores són 59
                if (this.hores == 23) {
                    // Settear la hora a 23
                    this.setHores(0);
                // Del contrari
                } else {
                    // Sumar-li 1 a les hores
                    this.hores++;
                }
                // Setter els minuts a 0
                this.setMinuts(0);
            // Del contrari
            } else {
                // Restar-li 1 als minuts
                this.minuts++;
            }
            // Setter els segons a 0
            this.setSegons(0);
        // Del contrari
        } else {
            // Restar-li 1 als segons
            this.setSegons(this.segons + 1);         
        }
    }
    
    // Mètode que permet decrementar 1 al valor de la propietat segons
    public void decrementa() {
        // Si els segons actual són 0
        if (this.segons == 0) {
            // Si els minuts són 0
            if (this.minuts == 0) {
                // Si les hores són 0
                if (this.hores == 0) {
                    // Settear la hora a 23
                    this.setHores(23);
                // Del contrari
                } else {
                    // Restar-li 1 a les hores
                    this.hores--;
                }
                // Setter els minuts a 59
                this.setMinuts(59);
            // Del contrari
            } else {
                // Restar-li 1 als minuts
                this.minuts--;
            }
            // Setter els segons a 59
            this.setSegons(59);
        // Del contrari
        } else {
            // Restar-li 1 als segons
            this.setSegons(this.segons - 1);         
        }
    }
    
    // Mètode que permet incrementar el segons que rep a la propietat segons
    public void incrementa(int segon) {
        // Cridar el procediment que fa el treball
        incredecre(segon, "incrementa");
    }
    
    // Mètode que permet decrementar el segons que rep a la propietat segons
    public void decrementa(int segon) {
        // Cridar el procediment que fa el treball
        incredecre(segon, "decrementa");
    }
    
    public void incredecre(int segon, String accio) {
        // Formula per convertir la hora a segons
        int segonsEnHoraActual = (hores * 3600) + (minuts * 60) + segons;
        
        if (accio.equals("decrementa")) {
            // Restar els segons a decrementar
            segonsEnHoraActual -= segon; 
        }
        
        if (accio.equals("incrementa")) {
            // Sumar els segons a aumentar
            segonsEnHoraActual += segon;
        }
        
        // A partir dels segons restant/acumulat construeix la hora
        // Calcular quantes hores hi ha en els segons
        int horesSet = segonsEnHoraActual / 3600;
        // Calcular el residuo de les hores
        // Settear la hora
        this.setHores(horesSet);
        
        // Calcular els minuts a partir del residuo de les hores
        int minutsSet = (segonsEnHoraActual % 3600) / 60;
        // Settear els minuts
        this.setMinuts(minutsSet);
        
        // Calcular el residuo del segons
        int segonsSet = (segonsEnHoraActual % 3600) % 60;
        // Settear els segons
        this.setSegons(segonsSet);
    }
    
    // Mètode que compara dues hores (instàncies)
    public int compareTo(Hora hora) {
        // Obtenir les hores de la instància
        int hora1 = this.getHores();
        // Obtenir els minuts de la instància
        int minut1 = this.getMinuts();
        // Obtenir els segons de la instància
        int segon1 = this.getSegons();
        
        // Obtenir les hores de la instància rebuda
        int hora2 = hora.hores;
        // Obtenir els minuts de la instància rebuda
        int minut2 = hora.minuts;
        // Obtenir els segons de la instància rebuda
        int segon2 = hora.segons;
        
        // Verificar si la hora completa de la instancia és menor a la de la instància rebuda
        if (segon1 < segon2 || minut1 < minut2 || hora1 < hora2) {
            // Retornar -1
            return -1;
        }
        
        // Verificar si la hora completa de la instancia és major a la de la instància rebuda
        if (segon1 > segon2 || minut1 > minut2 || hora1 > hora2) {
            // Retornar 1
            return 1;
        }
        
        // Si es cap de les condicins anteriors, són iguals 
        // Retornar 0
        return 0;
    }
    
    // Anotació
    @Override
    // Mètode convertidor a String
    public String toString() {
        // Retornar un String personalitzat
        return String.format("%d:%02d:%02d", hores, minuts, segons);
    }
    
    private static String composaOperadorComparacio(Hora hora1, Hora hora2) {
        int comparacio = hora1.compareTo(hora2);

        if (comparacio < 0) {
            return "<";
        } else if (comparacio > 0) {
            return ">";
        } else {
            return "==";
        }
    }

    public static void main(String[] args) {
        Hora hora1 = new Hora();
        Hora hora2 = new Hora(0, 0, 2);

        System.out.printf("Inicialment hora1: %s %s hora2: %s%n",
                            hora1,
                            composaOperadorComparacio(hora1, hora2),
                            hora2);

        System.out.println("Incrementem 1 segon a la primera i decrementem 1 segon a la segona");

        //hora1.incrementa();
        hora2.decrementa(3600);

        System.out.printf("Finalment hora1: %s %s hora2: %s%n", 
                            hora1,
                            composaOperadorComparacio(hora1, hora2),
                            hora2);
        }
}
