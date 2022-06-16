package com.syntax.class16;

public class SyntaxEmployee {

    /*
    Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects
     */

    int empID;
    int salary;
    /*whenever we are sure that 2 objects of a class can have different values for a variable or
        if we have to share that variable between 2 or more methods of that class we should always
        use instance variables
     */
    static String ceo="Sumair";

    public static void main(String[] args) {

        SyntaxEmployee se=new SyntaxEmployee();
        se.empID=101;
        se.salary=100000;

        SyntaxEmployee se2=new SyntaxEmployee();
        se2.empID=102;
        se2.salary=85000;

        System.out.println("Employee ID: "+se.empID+" Employee Salary: "+se.salary+" CEO: "+ceo);
        System.out.println("Employee ID: "+se2.empID+" Employee Salary: "+se2.salary+" CEO: "+ceo);

    }
}
