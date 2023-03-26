package com.assignmentno5.IfElse.Qno1;


import java.util.Scanner;

public class MarkingSystem {
    public static void main(String[] args) {
        float[] marks = new float[8];
        float sum=0, avg = 0;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks");
        for ( i = 0; i <8 ; i++) {
            marks[i]=scanner.nextFloat();

        }
        for (int j = 0; j <8 ; j++) {
            sum+=marks[j];
            avg=sum/8;


        }
        String grade = "";

        if(avg>=94)
            grade = "A";
        else if(avg>=90 && avg<94)
            grade = "A-";
        else if(avg>=87 && avg<90)
            grade = "B+";
        else if(avg>=83 && avg<87)
            grade = "B";
        else if(avg>=80 && avg<83)
            grade = "B-";
        else if(avg>=77 && avg<80)
            grade = "C+";
        else if(avg>=73 && avg<77)
            grade = "C";
        else if(avg>=70 && avg<73)
            grade = "C-";
        else if(avg>=67 && avg<70)
            grade = "D+";
        else if(avg>=63 && avg<67)
            grade = "D";
        else if(avg>=60 && avg<63)
            grade = "D-";
        else
            grade = "F";

        System.out.println("\nGrade = " +grade);

        }
    
}
