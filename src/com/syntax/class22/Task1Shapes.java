package com.syntax.class22;

public class Task1Shapes {

    /*Create 1 class in which create a methods that will calculate the area (volume in case of box) of
            Rectangle,Square, Box
        Use separate class to test your code
     */

    public double calculateArea(double width, double length){
        double area=width*length;
        return area;
    }

    public double calculateArea(double a){
        double area=Math.pow(a,2);
        return area;
    }

    public double calculateVolume(double width, double length, double height){
        double volume=length*width*height;
        return volume;
    }




}
