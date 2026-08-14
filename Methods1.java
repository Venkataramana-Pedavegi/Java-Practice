 import java.util.*;
 public class Methods1 {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);

        // Get an element
        System.out.println("First fruit: " + fruits.get(0));

        // Change an element
        fruits.set(1, "Orange");
        System.out.println("After change: " + fruits);

        // Remove an element
        fruits.remove("Mango");
        System.out.println("After remove: " + fruits);

        // Size
        System.out.println("Number of fruits: " + fruits.size());
    }
}
    

