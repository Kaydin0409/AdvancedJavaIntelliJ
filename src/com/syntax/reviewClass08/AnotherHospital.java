package com.syntax.reviewClass08;

public class AnotherHospital {

    public static void main(String[] args) {

        DoctorModifiers doc=new DoctorModifiers("Sherlock","Holmes","Magic",10);

        //access methods to test visibility
        doc.printInfo();
        doc.work();
        doc.study("UGA");

        //cannot access private method getPaid();

    }


}
