import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreetingTest {

    private Greeting greeting;

    @BeforeEach
    public void beforeEach() {
        greeting = new Greeting();
    }

    @Test
    public void helloJanTest() {
        assertEquals("Witaj, Jan.", greeting.greet("Jan"));
        assertEquals("Witaj, Marek.", greeting.greet("Marek"));
    }
}
