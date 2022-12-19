package com.assignmentno4.InputFromUser;
import java.util.Scanner;
public class Qno5Area_Of_Square_and_Perimeter {
    public static void main(String[] args) {
        Scanner values = new Scanner(System.in);
        System.out.println("Enter the value");
        int number = values.nextInt();
        int Area_Of_Square = number * number ;
        System.out.println("The Area of square is "+Area_Of_Square);
        int Area_Of_Perimeter = 4 * number ;
        System.out.println("The Area_Of_Perimeter is "+Area_Of_Perimeter);
    }
}