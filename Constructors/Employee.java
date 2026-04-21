class Employee{
    String name;
    int id;
    double salary;

    public Employee(){
        name = "Not Assigned";
        id = 0;
        salary = 0.0;

        System.out.println("Default Constructor Executed");
    }

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;

        if (salary > 0){
            this.salary = salary;
        }
        else {
            System.out.println("salary should not be negative");
        }

    }

    public void displayDetails(){
        System.out.println("Name - " + name + " : " + "id - " + id + " : " + "salary - " + salary);
    }

    public static void main(String[] args){
        Employee emp1 = new Employee();
        emp1.displayDetails();

        Employee emp2 = new Employee("Rajesh", 536, 1000000.00);
        emp2.displayDetails();
    }

}