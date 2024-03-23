package CommandPattern;

public class PrintTextCommand implements Command {
    private String text;

    public PrintTextCommand(String text) {
        this.text = text;
    }

    public void execute() {
        System.out.println(text);
    }
}