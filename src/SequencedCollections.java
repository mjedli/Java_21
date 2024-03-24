import java.util.ArrayList;
import java.util.List;

// Java 21
// Unnamed Patterns and Variables
public class SequencedCollections {
    public static void main(String[] args) {

        // before java 21

        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);

        // Fetch the first element (element at index 0)
        int firstElement = list.get(0);

        // Fetch the last element
        int lastElement = list.get(list.size() - 1);

        System.out.println("firstElement = " + firstElement );
        System.out.println("lastElement = " + lastElement );

        // now with java 21

        // Fetch the first element (element at index 0)
        firstElement = list.getFirst();

        // Fetch the last element
        lastElement = list.getLast();

        System.out.println("firstElement = " + firstElement );
        System.out.println("lastElement = " + lastElement );
    }
}