package com.assignmentno5.IfElse.Qno1;

import java.util.Scanner;

public class Qno7PrintSameValue {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = value.nextInt();
        System.out.println("Enter second number");
        int number2 = value.nextInt();
        if(number1==number1){
            System.out.println(number1);
        }
        else {
            System.out.println(number2);

        }
    }
}
