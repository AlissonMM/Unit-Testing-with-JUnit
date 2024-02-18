import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


public class AssertionsTest {

    @Test
     public void testsAssertion(){
    int[] firstArray = {10, 20, 30};
    int[] secondArray = {1, 2, 3};

    assertArrayEquals(firstArray, secondArray);
    assertNotEquals(firstArray, secondArray);

    }

    @Test
    public void personNullTest(){
        Person james = new Person("James", LocalDateTime.now());
        assertNotNull(james);
    }
}
