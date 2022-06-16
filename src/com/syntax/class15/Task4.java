package com.syntax.class15;

public class Task4 {
    //Create a method that will say Hello in different languages based on the country

    void printHello(String country){

        String hello;
        switch(country){

            case "USA":
                hello="Hi";
                break;
            case "Mexico":
                hello="Hola";
                break;
            case "Turkey":
                hello="Merhaba";
                break;
            case "Russia":
                hello="Privet";
                break;
            case "France":
                hello="Bonjour";
                break;
            default:
                hello="Unknown";
        }
        System.out.println(hello);
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();

        task4.printHello("Turkey");
    }


}
