import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.time.LocalDateTime;

public class AssumptionsTest {
    @Test
    //A usage of Assumptions to make sure this test will only run on Windows OS
    @EnabledOnOs(OS.WINDOWS)
    //A usage of Assumptions to make sure this test will only run on Java 17
    //@EnabledOnJre(JRE.JAVA_17)
    //A usage of Assumptions to make sure this test will only run in a range
    // between Java 10 and Java 17
    @EnabledForJreRange(min = JRE.JAVA_10, max = JRE.JAVA_17)
    void Assumptions(){
        Person person1 = new Person("Joelmer", LocalDateTime.now());
        Person person2 = new Person("John", LocalDateTime.now());
        Assertions.assertNotEquals(person2, person1);
    }

    @Test
    void AnotherAssumptionTest(){
        Person person1 = new Person("Joelmer", LocalDateTime.now());
        //A usage of Assumptions to make the test run only
        // if "aliss" == "aliss"
        Assumptions.assumeTrue("aliss".equals("aliss"));
        Assertions.assertNotNull(person1);
    }
}
