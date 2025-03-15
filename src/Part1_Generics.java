// Generic Box class to store any type of object.
class Box<T> {
    // private variable of type T to hold the value.
    private T value;
    //set the value of the box
    public void set(T value) {
        this.value = value;
    }

    //retrieved the value from the box
    public T get() {
        return value;
    }

    //generic method to print the value of the box
    public void printBox() {
        System.out.println("Box value: " + value);
    }
}

// bounded generic class to restrict the type param T to subclass of number int & double
class NumberBox<T extends Number> extends Box<T> {}

public class Part1_Generics {
    public static void main(String[] args) {

        // Normal Test Cases

        // Test Case 1: Box with Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("[Normal] Integer Box Value: " + intBox.get());
        intBox.printBox(); // Output: 100

        // Test Case 2: Box with String
        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("[Normal] String Box Value: " + strBox.get());
        strBox.printBox(); // Output: "Hello Generics"

        // Test Case 3: NumberBox with Double
        NumberBox<Double> doubleNumberBox = new NumberBox<>();
        doubleNumberBox.set(99.9);
        System.out.println("[Normal] Double NumberBox Value: " + doubleNumberBox.get());
        doubleNumberBox.printBox(); // Output: 99.9


        // Edge Test Cases

        // Edge Case 1: Box with Null Value
        Box<Object> nullBox = new Box<>();
        nullBox.set(null);
        System.out.println("[Edge] Null Box Value: " + nullBox.get()); // Output: null

        // Edge Case 2: NumberBox with Maximum Integer Value
        NumberBox<Integer> maxIntBox = new NumberBox<>();
        maxIntBox.set(Integer.MAX_VALUE);
        System.out.println("[Edge] Max Integer Value: " + maxIntBox.get()); // Output: 2147483647

        // Edge Case 3: compile-time error due to non-numeric type
//         NumberBox<String> invalidBox = new NumberBox<>(); // Error
    }
}