import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void canAdd() {
        assertEquals(7, Calculator.add(3,4));
    }

    @Test
    public void canSubtract(){
        assertEquals(1, Calculator.subtract(4,3));
    }

    @Test
    public void canMultiply(){
        assertEquals(12, Calculator.multiply(3,4));
    }

    @Test
    public void canDivide(){
        assertEquals(2.0, Calculator.divide(6.0,3.0), 0.01);
    }

}
