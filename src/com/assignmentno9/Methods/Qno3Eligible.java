package com.assignmentno9.Methods;

import java.util.Scanner;

public class Qno3Eligible {
    //A person is eligible to vote if his/her age is greater than or equal to 18.
    // Define a method to find out if he/she is eligible to vote.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        System.out.println(isValid(age));
    }
    static private int  isValid(int age){
        if(age>=18){
            System.out.println("He/She is eligible");
        }
        else {
            System.out.println("he not eligible");
        }
        return age;

    }
}
