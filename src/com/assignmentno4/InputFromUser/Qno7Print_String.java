package com.assignmentno4.InputFromUser;

import java.util.Scanner;

public class Qno7Print_String {
    public static void main(String[] args) {
        Scanner values = new Scanner(System.in);
        System.out.println("Enter the first Word ");
        String word1 = values.next();
        System.out.println("Enter the second word ");
        String word2 = values.next();
        System.out.println(word1 + word2);
    }
}
