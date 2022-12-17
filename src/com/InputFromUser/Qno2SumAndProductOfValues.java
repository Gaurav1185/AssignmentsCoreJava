package com.InputFromUser;

import java.util.Scanner;

public class Qno2SumAndProductOfValues {
    public static void main(String[] args) {
        Scanner values = new Scanner(System.in);
        System.out.println("Enter First Number");
        int value1 = values.nextInt();
        System.out.println("Enter Second Number");
        int value2 = values.nextInt();
        int SumOfProduct= value1 + value2;
        int product = value1 * value2;
        System.out.println();
        System.out.println("The sum of two product is  "+SumOfProduct + "The product is"+product);
    }
}
