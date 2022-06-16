package com.syntax.class16;

public class Dog {

    //static String name;//don't want static because only 1 memory location for static, so can only hold 1
    //if you were to System.out.println(name); you would only print out Jajaja
    String name;
    String color;

    static int noOfLegs=4; //can use static because value will be the same for all the dogs, and you save memory

    public static void main(String[] args) {
        Dog dog1=new Dog();  //creating an object of Dog class
        dog1.name="Tommy";
        dog1.color="pink";

        Dog dog2=new Dog();
        dog2.name="Fido";
        dog2.color="Black";

        Dog dog3=new Dog();
        dog3.name="Jajaja";
        dog3.color="White";


    }
}
