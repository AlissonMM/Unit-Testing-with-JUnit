import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class DataBaseTest {
    static DataBase dataBase = new DataBase();
    Person tester = new Person("Joey", LocalDateTime.of(2000, 1, 1, 1, 1, 1));

    @BeforeAll
    static void startConnection(){
        dataBase.startConnection();
    }

    @BeforeEach
    void addData(){
        dataBase.addData(tester);
    }

    @Test
    void testDatabase(){
        assertNotNull(tester);
    }

    @AfterEach
    void dropData(){
        dataBase.dropData();
    }

    @AfterAll
    static void closeConnection(){
        dataBase.closeConnection();
    }
}
