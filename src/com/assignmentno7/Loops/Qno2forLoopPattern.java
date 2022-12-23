package com.assignmentno7.Loops;

import java.util.Scanner;

public class Qno2forLoopPattern {
    public static void main(String[] args) {
        Scanner values = new Scanner(System.in);
        System.out.println("Enter Number");
        int number =values.nextInt();
        for(int i=1;i<=number;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }


}
