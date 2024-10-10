/*
* Aquest programa demana dos operands i un operador binari (+, -, * o /)
* i mostra el resultat del càlcul corresponent
*/

public class CalculadoraSenzilla {
    public static void main(String[] args) {
        System.out.println("Operand1?");
        double operandUno = Double.parseDouble(Entrada.readLine());
        System.out.println("Operador?");
        char operador = Entrada.readLine().charAt(0);
        System.out.println("Operand2?");
        double operandDos = Double.parseDouble(Entrada.readLine());
        double resultat; 
        
        if (operador == '+') {
            resultat = operandUno + operandDos;
            System.out.println(operandUno + " + " + operandDos + " = " + resultat);
        } else if (operador == '-') {
            System.out.println(operandUno + " - " + operandDos + " = " + (operandUno - operandDos));
        } else if (operador == '*') {
            System.out.println(operandUno + " * " + operandDos + " = " + (operandUno * operandDos));
        } else if (operador == '/') {
            System.out.println(operandUno + " / " + operandDos + " = " + (operandUno / operandDos));
        } else if (operandDos == 0) {
            System.out.println("No es pot dividir entre 0");
        } else {
            System.out.println("L'operador " + operador + " no esta disponible");
        }
    }
}
