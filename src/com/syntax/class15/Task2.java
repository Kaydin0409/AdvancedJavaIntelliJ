package com.syntax.class15;

public class Task2 {

    //create a method that will take a number and print whether the number is even or odd

    void printEvenOrOdd(int x){

        if(x%2==0){
            System.out.println(x+" is even.");
        }else if(x%2!=0){
            System.out.println(x+" is odd.");
        }else{
            System.out.println("Number is "+x);
        }

    }

    public static void main(String[] args) {

        Task2 task2=new Task2();
        task2.printEvenOrOdd(5);
    }
}
