package Interfaces;

@FunctionalInterface
interface PaymentMethod{
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Credit Card.");
    }
}

class UPIPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using UPI.");
    }
}

class CashPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Cash.");
    }
}


public class Interface {
    public static void main(String[] args) {
        PaymentMethod payment;

        payment = new CreditCardPayment();
        payment.pay(1000);

        payment = new UPIPayment();
        payment.pay(500);

        payment = new CashPayment();
        payment.pay(200);

        // Using Anonymous Inner Class
        payment = new PaymentMethod() {
            @Override
            public void pay(double amount) {
                System.out.println("Paying " + amount + " using Anonymous Class.");
            }
        };

        payment.pay(300);

        // using lambda expression
        
        //payment = (double amount) -> System.out.println("Paying " + amount + " Using lamda expression.");

        // lambda expression in simple way
        payment = amount -> System.out.println("Paying " + amount + " Using lamda expression.");

        // if the method has retrun type then we can use lambda expression in this way like --> double pay(double amount);
        // payment = amount -> return amount * 0.95; // for example, applying a discount of 5%
        // payment = amount -> amount * 0.95; // no need to mention return keyword if the method has only one statement
           
        payment.pay(400);




    }
    
}
