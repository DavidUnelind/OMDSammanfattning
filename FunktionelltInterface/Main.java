package FunktionelltInterface;

public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        System.out.println("Add: " + add.operate(5, 3));

        Calculator subtract = (a, b) -> a - b;
        System.out.println("Subtract: " + subtract.operate(5, 3));
    }
}