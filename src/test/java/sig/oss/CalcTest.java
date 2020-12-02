import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {
	@Test
	public void testAdd() {
		Calc c = new Calc();
		assertEquals(30, c.add(10, 20));
	}
	@Test
	public testSub() {
		Cale c = new Cale();
		assertEquals(-10, c. sub(10, 20));
	}
	public void testMultipleInc(){//test
		Calc c = new Calc();
		c.inc(25);
		c.inc(25);
		assertEquals(50, c.getResult());
	}
}

