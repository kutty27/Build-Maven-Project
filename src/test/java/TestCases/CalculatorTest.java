package TestCases;

import org.junit.Test;
import static org.junit.Assert.*;
import Main.Calculator;

public class CalculatorTest {
    
    @Test
    public void testAdd() {
    	Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }
    
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(10, 4);
        assertEquals(6, result);
    }
    
    @Test
    public void testMul() {
        Calculator calculator = new Calculator();
        int result = calculator.mul(6, 2);
        assertEquals(12, result);
    }
    
    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        int result = calculator.div(20, 4);
        assertEquals(5, result);
    }
}

