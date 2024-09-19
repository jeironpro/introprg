/*
 * Classe que simplifica la lectura per entrada estàndard.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Entrada {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Llegeix una línia de l'entrada estàndard i la retorna en forma de
     * String
     *
     * Converteix IOException en RuntimeException per evitar que sigui
     * obligatòri gestionar-la i així simplificar l'accés al llenguatge a
     * estudiants nous. Enginy casolà ;)
     */
    public static String readLine() {
        try {
            String line = reader.readLine();
            if (line == null) {
                throw new RuntimeException("S'ha cridat massa cops Entrada.readLine()");
            }
            return line;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
