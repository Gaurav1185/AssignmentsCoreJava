package com.assignmentno3.operator;
import java.util.Scanner;
//If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ),
// write a program to calculate his total marks and percentage marks.

public class Qno9CalculatePercentage {

    public static void main(String[] args) {
        Scanner values=new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1=values.nextInt();
        System.out.println("Enter the Second number");
        int number2= values.nextInt();
        System.out.println("Enter third number");
        int number3= values.nextInt();
        int sumOfMarks = number1 + number2 + number3;
        System.out.println("The total of marks is"+sumOfMarks);

        float percentage =sumOfMarks/3;
        System.out.println("Percentage = "+percentage);

    }
}
