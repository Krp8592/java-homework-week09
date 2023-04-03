package javaprogrammewk09;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

import java.util.HashSet;

public class ShowNumbers08 {

    public static void main(String[] args) {

        // Create a HashSet object called numbers
        HashSet<Integer> set = new HashSet<>();
        // Add values to the set
        set.add(4);
        set.add(7);
        set.add(10);

        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (set.contains(i)) {
                System.out.println(i + " was found in the set.");
            }
        }


    }
}
