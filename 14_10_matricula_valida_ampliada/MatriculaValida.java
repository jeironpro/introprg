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
                if (Character.isLetter(primeraLletra) && primeraLletra >= 'A' && primeraLletra <= 'Z' && primeraLletra != 'I' && primeraLletra != 'O' && primeraLletra != 'Q' && primeraLletra != 'U' && Character.isUpperCase(primeraLletra)) {
                    System.out.println(primeraLletra + ": Correcte");
                } else {
                    System.out.println(primeraLletra + ": Ha de ser majúscula");                    
                }
                
                if (Character.isLetter(segonaLletra) && segonaLletra >= 'A' && segonaLletra <= 'Z' && segonaLletra != 'I' && segonaLletra != 'O' && segonaLletra != 'Q' && segonaLletra != 'U' && Character.isUpperCase(segonaLletra)) {
                    System.out.println(segonaLletra + ": Correcte");
                } else {
                    System.out.println(segonaLletra + ": Ha de ser una majúscula");                
                }
                
                if (Character.isDigit(primerNum)) {
                    System.out.println(primerNum + ": Correcte");  
                } else {
                    System.out.println(primerNum + ": Ha de ser un digit");
                }
                
                if (Character.isDigit(segonNum)) {
                    System.out.println(segonNum + ": Correcte");  
                } else {
                    System.out.println(segonNum + ": Ha de ser un digit");
                }
                
                if (Character.isDigit(tercerNum)) {
                    System.out.println(tercerNum + ": Correcte");  
                } else {
                    System.out.println(tercerNum + ": Ha de ser un digit");
                }
                
                if (Character.isLetter(terceraLletra) && terceraLletra >= 'A' && terceraLletra <= 'Z' && terceraLletra != 'I' && terceraLletra != 'O' && terceraLletra != 'Q' && terceraLletra != 'U' && Character.isUpperCase(terceraLletra)) {
                    System.out.println(terceraLletra + ": Correcte");
                } else {
                    System.out.println(terceraLletra + ": Ha de ser majúscula");                    
                }
                
                if (Character.isLetter(quartaLletra) && quartaLletra >= 'A' && quartaLletra <= 'Z' && quartaLletra != 'I' && quartaLletra != 'O' && quartaLletra != 'Q' && quartaLletra != 'U' && Character.isUpperCase(quartaLletra)) {
                    System.out.println(quartaLletra + ": Correcte");
                } else {
                    System.out.println(quartaLletra + ": Ha de ser una majúscula");                
                }
            }
        } else {
            System.out.println("No és una matrícula italiana vàlida: massa llarga");
        }
    }
}
