# Java Abstract Keyword - Complete Guide

---

## 🔹 What is Abstraction?

**Abstraction** means:

> Hiding implementation details and showing only essential features.

👉 Focus on **WHAT to do**, not **HOW to do**

---

## 🔹 What is `abstract` keyword?

The `abstract` keyword is used to define:

* Abstract class
* Abstract methods

👉 It represents **incomplete behavior** that must be implemented by child classes.

---

# Abstract Class

## Definition

An abstract class is a class that:

* Cannot be instantiated
* Can contain both:

  * Abstract methods (no body)
  * Concrete methods (with body)

---

## Syntax

```java
abstract class ClassName {
    // abstract method
    abstract void methodName();

    // concrete method
    void normalMethod() {
        System.out.println("Normal method");
    }
}
```

---

## Cannot create object

```java
abstract class A {}

A obj = new A(); // ❌ ERROR
```

---

# 🔸 Abstract Method

## Definition

An abstract method:

* Has no body
* Ends with `;`
* Must be implemented in subclass

---

## Syntax

```java
abstract void methodName();
```

---

## Invalid

```java
abstract void test() { } // ❌ ERROR
```

---

# 🔸 Example: Basic Implementation

```java
abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Barking");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog(); // parent reference
        a.makeSound();
        a.sleep();
    }
}
```

---

# 🔹 Key Rules of Abstract

## Rule 1: Abstract class cannot be instantiated

```java
Animal a = new Animal(); // ❌
```

---

## Rule 2: Must override abstract methods

```java
class Dog extends Animal { } // ❌ ERROR
```

✔ Fix:

```java
class Dog extends Animal {
    void makeSound() {
        System.out.println("Barking");
    }
}
```

---

## Rule 3: If child doesn't implement → it must be abstract

```java
abstract class Dog extends Animal {}
```

---

## Rule 4: Abstract class can have constructor

```java
abstract class Animal {
    Animal() {
        System.out.println("Constructor called");
    }
}
```

👉 Called when child object is created

---

## Rule 5: Can have normal methods

```java
void eat() {
    System.out.println("Eating...");
}
```

---

## Rule 6: Can have variables

```java
int age;
String name;
```

---

## Rule 7: Abstract methods cannot be:

* `private`
* `static`
* `final`

---

# 🔹 Abstract + Polymorphism

```java
Animal a = new Dog();
a.makeSound();
```

👉 This is:

* Runtime polymorphism
* Dynamic method dispatch

---

# 🔹 Parent vs Child Reference

## Parent Reference

```java
Animal a = new Dog();
a.makeSound(); // ✔
```

❌ Cannot access child-specific methods

---

## Child Reference

```java
Dog d = new Dog();
d.makeSound();
```

✔ Can access all methods

---

## Downcasting

```java
Animal a = new Dog();
((Dog) a).makeSound(); // ✔
```

---

## Risk

```java
Animal a = new Cat();
((Dog) a).makeSound(); // ❌ Runtime error
```

---

# 🔹 Real-World Example

## Notification System

```java
abstract class Notification {
    abstract void sendMessage();
}

class EmailNotification extends Notification {
    void sendMessage() {
        System.out.println("Email sent");
    }
}

class SMSNotification extends Notification {
    void sendMessage() {
        System.out.println("SMS sent");
    }
}
```

---

## Usage

```java
Notification notify = new EmailNotification();
notify.sendMessage();
```

👉 Easy to switch:

```java
notify = new SMSNotification();
```

---

# 🔹 When to Use Abstract Class?

Use abstract class when:

* You have **common base behavior**
* But some methods differ in implementation
* You want **partial abstraction**

---

# 🔹 Abstract vs Concrete Class

| Feature         | Abstract Class      | Normal Class        |
| --------------- | ------------------- | ------------------- |
| Object creation | ❌ Not allowed       | ✅ Allowed           |
| Methods         | Abstract + Concrete | Only concrete       |
| Purpose         | Blueprint           | Full implementation |

---

# 🔹 Common Mistakes

❌ Creating object of abstract class
❌ Not overriding abstract method
❌ Giving body to abstract method
❌ Calling child methods using parent reference

---

# 🔹 Interview Questions

### Q1: What is abstraction?

👉 Hiding implementation details and showing essential features

---

### Q2: Can abstract class have constructor?

👉 Yes

---

### Q3: Can abstract class have concrete methods?

👉 Yes

---

### Q4: Can we create object of abstract class?

👉 No

---

### Q5: Why use abstract class?

👉 To achieve partial abstraction and code reusability

---

# 🔹 Best Practice

👉 Always code like this:

```java
Notification notify = new EmailNotification();
```

NOT:

```java
EmailNotification notify = new EmailNotification();
```

👉 Reason: Loose coupling + flexibility

---

# 🔹 One-Line Summary

👉 **Abstract = Incomplete blueprint that must be implemented by child class**

---
