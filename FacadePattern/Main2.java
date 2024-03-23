package FacadePattern;

public class Main2 {
    
    public static void main(String[] args) {
        String text = "Hello";
        String fileName = "text.txt";
        Writer.toFile(text, fileName);
    }
    
    
}
