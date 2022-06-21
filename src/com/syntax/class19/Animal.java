package com.syntax.class19;

 public class Animal {

    String name;
    String bree;
    String color;
    int age;
    double weight;

     void printInfo(){
         System.out.println("Name: "+name+" color: "+color);
     }
}

class Dog extends Animal {
    Dog(String name, String Color) {
        this.name = name;
        this.color=color;
    }
}

class Cat extends Animal{
     Cat(String name,String color){
         this.name = name;
         this.color=color;
     }

}

