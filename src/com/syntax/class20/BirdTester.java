package com.syntax.class20;

public class BirdTester {

    public static void main(String[] args) {
        parrot parrot=new parrot("parrot","Green",10,.5);
        parrot.printInfo();

        sparrow sparrow=new sparrow("Jack Sparrow","White",10,.7);
        sparrow.printInfo();
    }
}
