Java final Keyword – Complete Guide
🔹 Overview

The final keyword in Java is used to restrict modification. It can be applied to:

Variables
Methods
Classes

Once something is declared as final, it cannot be changed in certain ways depending on where it's used.

🔸 1. Final Variable

A final variable becomes a constant — its value cannot be changed once assigned.

Example:
class Test {
    final int x = 10;

    void change() {
        // x = 20; ❌ Error: cannot assign a value to final variable
    }
}
🔹 Key Points:
Must be initialized once
Can be initialized:
At declaration
Inside constructor
Commonly used with static → constants
Example with constructor:
class Test {
    final int x;

    Test(int value) {
        x = value; // allowed
    }
}
🔸 2. Final Method

A final method cannot be overridden by subclasses.

Example:
class Parent {
    final void show() {
        System.out.println("Final method");
    }
}

class Child extends Parent {
    // void show() {} ❌ Error: cannot override final method
}
🔹 Use Case:
Prevent modification of critical logic
Security / design control
🔸 3. Final Class

A final class cannot be inherited.

Example:
final class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

// class Dog extends Animal {} ❌ Error: cannot inherit from final class
🔹 Real-world Example:
final class String { }
String class is final → cannot be extended
🔸 4. Final with Reference Variables

When a reference variable is final, you cannot change the reference, but you can modify the object.

Example:
class Test {
    int x;
}

class Main {
    public static void main(String[] args) {
        final Test t = new Test();

        t.x = 10;  // ✅ allowed (object modified)

        // t = new Test(); ❌ not allowed (reference change)
    }
}
🔸 5. Final vs Finally vs Finalize
Keyword	Meaning
final	Restriction keyword
finally	Block in exception handling
finalize()	Method called by Garbage Collector
🔸 6. Final with Static (Constants)

Used to create constants.

Example:
class Constants {
    static final double PI = 3.14159;
}
🔹 Naming Convention:
Use UPPERCASE
Example: MAX_VALUE, PI, MIN_LIMIT
🔸 7. Blank Final Variable

A final variable declared without initialization is called a blank final variable.

It must be initialized in:

Constructor (instance variable)
Static block (static variable)
Example:
class Test {
    final int x;

    Test() {
        x = 100; // must initialize
    }
}
🔸 8. When to Use final

Use final when you want to:

🔒 Make variables constant
🚫 Prevent method overriding
🛑 Stop inheritance
🔐 Improve security and design control
🔸 9. Interview Questions
❓ Can we declare constructor as final?

❌ No — constructors cannot be overridden, so final is useless.

❓ Can a final variable be uninitialized?

✅ Yes, but must be initialized later (constructor/block).

❓ Can we use final with arrays?

✅ Yes

final int[] arr = {1, 2, 3};
arr[0] = 10;   // ✅ allowed
// arr = new int[5]; ❌ not allowed
❓ Is final method inherited?

✅ Yes, but cannot be overridden

🔸 Summary
Usage	Effect
Final Variable	Value cannot change
Final Method	Cannot be overridden
Final Class	Cannot be extended

Conclusion

The final keyword is a powerful feature in Java that helps enforce immutability, security, and controlled design. It is widely used in real-world applications to prevent unintended changes.