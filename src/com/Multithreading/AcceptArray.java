package com.Multithreading;

import java.util.Scanner;

public class AcceptArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[8];
        System.out.println("Enter array elements");
        for (int index = 0; index < arr.length; index++) {
            int [] arrayAccept= new int[]{scanner.nextInt()};
            System.out.println(index);

        }

    }
}
