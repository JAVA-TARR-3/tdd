import org.junit.jupiter.api.*;

public class RepeatedTestDemoTest {

    @BeforeEach
    public void befeoreEach(TestInfo testInfo, TestReporter testReporter, RepetitionInfo repetitionInfo) {
        int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();
        String methodName = testInfo.getDisplayName();

        testReporter.publishEntry(String.format("Wykonywany test %d z %d dla %s", currentRepetition, totalRepetitions, methodName));
    }

    @RepeatedTest(value = 10, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("Test wielokrotny")
    public void repeatedTest(TestInfo testInfo, TestReporter testReporter, RepetitionInfo repetitionInfo) {
//        testReporter.publishEntry(testInfo.getDisplayName());
//        testReporter.publishEntry(repetitionInfo.getCurrentRepetition() + "");
//        testReporter.publishEntry(repetitionInfo.getTotalRepetitions() + "");
    }
}
