/**
 * 
 */
package Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Jay Patel
 *
 */
public class CalculatorTest {
	double d = 0.000001d;
	@Test
	public void addTest1() {
		CalOperation c1 = new CalOperation(5.6,3);
		
		assertEquals(8.6,c1.addNum(),d);
		
	}
	@Test
	public void addTest2() {
		CalOperation c1 = new CalOperation(-5.6,3);
		assertEquals(-2.6,c1.addNum(),d);
		
	}@Test
	public void addTest3() {
		CalOperation c1 = new CalOperation(5.6,-3);
		assertEquals(2.6,c1.addNum(), d);
		
	}@Test
	public void addTest4() {
		CalOperation c1 = new CalOperation(-2.4,-3);
		assertEquals(-5.4,c1.addNum(),d);
		
	}
	@Test
	public void subTest2() {
		CalOperation c1 = new CalOperation(-5.6,3);
		assertEquals(-8.6,c1.subNum(),d);
		
	}@Test
	public void multiTest3() {
		CalOperation c1 = new CalOperation(5.6,-3);
		assertEquals(-16.8,c1.multiNum(), d);
		
	}@Test
	public void divTest4() {
		CalOperation c1 = new CalOperation(-8.6,-4);
		assertEquals(2.15,c1.divNum(),d);
		
	}
	
}
