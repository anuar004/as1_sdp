public class SingletonClient {
    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton singletonInstance = Singleton.getInstance();


        // Call a method to demonstrate functionality
        singletonInstance.showMessage();

        // Try to create another instance (it will return the same instance)
        Singleton anotherInstance = Singleton.getInstance();

        // Check if both instances are the same
        if (singletonInstance == anotherInstance) {
            System.out.println("Both instances are the same. Singleton pattern is working!");
        } else {
            System.out.println("Singleton pattern is not working!");
        }
    }
}