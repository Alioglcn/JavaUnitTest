import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd_PositiveNumbers() {
        assertEquals("10 + 20 should equal 30", 30, Calculator.sum(10, 20));
    }

    @Test
    public void testAdd_NegativeNumbers() {
        assertEquals("-10 + -20 should equal -30", -30, Calculator.sum(-10, -20));
    }

    @Test
    public void testAdd_PositiveAndNegativeNumbers() {
        assertEquals("-10 + 20 should equal 10", 10, Calculator.sum(-10, 20));
    }

    @Test
    public void testAdd_ZeroNumbers() {
        assertEquals("0 + 0 should equal 0", 0, Calculator.sum(0, 0));
    }

    @Test
    public void testAdd_LargeNumbers() {
        assertEquals("Max Integer + 1 should overflow and equal to Minimum Integer",
                Integer.MIN_VALUE, Calculator.sum(Integer.MAX_VALUE, 1));
    }

}