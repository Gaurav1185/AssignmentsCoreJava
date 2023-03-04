package Practise.StringHandling.Date20_02;

import java.util.Scanner;

public class AvgOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any ten numbers");

        float sum=0;
        for (int i = 1; i <=10; i++) {
            sum+=scanner.nextInt();

        }
    }
}
