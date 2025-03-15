# Java Generics Project

A project demonstrating the use of generics in Java, covering three parts:
1. **Basic Generics**: Generic classes and bounded type parameters.
2. **Advanced Generics**: Generic interfaces and wildcards.
3. **Practical Application**: A generic library management system.

## Prerequisites
- **Java JDK 8+** (tested on OpenJDK 17)
- A terminal or IDE (e.g., IntelliJ, VSCode).



## Compile and Run

### Compile All Files:

javac Part1_Generics.java Part2_AdvancedGenerics.java Part3_LibraryApplication.java

Part Explanations
Part 1: Understanding Generics

    Objective:

        Create a generic Box<T> class to store any type of object.

        Extend it to NumberBox<T extends Number> for numeric types only.

    Key Features:

        set(), get(), and printBox() methods.

        Bounded type parameters (T extends Number).

    Test Cases:

        Normal: Integer, String, Double boxes.

        Edge: null values, Integer.MAX_VALUE, and compile-time error for invalid types.

![image](https://github.com/user-attachments/assets/2d78e023-9507-4bbb-811e-c544faff0df3)


Part 2: Advanced Generics

    Objective:

        Implement a Processor<T> interface for string reversal.

        Use wildcards (? extends Number) to handle numeric boxes.

    Key Features:

        StringProcessor reverses strings.

        Wildcard method printWildcardBox().

    Test Cases:

        Normal: Reverse strings, print Integer/Double boxes.

        Edge: Empty string reversal, null box handling.

![image](https://github.com/user-attachments/assets/543fa103-7d0b-4ef4-9d76-d3fa84c63193)


Part 3: Practical Application

    Objective:

        Build a Library<T> class to manage items (books, DVDs, etc.).

    Key Features:

        addItem(), removeItem(), and findItemByName() methods.

    Test Cases:

        Normal: Add/remove books and IDs.

        Edge: Search empty library, remove non-existent items.

![image](https://github.com/user-attachments/assets/3e0408c7-b43f-4633-af94-32e23f267c0f)
