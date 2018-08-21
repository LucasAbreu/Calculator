package lucasabreu.Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	//@Before
	Calculator calculator = new Calculator();
	
	@Test
	public void evaluatesExpression() {
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		assertEquals(6, sum);
	}
	@Test
	public void evaluatesSingleDigit() {
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("3");
		assertEquals(2, sum);
	}

}
