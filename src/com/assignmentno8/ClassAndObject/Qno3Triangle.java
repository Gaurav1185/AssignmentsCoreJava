package com.assignmentno8.ClassAndObject;

public class Qno3Triangle {
    //Write a program to print the
    // area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle'
    // without any parameter in its constructor.
    int side1 = 3;
    int side2 = 4;
    int side3 = 5;

    public static void main(String[] args) {
        Qno3Triangle triangle = new Qno3Triangle();
        triangle.getPerimeter();
        triangle.areaOfRectangle();
        System.out.println("Perimeter of triangle is "+triangle.getPerimeter());
        System.out.println("The Area of triangle is "+triangle.areaOfRectangle());


    }

    double areaOfRectangle() {


        return  0.5 * side1 * side2 * side3;

    }

    public float getPerimeter() {

        return  side1 + side2 + side3;
    }



}
