package com.assignmentno4.InputFromUser;

import java.util.Scanner;

public class Qno6Square_Of_Number {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = number.nextInt();

        int Square_Of_Number = num1 * num1;
        System.out.println("The square of given number is "+Square_Of_Number);
    }
}
