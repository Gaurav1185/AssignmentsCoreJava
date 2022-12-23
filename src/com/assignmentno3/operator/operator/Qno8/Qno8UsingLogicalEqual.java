package com.assignmentno3.operator.operator.Qno8;

import java.util.Scanner;

public class Qno8UsingLogicalEqual {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = number.nextInt();
        System.out.println("Enter second number");
        int number2 = number.nextInt();
        System.out.println("Enter third number");
        int number3 = number.nextInt();
        System.out.println("All numbers are equal"+(number1 ==number2&& number2==number1 && number3==number1));
        System.out.println("Given number are equal"+(number1==number2||number2==number1||number3==number1));
    }
}
