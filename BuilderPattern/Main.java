package BuilderPattern;

public class Main {
    
    public static void main(String[] args) {
        new User.Builder("David").email("email").age(21).build();
    }
}