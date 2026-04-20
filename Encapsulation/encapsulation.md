📦 Encapsulation in Java
🧠 What is Encapsulation?

Encapsulation is one of the core principles of Object-Oriented Programming (OOP).

Encapsulation means wrapping data (variables) and methods (functions) together in a single unit (class) and restricting direct access to the data.

In simple terms:

Hide internal data
Allow controlled access using methods
🏦 Real-Life Example

Think of a bank account:

You cannot directly access or change your balance
You use methods like:
deposit()
withdraw()
getBalance()

This ensures:

No invalid operations
Secure handling of data
🔐 Key Components of Encapsulation

Encapsulation mainly involves:

Private variables (Data Hiding)
Getter methods (Read access)
Setter methods (Write access)
this keyword (Reference current object)
🔒 1. Private Variables

Variables are declared as private to restrict direct access.

class Student {
private int age;
}
❗ Why private?
Prevents direct modification
Protects data from invalid values
🔓 2. Getter Method (Read Access)

Used to retrieve the value of a private variable.

public int getAge() {
return age;
}
💡 Naming Convention:
get + VariableName (camelCase)
Example: getAge(), getName()
✏️ 3. Setter Method (Write Access)

Used to update the value of a private variable.

public void setAge(int age) {
if (age > 0) {   // validation
this.age = age;
}
}
💡 Naming Convention:
set + VariableName
Example: setAge(), setSalary()
🎯 4. Understanding this Keyword

The this keyword refers to the current object.

public void setAge(int age) {
this.age = age;
}
🤔 Why use this?

Because:

age (parameter) and age (instance variable) have same name
this.age refers to the class variable
💻 Complete Example
class Employee {

    private String name;
    private double salary;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary!");
        }
    }
}
Usage:
public class Main {
public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setName("Rajesh");
        emp.setSalary(50000);

        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }
}
❌ Without Encapsulation (Bad Practice)
class Student {
public int age;
}
Student s = new Student();
s.age = -10;   // ❌ invalid but allowed
✅ With Encapsulation (Good Practice)
class Student {
private int age;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
🔄 Execution Flow
Object is created
Setter method is called → sets value with validation
Getter method is called → retrieves value
🎯 Advantages of Encapsulation
✔ Data hiding (security)
✔ Controlled access
✔ Validation before updating data
✔ Improved maintainability
✔ Flexibility to change internal implementation
⚠️ Important Notes
Always keep variables private
Use public getters/setters to access them
Add validation logic inside setters
Avoid unnecessary setters if data should not change