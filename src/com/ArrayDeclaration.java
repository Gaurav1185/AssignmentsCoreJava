package com;
import java.util.Scanner;
public class ArrayDeclaration {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] arr=new int[8];
        System.out.println("Enter array elements");
        for (int index = 0; index < arr.length ; index++) {
            int acceptno=scanner.nextInt();
            //System.out.print(arr[index]);
        }
        System.out.println(arr[0]);
    }
}
