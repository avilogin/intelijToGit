package src.DecPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingUsingKey {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 3);
        map.put("Apple", 5);
        map.put("Cherry", 2);
        map.put("Date", 7);

        // Sort by keys using TreeMap
        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);

        // Print the sorted map
        System.out.println("HashMap sorted by keys:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
