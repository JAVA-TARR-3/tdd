import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import java.util.Stack;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestSatck {

    Stack<Object> stack;

    @Nested
    class WhenNew {

        @BeforeEach
        public void initStack() {
            stack = new Stack<>();
        }

        @Test
        @Order(1)
        public void whenNewIsEmptyTest() {
            assertTrue(stack.isEmpty());
        }

        @Test
        @Order(2)
        public void whenNewPoppedTest() {
            assertThrows(EmptyStackException.class, stack::pop);
        }

        @Test
        @Order(3)
        public void whenNewPeekedTest() {
            assertThrows(EmptyStackException.class, stack::peek);
        }
    }

    @Nested
    class AfterPushing {

        private String item = "An item";

        @BeforeEach
        public void initStack() {
            stack = new Stack<>();
            stack.push(item);
        }

        @Test
        @Order(1)
        public void afterPushingNotEmptyTest() {
            assertFalse(stack.isEmpty());
        }

        @Test
        @Order(2)
        public void afterPushingPoppedTest() {
            assertEquals(item, stack.pop());
            assertTrue(stack.isEmpty());
        }

        @Test
        @Order(3)
        public void afterPushingPeekedTest() {
            assertEquals(item, stack.peek());
            assertFalse(stack.isEmpty());
        }
    }
}
