package com.assignmentno3.operator;
//The total number of students in a class are 90 out of which 45 are boys.
//
//If 50% of the total students secured grade 'A' out of which 20 are boys,
// then write a program to calculate the total number of girls getting grade 'A'.
public class Qno12CalculateNoOfStudent {
    public static void main(String[] args) {
        int total_student=90;
        int boys  = total_student - 45;
        int girls = total_student - boys;
        int student_Scored_A_Grade = total_student/2;
        int girls_Who_Scored_A_Grade = student_Scored_A_Grade-20;
        System.out.println(girls_Who_Scored_A_Grade);
    }
}
