package src.DecPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingUsingValue {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 3);
        map.put("Apple", 5);
        map.put("Cherry", 2);
        map.put("Date", 7);

        // Convert the map to a list of entries
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort the list by values
        entryList.sort(Map.Entry.comparingByValue());

        // Print the sorted entries
        System.out.println("HashMap sorted by values:");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
