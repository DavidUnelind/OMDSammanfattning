package FluentInterfaces;

public class Main {
    
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.inc().inc().dec();
    }
}
