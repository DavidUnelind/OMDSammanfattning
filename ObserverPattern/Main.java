package ObserverPattern;

@SuppressWarnings("deprecation")
public class Main {

    public static void main(String[] args) {
        Button button = new Button();
        button.addObserver(new Lightbulb());
    }
}