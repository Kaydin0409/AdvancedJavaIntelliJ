package com.syntax.class18;

public class Car {

    private String make;
    private String model;
    private String color;

    //fields should be private for sensitive info.
    //no one can assign any values to your fields

    public Car(String carMake, String carModel, String carColor){
        make=carMake;
        model=carModel;
        color=carColor;
    }

    void printInfo(){
        System.out.println("Car Make: "+make+" Car Model: "+model+" Car Color: "+color);
    }

    //CarTester Class created to create objects for Constructor and methods
}
