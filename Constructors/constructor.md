# Java Constructors – Complete Guide

## What is a Constructor?

A **constructor** in Java is a special method used to **initialize objects**.

It is automatically called when an object is created.

```java
Student s = new Student(); // Constructor is called here
```

---

## Key Characteristics

* Same name as the class
* No return type (not even `void`)
* Automatically invoked when object is created
* Used to initialize instance variables

---

## Why Constructors?

Without constructors:

* You must manually assign values after object creation

With constructors:

* Object is **ready to use immediately**

---

## Basic Example

```java
class Student {
    String name;

    Student() {
        name = "Rajesh";
        System.out.println("Constructor executed");
    }
}
```

---

## Types of Constructors

---

### 1. Default Constructor

A constructor with **no parameters**

```java
class Student {
    String name;

    Student() {
        name = "Unknown";
    }
}
```

👉 If you don’t define any constructor, Java provides a **default constructor automatically**

---

### 2. Parameterized Constructor

A constructor with **parameters to initialize values**

```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

## The `this` Keyword

`this` refers to the **current object**

### Example:

```java
Student(String name, int age) {
    this.name = name;
    this.age = age;
}
```

👉 Used to avoid confusion between:

* instance variables
* parameters

---

## Constructor vs Method

| Feature     | Constructor       | Method          |
| ----------- | ----------------- | --------------- |
| Name        | Same as class     | Any name        |
| Return Type | No return type    | Must have type  |
| Purpose     | Initialize object | Perform actions |
| Call        | Auto              | Manual          |

---

## Example Program

```java
class Employee {
    String name;
    int id;
    double salary;

    // Default Constructor
    Employee() {
        name = "Not Assigned";
        id = 0;
        salary = 0.0;
        System.out.println("Default Constructor Executed");
    }

    // Parameterized Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;

        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative. Setting to 0.");
            this.salary = 0.0;
        }

        System.out.println("Parameterized Constructor Executed");
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.displayDetails();

        Employee e2 = new Employee("Rajesh", 101, 50000);
        e2.displayDetails();
    }
}
```

---

## Execution Flow

1. Object is created using `new`
2. Constructor is called automatically
3. Variables are initialized
4. Object becomes ready to use

---

## Important Rules

* Constructor name must match class name
* Cannot have return type
* Can be overloaded (multiple constructors)
* Called only once per object creation

---

## Common Mistakes

### Adding return type

```java
void Student() { } // WRONG
```

---

### Forgetting `this`

```java
name = name; // WRONG (no effect)
```

---

### Not initializing variables properly

---

## Best Practices

* Always initialize variables properly
* Use validation inside constructors
* Keep constructors simple and readable
* Avoid heavy logic inside constructors

---

## Real-Life Analogy

Constructor = **Setup process**

👉 Like when you buy a phone:

* OS installed
* Settings initialized

Before you use it → everything is ready

---

## Summary

* Constructors initialize objects
* Automatically called during object creation
* Two main types:

  * Default
  * Parameterized
* `this` keyword helps assign values correctly

---
