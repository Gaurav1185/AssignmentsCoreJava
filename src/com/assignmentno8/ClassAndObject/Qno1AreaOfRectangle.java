package com.assignmentno8.ClassAndObject;

import java.util.Scanner;

public class Qno1AreaOfRectangle {
    //1. Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
    //2. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle.
    //3. Length and breadth of rectangle are entered through keyboard.
    public static void main(String[] args) {
        Qno1AreaOfRectangle areaOfRectangle=new Qno1AreaOfRectangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        double length= sc.nextDouble();
        System.out.println("Enter breadth");
        double breadth= sc.nextDouble();
        areaOfRectangle.setDim(length,breadth);

    }
    public void setDim(double length,double breadth){
        getArea(length,breadth);

    }
    public void getArea(double length, double breadth){
        double area = length * breadth;
        System.out.println("The area of reactangle is "+area);

    }
}
