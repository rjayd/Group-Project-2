package com.syntax.GroupProject2;

public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
    int radius = 7;
    @Override
    public void calculateArea() {

        System.out.println("The are of the circle is "+Math.PI*(radius*radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(("The perimeter of the circle is "+(2*Math.PI)*radius));
    }
}
class Square implements Shape{
    int length = 5;
    @Override
    public void calculateArea() {
        System.out.println("The area of the square is "+Math.pow(length,2));
    }

    @Override
    public void calculatePerimeter() {

        System.out.println("The perimeter of the square is "+4*length);
    }
}