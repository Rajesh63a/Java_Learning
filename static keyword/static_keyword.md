# 📘 Java `static` Keyword – Complete Guide

## 🔹 What is `static` in Java?

The `static` keyword in Java is used for memory management.
It means that a member (variable/method/block) belongs to the **class**, not to individual objects.

👉 Only **one copy** exists, shared across all objects.

---

# 🔹 Static Variable

## ✅ Definition

A static variable is a class-level variable shared among all instances.

## 📌 Example

```java
class Student {
    String name;
    static String collegeName = "AITS";
}
```

## 🔍 Key Points

* Only **one copy** exists
* Stored in **Method Area (Metaspace)**
* Shared across all objects
* Access using class name (recommended)

```java
Student.collegeName;
```

---

## ⚠ Example Behavior

```java
Student s1 = new Student();
Student s2 = new Student();

s1.collegeName = "ABC";

System.out.println(s2.collegeName); // ABC
```

👉 Change in one place affects all objects

---

## ✅ Use Cases

* Common properties (college, company)
* Counters (total users, objects created)
* Constants (`static final`)

---

# 🔹 Static Method

## ✅ Definition

A static method belongs to the class and can be called without creating an object.

## 📌 Example

```java
class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
}
```

## 📌 Usage

```java
int result = Calculator.add(2, 3);
```

---

## 🔍 Key Rules

### ✅ Can access:

* Static variables
* Other static methods

### ❌ Cannot directly access:

* Non-static (instance) variables
* Non-static methods

---

## ⚠ Example Error

```java
class Test {
    int x = 10;

    static void show() {
        System.out.println(x); // ERROR
    }
}
```

---

## ✅ Correct Way

```java
static void show() {
    Test t = new Test();
    System.out.println(t.x);
}
```

---

## ✅ Real-world Example

```java
Math.max(10, 20);
Math.sqrt(16);
```

---

## ✅ Best Practice

* Use static methods for **utility logic**
* Avoid unnecessary object creation
* Keep them **stateless**

---

# 🔹 Static Block

## ✅ Definition

A static block is used to initialize static variables and runs **once when the class is loaded**.

---

## 📌 Example

```java
class Demo {
    static {
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
```

## 🧾 Output

```
Static block executed
Main method
```

---

## 🔍 Key Points

* Executes only **once**
* Runs **before main()**
* Executes when class is loaded
* Can have multiple static blocks

---

## 📌 Multiple Static Blocks

```java
static {
    System.out.println("Block 1");
}

static {
    System.out.println("Block 2");
}
```

👉 Output order:

```
Block 1
Block 2
```

---

## ⚠ Important

Static block executes only if class is used:

```java
System.out.println(Student.collegeName);
```

OR

```java
new Student();
```

---

# 🔹 Difference: Static vs Non-Static

## 📊 Variables

| Feature    | Static Variable | Instance Variable |
| ---------- | --------------- | ----------------- |
| Belongs to | Class           | Object            |
| Copies     | One             | One per object    |
| Memory     | Method Area     | Heap              |
| Access     | ClassName.var   | object.var        |

---

## 📊 Methods

| Feature            | Static Method | Non-Static Method |
| ------------------ | ------------- | ----------------- |
| Belongs to         | Class         | Object            |
| Requires object    | ❌ No          | ✅ Yes             |
| Access static data | ✅ Yes         | ✅ Yes             |
| Access instance    | ❌ Directly No | ✅ Yes             |

---

# 🔹 Execution Flow in Java (VERY IMPORTANT)

When a class is used:

## 🔥 Order of Execution

```
1. Static variables initialization
2. Static block execution
3. Main method starts
4. Object creation
5. Instance variables initialization
6. Constructor execution
```

---

## 📌 Example

```java
class Demo {

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }

    Demo() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
    }
}
```

---

## 🧾 Output

```
Static block
Instance block
Constructor
```

---

# 🔹 Best Practices

✅ Use static for:

* Shared data
* Utility methods
* Constants

❌ Avoid:

* Accessing static via object
* Mixing static & instance unnecessarily
* Overusing static (breaks OOP principles)

---

# 🔹 Summary

* `static` = class-level
* Shared memory across objects
* Static methods → no object needed
* Static block → runs once at class load
* Execution flow is crucial for interviews

---

# 🚀 Final Tip

If you understand:

* Static variable
* Static method
* Static block
* Execution flow

👉 You’ve mastered one of the **most important Java core concepts**

---
