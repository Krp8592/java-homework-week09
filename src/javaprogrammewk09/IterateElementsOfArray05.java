package javaprogrammewk09;

import java.util.ArrayList;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */
public class IterateElementsOfArray05 {
    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<String> city = new ArrayList<>();

        // Adding elements to ArrayList
        city.add("London");
        city.add("Belfast");
        city.add("Birmingham");
        city.add("New castle");
        city.add("Bristol");
        city.add("Milton Kings");

        // Iterating using for loop
        for (String s : city) {
            System.out.println(s);
        }

    }
}
