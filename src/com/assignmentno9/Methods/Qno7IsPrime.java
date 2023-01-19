package com.assignmentno9.Methods;

import java.util.Scanner;

public class Qno7IsPrime {
    static boolean isTrueOrFalse=true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = scanner.nextInt();
        System.out.println(isTrueOrFalse?"Number is prime":"Number is not prime");
    }
    private static int isPrime(int number) {

        for (int i = number; i <= number / 2; i++) {
            if (number % 2 == 0) {
                System.out.println("is prime no");
                isTrueOrFalse=false;
            }
            else {
                System.out.println("not prime no");
            }

        }

        return number;
    }
}

