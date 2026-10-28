
package calc_t2_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import calc_t2.Calc;

class Calc_test {

    private final Calc calculator = new Calc();

    @Test
    void testAddition() {
        assertEquals(6, calculator.add(4, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(8, calculator.multiply(4, 2));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculator.divide(4, 2), 0.0001);
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(2, 0)
        );
    }
}
