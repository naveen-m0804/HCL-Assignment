package assignments;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> books = new Stack<>();

        // 2. Pushing (Adding) elements to the top
        System.out.println("--- Pushing Elements ---");
        books.push("Harry Potter");
        books.push("The Hobbit");
        books.push("Effective Java");
        
        System.out.println("Current Stack: " + books);

        // 3. Peeking: Looking at the top element without removing it
        System.out.println("\n--- Peeking ---");
        String topBook = books.peek();
        System.out.println("Element at the top: " + topBook);
        System.out.println("Stack remains: " + books);

        // 4. Searching: Finding the position of an object
        // Returns the 1-based position from the top of the stack
        System.out.println("\n--- Searching ---");
        int position = books.search("Harry Potter");
        if (position != -1) {
            System.out.println("'Harry Potter' is found at position #" + position + " from the top.");
        } else {
            System.out.println("Element not found.");
        }

        // 5. Popping: Removing elements from the top
        System.out.println("\n--- Popping Elements ---");
        while (!books.empty()) {
            String removedBook = books.pop();
            System.out.println("Popped: " + removedBook);
        }

        // 6. Checking if empty
        System.out.println("\n--- Status ---");
        System.out.println("Is the stack empty now? " + books.empty());

	}

}
