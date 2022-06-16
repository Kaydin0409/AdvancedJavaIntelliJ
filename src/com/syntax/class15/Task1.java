package com.syntax.class15;

public class Task1 {

    void printLargerNum(int x, int y){
        int larger=0;
        if(x>y){
            larger=x;
        }else if(y>x){
            larger=y;
        }else{
            larger=x;
        }
        System.out.println(larger);
    }
    public static void main(String[] args) {
        /*
        Create a method that will take 2 parameters as a number and prints which number is larger
         */
        Task1 task1=new Task1();

        task1.printLargerNum(10,30);


    }
}
