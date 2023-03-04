package com.ExceptionHandling;

public class Demo1 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException arithmeticException) {
            arithmeticException.printStackTrace();
        }
        System.out.println("Hello");
        System.out.println("Hello");
    }
}
