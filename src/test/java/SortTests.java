import org.junit.jupiter.api.*;


//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class SortTests {

   // @Order(1)
    @DisplayName("D")
    @Test
    void ValidateA(){
        Account account1 = new Account("test1", 2);
        Account account2 = new Account("test2", 2);
        Assertions.assertNotEquals(account1, account2);
    }
  //  @Order(4)
  @DisplayName("B")
    @Test
    void ValidateB(){
        Account account1 = new Account("test1", 2);
        Account account2 = new Account("test2", 2);
        Assertions.assertNotEquals(account1, account2);
    }
   // @Order(2)
   @DisplayName("C")
    @Test
    void ValidateC(){
        Account account1 = new Account("test1", 2);
        Account account2 = new Account("test2", 2);
        Assertions.assertNotEquals(account1, account2);
    }
   // @Order(3)
   @DisplayName("A")
    @Test
    void ValidateD(){
        Account account1 = new Account("test1", 2);
        Account account2 = new Account("test2", 2);
        Assertions.assertNotEquals(account1, account2);
    }
}
