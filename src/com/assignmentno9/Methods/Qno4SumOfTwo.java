package com.assignmentno9.Methods;

import java.util.Scanner;

public class Qno4SumOfTwo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any two  numbers");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        System.out.println(sumOfNumber(number1,number2));
    }
    static int sumOfNumber(int n1,int n2){
        int number1=n1;
        int number2=n2;
        return n1+n2;

    }
}
