public class StringExample {

    public static void main(String[] args) {

        // Creating a String (String literal - stored in String Pool)
        String name = "Rajesh";

        System.out.println("Original Name: " + name);
        System.out.println("Greeting: Hello " + name);

        // Strings are immutable (new object is created)
        name = name + " Annam";
        System.out.println("After Concatenation: " + name);

        // Common String Methods
        System.out.println("Character at index 1: " + name.charAt(1));
        System.out.println("Length of String: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        // String Pool Example (same reference)
        String s1 = "Java";
        String s2 = "Java";

        System.out.println("\n--- String Pool Comparison ---");
        System.out.println("s1 == s2: " + (s1 == s2)); // true (same reference)

        // Heap Memory Example (different objects)
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println("\n--- Heap Memory Comparison ---");
        System.out.println("s3 == s4: " + (s3 == s4));       // false (different references)
        System.out.println("s3.equals(s4): " + s3.equals(s4)); // true (same value)
    }
}