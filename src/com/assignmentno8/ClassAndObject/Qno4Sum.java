package com.assignmentno8.ClassAndObject;

import java.util.Scanner;

public class Qno4Sum {
    int number1;
    int number2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two number");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        Qno4Sum qno4Sum = new Qno4Sum();
        System.out.println(qno4Sum.SumOfNumber(number1,number2));
    }

    private  int SumOfNumber(int n1,int n2) {
        return n1+n2;
    }

    public static class Qno4Product {
        int number1;
        int number2;
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Two number");
            int number1=scanner.nextInt();
            int number2=scanner.nextInt();
            Qno4Product qno4Sum = new Qno4Product();
            System.out.println(qno4Sum.SumOfNumber(number1,number2));
        }

        private  int SumOfNumber(int n1,int n2) {
            return n1*n2;
        }
    }
}
