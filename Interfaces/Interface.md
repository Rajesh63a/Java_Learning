# Java Interfaces – Complete Guide

## What is an Interface?

An **interface** in Java is a blueprint of a class that defines **what a class should do**, but not **how it does it**.

It contains:

* Abstract methods (by default)
* Constants (public, static, final)

```java
interface Animal {
    void makeSound();
}
```

---

## Why Use Interfaces?

Interfaces are used to:

* Achieve **abstraction**
* Support **multiple inheritance**
* Enable **loose coupling**
* Improve **scalability and flexibility**

👉 Think of an interface as a **contract**

---

## How to Implement an Interface

```java
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}
```

---

## 🔷 Key Rules of Interfaces

### 1. Methods are:

* `public`
* `abstract` (by default)

```java
void show(); // same as public abstract void show();
```

---

### 2. Variables are:

* `public`
* `static`
* `final`

```java
int x = 10; // same as public static final int x = 10;
```

👉 Cannot be modified

---

### 3. Cannot create object

```java
Animal a = new Animal(); // ❌ Not allowed
```

---

### 4. Use reference

```java
Animal a = new Dog(); // ✅
```

---

## 🔷 Types of Interfaces

### 1. Normal Interface

Contains multiple abstract methods

```java
interface A {
    void show();
    void display();
}
```

---

### 2. Functional Interface

Interface with **only one abstract method**

```java
@FunctionalInterface
interface Payment {
    void pay(double amount);
}
```

✔ Used with **lambda expressions**

---

### 3. Marker Interface

Empty interface (no methods)

Example:

* Serializable
* Cloneable

Used to **mark a class**

---

## 🔷 Java 8 Features in Interface

### 1. Default Methods

```java
interface Vehicle {
    default void start() {
        System.out.println("Vehicle starting...");
    }
}
```

✔ Allows method implementation inside interface

---

### 2. Static Methods

```java
interface MathUtil {
    static void add(int a, int b) {
        System.out.println(a + b);
    }
}
```

Call using:

```java
MathUtil.add(10, 20);
```

---

## 🔷 Multiple Inheritance using Interface

```java
interface A {
    void show();
}

interface B {
    void display();
}

class Test implements A, B {
    public void show() {
        System.out.println("Show");
    }

    public void display() {
        System.out.println("Display");
    }
}
```

✔ Java supports multiple inheritance through interfaces

---

## 🔷 Interface vs Abstract Class

| Feature              | Interface                 | Abstract Class           |
| -------------------- | ------------------------- | ------------------------ |
| Methods              | Abstract + default/static | Abstract + concrete      |
| Multiple inheritance | ✅ Yes                     | ❌ No                     |
| Variables            | Constants only            | Normal variables allowed |
| Constructor          | ❌ No                      | ✅ Yes                    |

---

## 🔷 What is Functional Interface?

An interface with **only one abstract method**

```java
@FunctionalInterface
interface Greeting {
    void sayHello();
}
```

---

## 🔷 Lambda Expression

Lambda is a **short way to implement a functional interface**

### Syntax:

```java
(parameters) -> expression
```

---

### Example 1: Void method

```java
Payment p = amount -> System.out.println(amount);
```

---

### Example 2: Return type

```java
Payment p = amount -> amount * 0.9;
```

---

### Example 3: Multiple lines

```java
Payment p = amount -> {
    double discount = amount * 0.9;
    return discount;
};
```

---

## 🔷 Anonymous Inner Class vs Lambda

### Anonymous Class

```java
Payment p = new Payment() {
    public void pay(double amount) {
        System.out.println(amount);
    }
};
```

---

### Lambda

```java
Payment p = amount -> System.out.println(amount);
```

---

## 🔷 When to Use What?

| Scenario                | Use             |
| ----------------------- | --------------- |
| Complex logic, reusable | Class           |
| One-time logic          | Anonymous class |
| Simple behavior         | Lambda          |

---

## 🔷 Real-World Example

```java
interface PaymentMethod {
    void pay(double amount);
}

class CreditCard implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Credit Card Payment");
    }
}

class UPI implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("UPI Payment");
    }
}
```

---

## 🔷 Advantages of Interface

* Loose coupling
* High flexibility
* Supports multiple inheritance
* Promotes clean architecture

---

## 🔷 Disadvantages

* Cannot have instance variables
* More boilerplate (before lambda)
* Requires implementation in all classes

---

## 🔷 Important Points

* Interface = Contract
* No object creation
* Methods are public & abstract by default
* Variables are static & final
* Functional interface → enables lambda

---

## 🔷 Best Practices

* Always use `@FunctionalInterface` when applicable
* Keep interfaces small and focused
* Follow naming conventions (lowercase package names)
* Prefer interfaces over abstract classes when possible

---

## Summary

Interfaces are one of the most powerful features in Java that help you:

* Design scalable systems
* Write flexible code
* Implement abstraction cleanly
* Use modern features like lambda and streams

---