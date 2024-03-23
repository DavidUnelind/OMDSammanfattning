package EventSourcing;

import java.util.List;
import java.util.ArrayList;

public class Bank {
    private List<Transaction> transactions = new ArrayList<Transaction>();

    public void withDraw(double amount) {
        transactions.add(new Transaction("ID", -amount));
    }

    public void deposit(double amount) {
        transactions.add(new Transaction("ID", amount));
    }
}