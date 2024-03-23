package FacadePattern;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void toFile(String text, String fileName) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(text);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
