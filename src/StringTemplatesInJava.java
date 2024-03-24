// Java 21
// String Templates In Java
public class StringTemplatesInJava {
    public static void main(String[] args) {

        // before java 21

        String name = "Sachin P";
        String message = String.format("Welcome %s", Java);

        // now with java 21

        String name = "Sachin P";
        String message = STR."Welcome  \{name}!";

    }
}