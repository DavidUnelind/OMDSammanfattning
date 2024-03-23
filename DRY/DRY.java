package DRY;

import java.io.FileWriter;
import java.io.IOException;

public class DRY {

    public void writeUserToFile(String fileName, String user) {
        writeToFile(fileName, user);
    }

    public void writeEventToFile(String fileName, String event) {
        writeToFile(fileName, event);
    }

    private void writeToFile(String fileName, String text) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(text);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
