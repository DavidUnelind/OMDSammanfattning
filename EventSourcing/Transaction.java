package EventSourcing;

public class Transaction {
    private String id;
    private double amount;
    
    public Transaction(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return id + ": " + amount;
    }
}