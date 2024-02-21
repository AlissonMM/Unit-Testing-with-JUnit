import java.time.LocalDateTime;

public class Account {
    private double balance;
    private String name;

    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
