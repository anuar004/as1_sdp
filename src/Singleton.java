public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation from other classes
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am a thread-safe Singleton instance!");
    }
}



