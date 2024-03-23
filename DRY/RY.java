package DRY;

import java.io.FileWriter;
import java.io.IOException;

public class RY {

    public void writeUserToFile(String fileName, String user) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(user);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeEventToFile(String fileName, String event) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(event);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
