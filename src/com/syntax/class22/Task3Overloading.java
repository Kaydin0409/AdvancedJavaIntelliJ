package com.syntax.class22;

public class Task3Overloading {

    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    public int calculatePerimeter(int a,int b,int c){
        return a+b+c;

    }

    public int calculatePerimeter(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public int calculatePerimeter(int a,int b,int c,int d,int e,int f){
        return a+b+c+d+e+f;
    }

    public static void main(String[] args) {
        Task3Overloading task3=new Task3Overloading();

        System.out.println(task3.calculatePerimeter(5,4,7));
        System.out.println(task3.calculatePerimeter(8,6,9,2));
        System.out.println(task3.calculatePerimeter(3,3,3,3,3,3));
    }
}
