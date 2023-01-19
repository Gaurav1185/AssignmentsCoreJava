package com.assignmentno9.Methods;

import java.util.Scanner;

public class Qno5ProductOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        System.out.println(productOfTwo(number1,number2));
    }

    private static int productOfTwo(int number1,int number2) {
       return number1*number2;
    }

}
