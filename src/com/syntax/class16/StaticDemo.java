package com.syntax.class16;

public class StaticDemo {

    static int noOfEmployees=10;
    String name; //instance is object specific.  Can have thousands of different values based on how many objects

    static void method1(){
        System.out.println(noOfEmployees);
       /*
       cannot put String name; because it is instance variable and static can only have 1 copy/value,
        regardless of number of objects
        */
    }

    void method2(){
        System.out.println(noOfEmployees);  //static is no problem because all objects can access static variable
        //only problem when non-static value is within static method
        System.out.println(name); //instance variable can be used in non-static method
    }

    public static void main(String[] args) {
        StaticDemo st=new StaticDemo();
        st.name="Omid";

        StaticDemo st2=new StaticDemo();
        st2.name="Rachid";


    }
}

