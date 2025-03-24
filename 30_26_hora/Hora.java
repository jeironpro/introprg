/*
 * Programa que conté una classe i tres propietats privades,
 * dos constructor, un constructor per defecte i un altre que
 * rep parámetres, els mètodes accessors per cada propietat, dos
 * mètode que permetren augmnetar i disminuir el valor de un propietat
 * en especific, i dos versió mès dels mateixos mètodes que rebren
 * paràmetres. També sobreescriu amb l'anotació @override el mètode 
 * toString per representar la conversió de l'object a un String de 
 * manera personalitzada i no com ho faria java per defecte, a més un 
 * mètode que compara dues instàncies de la classe.
 */

public class Hora {
    private int hores;
    private int minuts;
    private int segons;
    
    public Hora() {
        this(0, 0, 0);
    }
    
    public Hora(int hores, int minuts, int segons) {
        this.setHores(hores);
        this.setMinuts(minuts);
        this.setSegons(segons);
    }
    
    public int getHores() {
        return this.hores;
    }
    
    public int getMinuts() {
        return this.minuts;
    }
    
    public int getSegons() {
        return this.segons;
    }
    
    public void setHores(int hores) {
        if (hores >= 0 && hores <= 24) {
            this.hores = hores;
        }
    }
    
    public void setMinuts(int minuts) {
        if (minuts >= 0 && minuts <= 60) {
            this.minuts = minuts;
        }
    }
    
    public void setSegons(int segons) {
        if (segons >= 0 && segons <= 60) {
            this.segons = segons;
        }
    }
    
    public void incrementa() {
        if (this.segons + 1 == 60) {
            this.minuts++;
        } else {
            this.setSegons(this.segons + 1);         
        }
    }
    
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
    
    public void incrementa(int segons) {
        incredecre(segons, "incrementa");
    }
    
    public void decrementa(int segons) {
        incredecre(segons, "decrementa");
    }
    
    public void incredecre(int segons, String accio) {
        // Convertir la hora a segons, per poder decrementar els segons
        int horesASegons = this.hores * 3600 + this.minuts * 60 + this.segons;
        int restaSegons = horesASegons - segons;
        
        if (accio.equals("incrementa")) {
            horesASegons += segons;
        }
        
        if (accio.equals("decrementa")) {
            horesASegons -= segons;
            if (horesASegons < 0) {
                horesASegons += 86400;
            }
        }
        
        this.setHores(horesASegons / 3600);
        this.setMinuts((horesASegons % 3600) / 60);
        this.setSegons((horesASegons % 3600) % 60);
    }
    
    public int compareTo(Hora hora) {
        int hora1 = this.getHores();
        int minut1 = this.getMinuts();
        int segon1 = this.getSegons();
        
        int hora2 = hora.hores;
        int minut2 = hora.minuts;
        int segon2 = hora.segons;
        
        if (segon1 < segon2 || minut1 < minut2 || hora1 < hora2) {
            return -1;
        }
        
        if (segon1 == segon2 && minut1 == minut2 && hora1 == hora2) {
            return 0;
        }
        
        if (segon1 > segon2 || minut1 > minut2 || hora1 > hora2) {
            return 1;
        }
        
        return 2;
    }
    
    @Override
    public String toString() {
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

        hora1.incrementa();
        hora2.decrementa();

        System.out.printf("Finalment hora1: %s %s hora2: %s%n",
                hora1,
                composaOperadorComparacio(hora1, hora2),
                hora2);
    }
}
