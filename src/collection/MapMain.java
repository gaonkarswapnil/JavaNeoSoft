package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Add elements to the Map
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Cherry", 5);
        map.put("Date", 7);

        System.out.println("Initial Map: " + map);

        // Access elements by key
        int appleCount = map.get("Apple");
        int cherryCount = map.get("Cherry");
        System.out.println("Count of Apples: " + appleCount);
        System.out.println("Count of Cherries: " + cherryCount);

        // Update elements by key
        map.put("Banana", 4);
        System.out.println("Map after updating Banana count: " + map);

        // Remove elements by key
        map.remove("Date");
        System.out.println("Map after removing Date: " + map);

        // Check if Map contains a key
        System.out.println("Contains 'Apple': " + map.containsKey("Apple"));

        // Check if Map contains a value
        System.out.println("Contains value 5: " + map.containsValue(5));

        // Get size of Map
        System.out.println("Size of Map: " + map.size());

        // Iterate over Map
        System.out.println("Iterating using for-each loop:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Iterating using Iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Sort Map by keys
        Map<String, Integer> treeMap = new TreeMap<>(map);
        System.out.println("Sorted Map by keys (TreeMap): " + treeMap);

        // Sort Map by values
        LinkedHashMap<String, Integer> sortedByValueMap = new LinkedHashMap<>();
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedByValueMap.put(x.getKey(), x.getValue()));
        System.out.println("Sorted Map by values: " + sortedByValueMap);

        // set of keys
        System.out.println("Keys in the Map: " + map.keySet());

        // collection of values
        System.out.println("Values in the Map: " + map.values());

        // set of entries
        System.out.println("Entries in the Map: " + map.entrySet());

        // Clear Map
        map.clear();
        System.out.println("Map after clearing: " + map);

        // Check if Map is empty or not
        System.out.println("Is Map empty: " + map.isEmpty());
    }
}
