package DecoratorPattern;

public class SimpleBank implements Bank {
    private double balance = 0;

    @Override
    public void withDraw(double amount) {
        balance -= amount;
    }
    
    @Override
    public void deposit(double amount) {
        balance += balance;
    }

    public double getBalance() {
        return balance;
    }
}
