package com.syntax.class23;

public class CreditCardTester {

    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.calculateInterest(500,1.5);

        Visa visa=new Visa();
        visa.calculateInterest(400,2.5);

        AX ax=new AX();
        ax.calculateInterest(1000,1.5);
    }
}
