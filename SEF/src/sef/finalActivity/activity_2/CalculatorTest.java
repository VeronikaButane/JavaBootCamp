package sef.finalActivity.activity_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testGetSum() {

        int a = 19;
        int b = 9;
        assertEquals(15, (Calculator.getSum(a, b)));
        assertEquals(15, (Calculator.getSum(b, a)));

        a = -9;
        b = 0;
        assertEquals(5, (Calculator.getSum(a, b)));
        assertEquals(5, (Calculator.getSum(b, a)));

        a = -19;
        b = -9;
        assertEquals(-15, (Calculator.getSum(a, b)));
        assertEquals(-15, (Calculator.getSum(b, a)));
    }

}