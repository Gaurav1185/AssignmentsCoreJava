package com.assignmentno8.ClassAndObject;
public class Qno8Complex {
    //Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with
    // separate methods for each operation whose real and imaginary parts are entered by user.
    int number1;int number2;
    int sum(int n1,int n2){
        number1=n1;
        number2=n2;
        return n1+n2;}
    int product (int n1,int n2){
        number1=n1;
        number2=n2;
        return n1*n2;}
    int difference(int n1,int n2){
        number1=n1;
        number2=n2;
        return n1-n2;}
    public static void main(String[] args) {
        Qno8Complex complex=new Qno8Complex();
        System.out.println(complex.product(50,20));
        System.out.println(complex.difference(50,20));
        System.out.println(complex.sum(50,20));}}
