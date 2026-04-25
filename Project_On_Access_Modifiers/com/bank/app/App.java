package com.bank.app;

import com.bank.BankAccount;

public class App {

    public static void main(String[] args){

        BankAccount acc = new BankAccount();

        SavingsAccount sa = new SavingsAccount();

        //acc.balance = 2000;     //error: balance has private access in BankAccount
        //acc.interestRate = 3.0;   // error: interestRate is not public in BankAccount; cannot be accessed from outside package
        //acc.accountType = "current";    //error: accountType has protected access in BankAccount
        acc.bankName = "Equitas";

        sa.testAccess();



    }
}