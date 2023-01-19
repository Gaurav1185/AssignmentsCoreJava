package com.assignmentno9.Methods;

import java.util.Scanner;

public class Qno1MaxAndMin {
    //Define two methods to print the maximum and the minimum number respectively
    // among three numbers entered by user
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any three numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println("Max number is "+ maxNumber(number1,number2,number3));
        System.out.println("Min number is "+ minNumber(number1,number2,number3));
    }

    private static int maxNumber(int number1,int number2,int number3) {
       return number1 >= number2 && number1 >= number3 ?
               number1 : (number2>=number1 && number2>=number3)? number2 : number3 ;
    }
    private static int minNumber(int number1,int number2,int number3){
        return number1<=number2 && number1 <= number3 ?
                number1 : number2 <= number1 && number2<=number3 ? number2 : number3;
    }

}