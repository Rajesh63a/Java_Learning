package com.bank;

public class BankTest{

    public static void main(String args[]){

        BankAccount acc = new BankAccount();

        acc.show_details();
        System.out.println();

       // acc.balance = 2000;             //error: balance has private access in BankAccount

        acc.interestRate = 10.0;         // default variable can be accessable within the same class or in same package

        acc.accountType = "current";      // protected can be acccessibe -- same class, same package, subclass in different package

        acc. bankName = "Equitas";         // public can be accessble from anywhere.

        acc.show_details();
        


    }
}