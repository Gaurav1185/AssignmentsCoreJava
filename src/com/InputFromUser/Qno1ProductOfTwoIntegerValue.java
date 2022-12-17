package com.InputFromUser;

import java.util.Scanner;

public class Qno1ProductOfTwoIntegerValue {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("Enter First value");
        int value1=value.nextInt();
        System.out.println("Enter Second value");
        int value2=value.nextInt();
        int product= value1 * value2;
        System.out.println("The product of given values is"+product);
    }
}
