package com.assignmentno9.Methods;

import java.util.Scanner;

public class Qno10Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number*i);


        }

    }
}