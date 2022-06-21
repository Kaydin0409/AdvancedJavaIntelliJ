package com.syntax.class19;

public class Task2ReversedString {

    /*
    Create a method that will take a String as a parameter
    and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */

    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString(); //multiple methods on same line is method chaining
                                                            //since we used static we don't have to create an object
                                                            //we can call method simply by using class name
    }

    public static void main(String[] args){
        System.out.println(Task2ReversedString.reverseString("Monday"));
        //Static allowed us to call method by simply putting class name Task2ReversedString
        //.reverseString calls method, then we simply place the parameters



    }
}
