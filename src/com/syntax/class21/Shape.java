package com.syntax.class21;

public class Shape {

    /*
    Write program: Shape class has a
     constructor that takes the radius and has a subclass as  circle class.
     In circle class create a method to calculate the area of circle. Test your code
     */
    int radius;

    Shape(int radius) {
        this.radius = radius;
    }
}
class Circle extends Shape{
    Circle(int radius) {
        super(radius);
    }

    public double areaOfCircle(){
        double area=Math.PI*Math.pow(radius,2);
        return area;
    }

    public static void main(String[] args) {

        Circle circle=new Circle(5);
        System.out.println(circle.areaOfCircle());
    }

}
