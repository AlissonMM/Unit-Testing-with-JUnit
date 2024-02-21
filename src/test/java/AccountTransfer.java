public class AccountTransfer {
    public void Transfer(Account account1, Account account2, int amount){
        if (amount <= 0 || amount < account1.getBalance()){
            throw new IllegalArgumentException("Amount should not exceed your balance, and should be greater than 0");
        }
    }
}
