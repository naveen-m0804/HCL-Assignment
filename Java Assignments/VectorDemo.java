package assignments;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initial capacity is 10 by default, but we can specify it.
        Vector<String> animals = new Vector<>();

        System.out.println("--- Adding Elements ---");
        // 2. Adding elements
        animals.add("Dog");
        animals.add("Cat");
        animals.addElement("Elephant"); // Legacy method specific to Vector
        animals.add(1, "Lion"); // Inserting at a specific index

        System.out.println("Current Vector: " + animals);

        // 3. Checking Capacity and Size
        System.out.println("\n--- Capacity vs Size ---");
        System.out.println("Size (number of elements): " + animals.size());
        System.out.println("Capacity (current storage reserved): " + animals.capacity());

        // 4. Accessing Elements
        System.out.println("\n--- Accessing Elements ---");
        System.out.println("Element at index 2: " + animals.get(2));
        System.out.println("First Element: " + animals.firstElement());
        System.out.println("Last Element: " + animals.lastElement());

        // 5. Iterating (Traversing)
        System.out.println("\n--- Iterating using Enumeration (Legacy) ---");
        Enumeration<String> en = animals.elements();
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }
        System.out.println();

        // 6. Removing Elements
        System.out.println("\n--- Removing Elements ---");
        animals.remove("Dog");      // Remove by object
        animals.remove(1);          // Remove by index
        
        System.out.println("Vector after removal: " + animals);

        // 7. Clearing the Vector
        animals.clear();
        System.out.println("Vector after clear(): " + animals);
        System.out.println("Is Vector empty? " + animals.isEmpty());
	}

}
