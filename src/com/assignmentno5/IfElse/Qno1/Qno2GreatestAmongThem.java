package com.assignmentno5.IfElse.Qno1;

import java.util.Scanner;

public class Qno2GreatestAmongThem {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 =numbers.nextInt();
        System.out.println("Enter Second number");
        int number2 = numbers.nextInt();
        if(number1>number2){
            System.out.println(number1 +" is greater than " + number2);
        }
        else {
            System.out.println(number2 +" is greater than " +number1);
        }

    }
}
