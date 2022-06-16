package com.syntax.class15;

public class MethodsDemo1 {

    void method1(){
        System.out.println("I can use print statements in a void type method");
        int num=0;
        //can write if condition or switch statement, etc. in void method
    }

    public static void main(String[] args) {
        MethodsDemo1 methodsDemo1=new MethodsDemo1();

        //int x=methodsDemo1.method1();  this creates an error because the void method does not return integer value.
        //you cannot reassign void methods to any variables
        //*Methods with void return type can't be assigned to variables.*
    }

}
