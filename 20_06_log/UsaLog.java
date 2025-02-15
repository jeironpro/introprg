/*
 * Aquest programa realitza una demostració de l'ús del mòdul de Log
 * El funcionament és el següent:
 * - Escriu un missatge d'error
 * - Escriu un missatge d'avisi
 * - Escriu un missatge d'informació per cada argument de línia de comandes
 * - Realitza un reset per comprovar la inicialització del comptador
 * - Escriu un missatge de depuració
 */
import java.io.IOException;
public class UsaLog {
   public static void main(String[] args) throws IOException {
       Log.printError("Això és un error greu");
       Log.printWarning("Això és un avís");
       for (int i=0; i < args.length; i++) {
           Log.printInfo(String.format("Argument %d: %s", i, args[i]));
       }
       Log.reset();     // comencem a comptar un altre cop
       Log.printDebug("Aquí s'acaba el main()");
   }
}
