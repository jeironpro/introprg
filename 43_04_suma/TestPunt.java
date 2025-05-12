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
    
    @Test
    public void setX42() {
    	Punt p = new Punt();
    	p.setX(42);
    	assertEquals(42, p.getX());
    }
    
    @Test
    public void setY42() {
    	Punt p = new Punt();
    	p.setY(42);
    	assertEquals(42, p.getY());
    }
    
    @Test
    public void sumaPunt() {
    	Punt p1 = new Punt(5, 9);
    	Punt p2 = new Punt(3, 7);
    	p1.suma(p2);
    	assertAll (
		    () -> assertEquals(8, p1.getX()),
		    () -> assertEquals(16, p1.getY())
		);
    }
}
