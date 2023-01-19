package com.assignmentno9.Methods;

import java.util.Scanner;

public class Qno6Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius");
        int radius = scanner.nextInt();
        System.out.println("The circumference is "+circumferenceOfCircle(radius));
        System.out.println("The area of circle is "+areaOfCircle(radius));
    }

    private static double areaOfCircle(int radius) {
        return (2 * 3.14 * radius * radius);
    }

    private static double circumferenceOfCircle(int radius) {
       return  (2 * 3.14 *radius);

    }

}
