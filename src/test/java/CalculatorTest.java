import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
// import org.junit.jupiter.api.Assertions.*;

@DisplayName("Test kalkulatora")
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("before each");
        calculator = new Calculator();
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after each");
    }

    @Test
    @DisplayName("Test dodawania")
    public void additionTest() {
        System.out.println(calculator.getValue());

        assertEquals(3, calculator.add(1, 2));
        assertNotEquals(3, calculator.add(2, 2));
    }

    @Test
    @DisplayName("Test odejmowania")
    public void substractTest() {
        System.out.println(calculator.getValue());

        assertEquals(10, calculator.substract(50,40));
        assertNotEquals(10, calculator.substract(5, 190));
    }

    @Test
    @DisplayName("Test dzielenia")
    @Disabled("logika w trakcie implementacji")
    public void divideTest() {

    }
}
