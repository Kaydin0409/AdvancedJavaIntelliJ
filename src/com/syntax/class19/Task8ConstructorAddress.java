package com.syntax.class19;

public class Task8ConstructorAddress {

    String name;
    String address;

    Task8ConstructorAddress(String name, String address){
        this.name=name;
        this.address=address;
    }

    public void displayInfo(){
        System.out.println(name+" lives at "+address);
    }

    public static void main(String[] args) {
        Task8ConstructorAddress task8=new Task8ConstructorAddress("Kellie","Piney Flats");

        task8.displayInfo();


    }



}
