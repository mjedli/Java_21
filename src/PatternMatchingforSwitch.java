// Java 21
// Pattern matching for switchss
public class PatternMatchingforSwitch {
    public static void main(String[] args) {

        //1. Pattern Matching for Switch

        // before java 21

        String response = "yes";

        switch (response) {
            case "yes":
            case "yeah":
                System.out.println("You said yes!");
                break;
            case "no":
            case "nope":
                System.out.println("You said no!");
                break;
            default:
                System.out.println("Please choose.");
        }

        // now with java 21

        switch (response) {
            case "yes", "yeah" -> System.out.println("You said yes!");
            case "no", "nope" -> System.out.println("You said no!");
            default -> System.out.println("Please choose.");
        }

    }
}