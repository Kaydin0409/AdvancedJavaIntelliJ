package com.syntax.class22;

public class AdvanceCalc {

    static void print(int ... arr){
        System.out.println(arr[2]);
    }
        //creates an array from those parameters


    public static void main(String[] args) {
        print(2,2,3); //prints 2
        print(4,5,8,9,10); //prints 8
    }
}
