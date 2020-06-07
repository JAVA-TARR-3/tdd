import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

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

    @ParameterizedTest
    @NullAndEmptySource
    public void helloNullOrEmptyTest(String name) {
        assertEquals("Witaj, przyjacielu.", greeting.greet(name));
    }
}
