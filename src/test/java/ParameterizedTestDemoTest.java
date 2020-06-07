import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTestDemoTest {

    @ParameterizedTest
    @ValueSource(strings = { "kajak", "rotor", "racecar" })
    public void palindromeTest(String word) {
        // kajak
        // rower
        // radar

//        assertTrue(isPalindrome("kajak"));
//        assertTrue(isPalindrome("rower"));
//        assertTrue(isPalindrome("kajak"));

        assertTrue(isPalindrome(word));
    }

    private boolean isPalindrome(String word) {

        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        return reverse.equals(word);
    }
}
