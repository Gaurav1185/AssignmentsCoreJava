package com.assignmentno9.Methods;

import java.util.Scanner;

public class Qno11PrimeFactors {
    private static int isPrime(int number){
        for (int i = number; i <=number/2 ; i++) {
            if(number%2==0){
                System.out.println("Number is prime");
            }
            else {
                System.out.println("Number is not prime");
            }

        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println(Qno11PrimeFactors.isPrime(number));
    }
}
