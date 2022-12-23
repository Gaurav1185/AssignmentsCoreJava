package com.assignmentno6.InputFromUserNew;

import java.util.Scanner;

public class Qno9ChakeCondition {
    public static void main(String[] args) {
        System.out.println("Enter number");
        /*Write a program to enter the values of two variables
        'a' and 'b' from keyboard and then check if both the conditions 'a < 50' and 'a < b' are true.*/
        Scanner values = new Scanner(System.in);
        int a = values.nextInt();
        int b = values.nextInt();
        System.out.println(a<50||a<b ? "b is greater than a": "b is less than a");

    }

}
