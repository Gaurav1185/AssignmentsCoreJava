package com.assignmentno6.InputFromUserNew;

import java.util.Scanner;

public class Qno3AreaOfRectangle {
    public static void main(String[] args) {
        Scanner values = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int length = values.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int breadth = values.nextInt();
        int area = length * breadth;
        System.out.println("Enter Area of rectangle is "+area);
    }
}
