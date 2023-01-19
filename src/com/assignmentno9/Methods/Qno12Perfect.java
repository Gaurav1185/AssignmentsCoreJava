package com.assignmentno9.Methods;

public class Qno12Perfect {
    //Define a method named 'perfect' that determines if parameter number is a perfect number.
    //
    //Use this function in a program that determines and prints all the perfect numbers between 1 and 1000.
    //
    //[An integer number is said to be "perfect number" if its factors, including 1(but not the number itself),
    // sum to the number. E.g., 6 is a perfect number because 6=1+2+3].
    public int Perfect() {
        for (int number = 1; number <= 10000; number++) {

            //check number is perfect or not
            int sumOfFactors = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfFactors = sumOfFactors + i;
                }
            }
            if (sumOfFactors == number) {
                System.out.println(number);
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        Qno12Perfect qno12Perfect=new Qno12Perfect();
        System.out.println(qno12Perfect.Perfect());
    }
}
