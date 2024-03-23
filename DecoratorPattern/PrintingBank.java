package DecoratorPattern;

public class PrintingBank implements Bank {
    SimpleBank bank;

    public PrintingBank(SimpleBank bank) {
        this.bank = bank;
    }

    @Override
    public void withDraw(double amount) {
        bank.withDraw(amount);
        System.out.println("Withdrew: " + amount);
    }
    
    @Override
    public void deposit(double amount) {
        bank.deposit(amount);
        System.out.println("Deposited: " + amount);
    }
}
