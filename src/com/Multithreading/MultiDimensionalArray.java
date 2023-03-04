package com.Multithreading;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int element=8;
        int[] arr={1,2,3,4,5,6,7,8};
        for (int i = 0; i < arr.length ; i++) {
            if(element==arr[i]){
                System.out.println(i);
            }

        }

    }

}
