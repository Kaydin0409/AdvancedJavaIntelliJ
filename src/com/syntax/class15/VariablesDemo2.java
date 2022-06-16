package com.syntax.class15;

public class VariablesDemo2 {

    int num=10; //This instance variable can be used in both methods.
                // Only needs to be declared once, instead of having to declare variable in each method

    void method1(){
        int num2=20; //This local variable is only accessible inside the method.  Cannot be used in the next method
                    //Only within the curly brackets of the method
        System.out.println(num);
    }

    void method2(){
        System.out.println(num);
    }
}
