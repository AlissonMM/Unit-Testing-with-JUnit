import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;

public class TestPerson {

    @Test
   public void CalculateAgeCorrectly(){
        Person joey = new Person("Joey", LocalDateTime.of(2000, 1, 1, 1, 1, 1));
        Assertions.assertEquals(24, joey.getAge());
    }
}
