package com.ExceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
        int[] arrayName ={1,2,3,4,5,6,7,8};
        try {
            for (int i = 0; i <arrayName.length ; i++) {
                System.out.println(arrayName[9]);//ArrayIndexOutOfBoundException Unchecked Exception

            }
        }
        catch (ArrayIndexOutOfBoundsException indexOutOfBoundsException){
            indexOutOfBoundsException.printStackTrace();
        }

    }
}
