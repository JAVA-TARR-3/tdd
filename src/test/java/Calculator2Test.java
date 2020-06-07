import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator2Test {

    @Test
    public void additionTest() {
        Calculator2 calculator2 = new Calculator2();

        assertEquals(3, calculator2.add(1, 2));
        assertNotEquals(3, calculator2.add(2, 2));
    }

    @Test
    public void substractTest() {
        Calculator2 calculator2 = new Calculator2();

        // assertEquals(3, calculator2.substract(5, 2));
    }
}
