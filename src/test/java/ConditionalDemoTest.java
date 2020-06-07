import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalDemoTest {

    @Test
    @EnabledOnOs(OS.MAC)
    public void onlyOnMacOs() {
        System.out.println("only on mac");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void onlyOnWindowsOs() {
        System.out.println("only on windows");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    public void onlyOnJava8() {
        System.out.println("only on java 8");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    public void onlyOnJava11() {
        System.out.println("only in java 11");
    }

    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
    public void onlyOn64BitArchitecture() {
        System.out.println("only on 64 bit");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = ".*dev.*")
    public void onlyOnDeveloperWorkstation() {
        System.out.println("only on dev");
    }

//    @Test
//    @EnabledIf("2 * 3 == 6")
//    public void onlyOnCondition() {
//        System.out.println("only when 2 * 3 == 6 :)");
//    }
}
