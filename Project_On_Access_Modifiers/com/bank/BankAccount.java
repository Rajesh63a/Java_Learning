package com.bank;

public class BankAccount {
    private double balance = 1000;
    double interestRate = 5.0;
    protected String accountType = "Savings";
    public String bankName = "SBI";

    public void show_details(){
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + interestRate);
        System.out.println("Type: " + accountType);
        System.out.println("Bank: " + bankName);
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    public void publicMethod() {
        System.out.println("Public method");
    }
}