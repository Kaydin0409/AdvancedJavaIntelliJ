package com.syntax.class16;

public class InstanceDemo {


    String str="instance";

    void method1(){
        str="method1";
    }
    void method(){
        System.out.println(str);
    }

    public static void main(String[] args) {
        InstanceDemo id=new InstanceDemo();

        System.out.println(id.str); //instance
        id.method(); //prints instance
        id.method1(); //changes str to method1
        id.method(); //now str equals method1 so method prints method1

        /*
        if you created 2 objects id1 and id2 then instance variables will only be changed for each object separately
         */


    }


}
