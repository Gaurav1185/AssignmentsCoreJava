package com.assignmentno5.IfElse.Qno1;

import java.util.Scanner;

public class Qno5GradingSystem {
    public static void main(String[] args) {
        Scanner values = new Scanner(System.in);
        System.out.println("Enter marks of student");
        int marksObtain=values.nextInt();
        if(marksObtain<25){
            System.out.println("F Grade");
        } else if (marksObtain<=45) {
            System.out.println("E Grade");
        } else if (marksObtain<=50) {
            System.out.println("D Grade");
        } else if (marksObtain<=60) {
            System.out.println("C Grade");

        } else if (marksObtain<=80) {
            System.out.println("B Grade");
            
        } else if (marksObtain>80) {
            System.out.println("A Grade");
            
        }
    }
}
