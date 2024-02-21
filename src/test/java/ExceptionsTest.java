import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionsTest {
   @Test
    void validateAccountTransferNotException(){
       Account account1 = new Account("Karl", 10);
       Account account2 = new Account("Joseph", 100);

       AccountTransfer accountTransfer = new AccountTransfer();

       //AssertDoesNotThrow verifies if no exception is thrown
       Assertions.assertDoesNotThrow(() -> accountTransfer.Transfer(account1, account2, -1));
   }

    @Test
    void validateAccountTransfer(){
        Account account1 = new Account("Karl", 10);
        Account account2 = new Account("Joseph", 100);

        AccountTransfer accountTransfer = new AccountTransfer();

        //AssertThrows verifies if the specified exception is thrown
        assertThrows(IllegalArgumentException.class, ()-> accountTransfer.Transfer(account1, account2, -1));
    }
}
