import static org.junit.Assert.*;

import com.example.cal.Calculator;
import org.junit.Test;
public class CalculatorTest {

    Calculator calculator=new Calculator();
    private static final double DELTA = 1e-15;

    @Test
    public void AdditionTruePositive(){
        assertEquals("Finding Addition of numbers for True Positive", 13, calculator.Addition(6,7),DELTA);
//        assertEquals("Finding factorial of a number for True Positive", 1, calculator.fact(1), DELTA);
//        assertEquals("Finding factorial of a number for True Positive", 6, calculator.fact(3), DELTA);
//        assertEquals("Finding factorial of a number for True Positive", 24, calculator.fact(4), DELTA);
//        assertEquals("Finding factorial of a number for True Positive", 1, calculator.fact(0), DELTA);
    }

    @Test
    public void AdditionFalsePositive(){
        assertNotEquals("Finding Addition  of  numbers for False Positive", 5, calculator.Addition(5,5),DELTA);
//        assertNotEquals("Finding factorial of a number for False Positive", 10, calculator.fact(6), DELTA);
//        assertNotEquals("Finding factorial of a number for False Positive", 42, calculator.fact(4), DELTA);
//        assertNotEquals("Finding factorial of a number for False Positive", 9, calculator.fact(2), DELTA);
//        assertNotEquals("Finding factorial of a number for False Positive", 0, calculator.fact(0), DELTA);
    }
}
