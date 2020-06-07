import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    public void beforeEach() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void simpleAddTest() throws Exception {
        assertEquals(0, stringCalculator.add(""));
        assertEquals(1, stringCalculator.add("1"));
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    public void manyNumbresAddTest() {
        assertEquals(6, stringCalculator.add("1,2,3"));
    }

    @Test
    public void endLineDelimeterTest() {
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }

    @Test
    public void customLineDelimeterTest() {
        assertEquals(6, stringCalculator.add("//;\n1;2;3"));
    }
}
