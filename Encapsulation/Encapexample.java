class BankAccount{
    int account_num;
    String account_holder;
    private double balance;

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        if (balance > 0) {
            this.balance = balance;
        }
        else {
            System.out.println("Please assign valid positive balance");
        }

    }
}

public class Encapexample{
    public static void main (String[] args){

        BankAccount acc1 = new BankAccount();
        acc1.account_num = 1232;
        acc1.account_holder = "Rajesh";

        acc1.setBalance(-7682.23);

        System.out.println(acc1.account_num + " : " + acc1.account_holder + " : " + acc1.getBalance());

    }
}