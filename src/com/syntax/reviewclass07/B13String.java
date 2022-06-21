package com.syntax.reviewclass07;

public class B13String {

    private String str;
    //Best practice is to always try to make all instance variables private
    public B13String(String str){
        this.str=str; //this. can only be used with instance variables
    }

    //write a method that can tell how many times a character is being repeated in a string

    public int countChars(char c){
        int counter=0;
        for(char cha:str.toCharArray()){
            if(cha==c){
                counter++;
            }
        }
            return counter;
    }

    public void printsChars(char c){
        int counter=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                counter++;
            }
        }
        System.out.println(c+" has appeared "+counter+" inside this String");
    }


}
