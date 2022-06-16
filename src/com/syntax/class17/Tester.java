package com.syntax.class17;

import com.syntax.class16.Dog;

public class Tester {

    public static void main(String[] args) {

        Employee employee=new Employee(); //no need to import this class since it is w/in same package
        Dog dog=new Dog();  //have to import from class16 since Dog is in different package
                            //alt+enter shows what classes are Dog and you can select to import

        employee.name="Mike"; //no error since name is public
       // employee.salary=125,000; error b/c salary is private
        employee.department="IT Saver";//can be accessed since default can be accessed in same package

    }
}
