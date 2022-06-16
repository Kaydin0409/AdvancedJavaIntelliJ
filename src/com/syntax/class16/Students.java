package com.syntax.class16;

public class Students {
    /*
    Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
     */

    String name;
    int id;
    static int numberOfStudents=0;

    public static void main(String[] args) {

        Students stu=new Students();
        stu.name="Kellie";
        stu.id=101;
        numberOfStudents++;

        Students stu2=new Students();
        stu2.name="Baris";
        stu2.id=102;
        numberOfStudents++;

        Students stu3=new Students();
        stu3.name="Oguz";
        stu3.id=103;
        numberOfStudents++;

        System.out.println(numberOfStudents);



    }
}
