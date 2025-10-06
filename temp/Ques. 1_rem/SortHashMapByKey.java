import java.util.*;

public class SortHashMapByKey {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Tejas");
        map.put(1, "Rohan");
        map.put(5, "Akash");
        map.put(2, "Priya");

        System.out.println("HashMap before sorting:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

        System.out.println("\nHashMap after sorting by keys:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
