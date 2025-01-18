/* 
* Programa que demana els valors positius a introduir en un array d'enters,
* el separador a utilitzar i els valors en cada posició de l'índex per 
* emmagatzemar-ho en el array i mostra aquest valor separat pel separador
* introduït, en cas que no s'introdueix un separador, el separador serà la coma.
*/

public class EntersEntreComes {
    public static void main(String[] args) {
        // Demanar la quantitat de valors del array
        System.out.println("Quants?");
        // Llegir la quantitat de valors
        int valorsCorrect = UtilString.valorEnter(Entrada.readLine());
        // Si el valor és major a 0
        if (valorsCorrect > 0) {
            // Demanar el separador
            System.out.println("Separador?");
            // Llegir el separador
            String separador = Entrada.readLine();
            // Declarar el char separadorValid
            char separadorValid = UtilString.separadorArray(separador);
            // Declarar e inicialitzar el int comptador en 0 
            int comptador = 0;
            // Declarar e incialitzar el int numValor en 1
            int numValor = 1;
            // Declarar e inicialitzar el array de enters numeros amb el valor introduït per l'usuari
            int[] numeros = new int[valorsCorrect];        
            // Fer un while que s'execute mentre comptador sigui menor que la longitud del array numeros
            while (comptador < numeros.length) {
                // Demanar el(s) valor(s)
                System.out.println("Valor " + numValor + "?");
                // Llegir el(s) valor(s)
                int valorCorrect = UtilString.valorEnter(Entrada.readLine());
                // Guardar el valor en l'index corresponent
                numeros[comptador] = valorCorrect;                
                // Augmentar en 1 comptador
                comptador++;
                // Augmentar en 1 numValor
                numValor++;
            }
            // Mostrar el valor separat des de la funció entreComes
            System.out.println(UtilString.entreComes(numeros, separadorValid));
        // Del contrari
        } else {
            // Mostrar aquest missatge
            System.out.println("Res a fer");
        }
    }
}
