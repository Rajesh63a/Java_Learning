class Vehicle{

    String brand;
    int speed;

    // Default Constructor
    public Vehicle() {
        this("Unknown", 0);
        System.out.println("In Default Constructor of Vehicle");

    }

    // Parameterized Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("In Parameterized Constructor of Vehicle");
    }

    public void displayInfo(){
        System.out.println("Vehicle brand : " + brand);
        System.out.println("Vehicle Speed : " + speed);
    }

}

class Car extends Vehicle{
    int seats;

    public Car(){
        this("Audi", 120, 5);
        super();
        seats = 4;
        System.out.println("In default const of Car");
    }

    public Car(String brand, int speed, int seats){
        super(brand, speed);
        this.seats = seats;
        System.out.println("In Parameterized Const for Car");
    }

    @Override
    public void displayInfo(){
        System.out.println("Vehicle brand : " + brand);
        System.out.println("Vehicle Speed : " + speed);
        System.out.println("Number of seats : " + seats);
    }
}

public class InheritExample{
    public static void main(String[] args){
        Car car = new Car("BMW", 1000, 7 );
        car.displayInfo();
    }
}