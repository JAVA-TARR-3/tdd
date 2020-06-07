import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator2Test {

    private Calculator2 calculator2;

    @BeforeEach
    public void beforeEach() {
        calculator2 = new Calculator2();
    }

    @Test
    public void additionTest() {
        assertEquals(3, calculator2.add(1, 2));
        assertNotEquals(3, calculator2.add(2, 2));
    }

    @Test
    public void substractTest() {
        assertEquals(3, calculator2.substract(5, 2));
        assertNotEquals(3, calculator2.substract(5, 5));
    }

    @Test
    public void miltiplyTest() {
        assertEquals(4, calculator2.multiply(2,2));
        assertNotEquals(4, calculator2.multiply(3,3));
    }

    @Test
    public void divideTest() {
        assertEquals(4, calculator2.divide(8,2));
        assertNotEquals(4, calculator2.divide(8, 4));
    }

    @Test
    public void divideByZeroTest() {
        assertThrows(ArithmeticException.class, () -> {
            calculator2.divide(4, 0);
        });
    }
}
