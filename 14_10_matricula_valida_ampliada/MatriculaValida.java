/* Aquest programa demana una matrícula i et dira si és una matrícula italiana vàlida 
* Si és massa curta, si es massa llarga o un informe dels caracters vàlids i no vàlids
*/

public class MatriculaValida {
    public static void main(String[] args) {
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();
        
        if (matricula.length() < 7) {
            System.out.println("No és una matrícula italiana vàlida: massa curta");
        } else if (matricula.length() == 7) {
            char primeraLletra = matricula.charAt(0);
            char segonaLletra = matricula.charAt(1);
            char primerNum = matricula.charAt(2);
            char segonNum = matricula.charAt(3);
            char tercerNum = matricula.charAt(4);
            char terceraLletra = matricula.charAt(5);
            char quartaLletra = matricula.charAt(6);
            
            if (Character.isLetter(primeraLletra) && primeraLletra >= 'A' && primeraLletra <= 'Z' && primeraLletra != 'I' && primeraLletra != 'O' && primeraLletra != 'Q' && primeraLletra != 'U' && Character.isUpperCase(primeraLletra) && Character.isLetter(segonaLletra) && segonaLletra >= 'A' && segonaLletra <= 'Z' && segonaLletra != 'I' && segonaLletra != 'O' && segonaLletra != 'Q' && segonaLletra != 'U' && Character.isUpperCase(segonaLletra) && Character.isDigit(primerNum) && Character.isDigit(segonNum) && Character.isDigit(tercerNum) && Character.isLetter(terceraLletra) && terceraLletra >= 'A' && terceraLletra <= 'Z' && terceraLletra != 'I' && terceraLletra != 'O' && terceraLletra != 'Q' && terceraLletra != 'U' && Character.isUpperCase(terceraLletra) && Character.isLetter(quartaLletra) && quartaLletra >= 'A' && quartaLletra <= 'Z' && quartaLletra != 'I' && quartaLletra != 'O' && quartaLletra != 'Q' && quartaLletra != 'U' && Character.isUpperCase(quartaLletra)) {
            System.out.println("És una matrícula italiana vàlida");
            } else {
                System.out.println("No és una matrícula italiana vàlida");
                // Verificar que la primera lletra compleixi totes les condicions per ser vàlida
                if (Character.isDigit(primeraLletra) || primeraLletra < 'A' || primeraLletra > 'Z') {
                    System.out.println(primeraLletra + ": Ha de ser una lletra");
                } else if (Character.isLowerCase(primeraLletra)) {
                    System.out.println(primeraLletra + ": Ha de ser majúscula");
                } else if (primeraLletra == 'I' || primeraLletra == 'O' || primeraLletra == 'Q' || primeraLletra == 'U') {
                    System.out.println(primeraLletra + ": No és una lletra vàlida");
                } else {
                    System.out.println(primeraLletra + ": Correcte");                    
                }
                
                // Verificar que la segona lletra compleixi totes les condicions per ser vàlida
                if (Character.isDigit(segonaLletra) || segonaLletra < 'A' || segonaLletra > 'Z') {
                    System.out.println(segonaLletra + ": Ha de ser una lletra");
                } else if (Character.isLowerCase(segonaLletra)) {
                    System.out.println(segonaLletra + ": Ha de ser majúscula");
                } else if (segonaLletra == 'I' || segonaLletra == 'O' || segonaLletra == 'Q' || segonaLletra == 'U') {
                    System.out.println(segonaLletra + ": No és una lletra vàlida");
                } else {
                    System.out.println(segonaLletra + ": Correcte");                    
                }
                
                // Vericar si el primer digit compleixi totes les condicions per ser vàlid
                if (Character.isLetter(primerNum)) {
                    System.out.println(primerNum + ": Ha de ser un digit");
                } else {
                    System.out.println(primerNum + ": Correcte");  
                }
                
                // Vericar si el segon digit compleixi totes les condicions per ser vàlid
                if (Character.isLetter(segonNum)) {
                    System.out.println(segonNum + ": Ha de ser un digit");
                } else {
                    System.out.println(segonNum + ": Correcte");  
                }
                
                // Vericar si el tercer digit compleixi totes les condicions per ser vàlid
                if (Character.isLetter(tercerNum)) {
                    System.out.println(tercerNum + ": Ha de ser un digit");
                } else {
                    System.out.println(tercerNum + ": Correcte");  
                }
                
                // Verificar que la tercera lletra compleixi totes les condicions per ser vàlida
                if (Character.isDigit(terceraLletra) || terceraLletra < 'A' || terceraLletra > 'Z') {
                    System.out.println(terceraLletra + ": Ha de ser una lletra");
                } else if (Character.isLowerCase(terceraLletra)) {
                    System.out.println(terceraLletra + ": Ha de ser majúscula");
                } else if (terceraLletra == 'I' || terceraLletra == 'O' || terceraLletra == 'Q' || terceraLletra == 'U') {
                    System.out.println(terceraLletra + ": No és una lletra vàlida");
                } else {
                    System.out.println(terceraLletra + ": Correcte");                    
                }
                
                // Verificar que la quarta lletra compleixi totes les condicions per ser vàlida
                if (Character.isDigit(quartaLletra) || quartaLletra < 'A' || quartaLletra > 'Z') {
                    System.out.println(quartaLletra + ": Ha de ser una lletra");
                } else if (Character.isLowerCase(quartaLletra)) {
                    System.out.println(quartaLletra + ": Ha de ser majúscula");
                } else if (quartaLletra == 'I' || quartaLletra == 'O' || quartaLletra == 'Q' || quartaLletra == 'U') {
                    System.out.println(quartaLletra + ": No és una lletra vàlida");
                } else {
                    System.out.println(quartaLletra + ": Correcte");                    
                }
            }
        } else {
            System.out.println("No és una matrícula italiana vàlida: massa llarga");
        }
    }
}
