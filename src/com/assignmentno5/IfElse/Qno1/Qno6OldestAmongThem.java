package com.assignmentno5.IfElse.Qno1;

import java.util.Scanner;

public class Qno6OldestAmongThem {
    public static void main(String[] args) {
        Scanner values = new Scanner(System.in);
        System.out.println("Enter first numbers");
        int number1 = values.nextInt();
        System.out.println("Enter second numbers");
        int number2 = values.nextInt();
        System.out.println("Enter third numbers");
        int number3 = values.nextInt();
        if(number1>number2 && number1>number3 ) {
            System.out.println(number1+ " is greatest among them");

        }else if(number2>number1 && number2>number3 ) {
            System.out.println(number2+ " is greatest among them");

        }else //if(number3>number1 && number3>number1)//
             {
            System.out.println(number3+ " is greatest among them");

        }
        if(number1<number2 && number1<number3){
            System.out.println(number1+" number is smallest among them");
        }
        else if(number2<number1 && number2<number3){
            System.out.println(number2+" number is smallest among them");
        }
        else{
            System.out.println(number3 + " number smallest among them");
        }
       }
}
