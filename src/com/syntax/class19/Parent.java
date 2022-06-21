package com.syntax.class19;

public class Parent {

    //example of single inheritance

    String name="Misha";
    double money=1000000;


}

class Child extends Parent{

    void printInfo(){
        System.out.println("My full name is Khrystyna "+name);
    }

    void buyCar(){
        System.out.println("hehehe buying car from Papa's money "+money);
    }



//Class Tester{
    //does not allow me to make another class in java8 under same class but if you do this you can still use Child class

        public static void main(String[] args) {
            Child child=new Child();
            child.printInfo();
            child.buyCar();



    }




}
