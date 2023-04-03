package javaprogrammewk09;

import java.util.Arrays;
import java.util.Collections;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class ReverseAnIntegerArray03 {

    // function reverses the elements of the array
    public static void reverseArray(Integer[] array) {

        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.asList(array));
    }

    public static void main(String[] args) {
        System.out.println("Normal Integer array : ");

        //Declare an array
        Integer[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(Arrays.toString(arr));
        System.out.println("Reversed array : ");

        //Call static method
        reverseArray(arr);
    }

}
