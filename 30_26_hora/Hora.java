/*
 * Programa que conté:
 * 3 propietats privades.
 * 2 constructor, un constructor per defecte i un altre que rep parámetres i té restrincions. 
 * els mètodes accessors per cada propietat.
 * 2 mètode que permetren augmentar i disminuir el valor de la propietat segons.
 * 2 versió dels mètodes anterior que rebren per paràmetre els segons a incrementar o disminuir a la propietat segons, aquests dos mètode tenen un altre que fa el seu treball.
 * 1 mètode que compara dues hores (instàncies) de la classe. 
 * També sobreescriu amb l'anotació @override el mètode toString per representar la conversió del valor de l'object de manera personalitzada i no com ho faria java per defecte.
 * 1 mètode que composa un operador segons el valor que retorna el mètode que compara les dues hores.
 */

public class Hora {
    // Propietats privades de la classe
    private int hores;
    private int minuts;
    private int segons;
    
    // Constructor per defecte
    public Hora() {
        this(0, 0, 0);
    }
    
    // Constructor amb paràmetres i restrincions
    public Hora(int hores, int minuts, int segons) {
        if (hores >= 0 && hores <= 23) {
            if (minuts >= 0 && minuts <= 59) {
                if (segons >= 0 && segons <= 59) {
                    // Settear les hores que rep
                    this.setHores(hores);
                    // Settear els minuts que rep
                    this.setMinuts(minuts);
                    // Settear els segons que rep
                    this.setSegons(segons);
                }
            }
        }
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
        // Setter les hores
        this.hores = hores;
    }
    
    // Mètode accessor setter de la propietat minuts
    public void setMinuts(int minuts) {
        // Settear els minuts
        this.minuts = minuts;
    }
    
    // Mètode accessor setter de la propietat segons
    public void setSegons(int segons) {
        // Settear els segons
        this.segons = segons;
    }
    
    // Mètode que permet incrementar 1 al valor de la propietat segons
    public void incrementa() {
        if (this.segons == 59) {
            if (this.minuts == 59) {
                if (this.hores == 23) {
                    this.setHores(0);
                } else {
                    this.hores++;
                }
                this.setMinuts(0);
            } else {
                this.minuts++;
            }
            this.setSegons(0);
        } else {
            this.setSegons(this.segons + 1);         
        }
    }
    
    // Mètode que permet decrementar 1 al valor de la propietat segons
    public void decrementa() {
        if (this.segons == 0) {
            if (this.minuts == 0) {
                if (this.hores == 0) {
                    this.setHores(23);
                } else {
                    this.hores--;
                }
                this.setMinuts(59);
            } else {
                this.minuts--;
            }
            this.setSegons(59);
        } else {
            this.setSegons(this.segons - 1);         
        }
    }
    
    // Mètode que permet incrementar el segons que rep a la propietat segons
    public void incrementa(int segons) {
        if (segons == 1) {
            incrementa();
        } else {
            // Cridar el procediment que fa el treball
            incredecre(segons, "incrementa");
        }
    }
    
    // Mètode que permet decrementar el segons que rep a la propietat segons
    public void decrementa(int segons) {
        if (segons == 1) {
            decrementa();
        } else {
            // Cridar el procediment que fa el treball
            incredecre(segons, "decrementa");
        }
    }
    
    // Mètode que fa el treball de els mètodes incrementa(int) i decrementa(int)
    public void incredecre(int segons, String accio) {
        int segonsEnHoraActual = this.hores * 3600 + this.minuts * 60 + this.segons;
        
        if (accio.equals("decrementa")) {
            segonsEnHoraActual -= segons; 
        }
        
        if (accio.equals("incrementa")) {
            segonsEnHoraActual += segons;
        }

        if (segonsEnHoraActual < 0) {
            while (segonsEnHoraActual < 0) {
                segonsEnHoraActual += 86400;
            }
        } else if (segonsEnHoraActual >= 86400) {
            segonsEnHoraActual -= 86400;
        }
        
        this.setHores(segonsEnHoraActual / 3600);
        this.setMinuts((segonsEnHoraActual % 3600) / 60);
        this.setSegons((segonsEnHoraActual % 3600) % 60);
    }
    
    // Mètode que compara dues hores (instàncies)
    public int compareTo(Hora hora) {
        int hores1 = this.getHores();
        int minuts1 = this.getMinuts();
        int segons1 = this.getSegons();
        
        int hores2 = hora.hores;
        int minuts2 = hora.minuts;
        int segons2 = hora.segons;
        
        if (segons1 < segons2 || minuts1 < minuts2 || hores1 < hores2) {
            return -1;
        }
        
        if (segons1 > segons2 || minuts1 > minuts2 || hores1 > hores2) {
            return 1;
        }
        
        return 0;
    }
    
    @Override
    /* Mètode sobreescrit per personalitza el valor que mostra per pantalla la
     * instancia (objecte).
     */
    public String toString() {
        return String.format("%d:%02d:%02d", hores, minuts, segons);
    }
    
    /* Mètode que composa un operador de aquest (<, >, ==) segons el valor que
     * retorna el mètode compareTo.
     */
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

        hora1.incrementa();
        hora2.decrementa();

        System.out.printf("Finalment hora1: %s %s hora2: %s%n", 
                            hora1,
                            composaOperadorComparacio(hora1, hora2),
                            hora2);
        }
}
