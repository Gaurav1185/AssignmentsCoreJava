package com.assignmentno8.ClassAndObject;

import java.util.Scanner;

public class Qno6PrintAreaOfRectangleUsingConstructor {
    //1. Write a program to print the area of a rectangle by creating a class named 'Area'
    // taking the values of its length and breadth as parameters of its constructor
    // and having a method named 'returnArea' which returns the area of the rectangle.
    //2. Length and breadth of rectangle are entered through keyboard.
    static int length;
    static int breadth;
    Qno6PrintAreaOfRectangleUsingConstructor(int length,int breadth){
        this.length=length;
        this.breadth=breadth;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int length=scanner.nextInt();
        int breadth=scanner.nextInt();
        System.out.println(returnArea(length,breadth));
    }

    private static int returnArea(int length,int breadth) {
        return length*breadth;
    }
}
