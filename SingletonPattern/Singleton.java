package SingletonPattern;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        //Skapar en Singleton
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
