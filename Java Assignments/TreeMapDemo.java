package assignments;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        // 1. Create a TreeMap
        // We use Integer as Key (ID) and String as Value (Name)
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // 2. Add elements (Intentionally added in random order)
        System.out.println("--- Adding Elements ---");
        employeeMap.put(103, "Alice");
        employeeMap.put(101, "John");
        employeeMap.put(104, "Zara");
        employeeMap.put(102, "Bob");

        // Notice we don't need to manually sort. TreeMap does it on insertion.

        // 3. Print Keys and Values in Default (Ascending) Order
        System.out.println("\n--- Natural Order (Ascending by Key) ---");
        
        // Using entrySet() is the most efficient way to loop through a Map
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }

        // 4. Print Keys and Values in Descending Order
        System.out.println("\n--- Descending Order (Reverse) ---");
        
        // descendingMap() returns a reverse view of the original map
        Map<Integer, String> reversedMap = employeeMap.descendingMap();

        for (Map.Entry<Integer, String> entry : reversedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }
        
        // 5. Fetch specific entries
        System.out.println("\n--- Specific Access ---");
        System.out.println("First Key (Lowest): " + employeeMap.firstKey());
        System.out.println("Last Key (Highest): " + employeeMap.lastKey());
    }
}
