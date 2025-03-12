// Java Code
import java.util.*;
import java.text.*;

public class CollaborativeProject {
    public static void main(String[] args) {
        // Set up a list of names
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Use a random number generator to pick a name from the list
        Random rand = new Random();
        int index = rand.nextInt(names.size());
        String name = names.get(index);

        System.out.println("Random Name: " + name);
    }
}
