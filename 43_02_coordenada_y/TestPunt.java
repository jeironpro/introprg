/**
 * Class per testejar la classe Punt
 */
 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPunt {
    @Test
    public void constructor() {
        new Punt();
    }
    
    @Test
    public void constructorDefecteXZero() {
        Punt p = new Punt();
        assertEquals(0, p.getX());
    }
    
    @Test
    public void constructorDefecteYZero() {
    	Punt p = new Punt();
    	assertEquals(0, p.getY());
    }
}
