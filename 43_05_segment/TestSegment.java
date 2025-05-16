/**
 * Classe per testejar la classe Segment
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
public class TestSegment {
	@Test
	public void constructorPerDefecte() {
		new Segment();
	}
	
	@Test
	public void constructorEspecific() {
		Punt p1 = new Punt(10, 4);
		Punt p2 = new Punt(6, 1);
		Segment segment = new Segment(p1, p2);
		String valorPunt1 = segment.getP1().toString();
		String valorPunt2 = segment.getP2().toString();
		String valorsPunts = valorPunt1 + " " + valorPunt2;
		assertEquals("Punt(10, 4) Punt(6, 1)", valorsPunts);
	}
		
	@Test
	public void longitud() {
		Punt p1 = new Punt(7, 9);
		Punt p2 = new Punt(3, 6);
		Segment segment = new Segment(p1, p2);
		assertEquals(5.0, segment.longitud());
	}

	@Test
	public void segmentToString() {
		Punt p1 = new Punt(2, 8);
		Punt p2 = new Punt(5, 3);
		Segment segment = new Segment(p1, p2);
		assertEquals("Segment(Punt(2, 8), Punt(5, 3))", segment.toString());
	}
	
	@Test
	public void puntsEquals() {
		Punt p1 = new Punt(5, 5);
		Punt p2 = new Punt(5, 5);
		Segment segment = new Segment(p1, p2);
		boolean puntsEquals = segment.getP1().equals(segment.getP2());
		assertEquals(true, puntsEquals);
	}
}
