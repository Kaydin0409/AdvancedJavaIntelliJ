package com.syntax.class22;

public class AdvanceCalc2 {

    static void sum(int ... arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of all the parameters is "+sum);
    }

    static void printNames(String ... names){
        for (String name:names){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        sum(2,2,3,4);  //11
        printNames("Kellie","Baris","Oguz"); //prints all 3 names


        int age=20;
        String name;
        if(age>18){
            name="Time to go work";
        }else{
            name="Enjoy no Work";
        }
        System.out.println(name);

        //This is another way to write if else condition called ternary operator

        String name2=age>18? "Time to go to work ":"Enjoy no Work";
        System.out.println(name2);
    }
}
