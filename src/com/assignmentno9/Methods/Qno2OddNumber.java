package com.assignmentno9.Methods;

import java.util.Scanner;

public class Qno2OddNumber {
    //Define a program to find out whether a given number is even or odd.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number1 = scanner.nextInt();
        System.out.println(evenOrOdd(number1));
    }
    static private int evenOrOdd(int number1) {
        if (number1 % 2 == 0) {
            System.out.println("no is even");
        } else {
            System.out.println("No is odd");
        }
        return number1;
    }
}

