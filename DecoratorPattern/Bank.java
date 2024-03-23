package DecoratorPattern;

interface Bank {
    void withDraw(double amount);
    void deposit(double amount);
}