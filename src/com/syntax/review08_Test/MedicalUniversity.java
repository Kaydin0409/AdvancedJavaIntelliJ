package com.syntax.review08_Test;

import com.syntax.reviewClass08.DoctorModifiers;

import javax.print.Doc;

public class MedicalUniversity {

    public static void main(String[] args) {
        DoctorModifiers doc=new DoctorModifiers("Jane","Doe");
        doc.printInfo();
        doc.study("ETSU");

        //only public is visible in different packages
        //protected is only visible if we use inheritance
    }

}
