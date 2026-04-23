# Java Inheritance - Complete Guide

## Table of Contents

* What is Inheritance?
* Why Use Inheritance?
* Types of Inheritance
* `super()` Keyword
* `this()` Keyword
* Constructor Chaining
* Method Overriding
* `super` vs `this`
* Important Rules
* Common Mistakes
* Interview Questions

---

# 1. What is Inheritance?

Inheritance is a mechanism in Java where one class **acquires the properties and behaviors** of another class.

👉 It promotes **code reuse** and **hierarchical relationships**.

```java
class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class");
    }
}
```

---

# 2. Why Use Inheritance?

* Reuse existing code
* Improve maintainability
* Enable polymorphism
* Reduce redundancy

---

# 3. Types of Inheritance in Java

## 1. Single Inheritance

One class extends another

```java
class A {}
class B extends A {}
```

---

## 2. Multilevel Inheritance

Chain of inheritance

```java
class A {}
class B extends A {}
class C extends B {}
```

---

## 3. Hierarchical Inheritance

Multiple classes inherit from one parent

```java
class A {}
class B extends A {}
class C extends A {}
```

---

## 4. Multiple Inheritance (Not Supported via Classes)

```java
// Not allowed
class A {}
class B {}
class C extends A, B {} // ❌ ERROR
```

👉 Java supports this using **interfaces**

---

# 4. `super` Keyword

Used to refer to **parent class**

## Uses of `super`

### 1. Call parent constructor

```java
super();
super("value");
```

---

### 2. Access parent variables

```java
super.name;
```

---

### 3. Call parent method

```java
super.display();
```

---

## Example

```java
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child constructor");
    }
}
```

---

# 5. `this` Keyword

Refers to **current class object**

## Uses of `this`

### 1. Access current class variables

```java
this.name = name;
```

---

### 2. Call another constructor

```java
this();
this("value");
```

---

### 3. Pass current object

```java
method(this);
```

---

## Example

```java
class Student {
    String name;

    Student() {
        this("Unknown");
    }

    Student(String name) {
        this.name = name;
    }
}
```

---

# 6. Constructor Chaining

Calling one constructor from another.

## Rules

* `this()` → same class
* `super()` → parent class
* Must be **first statement**

---

## Example Flow

```java
class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("B");
    }
}
```

---

# 7. Method Overriding

When a child class provides its own implementation of a parent method.

---

## Rules

* Same method name
* Same parameters
* Same return type (or covariant)
* Must be in different classes
* Use `@Override` (recommended)

---

## Example

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## Runtime Polymorphism

```java
Animal a = new Dog();
a.sound();
```

👉 Output:

```
Dog barks
```

---

# 8. `super` vs `this`

| Feature          | `this`        | `super`      |
| ---------------- | ------------- | ------------ |
| Refers to        | Current class | Parent class |
| Constructor call | Yes           | Yes          |
| Method call      | Yes           | Yes          |
| Variable access  | Yes           | Yes          |

---

# 9. Important Rules

* `this()` and `super()` must be first statement
* Cannot use both in same constructor
* Java inserts `super()` automatically if not written
* If parent has no default constructor → must call `super(param)`
* Constructors are **not inherited**
* Private members are not directly accessible

---

#  10. Common Mistakes

Calling both:

```java
this();
super(); // ❌ Not allowed
```

---

Forgetting super when no default constructor:

```java
class A {
    A(int x) {}
}

class B extends A {
    B() {} // ❌ ERROR
}
```

---

# 11. Interview Questions

### Q1: Can constructor be overridden?

👉 No

---

### Q2: Can we inherit private members?

👉 No (but can access via methods)

---

### Q3: What happens if super() is not written?

👉 Java inserts default super()

---

### Q4: Can we use this() and super() together?

👉 No

---

### Q5: Why multiple inheritance is not supported?

👉 To avoid **Diamond Problem**

---

# Final Summary

* Inheritance = **IS-A relationship**
* `super` = parent access
* `this` = current object
* Overriding = runtime polymorphism
* Constructor chaining = execution flow control

---
