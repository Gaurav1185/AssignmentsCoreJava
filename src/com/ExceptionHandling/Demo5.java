package com.ExceptionHandling;

public class Demo5 {
    static int  variableOne=10;
    public static void main(String[] args) {

        try{
            Class.forName("Hello");
        }
        catch (ClassNotFoundException e){

            e.printStackTrace();
        }

    }
}
