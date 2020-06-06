import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void additionTest() {
        Calculator calculator = new Calculator();

        int result = calculator.add(1, 2);

        assertEquals(3, calculator.add(1, 2));
        assertNotEquals(3, calculator.add(2, 2));
    }
}
