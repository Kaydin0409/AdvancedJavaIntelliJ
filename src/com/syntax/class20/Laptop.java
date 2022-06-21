package com.syntax.class20;

public class Laptop {

    int storage=512;    //remember default cannot be accessed in different packages
    int RAM=32;
    protected String make; //can access protected fields in a different package as long as "extends" keyword is present
                            //so protected field must be inherited
    String model;
    void printModel(){
        System.out.println(model);
    }
}
