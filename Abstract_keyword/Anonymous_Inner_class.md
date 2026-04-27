# 📘 Anonymous Inner Class in Java (with Abstract Classes)

---

## 🔹 What is an Anonymous Inner Class?

An **Anonymous Inner Class** is:

> A class without a name that is declared and instantiated in a single step.

👉 It is mainly used to provide a **one-time implementation** of:

* Abstract classes
* Interfaces

---

## 🔹 Why Use Anonymous Inner Class?

Use it when:

* Implementation is needed **only once**
* Logic is **small and simple**
* You want to avoid creating a separate class

---

# 🔸 Syntax

```java
ParentClass reference = new ParentClass() {
    // implementation of abstract methods
};
```

---

# 🔸 Example with Abstract Class

```java
abstract class Notification {
    abstract void sendMessage();
}

public class Test {
    public static void main(String[] args) {

        Notification notify = new Notification() {
            public void sendMessage() {
                System.out.println("Message sent through DefaultNotification");
            }
        };

        notify.sendMessage();
    }
}
```

---

# 🔹 How It Works

* Java creates a **hidden subclass** of `Notification`
* That subclass **implements `sendMessage()`**
* Object is created immediately

👉 No separate class file needed

---

# 🔹 Key Rules

## ✅ Rule 1: Must implement all abstract methods

```java
Notification n = new Notification() {
    // ❌ If sendMessage() not implemented → ERROR
};
```

---

## ✅ Rule 2: Cannot define constructor

❌ Not allowed:

```java
new Notification() {
    Notification() {} // ❌ ERROR
};
```

---

## ✅ Rule 3: Can access final/effectively final variables

```java
final String msg = "Hello";

Notification n = new Notification() {
    public void sendMessage() {
        System.out.println(msg);
    }
};
```

---

## ✅ Rule 4: Can define extra methods (but limited usage)

```java
Notification n = new Notification() {
    public void sendMessage() {
        System.out.println("Sending...");
    }

    public void extra() {
        System.out.println("Extra method");
    }
};
```

👉 But:

```java
n.extra(); // ❌ NOT accessible (reference type = Notification)
```

---

# 🔹 When to Use?

## ✅ Good Use Cases

* One-time logic
* Temporary behavior
* Quick testing
* Event handling (UI, listeners)

---

# 🔹 When NOT to Use?

❌ Avoid when:

* Logic is complex
* Code needs reuse
* Multiple implementations required

👉 Use a **separate class** instead

---

# 🔹 Anonymous Class vs Normal Class

| Feature     | Anonymous Class   | Normal Class |
| ----------- | ----------------- | ------------ |
| Name        | ❌ No              | ✅ Yes        |
| Reusability | ❌ No              | ✅ Yes        |
| Code size   | Small             | Can be large |
| Readability | Less (if complex) | Better       |

---

# 🔹 Anonymous Class vs Lambda (Java 8+)

| Feature                   | Anonymous Class | Lambda |
| ------------------------- | --------------- | ------ |
| Works with abstract class | ✅ Yes           | ❌ No   |
| Works with interface      | ✅ Yes           | ✅ Yes  |
| Syntax                    | Verbose         | Short  |

---

## ✅ Lambda Example (Interface Only)

```java
Runnable r = () -> System.out.println("Running");
```

---

# 🔹 Real-World Thinking

Instead of creating:

```java
class TempNotification extends Notification {
    void sendMessage() {
        System.out.println("Temp");
    }
}
```

👉 You can directly use:

```java
Notification n = new Notification() {
    void sendMessage() {
        System.out.println("Temp");
    }
};
```

---

# 🔹 Common Mistakes

❌ Not implementing abstract methods
❌ Trying to reuse anonymous class
❌ Writing complex logic inside anonymous class
❌ Calling extra methods not defined in parent

---

# 🔹 Interview Questions

### Q1: What is an anonymous inner class?

👉 A class without a name used for one-time implementation

---

### Q2: Can we use it with abstract class?

👉 Yes

---

### Q3: Can it have constructor?

👉 No

---

### Q4: Can it have additional methods?

👉 Yes, but not accessible via parent reference

---

### Q5: Difference between anonymous class and lambda?

👉 Lambda works only with functional interfaces

---

# 🔹 Best Practice

👉 Use anonymous class only for:

* Small logic
* One-time use

👉 For large logic:

* Create a proper class

---

# 🔹 One-Line Summary

👉 **Anonymous Inner Class = Quick, one-time implementation without creating a separate class**

---
