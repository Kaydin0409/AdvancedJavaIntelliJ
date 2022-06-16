package com.syntax.class16;

import com.syntax.class17.Employee;

public class EmployeeTester {

    //*using this class for Class 17* to show different packages

    public static void main(String[] args) {
        Employee employee=new Employee();

        employee.name="Merve";
        //employee.salary=125,000; *can't be accessed since salary is private
        //employee.department="IT"; *default variables can't be accessed inside different package
        /*
        Fields or methods if they are private they can't be accessed
         */

        System.out.println(Employee.manager);
        //if something is static you can call using only class name
        //instead of object name
        Employee.printManager();

    }

}
