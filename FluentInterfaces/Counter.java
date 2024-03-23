package FluentInterfaces;

public class Counter {
    private int value = 0;

    public Counter inc() {
        value++;
        return this;
    }

    public Counter dec() {
        value--;
        return this;
    }

    public int getValue() {
        return value;
    }
}
