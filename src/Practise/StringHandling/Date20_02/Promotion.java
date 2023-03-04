package Practise.StringHandling.Date20_02;

import java.util.Scanner;

public class Promotion {
//    A company decided to give bonus of 50% to employee if his/her year of service is more than 5 years.
//
//    Ask user for their salary and year of service and print the net bonus amount.
 int minSalary =12000;
    int salary(int yearOfJoining){
        if(yearOfJoining>2018){
            System.out.println(minSalary +=1/2*(minSalary));;
        }
        else {
            System.out.println(minSalary);
        }
      return 0;
    }
    int yearOfJoining;

    public Promotion() {
        this.minSalary = minSalary;
        this.yearOfJoining = yearOfJoining;
    }

    public static void main(String[] args) {
        Promotion promotion=new Promotion();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter year of joining ");
        int yearOfJoining= scanner.nextInt();
        System.out.println(promotion.salary(yearOfJoining));






    }
}
