package com.assignmentno3.operator;
//- Write a program to add 8 to the number 2345 and then divide it by 3.
//- Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5.
//- Display the final result.
public class Qno4UsingOperators {
    public static void main(String[] args){
        int GivenNumber=2345;
        GivenNumber +=8;
        System.out.println("The Result After Adding 8 "+GivenNumber);
        GivenNumber /=3;
        System.out.println("The Result After Dividing by 3 "+GivenNumber);
        GivenNumber %=5;
        System.out.println("The Result After Modulo by 5 "+GivenNumber);
        GivenNumber *=5;
        System.out.println("The Result After Multiplication by 5 "+GivenNumber);
        System.out.println("The Final Value is "+GivenNumber);
    }
}
