package com.assignmentno3.operator;

import java.util.Scanner;

public class Qno11ConvertFahrenheitintoCelsius {
    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
        System.out.println("Enter  temp in fahrenheit ");
        float fahrenheit=temp.nextFloat();
        float celsius;
        celsius = ((fahrenheit-32)*5)/9;
        System.out.println(+celsius);

    }
}
