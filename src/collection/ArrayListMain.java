package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements
        arrayList.add("Apple");
        arrayList.add("Mango");
        arrayList.add("Kiwi");
        arrayList.add("Grapes");

        System.out.println("Initial ArrayList: " + arrayList);

        // Access elements by index
        String firstElement = arrayList.get(0);
        String thirdElement = arrayList.get(2);
        System.out.println("First element: " + firstElement);
        System.out.println("Third element: " + thirdElement);

        // Update elements by index
        arrayList.set(1, "Blueberry");
        System.out.println("Updated ArrayList: " + arrayList);

        // Remove elements by index
        arrayList.remove(3);
        System.out.println("Removing element at index 3: " + arrayList);

        // Remove elements by value
        arrayList.remove("Grapes");
        System.out.println("Removing Grapes: " + arrayList);

        // Check if the element present in List
        System.out.println("Contains 'Cherry': " + arrayList.contains("Cherry"));

        // size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());

        // Iterate the ArrayList
        System.out.println("Iterating using for-each loop:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Sort ArrayList
        Collections.sort(arrayList);
        System.out.println("ArrayList after sorting: " + arrayList);

        // Convert ArrayList to array
        String[] array = arrayList.toArray(new String[0]);
        System.out.println("Array from ArrayList:");
        for (String fruit : array) {
            System.out.println(fruit);
        }

        // Clear ArrayList
        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);

        // Check if ArrayList is empty or not
        System.out.println("Is ArrayList empty: " + arrayList.isEmpty());
    }
}
