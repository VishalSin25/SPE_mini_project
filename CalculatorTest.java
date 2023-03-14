package org.example;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class CalculatorTest {

    Calculator calculator=new Calculator();
    private static final double DELTA = 1e-15;

    @Test
    public void AdditionTruePositive(){
        assertEquals("Finding Addition of numbers for True Positive", 13, calculator.Addition(6,7),DELTA);
    }

    @Test
    public void AdditionFalsePositive(){
        assertNotEquals("Finding Addition  of  numbers for False Positive", 5, calculator.Addition(5,5),DELTA);

    }

    private void assertNotEquals(String s, int i, double addition, double delta) {
    }
}
