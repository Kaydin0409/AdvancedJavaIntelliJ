package com.syntax.reviewClass08;

public class Doctor {

    String firstName, lastName, specialty;
    int experience;
    double salary;
    static String hospital;

    Doctor(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    Doctor(String firstName, String lastName,String specialty,int experience){
        this(firstName,lastName);
        this.specialty=specialty;
        this.experience=experience;
    }

    void printInfo(){
        System.out.println("Doctor's name is "+firstName+" "+lastName+" and their specialty is "+specialty);
    }

    void work(){
        printInfo(); //compiler is adding this. to printInfo(); you can type out this.printInfo();
        System.out.println("Doctor " +lastName+" works at "+hospital);
    }

  /*  static void study(String university){
        System.out.println("Doctor "+lastName+" studies at "+university);
        //static method cannot reference non-static instance variables. static can only be used with static
    } */
    static void study(String university) {
        //this.printInfo(); //cannot use a non-static method inside a static method
        System.out.println("Doctor studied at " + university + " and now works at " + hospital);
        //this worked because both are static variables
    }
    }

class Hospital{

    public static void main(String[] args) {

        Doctor doc = new Doctor("Jane","Doe");
        doc.printInfo(); //Doctor's name is Jane Doe and their specialty is null

        Doctor.hospital="UCSF";
        doc.work(); //Doctor Doe works at UCSF

        System.out.println("=======================");

        Doctor doctor=new Doctor("Joe","Doe","cardiologist",10);

        doctor.printInfo();
        doctor.work();

        System.out.println("===============================");
        //changing value of static variable
        Doctor.hospital="George Washington";
        doc.work();  //George Washington
        doctor.work(); //George Washington

        System.out.println("===============================");
        //changing value of instance variable
        doc.lastName="Obama";
        doc.printInfo(); //Obama
        doctor.printInfo(); //Doe
        doc.hospital="Mayo Clinic";  //since hospital is static then it will change static variable value
                                    //compiler is telling you that you are accessing static like an instance variable
                                    //you should really say Doctor.hospital="Mayo Clinic";

        doc.work(); //Mayo clinic
        doctor.work(); //Mayo Clinic

        //accessing static method
        Doctor.study("University of Georgia");

    }
}
