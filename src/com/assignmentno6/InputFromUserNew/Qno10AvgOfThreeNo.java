package com.assignmentno6.InputFromUserNew;

import java.util.Scanner;

public class Qno10AvgOfThreeNo {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter Subjects marks");
        int obtainMarks1 = marks.nextInt();
        int obtainMarks2 = marks.nextInt();
        int obtainMarks3 = marks.nextInt();
        int totalOfMarks = obtainMarks1 + obtainMarks2 + obtainMarks3;
        float percentage = totalOfMarks/3;
        System.out.println(percentage);
    }
}
