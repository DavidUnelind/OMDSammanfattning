package FacadePattern;

import java.io.FileWriter;
import java.io.IOException;

public class Main1 {

    public static void main(String[] args) {
        String text = "Hello";
        String fileName = "text.txt";
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(text);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}