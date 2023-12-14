package app;

import app.service.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-3, calculator.subtract(0, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
        assertEquals(0, calculator.multiply(0, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(0, calculator.divide(0, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }
}
