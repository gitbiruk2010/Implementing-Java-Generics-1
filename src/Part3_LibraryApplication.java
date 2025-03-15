import java.util.ArrayList;
import java.util.List;

//Implement add, remove, and find operations.
// @param <T> The type of items stored in the library.

class Library<T> {
    // list to store items of type T.
    private List<T> items = new ArrayList<>();

    //adds an item to the library
    public void addItem(T item) {
        items.add(item);
    }

    //removes an item from the libaray
    public void removeItem(T item) {
        items.remove(item);
    }

    //finds an item by name using param name (assumes item.toString()
    public T findItemByName(String name) {
        for (T item : items) {
            if (item.toString().equals(name)) {
                return item;
            }
        }
        return null;
    }
}

public class Part3_LibraryApplication {
    public static void main(String[] args) {

        // Normal Test Cases

        // Test Case 1: Library with Books (Strings)
        Library<String> bookLibrary = new Library<>();
        bookLibrary.addItem("Component Software");
        bookLibrary.addItem("Component Software");
        String foundBook = bookLibrary.findItemByName("Component Software");
        System.out.println("[Normal] Found Book: " + foundBook); // Output: "Component software"

        // Test Case 2: Library with IDs (Integers)
        Library<Integer> idLibrary = new Library<>();
        idLibrary.addItem(11);
        idLibrary.addItem(12);
        Integer foundId = idLibrary.findItemByName("11"); // Search by string "11"
        System.out.println("[Normal] Found ID: " + foundId); // Output: 11

        // Test Case 3: Remove an Item
        bookLibrary.removeItem("Component Software");
        System.out.println("[Normal] Removed 'Component Software'");


        // Edge Test Cases

        // Edge Case 1: Search Empty Library
        Library<Object> emptyLibrary = new Library<>();
        Object result = emptyLibrary.findItemByName("test");
        System.out.println("[Edge] Empty Library Search: " + result); // Output: null

        // Edge Case 2: Remove Non-Existent Item
        bookLibrary.removeItem("Non-Existent Book"); // Silently fails
        System.out.println("[Edge] Removed Non-Existent Item");

        // Edge Case 3: testing null item handling
//         bookLibrary.addItem(null);
//         System.out.println(bookLibrary.findItemByName("null")); // error
    }
}