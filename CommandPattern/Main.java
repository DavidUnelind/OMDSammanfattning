package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Command> commandList = new ArrayList<Command>();
        Command drawShapeCommand = new DrawShapeCommand(new Shape());
        commandList.add(drawShapeCommand);
        Command printTextCommnad = new PrintTextCommand("Hello");
        commandList.add(printTextCommnad);
        
        for (Command command : commandList) {
            command.execute();
        }     
    }
}
