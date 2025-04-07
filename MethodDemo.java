public class MethodDemo {
    // Method to greet the user
    public static void greet() {
        System.out.println("Hello from the greet method!");
    }

    // Method to print a custom message
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        // Calling methods
        greet();  // Calls the greet method
        printMessage("This is my message!");  // Calls the printMessage method with a string argument
    }
}
