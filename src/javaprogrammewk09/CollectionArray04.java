package javaprogrammewk09;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class CollectionArray04 {
    //Array
    String[] a = new String[7];

    public static void main(String[] args) {
        //Arraylist generic object
        ArrayList<Object> arrayList = new ArrayList<>();

        //adding elements to the arrayList
        arrayList.add("Purple");
        arrayList.add("Blue");
        arrayList.add("Sky-blue");
        arrayList.add("Green");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Gray");

        //Printing the collection using the arrayList.
        for (Object a : arrayList) {
            System.out.println(a);
        }
    }
}
