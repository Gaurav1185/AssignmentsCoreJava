package com.assignmentno3.operator.operator;

import java.util.Scanner;

public class Qno10BSwapping {
    public static void main(String[] args) {
        Scanner values=new Scanner(System.in);
        System.out.println("Enter first number");
        int value1=values.nextInt();
        System.out.println("Enter second number");
        int value2=values.nextInt();
        value1=value1+value2;
        value2=value1-value2;
        value1=value1-value2;
        System.out.println(value1+""+value2);
    }
}
