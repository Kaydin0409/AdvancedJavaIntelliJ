package com.syntax.class20;
//This is example of multi-level inheritance

public class Grandparent {

    String name="Anyatullah";
}

class Parent extends Grandparent{

    void printInfo(){
        System.out.println("Name of my father is "+name);
    }
}

class Child extends Parent{

    void printInfo(){
        System.out.println("Name of my Grandpa is "+name);
    }
}

class Grandchild extends Child{

    void printInfo(){
        System.out.println("My great Grandpa is "+name);
    }
}
