package com.syntax.reviewclass07;

public class B13StringTester {

    public static void main(String[] args) {
        B13String str=new B13String("abcsssesd");
        int count=str.countChars('s');
        System.out.println(count); //s occurs 4 times

        str.printsChars('c');



    }
}
