package javaprogrammewk09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class RetrieveAnElement06 {

    public static void main(String[] args) {

        // Create a Map object called map
        Map<Integer, String> map = new HashMap<>();

        //Add keys and values (Number, flowerNames)
        map.put(0, "Rose");
        map.put(1, "Lily");
        map.put(2, "Merry-gold");
        map.put(3, "Lotus");
        map.put(4, "Jasmine");
        System.out.println(map);

        //Creating a scanner object to enter key number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        String value1 = map.get(num);
        System.out.println(value1);
    }
}
