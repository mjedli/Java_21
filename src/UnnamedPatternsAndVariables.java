// Java 21
// Unnamed Patterns and Variables
public class UnnamedPatternsAndVariables {
    public static void main(String[] args) {

        // before java 21

        String userInput = "User Input";

        try {
            int number = Integer.parseInt(userInput);
            // Use 'number'
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input: " + userInput);
        }

        // now with java 21

        try {
            int number = Integer.parseInt(userInput);
            // Use 'number'
        } catch (NumberFormatException _) {
            System.out.println("Invalid input: " + userInput);
        }
    }
}