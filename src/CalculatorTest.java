import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculor cal = new Calculor();
		assertEquals(cal.add(10,10),20);
	}
	@Test
	public void testMinus() {
		Calculor cal = new Calculor();
		assertEquals(cal.minus(10,10),0);
	}
	@Test
	public void testMultiply() {
		Calculor cal = new Calculor();
		assertEquals(cal.multiply(10,10),100);
	}
}
