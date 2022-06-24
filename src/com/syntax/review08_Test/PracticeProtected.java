package com.syntax.review08_Test;

import com.syntax.reviewClass08.DoctorModifiers;

public class PracticeProtected extends DoctorModifiers {

    PracticeProtected(String firstName, String lastName){
        super(firstName, lastName); //makes a call to superclass/parent constructor
    }
    public static void main(String[] args) {

        PracticeProtected practice=new PracticeProtected("John","Smith");

        practice.printInfo();
        practice.work();
        PracticeProtected.study("ETSU");
        //able to use protected method due to inheritance
        //protected can access different package as long as inheritance is used


    }

}
