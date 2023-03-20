package Practise.StringHandling.Programs;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Length and breadth");
        int length= scanner.nextInt();
        int breadth= scanner.nextInt();
        int areaOfRectangle;
        areaOfRectangle=length*breadth;
        System.out.println("Area of rectangle is "+areaOfRectangle);

    }
}
