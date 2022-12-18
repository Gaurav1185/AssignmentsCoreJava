package com.InputFromUser;
import java.util.Scanner;
public class Qno4PrintGivenFields {
    public static void main(String[] args) {
        Scanner fields=new Scanner(System.in);
        //Take name, roll number and field of interest from user and print in the format below :
        //
        //Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
        System.out.println("Enter His Name");
        String Name= fields.next();
        System.out.println("Enter his roll number ");
        int RollNumber = fields.nextInt();
        System.out.println("Enter fields of interest");
        String Fields_Of_Interest=fields.next();
        System.out.println("His name is "+Name +"His Roll Number is "+RollNumber +"His fields of interest is "+Fields_Of_Interest);

    }
}
