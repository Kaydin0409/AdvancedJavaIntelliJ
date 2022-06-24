package com.syntax.class22;


public class Task4Overloading {

    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    private void favoriteFruits(String a){
        System.out.println("My favorite fruit is "+a);
    }

    private void favoriteFruits(String a, String b){
        System.out.println("My favorite fruits are: "+a+" and "+b);
    }

    private void favoriteFruits(String a, String b,String c){
        System.out.println("My favorite fruits are: "+a+" and "+b+" and "+c);
    }

    public static void main(String[] args) {
        Task4Overloading task4=new Task4Overloading();

        task4.favoriteFruits("raspberries");
        task4.favoriteFruits("raspberries","blackberries");
        task4.favoriteFruits("raspberries","blackberries","peaches");

    }

}
