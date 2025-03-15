//Part 2: Advanced Usage of Generics

//generic interface processor to define a method to process input of type T and return output of type T
interface Processor<T> {
    T process(T input);
}

class StringProcessor implements Processor<String> {
    //to reverse the input string
    public String process(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}

public class Part2_AdvancedGenerics {
    //static method to print the value of a box containing any subtype of number
    public static void printWildcardBox(Box<? extends Number> box) {
        System.out.println("Wildcard Box Value: " + box.get());
    }

    public static void main(String[] args) {
        // Normal Test Cases

        // Test Case 1: Reverse a String
        StringProcessor processor = new StringProcessor();
        String reversed = processor.process("hello");
        System.out.println("[Normal] Reversed String: " + reversed); // Output: "olleh"

        // Test Case 2: Print Integer Box using Wildcard
        Box<Integer> intBox = new Box<>();
        intBox.set(200);
        printWildcardBox(intBox); // Output: 200

        // Test Case 3: Print Double Box using Wildcard
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        printWildcardBox(doubleBox); // Output: 3.14


        // Edge Test Cases

        // Edge Case 1: Reverse Empty String
        String emptyReversed = processor.process("");
        System.out.println("[Edge] Reversed Empty String: " + emptyReversed); // Output: ""

        // Edge Case 2: Print Box with Null Value (allowed by wildcard)
        Box<?> wildcardBox = new Box<>();
        printWildcardBox((Box<? extends Number>) wildcardBox); // Output: null

        // Edge Case 3: runtime error
         processor.process(null);
    }
}