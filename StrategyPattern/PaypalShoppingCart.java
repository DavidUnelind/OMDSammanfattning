package StrategyPattern;

public class PaypalShoppingCart {
    private String email;
    private String password;

    public PaypalShoppingCart(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void checkout(double amount) {
        System.out.print(email + password); //Payment
    }
}