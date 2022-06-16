package com.syntax.class15;



public class Task3 {

    //create a method that will print whether given String is palindrome or not

    void palindromeOrNot(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String reversedStr = stringBuilder.toString();
        if (str.equals(reversedStr)) {
            System.out.println(str + " is palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {

        Task3 task3 = new Task3();

        task3.palindromeOrNot("dad");


    }


}


