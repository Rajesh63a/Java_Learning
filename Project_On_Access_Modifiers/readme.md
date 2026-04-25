# Java Access Modifiers & Packages - Complete Guide

---

# Access Modifiers in Java

Access modifiers define **who can access variables, methods, and classes**.

## Types of Access Modifiers

| Modifier    | Same Class | Same Package | Subclass (Different Package) | Other Packages |
| ----------- | ---------- | ------------ | ---------------------------- | -------------- |
| `private`   | ✅          | ❌            | ❌                            | ❌              |
| `default`   | ✅          | ✅            | ❌                            | ❌              |
| `protected` | ✅          | ✅            | ✅                            | ❌              |
| `public`    | ✅          | ✅            | ✅                            | ✅              |

---

# `private`

* Accessible **only within the same class**
* Cannot be accessed outside directly

```java
class Student {
    private int id;

    private void show() {
        System.out.println("Private method");
    }
}
```

### ✔ Use Case

* Data hiding (Encapsulation)

---

# `default` (No Modifier)

* Accessible **only within the same package**

```java
class Student {
    int id;  // default

    void display() {
        System.out.println("Default method");
    }
}
```

---

# `protected`

* Accessible:

  * Same package ✅
  * Subclass (even in different package) ✅

```java
class Animal {
    protected void sound() {
        System.out.println("Animal sound");
    }
}
```

---

# Important Rule (Protected)

In different package:

* Accessible **only through inheritance**
*   Not accessible using object reference

```java
// ❌ Not allowed
obj.protectedVar;

// ✅ Allowed inside subclass
System.out.println(protectedVar);
```

---

# `public`

* Accessible from **anywhere**

```java
public class Main {
    public void show() {
        System.out.println("Public method");
    }
}
```

---

# Memory Trick

* `private` → Only me
* `default` → Same package
* `protected` → Package + inheritance
* `public` → Everyone

---

# Packages in Java

A **package** is a namespace that organizes classes.

---

## Why Packages?

* Avoid class name conflicts
* Better organization
* Access control
* Reusability

---

## Creating a Package

```java
package com.bank;
```

👉 Must be the **first line in file**

---

## Folder Structure

```text
project/
 └── com/
     └── bank/
         ├── BankAccount.java
         └── BankTest.java
```

---

## Using Classes from Another Package

```java
import com.bank.BankAccount;
```

---

# Compilation & Execution

## Compile

```bash
javac com/bank/*.java com/bank/app/*.java
```

## Run

```bash
java com.bank.BankTest
```

---

# Real Example

## BankAccount.java

```java
package com.bank;

public class BankAccount {

    private double balance = 1000;
    double interestRate = 5.0;
    protected String accountType = "Savings";
    public String bankName = "SBI";

    public void showDetails() {
        System.out.println(balance);
        System.out.println(interestRate);
        System.out.println(accountType);
        System.out.println(bankName);
    }
}
```

---

## BankTest.java (Same Package)

```java
package com.bank;

public class BankTest {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.interestRate = 10.0;   // ✅ default
        acc.accountType = "Current"; // ✅ protected
        acc.bankName = "Equitas";  // ✅ public

        acc.showDetails();
    }
}
```

---

## SavingsAccount.java (Different Package - Subclass)

```java
package com.bank.app;

import com.bank.BankAccount;

public class SavingsAccount extends BankAccount {

    public void testAccess() {

        // System.out.println(balance); ❌ private
        // System.out.println(interestRate); ❌ default

        System.out.println(accountType); // ✅ protected
        System.out.println(bankName);    // ✅ public
    }
}
```

---

## App.java (Different Package - Normal Class)

```java
package com.bank.app;

import com.bank.BankAccount;

public class App {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        // acc.balance ❌
        // acc.interestRate ❌
        // acc.accountType ❌

        acc.bankName = "Equitas"; // ✅
    }
}
```

---

# Important Rules

## 1. Class Level Modifiers

```java
public class A {}   // ✅
class B {}          // ✅ (default)

private class C {}  // ❌ Not allowed
```

---

## 2. Methods & Variables

All modifiers are allowed:

* private
* default
* protected
* public

---

## 3. Best Practices

* Use `private` for variables
* Use getters/setters
* Use `protected` for inheritance
* Use `public` for APIs

---

# Encapsulation Example

```java
class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
```

---

# Interview Questions

### Q1: Difference between `protected` and `default`?

* `default` → same package only
* `protected` → same package + subclass (even different package)

---

### Q2: Can we access private variables outside class?

✔ Yes, using getters/setters

---

### Q3: Why packages are used?

* Organization
* Avoid naming conflicts
* Access control

---

# Summary

* Access modifiers control **visibility**
* Packages control **organization & structure**
* Together, they help build **secure and scalable applications**

---
