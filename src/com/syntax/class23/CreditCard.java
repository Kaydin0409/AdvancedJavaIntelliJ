package com.syntax.class23;
/*
Create a class CreditCard and define variable balance and interest.
Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
 */

public class CreditCard {

    double balance;
    double interestRate;

    void calculateInterest(double balance, double interestRate){
        this.balance=balance;
        this.interestRate=interestRate;
        System.out.println("The interest due this month is "+balance*(interestRate/100));
    }
}

class Visa extends CreditCard{

}

class AX extends CreditCard{
    @Override
    void calculateInterest(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
        System.out.println("The interest due this month on your American Express is " + balance * (interestRate / 100));
    }
}

