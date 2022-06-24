package com.syntax.class22;

public class Parent {

    String name;
    void getMarried(){
        System.out.println("Hey Hamid we have found a girl for you to marry");
    }
}

class Hamid extends Parent{

    void getMarried(){
        System.out.println("I want to try with Tara first");
    }

}
