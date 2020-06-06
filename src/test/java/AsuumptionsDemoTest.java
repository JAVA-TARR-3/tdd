import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

public class AsuumptionsDemoTest {

    @Test
    public void testOnlyOnCiServer() {
        assumeTrue("CI".equals(System.getenv("ENV")));
    }

    @Test
    public void testOnlyOnDeveloperWorkstation() {
        assumeTrue("DEV".equals(System.getenv("ENV")), () -> "Aborting test: not on developer workstation");
    }

    @Test
    public void testInAllEnvironments() {
        assumingThat("CI".equals(System.getenv("ENV")), () -> {
            System.out.println("Test on CI");
            Calculator calculator = new Calculator();
            assertEquals(3, calculator.add(3, 0));
        });

        System.out.println("Test on all environments");

        Calculator calculator = new Calculator();
        assertEquals(6, calculator.add(3, 3));
    }
}
