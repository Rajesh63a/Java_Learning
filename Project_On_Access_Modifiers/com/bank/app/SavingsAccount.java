package com.bank.app;

import com.bank.BankAccount;

public class SavingsAccount extends BankAccount{

    public void testAccess(){
       // System.out.println("Balance: " + balance);          //error: balance has private access in BankAccount
       // System.out.println("Interest: " + interestRate);    // error: interestRate is not public in BankAccount; cannot be accessed from outside package
        System.out.println("Type: " + accountType);
        System.out.println("Bank: " + bankName);
    }

}

